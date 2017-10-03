package metier;

import javax.persistence.Entity;

@Entity
public class VinDeGarde extends Vin {

	private int nbAnneeMax;
	private int nbAnneeMin;

	public VinDeGarde() { }

	public VinDeGarde(String nom, int annee, int nbBouteilles, float prix, int aNbAnneeMax, int aNbAnneeMin) {
		super(nom, annee, nbBouteilles, prix);
		this.nbAnneeMax = aNbAnneeMax;
		this.nbAnneeMin = aNbAnneeMin;
	}

	public void setNbAnneeMax(int aNbAnneeMax) {
		this.nbAnneeMax = aNbAnneeMax;
	}

	public int getNbAnneeMax() {
		return this.nbAnneeMax;
	}

	public void setNbAnneeMin(int aNbAnneeMin) {
		this.nbAnneeMin = aNbAnneeMin;
	}

	public int getNbAnneeMin() {
		return this.nbAnneeMin;
	}
}