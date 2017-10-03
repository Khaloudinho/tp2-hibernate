package metier;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Producteur {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;

	@OneToOne
	private Adresse adresse;
	private String nom;


	public Producteur() {
	}

	public Producteur(Adresse adresse, String nom) {
		this.adresse = adresse;
		this.nom = nom;
	}

	public Producteur(String aNom) {
		throw new UnsupportedOperationException();
	}

	public void setNom(String aNom) {
		this.nom = aNom;
	}

	public String getNom() {
		return this.nom;
	}
}