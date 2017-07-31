
public class Departments {
	
	Men men;
	Women women;
	Products product;
	Shopingorder shop;
	Departments(){
		
		
		dep();
	}
	
	public void dep()
	{
		System.out.println("welcome to department "+"\n");
		System.out.println("::::::MENS:::::"+"\n");
		
	/*	Products prod= new Products();
		
		System.out.println(prod.toString());*/
				
		
		men = new Men();
		men.mensProductdetails("menswatch", "watch1", 200, 2);
		System.out.println("name:"+men.productName+"\n"+"ID"+men.productID+"\n"+"price"+men.price+"\n"+"quanntity"+men.quantity+"\n");
		System.out.println("::::::WOMENS:::::"+"\n");
		women = new Women();
		women.womensProductdetails("womenswatch", "watch2", 300, 3);
		System.out.println("name:"+women.productName+"\n"+"ID"+women.productID+"\n"+"price"+women.price+"\n"+"quanntity"+women.quantity);
		
       //   addToCart();
		
	}
	
	
	
	/*public Shopingcart addToCart()
	{
		  product =new Products();
			
		
		Shopingcart shop= new Shopingcart(product);
		return shop;
	}*/
}
	
