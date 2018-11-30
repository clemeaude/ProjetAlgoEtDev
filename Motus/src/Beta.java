


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Beta {
	
	public static int score =1400;
	public static ArrayList<String> listeMDico = new ArrayList<String>();
	public static ArrayList<String> listeMUtil = new ArrayList<String>();
	public static char motJoueur [] = {};
	public static ArrayList<Character> nb = new ArrayList<Character>();
	public static ArrayList<Character> tabLettreRS = new ArrayList<Character>();
	public static ArrayList<Character> tabLettreWS = new ArrayList<Character>();
	
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
				listeMDico.add(ligneLue);
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
				int ligne = r.nextInt(listeMDico.size()) +1 ;
				listeMUtil.add((listeMDico.get(ligne)));					
		
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
						/*if((!tabLettreRS.contains(tabLettreRS2.get(i))))
						{
							tabLettreRS.add(tabLettreRS2.get(i));
						}*/
				}
			i++;	
		}
	}
	
	public static void wrongSpot(String a1, String a2)
	{
		tabLettreWS.clear();
		for(int i=0;i<a1.length();i++)
		{
			for (int j=1;j<a2.length()-1;j++)
			{
				if(a1.charAt(i) == a2.charAt(j) && a1.charAt(i) != a2.charAt(i))
					if((!tabLettreRS.contains(a2.charAt(j))))
							tabLettreWS.add(a2.charAt(j));
			}
		}
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
	
	public static ArrayList<Character> motDsArray(String m)
	{
		for(int i=0;i<m.length();i++)
		{
			nb.add(m.charAt(i));
		}
		return nb;
	}
	
	public static void main(String arg[])
	{
		Boolean endGame=false;
		listeMotsDico();
		MotUtile();
		String motD = listeMUtil.get(0);
		Scanner sc = new Scanner(System.in);
		String motJ = null;
		System.out.println("--------------------------");
		System.out.println("|  Bienvenue dans Motus  |");
		System.out.println("-------------------------- ");
		motDsTab(motD);
		//System.out.println(motJoueur);
		System.out.println("\n Le mot comporte : "+motD.length()+" lettres\n La premiere lettre est : "+motD.charAt(0));
		System.out.println("\n Quel est le mot ? \n");
		while(score > 0 && endGame == false)
		{
			motJ=sc.nextLine();
			motJ=motJ.toUpperCase();
			motDsArray(motJ);
			if(motJ.length()==motD.length())
			{
				if(score >0)
					{
						if(motD.compareTo(motJ)==0)
							{
								System.out.println("Felicitation ! Votre score est de : "+score);
								endGame=true;
							}
						else
							{
								score = score-200;
								System.out.println("Votre score potentiel est de : "+score+" points \n");
								rightSpot(motD,motJ);
								System.out.println("Les lettres situées au bon endroit sont : "+tabLettreRS+"\n");
								wrongSpot(motD,motJ);
								System.out.println("Les lettres existantes situées au mauvais endroit sont : "+tabLettreWS+"\n");
							}
						if(score == 0)
						{
							System.out.println("Désolé vous avez perdus, le mot a deviner était :"+ motD);
						}
					}
		}
	}
	sc.close();
}
}
