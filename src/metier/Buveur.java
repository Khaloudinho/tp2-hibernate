package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Buveur {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private String nom;
	private String prenom;

	@ManyToMany
	public Set<Vin> vins;

	public Buveur() { }

	public Buveur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.vins = new HashSet<Vin>();
	}

	public void setNom(String aNom) {
		this.nom = aNom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setPrenom(String aPrenom) {
		this.prenom = aPrenom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Vin> getVins() {
		return vins;
	}

	public void setVins(Set<Vin> vins) {
		this.vins = vins;
	}
}