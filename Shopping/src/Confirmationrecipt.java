
public class Confirmationrecipt {
	
	
String email="abc@gmail.com";
int phone=984968499;




	public boolean emailRecipt(String emailid,int phonenumber){
		
		this.email=emailid;
		this.phone=phonenumber;
		System.out.println("\n"+"send confirmmation recipt to email ");

		
		if(email.equals(emailid)&&phone==phonenumber)
		{
			
			
			System.out.println("\n"+"emailsent");
			
		}
			
				
		return true;
	}
	
	
	
}
