import javax.servlet.http.HttpServlet;

public class Register extends HttpServlet  {

	String userName;
	String createPassword;
	String email;
	Address address;	
	 public boolean signupDetails(String user_name,String create_password,String mail,Address addr)throws Exception
	 
	 {
		 this.userName=user_name;
		 this.createPassword=create_password;
		 this.email=mail;
		 this.address=addr;

		try{ 
		 
		 if(userName != null && createPassword != null && email!=null)
			 
			
		   {
			 
				    System.out.println("details correct"+"\n"+"Name:"+this.userName+"\n"+"email:"+this.email+"\n"+"address:"+this.address.City);
			 
		   }
			 
			else
	
				{
				System.out.println("Please try again.");
			
				}
	 }
		
		finally{
			
			System.out.println("closed conection");
		}
	 
	 return true;
	 }
		 
	 }
	
	
	
	
	
	

