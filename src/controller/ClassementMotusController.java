package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import player.Player;

public class ClassementMotusController 
{
	@FXML
	private Label text;

	@FXML
	private TableView<?> tableauScoreMotus;

	@FXML
	private TableColumn<?, ?> identifiant;

	@FXML
	private TableColumn<?, ?> score;

	@FXML
	private Button retour;

	@FXML
	private Button quitter;

	@FXML
	void initialize() {
		try {
    		Class.forName("org.postgresql.Driver");
    		System.out.print("Driver OK.");

    		String url = "jdbc:postgresql://localhost:5432/AlgoEtDev";
    		String user = "postgres";
    		String passwd = "101506";

    		Connection con = DriverManager.getConnection(url, user, passwd);
    		String sql = "SELECT scoremotus FROM player WHERE  id = player.id";
    		PreparedStatement statement = con.prepareStatement(sql);
    		ResultSet result = statement.executeQuery();
    		result.next();
    		int score = result.getInt(1);
    		text.setText(Player.id + ", votre score au MOTUS est de : " + score +".");
    		/*
    		String sql1 = "SELECT MAX(scoregeneral) FROM player";
    		statement = con.prepareStatement(sql1);
    		result = statement.executeQuery();
    		result.next();
    		String max = result.getString(1);
    		pseudo.getColumns().add(1, max);
    		String sql2 = "SELECT id FROM player WHERE  MAX(scoregeneral)";
    		*/
    		
    		statement.close();
    	}catch (Exception e){
    		e.printStackTrace();
    	}

	}

	@FXML
	void clickOnRetour(ActionEvent event) {
		Stage stage = new Stage();
    	Stage stage1 = new Stage();
    	try
    	{
    		Parent root = FXMLLoader.load(getClass().getResource("../ressources/MenuJouer.fxml"));
    		stage.setScene(new Scene(root));
			stage.setTitle("Jeux");
			stage.getIcons().add(new Image("file:jeux.jpg"));
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
