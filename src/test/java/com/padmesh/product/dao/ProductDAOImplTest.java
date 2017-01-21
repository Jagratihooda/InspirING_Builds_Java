package com.padmesh.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.*;

import com.padmesh.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public static void main(String[] args) {

  ProductDAO dao = new ProductDAOImpl();
  Product product = new Product();
  product.setId(1);
  product.setName("Ihone");
  product.setDescription("its awesome");
  product.setPrice(800);
  dao.create(new Product());
  
//  dao.create(product);
  //Product result = dao.read(1);
//assertNotNull(result);
//assertEquals("Iphone",result.getName());
  
	Class c=null;;
	try {
		c = Class.forName("com.padmesh.product.dto.Product");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       // System.out.println("Fields =");

        // returns the array of Field objects representing the public fields
       // Field f[] = cls.getFields();
       // for (int i = 0; i < f.length; i++) {
//           System.out.println(f[i]);

		//assertNotNull(f(i));
		//assertEquals("ING_",f(i).substring(0,3));

        //}

 boolean flag=false;
 int i;
  System.out.println(c.getName());  
  Field[] S=c.getFields();
  S=c.getDeclaredFields();
  System.out.print(S.length);  
  for( i=0;i<=S.length-1;i++){
	  System.out.println(S[i]);  
	String y=  S[i].toString();
	if(y.contains("ING_")){
		flag=true;
	}
	y=S[i].toString();
	  System.out.println(flag);  

	}
//assertNotNull(S[i]);
assertEquals(true,flag);
}
}
