package sudoku.controller;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sudoku.Programme;
import sudoku.Grille.Grille;

public class controllerGrille4x4 {
	
	@FXML
	private static BorderPane borderpane;

	@FXML
	private TextField case0;

	@FXML
	private TextField case1;

	@FXML
	private TextField case2;

	@FXML
	private TextField case3;

	@FXML
	private TextField case4;

	@FXML
	private TextField case5;

	@FXML
	private TextField case6;

	@FXML
	private TextField case7;

	@FXML
	private TextField case8;

	@FXML
	private TextField case9;

	@FXML
	private TextField case10;

	@FXML
	private TextField case11;

	@FXML
	private TextField case12;

	@FXML
	private TextField case13;

	@FXML
	private TextField case14;

	@FXML
	private TextField case15;

	@FXML
	private TextField score;

	@FXML
	private TextArea listePossible;

	@FXML
	private Button init;

	@FXML
	private Button retour;

	@FXML
	private Button verifier;

	@FXML
	private Button Reset;
	
	public static void setBorderpane(BorderPane _borderpane) {
		borderpane = _borderpane;
	}

	@FXML
	void clickOnQuitter(ActionEvent event) {
		Stage stage = (Stage) retour.getScene().getWindow();
		stage.close();
		
		Programme p = new Programme();
		p.start(new Stage());
	}

	@FXML
	void clickOnInit(ActionEvent event) {
		if (!Programme.getGrille().grilleEgale(new Grille(Programme.getGrille().getTaille(), Programme.getGrille().getType()))) {
			Pane p = Programme.getPane();

			for (Node node3 : p.getChildren()) {
				if (node3 instanceof TextField) {
					// clear
					if (!node3.getId().equals("score")) {
						((TextField) node3).setText("");
						((TextField) node3).setEditable(false);
						((TextField) node3).setStyle(null);
					}
					else {
						((TextField) node3).setText("0");
					}
				}
				if (node3 instanceof TextArea) {
					((TextArea) node3).setText("Liste des valeurs possibles:");
				}
			}

			Programme.setGrille(new Grille(Programme.getGrille().getTaille(),Programme.getGrille().getType()));
			verifier.setDisable(true);
		}
		
		int revele = 0;
		Pane p = Programme.getPane();

		for (Node node3 : p.getChildren()) {
			if (node3 instanceof TextArea) {
				if (node3.getId().equals("listePossible")) {
					((TextArea) node3).setText("Liste des valeurs possibles:" + "\n" + Programme.getGrille().afficheListeChoix());
				}
			}
		}

		while (revele < 4) {
			Random ran = new Random();
			int x = ran.nextInt(Programme.getGrille().getTaille()) + 1;
			int y = ran.nextInt(Programme.getGrille().getTaille()) + 1;

			while (Programme.getGrille().listePossible(y,x).size() == 0) {
				x = ran.nextInt(Programme.getGrille().getTaille()) + 1;
				y = ran.nextInt(Programme.getGrille().getTaille()) + 1;
			}
			int place = ran.nextInt(Programme.getGrille().listePossible(y,x).size());
			String valeur = Programme.getGrille().listePossible(y,x).get(place);

			if (!valeur.equals(null)  && !Programme.getGrille().getTab_Case()[y-1][x-1].getInitialise()) {
				int numCase = (y-1)*Programme.getGrille().getTaille() + x-1;
				String casenb = "case" + Integer.toString(numCase);	
				for (Node node3 : p.getChildren()) {
					if (node3 instanceof TextField) {
						// clear
						if (node3.getId().equals(casenb)) {
							((TextField) node3).setText(valeur);
							Programme.getGrille().revele(y, x, valeur);
							((TextField) node3).setStyle("-fx-text-fill: white; -fx-background-color: green");
						}
					}
				}
				revele++;
			}
		}
		for (Node node3 : p.getChildren()) {
			if (node3 instanceof TextField) {
				// clear
				if (!node3.getId().equals("score") && ((TextField) node3).getText().equals("")) {
					((TextField) node3).setEditable(true);
				}
			}
		}
		
		Programme.setAncienneGrille(Programme.getGrille());
		
		verifier.setDisable(false);
		
		Programme.getGrille().setDebut(System.currentTimeMillis());
	}

