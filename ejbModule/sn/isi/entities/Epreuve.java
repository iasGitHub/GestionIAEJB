package sn.isi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Epreuve {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private Date date;
	@Column
	private int coefficient;
	
	public Epreuve() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Epreuve(String nom, Date date, int coefficient) {
		super();
		this.nom = nom;
		this.date = date;
		this.coefficient = coefficient;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficeint(int coefficient) {
		this.coefficient = coefficient;
	}
	
	
}
