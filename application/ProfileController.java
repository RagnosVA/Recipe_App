package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ProfileController implements Initializable{
	@FXML
	private Label fname;
	@FXML
	private Label lname;
	@FXML
	private Label email;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		fname.setText(application.RecipeAppMain.currentUser.getfname());
		lname.setText(application.RecipeAppMain.currentUser.getlname());
		email.setText(application.RecipeAppMain.currentUser.getemail());
	}

}