	@FXML
	void clickOnVerifier(ActionEvent event) throws IOException{
		Pane p = Programme.getPane();
		Programme.setAncienneGrille(Programme.getGrille());

		for (Node node: p.getChildren()) {
			if (node instanceof TextField) {
				if (!node.getId().equals("score")) {
					
					String nom = node.getId();
					nom = nom.replaceAll("case", "");
					int num = Integer.parseInt(nom);
					int x = num%Programme.getGrille().getTaille();
					int y = (num - x) / Programme.getGrille().getTaille();
					
					if (!((TextField) node).getText().equals("")) {
						String val = ((TextField) node).getText();
						Programme.getGrille().saisie(y+1, x+1, val.toUpperCase());
						if (!val.equals(val.toUpperCase())) {
							((TextField) node).setText(val.toUpperCase());
						}
						//Programme.getGrille().getTab_Case()[y][x].setValeur(((TextField) node).getText());
						if (!Programme.getGrille().getTab_Case()[y][x].getValeur().equals(((TextField) node).getText())) {
							((TextField) node).setStyle("-fx-text-fill: white; -fx-background-color: red");
						}
					}
					else {
						((TextField) node).setStyle(null);
						Programme.getGrille().initCase(y+1, x+1);
					}
				}
			}
		}

		int nbTextField = 0;
		int nbTextFieldInit = 0;
		for (Node node: p.getChildren()) {
			if (node instanceof TextField) {
				if (!node.getId().equals("score")) {
					nbTextField++;
					if (!((TextField) node).getText().equals("")) {
						nbTextFieldInit++;
						String nom = node.getId();
						nom = nom.replaceAll("case", "");
						int num = Integer.parseInt(nom);
						int x = num%Programme.getGrille().getTaille();
						int y = (num - x) / Programme.getGrille().getTaille();

						if (Programme.getGrille().verifValCase(y, x, ((TextField) node).getText())) {
							((TextField) node).setStyle("-fx-text-fill: white; -fx-background-color: green");
						}
						else {
							((TextField) node).setStyle("-fx-text-fill: white; -fx-background-color: red");
						}
					}
				}
			}
		}
		if (nbTextField == nbTextFieldInit) {
			if (Programme.getGrille().verifGrille(Programme.getGrille().getTab_Sous_Grille())) {
				AnchorPane anchorpane = null;
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Programme.class.getResource("ressource/partieGagnee.fxml"));
				anchorpane = (AnchorPane) loader.load();
				borderpane = Programme.getRootLayout();
				borderpane.setCenter(anchorpane);
				borderpane.setBorder(null);
				borderpane.setBottom(null);
				borderpane.setTop(null);
				Programme.getPrimaryStage().setTitle("Vous avez gagné :D");
				
				Programme.getGrille().setFin(System.currentTimeMillis());
				Programme.getGrille().calculTemps();
			}
		}

	}
	
	@FXML
	void clickOnCase() {
		this.verifie();
	}

	private void verifie() {
		Pane p = Programme.getPane();

		for (Node node: p.getChildren()) {
			if (node instanceof TextField) {
				
				if (!node.getId().equals("score")) {

					String nom = node.getId();
					nom = nom.replaceAll("case", "");
					int num = Integer.parseInt(nom);
					int x = num%Programme.getGrille().getTaille();
					int y = (num - x) / Programme.getGrille().getTaille();
					String val = ((TextField) node).getText();
					
					if (!((TextField) node).getText().equals("")) {
						
						if (!val.equals(val.toUpperCase())) {
							((TextField) node).setText(val.toUpperCase());
							val = val.toUpperCase();
						}
						
						if (Programme.getGrille().getTab_Case()[y][x].getValeur().equals("")) {
							if (Programme.getGrille().verifCase(y, x, val)) {
								Programme.getGrille().saisie(y+1, x+1, val);
								((TextField) node).setStyle("-fx-text-fill: white; -fx-background-color: green");
							}
							else {
								Programme.getGrille().saisie(y+1, x+1, val);
								((TextField) node).setStyle("-fx-text-fill: white; -fx-background-color: red");
							}
						}
						
						
						if (Programme.getGrille().verifCase(y, x, val) && 
								Programme.getAncienneGrille().getTab_Case()[y][x].getValeur().equals("")) {
							Programme.getGrille().saisie(y+1, x+1, val);
							if (Programme.getGrille().getTab_Case()[y][x].getValeur().equals(val)) {
								((TextField) node).setStyle("-fx-text-fill: white; -fx-background-color: green");
							}
							else {
								((TextField) node).setStyle("-fx-text-fill: white; -fx-background-color: red");
							}
						}
					}
					else if (!Programme.getGrille().getTab_Case()[y][x].getInitialise()){
						((TextField) node).setStyle(null);
						Programme.getGrille().getTab_Case()[y][x].setValeur("");
					}
				}
			}
		}
		
		for (int y = 0; y < Programme.getGrille().getTaille(); y++) { //y => ligne
			for (int x = 0; x < Programme.getGrille().getTaille(); x++) { //x => colonne
				if (!Programme.getGrille().getTab_Case()[y][x].getValeur().equals(Programme.getAncienneGrille().getTab_Case()[y][x].getValeur())) {
					Programme.getAncienneGrille().saisie(y, x, Programme.getGrille().getTab_Case()[y][x].getValeur());
				}
			}
		}
		
		Programme.setGrille(Programme.getAncienneGrille());
		
		score.setText(Programme.getGrille().getScore());
	}
}
