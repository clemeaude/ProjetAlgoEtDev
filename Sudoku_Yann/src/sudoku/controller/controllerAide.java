package sudoku.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sudoku.Programme;

public class controllerAide {

    @FXML
    private Button voirLaListe;

	@FXML
    private Text liste;

    @FXML
    private Button fermer;

    @FXML
    private Text texteListe;

    @FXML
    void initialize() 
    {
    	texteListe.setText(texteListe.getText() + " " + Programme.getGrille().getTaille() + "x" + Programme.getGrille().getTaille());
    	liste.setText(Programme.getGrille().afficheListeChoix());
    }
    
    @FXML
    void clickOnFermer(ActionEvent event) {
    	Stage stage = (Stage) fermer.getScene().getWindow();
		stage.close();
    }
    
    @FXML
    void clickOnVoirLaListe(ActionEvent event) {
    	voirLaListe.setVisible(false);
    	liste.setText(Programme.getGrille().afficheListeChoix());
    	liste.setVisible(true);
    }
    
}
