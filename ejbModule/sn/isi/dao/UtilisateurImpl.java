package sn.isi.dao;

import java.util.List;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import sn.isi.entities.Utilisateur;
@Stateless
public class UtilisateurImpl implements IUtilisateur {
	
	@PersistenceContext(unitName = "GestionIA_UP")
	private EntityManager em;
	
	public UtilisateurImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionIA_UP");
		em = emf.createEntityManager();
	}
	
	@Override
	public int add(Utilisateur uti) {
		try {
			em.getTransaction().begin();
			em.persist(uti);
			em.getTransaction().commit();
			return 1;
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Utilisateur> lister() {
		try {
			return em.createQuery("SELECT u From Utilisateur u").getResultList();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Utilisateur uti) {
		try {
			em.getTransaction().begin();
			em.merge(uti);
			em.getTransaction().commit();
			return 1;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int id) {
		try {
			em.getTransaction().begin();
			em.remove(em.find(Utilisateur.class, id));
			em.getTransaction().commit();
			return 1;
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	@Override
	public Utilisateur get(int id) {
		return em.find(Utilisateur.class, id);
	}

	@Override
	public Utilisateur logon(String email, String password) {
		try {
			return (Utilisateur)em.createQuery("SELECT u FROM Utilisateur u WHERE u.email = :em AND u.password = :pass")
					.setParameter("em", email)
					.setParameter("pass", password)
					.getSingleResult();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
