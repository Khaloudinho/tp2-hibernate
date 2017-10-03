package metier;

import javax.persistence.Entity;

@Entity
public class VinConsommable extends Vin {

	public VinConsommable(String nom, int annee, int nbBouteilles, float prix) {
		super(nom, annee, nbBouteilles, prix);
	}

	public VinConsommable() {
	}
}