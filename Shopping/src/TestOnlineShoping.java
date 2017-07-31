import java.util.*;

public class TestOnlineShoping {

	public static void main(String[] args) throws Exception {
		
	OnlineShoping ob=new OnlineShoping();	
	Register reg= new Register();
	Address info=new Address("line1","line2","city",1234);	

	//System.out.println("name on card is:: "+ob.shopingCart.carddetail.nameOnCard);
	//System.out.println("card number is :: "+ob.shopingCart.carddetail.cardNumber);

    reg.signupDetails("abc","password","xyz@gmail.com",info);
   
	Signin sign= new Signin();
	sign.signinSucessfull("abc","password",reg);
	
	Shopingorder o=new Shopingorder();	

	o.addProduct(new Products("101","mens watch",12,120));
	o.addProduct(new Products("102","womens watch",4,140));
	o.addProduct(new Products("103"," watch",5,222));
o.removeProduct("103");
	
	System.out.println("\nNo. of Product : "+o.productCount());
	System.out.println ("Order Places By: "+reg.userName);
	

	 System.out.println ("Cart Total : "+o.getCartPrice()+System.getProperty("line.separator"));  
	 
	   Iterator<Products> it = o.getCartDetails().iterator();
		while(it.hasNext()){
			
			System.out.println (System.getProperty("line.separator")+it.next());
	
		}
		
    Shopingcart s =new Shopingcart();

	
	Carddetails carddetails= new Carddetails();
	carddetails.paymentSucessfull("Manoj",1234567890,"sep16",234);
	
	
	Confirmationrecipt confirm =new Confirmationrecipt();
	confirm.emailRecipt("abc@gmail.com",984968499);
	

		

}}
