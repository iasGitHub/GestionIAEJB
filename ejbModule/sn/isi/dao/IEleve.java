package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Eleve;

public interface IEleve {

	public int add(Eleve el);
	public List<Eleve> lister();
	public int update(Eleve el);
	public int delete(int id);
	public Eleve get(int id);
	public Eleve logon(String email, String password);
}
