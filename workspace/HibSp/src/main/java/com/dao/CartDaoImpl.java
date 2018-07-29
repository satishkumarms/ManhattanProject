package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bean.Cart;
import com.bean.Customer;
import com.bean.Product;

public class CartDaoImpl implements CartDaoI {

	private SessionFactory sf;

	public SessionFactory getSf() {
	return sf;
	}
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public boolean addCart(Cart cart) 
	{
		Session s=sf.openSession();
		s.getTransaction().begin();
		s.save(cart);
		s.getTransaction().commit();
	return true;

	}

	@Override
	public boolean deleteCart(Customer customer) {
		Session s= sf.openSession();
		s.getTransaction().begin();
		Query query= s.createQuery("select c from Cart c where c.getCustomerId() where  ? " );
		query.setParameter(0,"customer.getCustomerId()");
		for(Cart c: (List<Cart>)query.list())
		{
			
			s.delete(c);
			
		}
		s.getTransaction().commit();
		return true;
	}

	
}
