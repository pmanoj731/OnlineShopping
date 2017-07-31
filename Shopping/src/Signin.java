
public class Signin {

	 String userID;
	 String password;
	
	 Departments dept;
	
	public Departments signinSucessfull(String user_id, String user_password,Register reg)
	{
		
this.userID=user_id;
	this.password=user_password;
		
		if(userID != null && password != null)
		{
			
			
			
			if(reg.userName.equals(this.userID) && reg.createPassword.equals(this.password) )
			
			{
			    System.out.println("Credentials Accepted.");
			    

		}
			
		else
		{
			System.out.println("Please try again.");
		}   
		
		}
		dept= new Departments();
		return dept;
		
		
	}
	
	}
