package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.bean.Book;

@Repository
public class BookDaoImpl implements BookDaoI {
	private static final Logger logger = LoggerFactory.getLogger(BookDaoImpl.class);

private SessionFactory sf;

	public SessionFactory getSf() {
	return sf;
}
public void setSf(SessionFactory sf) {
	this.sf = sf;
}

	public boolean addBook(Book book) {
		
			Session s=sf.openSession();
			s.getTransaction().begin();
			s.save(book);
			s.getTransaction().commit();
		return true;
	}

}
