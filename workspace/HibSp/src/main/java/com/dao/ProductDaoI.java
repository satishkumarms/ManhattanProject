package com.dao;

import java.util.List;

import com.bean.Product;

public interface ProductDaoI 
{
public boolean addProduct(Product product);
public List<Product> getProduct(String productName);
public boolean deleteProduct(Long productId);

}
