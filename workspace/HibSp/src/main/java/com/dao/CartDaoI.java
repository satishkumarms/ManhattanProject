package com.dao;

import com.bean.Cart;
import com.bean.Customer;

public interface CartDaoI 
{

	public boolean addCart(Cart cart);
	public boolean deleteCart(Customer customer);
}
