package com.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Book;
import com.dao.BookDaoI;

@Service
public class BookServiceImpl implements BookServiceI {
private BookDaoI bookDao;

	
	public BookDaoI getBookDao() {
	return bookDao;
}

	public void setBookDao(BookDaoI bookDao) {
	this.bookDao = bookDao;
}

	
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		
		bookDao.addBook(book);
		return true;
	
	}

	

}
