package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enseignant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String matricule;
	@Column
	private String ville;
	@Column
	private String adresse;
	@Column
	private int telephone;
	
	public Enseignant()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String nom, String prenom, String matricule, String ville, String adresse, int telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.ville = ville;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatriccule(String matricule) {
		this.matricule = matricule;
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

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	
}
