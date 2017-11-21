import java.util.*;

public class JoueurIA extends Joueur {
	
	//***********************************ATTRIBUT DE JOUEURIA***********************************
	private int id;

	//***********************************CONSTRUCTEUR***********************************
	public JoueurIA(int i) {
		this.setId(i);
	}
	
	//***********************************GETTERS ET SETTERS***********************************
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//***********************************METHODE TOSTRING***********************************
	public String toString() {
		String name = "Joueur " + this.getId();
		return name;
	}
	
	/*public String jouer() {
		
	}*/
	
	public void jouerFacile(Talon t,  Pioche p) {
		Iterator<Carte> it = this.getIterator();
		Carte i = it.next();
		while (it.hasNext() && !this.testerCarte(i, t.getDerniereCarte())) {
			i = it.next();
		}
		if (testerCarte(i,t.getDerniereCarte()) == true) {
			this.jouerCarte(i, t);
			System.out.println(this + " a joué la carte "+ i);
		} else {
			this.piocherCarte(p);
			System.out.println(this + " a pioché.");
		}
	}
	
	public void jouerDifficile() {
		
	}
}
