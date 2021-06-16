package application;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;

public class MenuController {
	
	// Event Listener on Button.onAction
	@FXML
	public void openHomeView(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Home");
		application.RecipeAppMain.root.setCenter(view);
	}
	// Event Listener on Button.onAction
	@FXML
	public void openProfileView(ActionEvent event) {
		FxmlLoader object = new FxmlLoader();
		Pane view = object.getPage("Profile");
		application.RecipeAppMain.root.setCenter(view);
	}
	
	
}
