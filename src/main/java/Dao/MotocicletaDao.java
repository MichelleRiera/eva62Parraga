package Dao;

import java.io.Serializable;
import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import modelo.Motocicleta;


@Stateless
public class MotocicletaDao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Motocicleta motocicleta) {
		em.persist(motocicleta);
	}
	
	public void update(Motocicleta motocicleta) {
		em.merge(motocicleta);
	}
	
	public Motocicleta read(Integer motocicleta_id) {
		Motocicleta m = em.find(Motocicleta.class, motocicleta_id);
	    return m;
	}

	
	public void delete(String placa) {
		Motocicleta m = em.find(Motocicleta.class, placa);
		em.remove(m);
	}
	
	public List<Motocicleta> getAll(){
		String jpql = "SELECT m FROM Motocicleta m";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}
	

     
}