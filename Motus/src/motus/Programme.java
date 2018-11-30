package motus;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import motus.tableau.Tableau;


public class Programme extends Application{

	private static Stage primaryStage;
	private static BorderPane rootLayout;
	private static Tableau tableau;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Programme.primaryStage = primaryStage;
		Programme.primaryStage.setTitle("Mo Mo Mo Motus");
		//Programme.primaryStage.getIcons().add(new Image("images/motus.jpg"));
		initRootLayout();
	}

	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Programme.class.getResource("ressource/Motus.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	public static BorderPane getRootLayout() {
		return rootLayout;
	}

	public static void setRootLayout(BorderPane borderpane) {
		rootLayout = borderpane;
	}

	public static void setTableau (Tableau t) {
		tableau = t;
	}

	public static Tableau getTableau() {
		return tableau;
	}
}
