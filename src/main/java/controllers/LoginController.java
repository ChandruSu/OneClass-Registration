package controllers;


import javafx.animation.FillTransition;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import database.VerifyLogin;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import windows.Popup;


public class LoginController
{
	@FXML VBox root;
	@FXML TextField usernameInput;
	@FXML PasswordField passwordInput;
	@FXML Button loginButton;
	
	public void initialize()
	{

	}
	
	@FXML 
	public void onLoginDown()
	{
		if (VerifyLogin.checkLogin(usernameInput.getText(), passwordInput.getText()))
		{
			try {
				startDashboard();
				((Stage)root.getScene().getWindow()).close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			Popup.AlertBox("Account not found...");
		}
	}

	@FXML
	public void closeWindow()
	{
		Platform.exit();
	}

	public void startDashboard() throws Exception
	{
		Stage window = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Dashboard.fxml"));
		Scene scene1 = new Scene(root);
		window.setScene(scene1);
		window.setTitle("Dashboard");
		window.setResizable(true);
		window.show();
	}
}