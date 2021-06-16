package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.net.URL;

public class FxmlLoader {
	
	private Pane view;
	
	public Pane getPage( String fileName ) {
		
		try {
			URL fileUrl = RecipeAppMain.class.getResource("\\FxmlFiles\\" + fileName + ".fxml");
			
			if( fileUrl == null ) {
				System.out.println("File not found");
				throw new java.io.FileNotFoundException("FXML file not found");
			}
			
			view = FXMLLoader.load(fileUrl);
		}
		catch (Exception e){
			
		}
		return view;
	}

}
