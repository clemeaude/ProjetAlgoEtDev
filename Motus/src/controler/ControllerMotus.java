package controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import motus.tableau.Tableau;


public class ControllerMotus {

	@FXML
	private static Button StartG;
	
	@FXML
	private static BorderPane BPaneM;

	@FXML
	private static Label case0_0;
	@FXML
	private static Label case0_1;
	@FXML
	private static Label case0_2;
	@FXML
	private static Label case0_3;
	@FXML
	private static Label case0_4;
	@FXML
	private static Label case0_5;
	@FXML
	private static Label case0_6;
	@FXML
	private static Label case0_7;
	@FXML
	private static Label case0_8;
	@FXML
	private static Label case0_9;
	@FXML
	private static Label case0_10;
	@FXML
	private static Label case0_11;
	@FXML
	private static Label case0_12;
	@FXML
	private static Label case0_13;
	@FXML
	private static Label case0_14;
	@FXML
	private static Label case0_15;

	@FXML
	private static Label case1_0;
	@FXML
	private static Label case1_1;
	@FXML
	private static Label case1_2;
	@FXML
	private static Label case1_3;
	@FXML
	private static Label case1_4;
	@FXML
	private static Label case1_5;
	@FXML
	private static Label case1_6;
	@FXML
	private static Label case1_7;
	@FXML
	private static Label case1_8;
	@FXML
	private static Label case1_9;
	@FXML
	private static Label case1_10;
	@FXML
	private static Label case1_11;
	@FXML
	private static Label case1_12;
	@FXML
	private static Label case1_13;
	@FXML
	private static Label case1_14;
	@FXML
	private static Label case1_15;

	@FXML
	private static Label case2_0;
	@FXML
	private static Label case2_1;
	@FXML
	private static Label case2_2;
	@FXML
	private static Label case2_3;
	@FXML
	private static Label case2_4;
	@FXML
	private static Label case2_5;
	@FXML
	private static Label case2_6;
	@FXML
	private static Label case2_7;
	@FXML
	private static Label case2_8;
	@FXML
	private static Label case2_9;
	@FXML
	private static Label case2_10;
	@FXML
	private static Label case2_11;
	@FXML
	private static Label case2_12;
	@FXML
	private static Label case2_13;
	@FXML
	private static Label case2_14;
	@FXML
	private static Label case2_15;

	@FXML
	private static Label case3_0;
	@FXML
	private static Label case3_1;
	@FXML
	private static Label case3_2;
	@FXML
	private static Label case3_3;
	@FXML
	private static Label case3_4;
	@FXML
	private static Label case3_5;
	@FXML
	private static Label case3_6;
	@FXML
	private static Label case3_7;
	@FXML
	private static Label case3_8;
	@FXML
	private static Label case3_9;
	@FXML
	private static Label case3_10;
	@FXML
	private static Label case3_11;
	@FXML
	private static Label case3_12;
	@FXML
	private static Label case3_13;
	@FXML
	private static Label case3_14;
	@FXML
	private static Label case3_15;

	@FXML
	private static Label case4_0;
	@FXML
	private static Label case4_1;
	@FXML
	private static Label case4_2;
	@FXML
	private static Label case4_3;
	@FXML
	private static Label case4_4;
	@FXML
	private static Label case4_5;
	@FXML
	private static Label case4_6;
	@FXML
	private static Label case4_7;
	@FXML
	private static Label case4_8;
	@FXML
	private static Label case4_9;
	@FXML
	private static Label case4_10;
	@FXML
	private static Label case4_11;
	@FXML
	private static Label case4_12;
	@FXML
	private static Label case4_13;
	@FXML
	private static Label case4_14;
	@FXML
	private static Label case4_15;

	@FXML
	private static Label case5_0;
	@FXML
	private static Label case5_1;
	@FXML
	private static Label case5_2;
	@FXML
	private static Label case5_3;
	@FXML
	private static Label case5_4;
	@FXML
	private static Label case5_5;
	@FXML
	private static Label case5_6;
	@FXML
	private static Label case5_7;
	@FXML
	private static Label case5_8;
	@FXML
	private static Label case5_9;
	@FXML
	private static Label case5_10;
	@FXML
	private static Label case5_11;
	@FXML
	private static Label case5_12;
	@FXML
	private static Label case5_13;
	@FXML
	private static Label case5_14;
	@FXML
	private static Label case5_15;

	@FXML
	private static Label case6_0;
	@FXML
	private static Label case6_1;
	@FXML
	private static Label case6_2;
	@FXML
	private static Label case6_3;
	@FXML
	private static Label case6_4;
	@FXML
	private static Label case6_5;
	@FXML
	private static Label case6_6;
	@FXML
	private static Label case6_7;
	@FXML
	private static Label case6_8;
	@FXML
	private static Label case6_9;
	@FXML
	private static Label case6_10;
	@FXML
	private static Label case6_11;
	@FXML
	private static Label case6_12;
	@FXML
	private static Label case6_13;
	@FXML
	private static Label case6_14;
	@FXML
	private static Label case6_15;

	@FXML
	private static Label case7_0;
	@FXML
	private static Label case7_1;
	@FXML
	private static Label case7_2;
	@FXML
	private static Label case7_3;
	@FXML
	private static Label case7_4;
	@FXML
	private static Label case7_5;
	@FXML
	private static Label case7_6;
	@FXML
	private static Label case7_7;
	@FXML
	private static Label case7_8;
	@FXML
	private static Label case7_9;
	@FXML
	private static Label case7_10;
	@FXML
	private static Label case7_11;
	@FXML
	private static Label case7_12;
	@FXML
	private static Label case7_13;
	@FXML
	private static Label case7_14;
	@FXML
	private static Label case7_15;


	@FXML
	private static Button RestartG;

	@FXML
	private static Button QuitG;

	@FXML
	private static TextField ReponseJ;

	@FXML
	private static ImageView ImageM;

	@FXML
	private static GridPane grilleM;

	@FXML
	private static Pane PaneM;

	@FXML
	private static AnchorPane APaneM;

	@FXML
	private static BorderPane borderpane;

	public static void setBorderpane(BorderPane _borderpane) {
		borderpane = _borderpane;
	}

	private Pane getPane() {
		AnchorPane anchorpane = null;
		for (Node node : borderpane.getChildren()) {
			if (node instanceof AnchorPane) {
				anchorpane = ((AnchorPane) node);
			}
		}

		// get Pane from AnchorPane
		Pane p = null;
		for (Node node2 : anchorpane.getChildren()) {
			if (node2 instanceof Pane) {
				p = ((Pane) node2);
			}

		}
		return p;
	}

	@FXML
	void StartG(ActionEvent event) 
	{
		Tableau.listeMotsDico();
		Tableau.MotUtile();
		String motD = Tableau.listeMU.get(0);
		for(int i=0 ; i<=motD.length(); i++)
		{
			Tableau.tableauM[0][i]=motD.charAt(i);
		}

	}

	@FXML
	void RestartG(ActionEvent event) 
	{
		Pane p = getPane();


	}

	@FXML
	void QuitG(ActionEvent event)
	{
		Stage stage = (Stage) QuitG.getScene().getWindow();
		stage.close();
	}

}
