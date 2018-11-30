package sudoku.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sudoku.Programme;

public class controllerPartieGagnee {
	
	@FXML
	private static BorderPane borderpan;

	@FXML
    private Button retour;

    @FXML
    private Text temps;
    
    @FXML
    void initialize() 
    {
    	Programme.getGrille().setFin(System.currentTimeMillis());
    	temps.setText(Programme.getGrille().calculTemps() + "\n" + 
    				Programme.getGrille().getDebut() + "\n" + 
    				Programme.getGrille().getFin());
    	
    }

    @FXML
    void clickOnRetour(ActionEvent event) throws IOException {
    	Stage stage = (Stage) retour.getScene().getWindow();
		stage.close();
		
		Programme p = new Programme();
		p.start(new Stage());
    }
    		
}
