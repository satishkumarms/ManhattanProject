package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDaoI {

	private SessionFactory sf;

	public SessionFactory getSf() {
	return sf;
	}
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public ProductDaoImpl() {

		}
	

	@Override
	public boolean addProduct(Product product)//adds product to product table
	{
		Session s=sf.openSession();
		s.getTransaction().begin();
		s.save(product);
		s.getTransaction().commit();
	return true;
	}

	@Override
	public List<Product> getProduct(String productName) //returns product object based on product name
	{
		
		Session s= sf.openSession();
		s.getTransaction().begin();
		Query query= s.createQuery("select p from Product p where p.getProductName() like  ? " );
		query.setParameter(0,"%"+productName+"%");
		
		return query.list();

		
	}

	@Override
	public boolean deleteProduct(Long productId) {
		
		Session s= sf.openSession();
		s.getTransaction().begin();
		Product product = (Product)s.get(Product.class,productId);
		s.delete(product);
		s.getTransaction().commit();
		return true;
	
	}

}
