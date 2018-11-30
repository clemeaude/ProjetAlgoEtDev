package motus.tableau;

public class Case {
	
	private String valeur;
	private boolean initialise;
	
	protected Case() {

		this.valeur = "";
		this.initialise = false;
	}
	
	/**
	 * Cr�er la case de coordonn�e [y][x].
	 * @param y
	 * 		La ligne o� se situe la case.
	 * @param x
	 * 		La colonne o� se situe la case.
	 */
	public Case(int y, int x) {

		this.valeur = "";
		this.initialise = false;
	}
	
	public String getValeur() {
		return this.valeur;
	}
	
	public boolean getInitialise() {
		return this.initialise;
	}
	
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
	protected void setInitialise(boolean initialise) {
		this.initialise = initialise;
	}
	
	public String afficheCase() {
		String str = "x: " + ", y: " + ", val" + getValeur() + ", init? " + getInitialise();
		return str;
	}

}
