package com.miniproject.productmgmtsys.service;

import java.util.List;

import com.miniproject.productmgmtsys.model.Product;

public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> saveAllProduct(List<Product> productList);
	public List<Product> getAllProduct();
	public Product getProductById(Integer id);
	public String deleteProduct(Integer id);
	public Product editProduct(Product product,Integer id);
	
}
