package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bean.Supplier;

public class SupplierDaoImpl implements SupplierDaoI {

	public SupplierDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	private SessionFactory sf;

	public SessionFactory getSf() {
	return sf;
	}
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public boolean addSupplier(Supplier supplier) {
		Session s=sf.openSession();
		s.getTransaction().begin();
		s.save(supplier);
		s.getTransaction().commit();
	return true;
	}

}
