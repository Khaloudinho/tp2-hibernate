package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private String numero;
	private String rue;
	private String codepostal;

	public Adresse() {}

	public Adresse(String aNumero, String aRue, String aCP) {
		this.numero = aNumero;
		this.rue = aRue;
		this.codepostal = aCP;
	}

	public void setNumero(String aNumero) {
		this.numero = aNumero;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setRue(String aRue) {
		this.rue = aRue;
	}

	public String getRue() {
		return this.rue;
	}

	public void setCP(String aCP) {
		this.codepostal = aCP;
	}

	public String getCP() {
		return this.codepostal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
}