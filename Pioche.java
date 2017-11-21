import java.util.*;
//import java.util;

public class Pioche {
	
	//***********************************ATTRIBUTS***********************************
	//ArrayList pour utiliser shuffle
	private ArrayList<Carte> tas = new ArrayList<Carte>();
		
	//private myEnum test;
	//enum myEnum{Coeur, Pic, Trefle};
	
	//***********************************CREATION DES CARTES***********************************
	public void creerCartes() {
		for (int i=0; i<=3; i++) {
			for (int k=0; k<=12; k++) {
				this.tas.add(new Carte(k,i));
			}
		}
	}
	
	//***********************************MELANGER LA PIOCHE***********************************
	public void melanger() {
		Collections.shuffle(this.tas);
	}
	
	//***********************************TIRER CARTE***********************************
	public Carte tirerCarte() {
		Carte c = this.tas.get(0);
		this.tas.remove(0);
		return c;
	}
	
	//***********************************BOOLEAN PIOCHE VIDE ET REFAIRE PIOCHE***********************************
	public boolean tasVide() {
		if (this.tas.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
		
	public void refairePioche() {
			
	}
		
	public Iterator<Carte> getIterator() {
		Iterator<Carte> it = this.tas.iterator();
		return it;
	}
}
