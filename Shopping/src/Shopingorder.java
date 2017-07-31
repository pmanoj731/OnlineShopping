import java.util.*;

public  class Shopingorder implements Ishopingorder {
		//Register reg;
		//public String uid=reg.userName;
		public HashMap<String, Products> map;
		
		public Shopingorder(){
			map = new HashMap<String, Products>();
		}
	/*	public Shopingorder(String Uid)
		{
			this.uid=uid;
			map = new HashMap<String, Products>();
		}//Order*/
		
		public boolean addProduct(Products p){
			if(map.containsKey(p.getproductID())){
				Products p1 = map.get(p.getproductID());
				p1.setPrice(p1.getPrice()+p.getPrice());
				p1.setquantity(p1.getquantity()+p.getquantity());
				return true;	
			}
			map.put(p.getproductID(),p);
			return false;
		}//addProduct
		
		public boolean removeProduct(String productID) 
	    throws ProductNotFoundException {
			if(map.containsKey(productID)){
				map.remove(productID);
				return true;
			}else throw new ProductNotFoundException(
	      "Product with ID "+productID+" is not Found.");
		}
		
		public Collection<Products> getCartDetails()
		{
			return map.values();
		}
		
		public Products getProductFromCart(String productID) 
	    throws ProductNotFoundException {
			if(map.containsKey(productID)){
				return map.get(productID);
			}else {
				throw new ProductNotFoundException(
	        "Product with ID "+productID+" is not Found.");
			}
		}
		
		public int productCount(){
			return map.size();
		}
	  
	  public double getCartPrice() {
		  
	    double price = 0.0d;
	    Iterator<Products> iterator = getCartDetails().iterator();
	    while(iterator.hasNext()){
	      price+= iterator.next().getPrice();
	    }
	    return price;
	  }
	  
	  
	  
	}
	
	
	
	
	
	
	
	
	
	
	

