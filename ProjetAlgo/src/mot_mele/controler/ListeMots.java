package mot_mele.controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ListeMots {

		static ArrayList<String> listeMDico = new ArrayList<String> () ;
		static ArrayList<String> listeMUtil = new ArrayList<String> () ;
		
		public void listeMotsDico ()
		{
			String pathFichier = "C:\\\\Users\\\\chtic\\\\Desktop\\\\Université\\\\Licence\\\\semestre 5\\\\AlgoDev\\\\dicofr.txt";
			
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
		
		
		
		public void listeMotsUtil ()
		{
			int j =0;
			
			
				for (int i=0; i<10;i++)
				{
					
						while (j < 10) 
						{
							Random r = new Random ();
							
							int ligne = r.nextInt(listeMDico.size()) +1 ;
							
							String motTrouve = listeMDico.get(ligne);
							
							int a = motTrouve.length();
							
							if ( a <11 )
							{
								listeMUtil.add((listeMDico.get(ligne)));
								j++;
							}
						}
						
					
		
			}
			for(String p: listeMUtil)
		       {
		       	 System.out.println (p.toLowerCase());
		       }
			
		}
		
		public void afficherListeMots ()
		{
			
			for (int i = 0; i< listeMDico.size(); i++)
			{
				System.out.println(listeMDico.get(i));
			}
			
		}
		
		
}
		
	
						
					
			
		
		
		
