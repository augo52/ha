import java.util.*;

public class Partie {
	
	//***********************************ATTRIBUTS***********************************
	//ArrayList pour pouvoir identifier les joueurs
	private ArrayList<Joueur> joueursListe = new ArrayList<Joueur>();
	private Pioche pioche = new Pioche();
	private Talon talon = new Talon();
	private int nbJoueurs;
	private boolean sensHoraire;
	private boolean estTerminee;
	private int nbCarteInit = 7;
	private int jCourant;
	
	//***********************************CONSTRUCTEUR***********************************
	public Partie(int i) {
		this.setNbJoueurs(i);
		this.setSensHoraire(true);
		this.setEstTerminee(false);
		
		this.creerPioche();
		this.creerJoueurs(i);
		this.distribuer();
		this.poserPremiereCarte();
		
		this.designerJCourant();
		
		
		
	}
	
	//***********************************GETTERS ET SETTERS***********************************
	public void setNbJoueurs(int i) {
		this.nbJoueurs = i;
	}
	
	public int getNbJoueurs() {
		return nbJoueurs;
	}

	public void setSensHoraire(boolean b) {
		this.sensHoraire = b;
	}
	
	public boolean isSensHoraire() {
		return sensHoraire;
	}

	public boolean isEstTerminee() {
		return estTerminee;
	}

	public void setEstTerminee(boolean estTerminee) {
		this.estTerminee = estTerminee;
	}

	public int getNbCarteInit() {
		return nbCarteInit;
	}

	public void setNbCarteInit(int nbCarteInit) {
		this.nbCarteInit = nbCarteInit;
	}
	
	public int getjCourant() {
		return jCourant;
	}

	public void setjCourant(int jCourant) {
		this.jCourant = jCourant;
	}

	//***********************************CREATION PIOCHE ET JOUEURS***********************************
	public void creerPioche() {
		this.pioche.creerCartes();
		this.pioche.melanger();
	}
	
	public void creerJoueurs(int nbJoueurs) {
		this.joueursListe.add(new JoueurReel());
		for (int i=1; i<nbJoueurs; i++) {
			this.joueursListe.add(new JoueurIA(i));
		}
	}
	
	//***********************************DISTRIBUTION DES CARTES ET POSER PREMIERECARTE***********************************
	public void distribuer() {
		Iterator<Joueur> it = this.getIterator();
		for (int i=0; i<this.getNbJoueurs(); i++) {
			if (it.hasNext()) {
				Joueur j = it.next();
				for (int k=0; k<this.getNbCarteInit(); k++) {
						j.piocherCarte(this.pioche);
				}
			}
		}
	}
	
	public Iterator<Joueur> getIterator() {
		return this.joueursListe.iterator();
	}
	
	public void poserPremiereCarte() {
		Carte c = this.pioche.tirerCarte(); //Piocher une carte
		this.talon.poserCarte(c); //Poser la carte sur le talon
		this.talon.afficherDerniereCarte();
	}
	
	//***********************************DESIGNER JCOURANT***********************************
	public int randomJCourant() {
		int random = (int)(Math.random() * (this.nbJoueurs));
		this.setjCourant(random);
		return random;
	}
	
	public Joueur designerJCourant() {
		int i = this.randomJCourant();
		System.out.println(this.joueursListe.get(i) + " commence");
		return this.joueursListe.get(i);
	}
	
	//***********************************AUTRES METHODES***********************************
	/*public Joueur joueurGagnant() {
		
	}
	
	public boolean estTerminee() {
		
	}*/
}
