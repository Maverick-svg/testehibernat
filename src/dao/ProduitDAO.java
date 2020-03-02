package dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Produit;

public class ProduitDAO implements IProduitDAO {
	SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	
	


	@Override
	public int creat(Produit pr) {
		
		try {
		session.beginTransaction();
		session.save(pr);
		session.getTransaction().commit();
		session.close();
		return 1;
		}catch(HibernateException e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int supr(int id) {
		try {
		session.beginTransaction();
		Produit produit = new Produit();
		produit.setIdProduit(id);
		session.delete(produit);
		session.getTransaction().commit();
		return 1;
	}catch(HibernateException e) {
		e.printStackTrace();
		return 0;
	}
		
	

}}
