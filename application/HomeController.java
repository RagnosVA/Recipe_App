package application;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;

public class HomeController {
	@FXML
	private TextField recipeNameInput;
	@FXML
	private FlowPane flowpane;
	@FXML
	private TextArea textarea;
	
	int i;
	
	// Event Listener on Button.onAction
	@FXML
	public void searchRecipe(ActionEvent event) {
		flowpane.getChildren().removeAll(flowpane.getChildren());
		Node[] nodes = new Node[20];
		File file = new File("src/application/Recipes");
		String[] fileList = file.list();
		for( i = 0; i < fileList.length; i++) {
			if( fileList[i].indexOf(recipeNameInput.getText()) != -1 ? true : false ) {
				Button button = new Button(fileList[i].substring(0, fileList[i].indexOf('.')));
				button.setId("recipebutton");
				
				button.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						try{
							Scanner scanner = new Scanner(new File("src/application/Recipes/" + button.getText() + ".txt"));
							textarea.setVisible(true);
							String s = "";
							while(scanner.hasNext())
								s = s + scanner.nextLine() + "\n";
							textarea.setText(s);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				nodes[i] = button;
				flowpane.getChildren().add(nodes[i]);
			}
		}
	}
}
