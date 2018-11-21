package mot_mele.controler;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import mot_mele.Main;
import mot_mele.controler.Grille15x15;
import mot_mele.controler.ListeMots;



public class MotsMeles {
	 @FXML
	    private Button retour;

	    @FXML
	    private Button quitter;
	    
	    @FXML
	    private Button afficheListe;
	    
	    @FXML
	    private Button debutPartie;

	    @FXML
	    private static BorderPane borderpane;
	
	    @FXML
	    private Label deuxiemeMot;

	    @FXML
	    private Label quatriemeMot;

	    @FXML
	    private Label cinquiemeMot;
	    
	    @FXML
	    private Label huitiemeMot;

	    @FXML
	    private Label troisiemeMot;

	    @FXML
	    private Label septiemeMot;

	    @FXML
	    private Label neuxiemeMot;

	    @FXML
	    private Label dixiemeMot;

	    @FXML
	    private Label premierMot;

	    @FXML
	    private Label sixiemeMot;
	    
	    @FXML
	    private GridPane listemots;
	    
	    @FXML
	    private GridPane grille;

	    @FXML
	    void retourMenu(ActionEvent event) throws IOException {
	    	
	    	BorderPane borderp= null;
	 	    	
	 	    	FXMLLoader loader = new FXMLLoader();
	 	    	
	 	    	
	 	    	
	 	    	loader.setLocation(Main.class.getResource("ressource/MenuJeu.fxml"));
	 	    	borderp = (BorderPane) loader.load();
	 			borderpane = Main.getRootLayout();
	 			
	 			borderpane.setCenter(borderp);
	 			borderpane.setBorder(null);
	 			borderpane.setBottom(null);
	 			borderpane.setTop(null);
	 			Main.getPrimaryStage().setTitle("Menu Mots meles");
	 			MotsMeles.setBorderpane(borderpane);
	 	    }
	    
	    public static void setBorderpane(BorderPane _borderpane) {
			borderpane = _borderpane;
		}
	    
	    @FXML
	    void debutGame(ActionEvent event) {
	    
	   
	    
		listemots.add(new Label(ListeMots.listeMUtil.get(0)),0,0);
		listemots.add(new Label(ListeMots.listeMUtil.get(1)),0,1);
		listemots.add(new Label(ListeMots.listeMUtil.get(2)),0,2);
		listemots.add(new Label(ListeMots.listeMUtil.get(3)),0,3);
		listemots.add(new Label(ListeMots.listeMUtil.get(4)),0,4);
		listemots.add(new Label(ListeMots.listeMUtil.get(5)),0,5);
		listemots.add(new Label(ListeMots.listeMUtil.get(6)),0,6);
		listemots.add(new Label(ListeMots.listeMUtil.get(7)),0,7);
		listemots.add(new Label(ListeMots.listeMUtil.get(8)),0,8);
		listemots.add(new Label(ListeMots.listeMUtil.get(9)),0,9);
		
		

	     

	    }
	    
	    @FXML
	    void afficheGrille(ActionEvent event) {
	    	for (int i=0;i<15;i++)
	    	{
	    		for (int j=0;j<15;j++)
	    		{
	    			
	    			String s=Character.toString(Grille15x15.grille[i][j]);
	    			grille.add(new Label(s),i,j);
	    		}
	    	}
	    	
	    	

	    }
	    

	    @FXML
	    void clickOnquitter(ActionEvent event) {
	    	Stage stage = (Stage) retour.getScene().getWindow();
			stage.close();
	    		
	    }
	    
	    
	
	    

}