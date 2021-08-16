package sn.isi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.isi.entities.Eleve;

public class EleveImpl implements IEleve {

	private EntityManager em;
	
	public EleveImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionIA_UP");
		em = emf.createEntityManager();
	}
	
	@Override
	public int add(Eleve el) {
		try {
			em.getTransaction().begin();
			em.persist(el);
			em.getTransaction().commit();
			return 1;
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Eleve> lister() {
		try {
			return em.createQuery("SELECT u From Eleve u").getResultList();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Eleve el) {
		try {
			em.getTransaction().begin();
			em.merge(el);
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
			em.remove(em.find(Eleve.class, id));
			em.getTransaction().commit();
			return 1;
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	@Override
	public Eleve get(int id) {
		return em.find(Eleve.class, id);
	}

	@Override
	public Eleve logon(String email, String password) {
		try {
			return (Eleve)em.createQuery("SELECT u FROM Eleve u WHERE u.email = :em AND u.password = :pass")
					.setParameter("em", email)
					.setParameter("pass", password)
					.getSingleResult();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
	}

}
