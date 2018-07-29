package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Book;
import com.service.BookServiceI;

@Controller
public class BookController {

	private BookServiceI bookService;
		
	public BookServiceI getBookService() {
		return bookService;
	}

	@Autowired(required=true)
	@Qualifier(value="bookService")
	public void setBookService(BookServiceI bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/showform")
	public ModelAndView showForm()
	{
		return new ModelAndView("bookform","command",new Book());
	}
	
	@RequestMapping("/addbook")
	public String addBook(@ModelAttribute("book") Book book)
	{
		
		bookService.addBook(book);
		return "success";
	}
}
