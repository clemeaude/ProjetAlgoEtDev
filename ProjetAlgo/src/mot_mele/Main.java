package mot_mele;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import mot_mele.controler.Grille15x15;
import mot_mele.controler.ListeMots;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.scene.layout.BorderPane;



public class Main extends Application {
	
	private static Stage primaryStage;
	private static BorderPane rootLayout;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
			
			
			Main.primaryStage = primaryStage;
			Main.primaryStage.setTitle("Mots meles");
			Main.primaryStage.getIcons().add(new Image("mot_mele/ressource/motsmeles.jpg"));
			
			initRootLayout();
			
			Grille15x15 g = new Grille15x15 ();
			
			ListeMots l = new ListeMots();
					
			l.listeMotsDico();
			
			l.listeMotsUtil();
			
			for (int i=0; i<10; i++)
			{
				g.creation(i, l);
			}
			
			
		
	}
	
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("ressource/MenuJeu.fxml"));
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
	
	
}
