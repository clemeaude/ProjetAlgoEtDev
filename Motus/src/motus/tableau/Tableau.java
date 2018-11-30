package motus.tableau;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Tableau {

	private int score;
	private String reponse;
	private String motD;
	public static char tableauM[][];
	public static char motJoueur [] = {};
	private static ArrayList<String> listeMD = new ArrayList<String>();
	public static ArrayList<String> listeMU = new ArrayList<String>();
	public static ArrayList<Character> tabLettreRS = new ArrayList<Character>();
	public static ArrayList<Character> tabLettreWS = new ArrayList<Character>();

	public Tableau(int score, String reponse, String motD, char[][] tableauM) 
	{
		this.score = score;
		this.reponse = reponse;
		this.motD = motD;
		Tableau.tableauM = tableauM;
	}

	public Tableau()
	{
		this.score = 0;
		this.reponse = "";
		this.motD = "";
		Tableau.tableauM = null;
	}

	public static void listeMotsDico ()
	{
		String pathFichier = "C:\\Users\\Cédric\\Desktop\\Dico.txt";

		BufferedReader fluxEntree = null;
		String line;

		try {

			//Creation du flux vers le fichier texte utilise

			fluxEntree = new BufferedReader (new FileReader (pathFichier));

			//Lecture d'une ligne aleatoire
			while (( line = fluxEntree.readLine()) != null)
			{

				String ligneLue = fluxEntree.readLine();	

				ligneLue = fluxEntree.readLine();
				listeMD.add(ligneLue);
			}


		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if (fluxEntree != null)
				{
					fluxEntree.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	public static void MotUtile ()
	{
		Random r = new Random ();
		int ligne = r.nextInt(listeMD.size()) +1 ;
		listeMU.add((listeMD.get(ligne)));					
	}

	public static char[] motDsTab(String m)
	{
		motJoueur = new char [m.length()];
		for(int i=0;i<m.length();i++)
		{
			motJoueur[i]=m.charAt(i);
		}
		return motJoueur;
	}
	
	public static void rightSpot(String a1 , String a2) 
	{
		ArrayList<Character> tabLettreRS2 = new ArrayList<Character>();
		tabLettreRS.clear();
		tabLettreRS2.clear();
		int i=0;
		while (i != a1.length())
		{
			if(a1.charAt(i) == a2.charAt(i))
			{
				tabLettreRS.add(a2.charAt(i));
				tabLettreRS2.add(a2.charAt(i));

			}
			i++;	
		}
	}



}
