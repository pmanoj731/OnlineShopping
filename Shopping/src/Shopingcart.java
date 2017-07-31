import java.util.Iterator;

public class Shopingcart {
	
Carddetails carddetail;

Shopingorder shop;
Products p;
Shopingcart()
{
	
	System.out.println( "\n"+":::::::::::::your cart:::::::::::::: ");
	p= new Products();
}




public Carddetails biling(Products p)

{
	
   System.out.println("detail of the selected project"+"\n"+"price:"+ p.price);  
	
	
	carddetail=new Carddetails();
	
	return carddetail;
	
}



}
