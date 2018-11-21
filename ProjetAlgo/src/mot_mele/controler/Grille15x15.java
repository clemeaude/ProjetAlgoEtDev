package mot_mele.controler;

import java.util.ArrayList;
import java.util.Random;

public class Grille15x15 {
	
	static char [][] grille = new char [15][15];
	
	public Grille15x15 ()
	{
		for (int i=0; i< 15;i++)
		{
			for (int j=0; j<15;j++)
			{
				char vide = '0';
				grille[i][j] =  vide;
			}
		}
	}
	
	
	
	

	
	 public void afficheGrille ()
		{
		 String str = "";
		 for (int i = 0; i <15; i++){
		     for (int j = 0; j < 15; j++) {
		          str = str + grille[i][j] + "\t";
		     }
		     System.out.println(str);
		     str = "";
		 }
		}
	 
	 public void creation ( int i, ListeMots l)
		{
			
			
				String mot = l.listeMUtil.get(i);
				
				int a = mot.length();
				char [] tab = new char [a];
	
				int nbCase1 =0;
				
				//Placement du premier mot de la liste de mot utilisé
				if (i == 0)
				{
					for (int j=0; j<a;j++)
					{
						
						tab[j]= mot.charAt(j);
						tab[j] = Character.toLowerCase(tab[j]);
						grille[nbCase1][0] = tab[j];
						nbCase1 = nbCase1 + 1;
					}
				}
				
				//Placement du deuxieme mot de la liste de mot utilisé
					
				int nbCase2=1;
				
				if (i == 1)
				{
					for (int k=0; k<a;k++)
					{
						
						tab[k]= mot.charAt(k);
						tab[k] = Character.toLowerCase(tab[k]);
						grille[0][nbCase2] = tab[k];
						nbCase2 = nbCase2 + 1;
					}
				}
				
				int nbCase3=1;
				int colonneCase =1;
				
				
				if (i == 2)
				{
					for (int z=0; z<a;z++)
					{
						
						tab[z]= mot.charAt(z);
						tab[z] = Character.toLowerCase(tab[z]);
						grille[nbCase3][colonneCase ] = tab[z];
						nbCase3 = nbCase3 + 1;
						colonneCase = colonneCase + 1;
						
					}
				}
				
				int colonneCase1=0;
				
				
				
				if (i == 3)
				{
					for (int z=0; z<a;z++)
					{
						
						tab[z]= mot.charAt(z);
						tab[z] = Character.toLowerCase(tab[z]);
						grille[12][colonneCase1] = tab[z];
						
						colonneCase1 = colonneCase1 + 1;
						
					}
				}
				
				
				int ligneCase2 =14;
				
				
				if (i == 4)
				{
					for (int z=0; z<a;z++)
					{
						
						tab[z]= mot.charAt(z);
						tab[z] = Character.toLowerCase(tab[z]);
						grille[ligneCase2][14] = tab[z];
					
						ligneCase2 = ligneCase2 - 1;
						
					}
				}
				
				int colonneCase2 =12;
				
				
				if (i == 5)
				{
					for (int z=0; z<a;z++)
					{
						
						tab[z]= mot.charAt(z);
						tab[z] = Character.toLowerCase(tab[z]);
						grille[14][colonneCase2 ] = tab[z];
						
						colonneCase2 = colonneCase2 -1;
						
					}
				}
				
			
				int colonneCase3 = 3;
				if (i == 6)
				{
					for (int y=0; y<a;y++)
					{
						
						tab[y]= mot.charAt(y);
						tab[y] = Character.toLowerCase(tab[y]);
						grille[2][colonneCase3 ] = tab[y];
						colonneCase3 = colonneCase3 + 1;
						
					}
				}
				
				int colonneCase4 = 14;
				
				
				if (i == 7)
				{
					for (int u=0; u<a;u++)
					{
						
						tab[u]= mot.charAt(u);
						tab[u] = Character.toLowerCase(tab[u]);
						grille[1][colonneCase4 ] = tab[u];
						colonneCase4 = colonneCase4 - 1;
						
					}
				}
				
				int ligneCase3 = 3; 
				
				if (i == 8)
				{
					for (int p=0; p<a;p++)
					{
						
						tab[p]= mot.charAt(p);
						tab[p] = Character.toLowerCase(tab[p]);
						
						grille[ligneCase3][12] = tab[p];
						ligneCase3 = ligneCase3 + 1 ;
						
					}
				}
				
				
				int colonneCase5 = 1;
				
				if (i == 9)
				{
					for (int n=0; n<a;n++)
					{
						
						tab[n]= mot.charAt(n);
						tab[n] = Character.toLowerCase(tab[n]);
						grille[9][colonneCase5 ] = tab[n];
						
						colonneCase5 = colonneCase5 + 1;
						
					}
				}
				
				for (int h=0; h<15;h++)
				{
					for (int m=0; m<15;m++)
					{
						if ( grille[h][m] == '0' || grille[h][m] == ' ')
						{
							Random rand = new Random ();
							char c = (char) (rand.nextInt(26) + 97);
							grille[h][m]=c;
						}
					}
					
				}
				
					
					
					
					
		}
	 
	/* public void verifierMot (int colonneCase, int ligneCase, int nbMot)
	 {
		 if (grille[ligneCase][colonneCase] ==  l.listeMUtil.get(0))
		 {
			 
		 }
	 }*/
	 
	 
	
	

		
		
		
}

