package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public abstract class Vin {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int numero;
	private String nom;
	private int annee;
	private int nbBouteilles;
	private float prix;

	@ManyToOne
	public Producteur leProducteur;

	public Vin() { }

	public Vin(String nom, int annee, int nbBouteilles, float prix) {
		this.nom = nom;
		this.annee = annee;
		this.nbBouteilles = nbBouteilles;
		this.prix = prix;
	}

	public void setNumero(int aNumero) {
		this.numero = aNumero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNom(String aNom) {
		this.nom = aNom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setAnnee(int aAnnee) {
		this.annee = aAnnee;
	}

	public int getAnnee() {
		return this.annee;
	}

	public void setNbBouteilles(int aNbBouteilles) {
		this.nbBouteilles = aNbBouteilles;
	}

	public int getNbBouteilles() {
		return this.nbBouteilles;
	}

	public void setPrix(float aPrix) {
		this.prix = aPrix;
	}

	public float getPrix() {
		return this.prix;
	}

	public Producteur getLeProducteur() {
		return leProducteur;
	}

	public void setLeProducteur(Producteur leProducteur) {
		this.leProducteur = leProducteur;
	}
}