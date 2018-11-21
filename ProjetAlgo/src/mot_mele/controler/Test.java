package mot_mele.controler;

import java.io.IOException;


public class Test {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Grille15x15 g = new Grille15x15 ();
		
		ListeMots l = new ListeMots();
				
		l.listeMotsDico();
		
		System.out.println("Voici la liste des mots a rechercher dans la grille\n");
		l.listeMotsUtil();
		
	
		
		for (int i=0; i<10; i++)
		{
			g.creation(i, l);
		}
			
		
		
		System.out.println("\nVoici maintenant la grille de mot mélés \n\n\n\n");
		g.afficheGrille();
		
		
		
	}

}
