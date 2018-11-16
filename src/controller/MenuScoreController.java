package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class MenuScoreController {
	@FXML
	private TableView<?> tableau;

	@FXML
	private TableColumn<?, ?> pseudo;

	@FXML
	private TableColumn<?, ?> score; 
	
	@FXML
    private Button retour;

    @FXML
    private Button quitter;

    @FXML
    void clickOnRetour(ActionEvent event) {
    	Stage stage = new Stage();
    	Stage stage1 = new Stage();
    	try
    	{
    		Parent root = FXMLLoader.load(getClass().getResource("../ressources/MenuIndex.fxml"));
    		stage.setScene(new Scene(root));
			stage.setTitle("Bienvenue");
			stage.setResizable(false);
			stage.show();
			
			stage1 = (Stage)retour.getScene().getWindow();
			stage1.close();
    		
    	} catch(IOException e)
    	{
    		System.out.println(e);
    	}
    }

    @FXML
    void clickOnExit(ActionEvent event) {
    	Stage stage = (Stage)quitter.getScene().getWindow();
    	stage.close();
    }

}
