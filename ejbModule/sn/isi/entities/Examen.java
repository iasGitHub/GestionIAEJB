package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Examen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String intitule;
	@Column
	private String lieu;
	
	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Examen(String intitule, String lieu) {
		super();
		this.intitule = intitule;
		this.lieu = lieu;
	}
	
	
	
}
