import java.util.*;
import java.util.Map.Entry;

public abstract class Joueur {
	
	//***********************************ATTRIBUTS***********************************
	protected int nbCartesMain;
	protected HashSet<Carte> main = new HashSet<Carte>();
	
	//***********************************GETTERS ET SETTERS***********************************
	public int getNbCartesMain() {
		return nbCartesMain;
	}

	public void setNbCartesMain(int nbCartesMain) {
		this.nbCartesMain = nbCartesMain;
	}
	
	//***********************************PIOCHER ET JOUER UNE CARTE***********************************
	public void piocherCarte(Pioche p) {
		this.main.add(p.tirerCarte());
	}
	
	public void jouerCarte(Carte c, Talon t) {
		this.retirerCarte(c);
		t.poserCarte(c);
	}
	
	public void retirerCarte(Carte c) {
		this.main.remove(c);
	}
	
	//***********************************AFFICHER LA MAIN DU JOUEUR***********************************
	public void afficherMain() {
		Iterator<Carte> it = this.getIterator();
		System.out.println("Votre main est :\t");
		while (it.hasNext()) {
			Carte c = it.next();
			System.out.println(c);
		}
	}
	
	public Iterator<Carte> getIterator() {
		return this.main.iterator();
	}
	
	//***********************************AUTRES METHODES***********************************
	public boolean testerCarte(Carte c1, Carte c2) {
		if (c1.getCouleur() == c2.getCouleur() || c1.getValeur() == c2.getValeur()) {
			return true;
		} else {
			return false;
		}
		
	}
}
