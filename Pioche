import java.util.*;

public class Talon {
	
	//***********************************ATTRIBUTS***********************************
	private LinkedList<Carte> tas = new LinkedList<Carte>();
	private Carte derniereCarte;
	private int derniereCouleur;
	private int nbCartesTalon = 0;
	
	//***********************************GETTERS ET SETTERS***********************************
	public Carte getDerniereCarte() {
		return derniereCarte;
	}

	public void setDerniereCarte(Carte derniereCarte) {
		this.derniereCarte = derniereCarte;
	}

	public int getNbCartesTalon() {
		return nbCartesTalon;
	}

	public void setNbCartesTalon(int nbCartesTalon) {
		this.nbCartesTalon = nbCartesTalon;
	}
	
	public int getDerniereCouleur() {
		return derniereCouleur;
	}

	public void setDerniereCouleur(int derniereCouleur) {
		this.derniereCouleur = derniereCouleur;
	}
	
	//***********************************POSER CARTE SUR TALON***********************************
	public void poserCarte(Carte c) {
		this.setDerniereCarte(c);
		this.setDerniereCouleur(c.getCouleur());
		this.setNbCartesTalon(this.nbCartesTalon + 1);
		System.out.println("Il y a " + this.getNbCartesTalon() + " carte(s) sur le talon \t");
		this.tas.add(c); //Carte ajoutée à la fin de la likedList (Last)
	}
	
	public void afficherDerniereCarte() {
		System.out.println("La derniere carte du talon est : " + this.tas.getLast() + "\t");
	}
	
}
