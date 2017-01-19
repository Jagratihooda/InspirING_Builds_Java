package com.padmesh.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.padmesh.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {

  ProductDAO dao = new ProductDAOImpl();
  Product product = new Product();
  product.setId(1);
  product.setName("Ihone");
  product.setDescription("its awesome");
  product.setPrice(800);
  dao.create(new Product());
  
  dao.create(product);
  Product result = dao.read(1);
assertNotNull(result);
assertEquals("Iphone",result.getName());
  
	}

}
