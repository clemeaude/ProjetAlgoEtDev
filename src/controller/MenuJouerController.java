package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class MenuJouerController {
	@FXML
    private CheckBox motus;

    @FXML
    private CheckBox pendu;

    @FXML
    private CheckBox motsMeles;

    @FXML
    private CheckBox sudoku;
    
    @FXML
    private Button jouer;
    
    @FXML
    private Button retour;

    @FXML
    private Button quitter; 
    
    @FXML
    void clickOnMotsMeles(ActionEvent event) {
    	motus.setSelected(false);
    	pendu.setSelected(false);
    	sudoku.setSelected(false);
    	if(motsMeles.isSelected())
    		jouer.setDisable(false);
    	else 
    		jouer.setDisable(true);
    }

    @FXML
    void clickOnMotus(ActionEvent event) {
    	pendu.setSelected(false);
    	motsMeles.setSelected(false);
    	sudoku.setSelected(false);
    	if(motus.isSelected())
    		jouer.setDisable(false);
    	else 
    		jouer.setDisable(true);
    }

    @FXML
    void clickOnPendu(ActionEvent event) {
    	motus.setSelected(false);
    	motsMeles.setSelected(false);
    	sudoku.setSelected(false);
    	if(pendu.isSelected())
    		jouer.setDisable(false);
    	else 
    		jouer.setDisable(true);
    }

    @FXML
    void clickOnSudoku(ActionEvent event) {
    	motus.setSelected(false);
    	motsMeles.setSelected(false);
    	pendu.setSelected(false);
    	if(sudoku.isSelected())
    		jouer.setDisable(false);
    	else 
    		jouer.setDisable(true);
    }	
    
    @FXML
    void clickOnJouer(ActionEvent event) {
    	
    }
    
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
