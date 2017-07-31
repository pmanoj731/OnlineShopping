import java.util.*;

public interface Ishopingorder {
	
	
	boolean addProduct(Products p);
	boolean removeProduct(String pid) throws ProductNotFoundException;
	Collection<Products> getCartDetails();
	Products getProductFromCart(String pid) throws ProductNotFoundException;
	int productCount();
    double getCartPrice();

	
	
	
}
