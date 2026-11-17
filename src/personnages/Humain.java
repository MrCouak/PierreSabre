package personnages;

public class Humain {
	private String nom;
	private String boissonPreferee;
	protected int argent;
	
	public Humain(String nom, String boissonPreferee, int argent) {
		super();
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonPreferee + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPreferee + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " + bien + " à  " + prix + "  sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous.");
		}
	}
}
