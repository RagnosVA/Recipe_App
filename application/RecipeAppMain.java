package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class RecipeAppMain extends Application {
	public static User currentUser = new User();
	public static BorderPane root;
	public static Scene scene;
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("RecipeApp");
			root = FXMLLoader.load(getClass().getResource("FxmlFiles/StartingMain.fxml"));
			scene = new Scene(root,700,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
