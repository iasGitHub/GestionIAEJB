package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etablissement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String code;
	@Column
	private String nomEtab;
	@Column
	private String ville;
	@Column
	private String adresse;
	
	public Etablissement()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Etablissement(String code, String nomEtab, String ville, String adresse) {
		super();
		this.code = code;
		this.nomEtab = nomEtab;
		this.ville = ville;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNomEtab() {
		return nomEtab;
	}

	public void setNomEtab(String nomEtab) {
		this.nomEtab = nomEtab;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}
