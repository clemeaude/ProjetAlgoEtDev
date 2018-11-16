package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuIndexController {
	
    @FXML
    private Button jouer;

    @FXML
    private Button classement;
    
    @FXML
    private Button deconnexion;

    @FXML
    private Button quitter;

    @FXML
    void clickOnJouer(ActionEvent event) 
    {
    	Stage stage = new Stage();
    	Stage stage1 = new Stage();
    	try
    	{
    		Parent root = FXMLLoader.load(getClass().getResource("../ressources/MenuJouer.fxml"));
    		stage.setScene(new Scene(root));
			stage.setTitle("Bienvenue");
			stage.setResizable(false);
			stage.show();
			
			stage1 = (Stage)jouer.getScene().getWindow();
			stage1.close();
    		
    	} catch(IOException e)
    	{
    		System.out.println(e);
    	}
    }
    
    @FXML
    void clickOnClassement(ActionEvent event) 
    {
    	Stage stage = new Stage();
    	Stage stage1 = new Stage();
    	try
    	{
    		Parent root = FXMLLoader.load(getClass().getResource("../ressources/MenuScore.fxml"));
    		stage.setScene(new Scene(root));
			stage.setTitle("Bienvenue");
			stage.setResizable(false);
			stage.show();
			
			stage1 = (Stage)classement.getScene().getWindow();
			stage1.close();
    		
    	} catch(IOException e)
    	{
    		System.out.println(e);
    	}
    }
    
    @FXML
    void clickOnDeconnecter(ActionEvent event) 
    {
    	Stage stage = new Stage();
    	Stage stage1 = new Stage();
    	try
    	{
    		Parent root = FXMLLoader.load(getClass().getResource("../ressources/Connexion.fxml"));
    		stage.setScene(new Scene(root));
			stage.setTitle("Bienvenue");
			stage.setResizable(false);
			stage.show();
			
			stage1 = (Stage)deconnexion.getScene().getWindow();
			stage1.close();
    		
    	} catch(IOException e)
    	{
    		System.out.println(e);
    	}
    }

    @FXML
    void clickOnExit(ActionEvent event) 
    {
    	Stage stage = (Stage)quitter.getScene().getWindow();
    	stage.close();
    }

}
