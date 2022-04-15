package gui;

<<<<<<< HEAD
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
=======
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
>>>>>>> d41b4541f0b3874867032a73f51b93ddf0e66609

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;
		
	@FXML
	public void onMenuItemSellerAction() {
<<<<<<< HEAD
		//loadView("/gui/DepartmentList.fxml");
=======
		System.out.println("onMenuItemSellerAction");
>>>>>>> d41b4541f0b3874867032a73f51b93ddf0e66609
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
<<<<<<< HEAD
		loadView("/gui/DepartmentList.fxml");
=======
		System.out.println("onMenuItemDepartmentAction");
>>>>>>> d41b4541f0b3874867032a73f51b93ddf0e66609
	}
	
	@FXML
	public void onMenuItemAboutAction() {
<<<<<<< HEAD
		loadView("/gui/About.fxml");
=======
		System.out.println("onMenuItemAboutAction");
>>>>>>> d41b4541f0b3874867032a73f51b93ddf0e66609
	}
	
	

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
		
	}
	
<<<<<<< HEAD
	private synchronized void loadView(String absoluteName) {
		try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
		VBox newVBox = loader.load();
		
		Scene mainScene = Main.getMainScene();
		VBox mainVBox = (VBox) ((ScrollPane)mainScene.getRoot()).getContent();
		
		Node mainMenu = mainVBox.getChildren().get(0);
		mainVBox.getChildren().clear();
		mainVBox.getChildren().add(mainMenu);
		mainVBox.getChildren().addAll(newVBox.getChildren());
		
		}
		
		catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}
=======
	
>>>>>>> d41b4541f0b3874867032a73f51b93ddf0e66609

}
