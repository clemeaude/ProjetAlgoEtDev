package mot_mele.controler;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import mot_mele.Main;

public class MenuJeu {
		
		@FXML
		private BorderPane borderpan;
		
	    @FXML
	    private ImageView imageJeu;
		
	 	@FXML
	    private Button retour;

	    @FXML
	    private Button quitter;

	    @FXML
	    private Button creer;

	    @FXML
	    void startGame(ActionEvent event) throws IOException{
	    	
	    	AnchorPane anchorpane = null ;
	    	FXMLLoader loader = new FXMLLoader();
	    	
	    	
	    	
	    	loader.setLocation(Main.class.getResource("ressource/MotsMeles.fxml"));
	    	anchorpane = (AnchorPane) loader.load();
			borderpan = Main.getRootLayout();
			
			borderpan.setCenter(anchorpane);
			borderpan.setBorder(null);
			borderpan.setBottom(null);
			borderpan.setTop(null);
			Main.getPrimaryStage().setTitle("Mots meles");
			MotsMeles.setBorderpane(borderpan);
	    }

	    @FXML
	    void clickOnQuitter(ActionEvent event) {
	    	Stage stage = (Stage) quitter.getScene().getWindow();
			stage.close();
	    }

	    @FXML
	    void retourMenu(ActionEvent event) {

	    }
}
