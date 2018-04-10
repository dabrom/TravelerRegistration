package edu.dmacc.spring.travelerregistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TravelerDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("TravelerRegistration");
	
	public void insertTraveler(Traveler travelerToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(travelerToAdd);
		em.getTransaction().commit();
		em.close();
		
	}

	public List<Traveler> getAllTravelers() {
		// TODO Auto-generated method stub
		
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select t from Traveler t";
		TypedQuery<Traveler> typedQuery = em.createQuery(q, Traveler.class);
		List<Traveler> all = typedQuery.getResultList();
		return all;
	}
}
