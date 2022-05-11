package sn.simplon.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.simplon.entities.Category;

public class CategoryImpl implements ICategory {
	private EntityManager em;
	public CategoryImpl() {
		// TODO Auto-generated constructor stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaProject");
		em = emf.createEntityManager();
	}

	@Override
	public int add(Category category) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.persist(category);
			em.getTransaction().commit();
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Category category) {
		// TODO Auto-generated method stub
		
		try {
			em.getTransaction().begin();
			em.merge(category);
			em.getTransaction().commit();
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public List<Category> getAll() {
		try {
			return em.createQuery("SELECT c FROM Category c").getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}


	@Override
	public Category getId(int id) {
		// TODO Auto-generated method stub
		try {
			return em.find(Category.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
