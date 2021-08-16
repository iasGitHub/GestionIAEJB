package sn.isi.dao;

import java.util.List;

import javax.ejb.Local;

import sn.isi.entities.Utilisateur;

@Local
public interface IUtilisateur {
	public int add (Utilisateur uti);
	public Utilisateur logon(String email, String password);
	public List<Utilisateur> lister();
	public int update(Utilisateur uti);
	public int delete(int id);
	public Utilisateur get(int id);
}
