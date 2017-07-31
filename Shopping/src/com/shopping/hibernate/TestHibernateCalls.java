package com.shopping.hibernate;
import org.hibernate.SessionFactory;

import com.shopping.dao.UsersEntity;
public class TestHibernateCalls {

	public static void main(String args[]) throws Exception
	{
		
		SessionFactory factory=DBHibernateSession.factory;
		try{
			boolean auth=false;
			
			
	    HibernateUsersTable.RegisterUserHibernate("innocoreit", "pegasus", "Email","innocore","pass","pass", factory);
		auth=HibernateUsersTable.validateLoginHibCriteria("innocore", "pass", factory);
		System.out.println(auth);
					
			
		/*
		UsersTable.insertUserHibernate("javaclient111", "javaclient111", "java", factory);
		auth=UsersTable.validateLoginHibCriteria("javaclient111", "javaclient111", factory);
		System.out.println(auth);
		
		
		UsersTable.updatePwdHibernate("javaclient111", "new_password", factory);
		auth=UsersTable.validateLoginHibernateHQuery("javaclient111", "new_password", factory);
		System.out.println(auth);
	
		UsersTable.updatePwdHibernateHquery("javaclient111", "new_password2", factory);
		auth=UsersTable.validateLoginHibernateHQuery("javaclient111", "new_password2", factory);
		System.out.println(auth);
		
		UsersTable.deleteUserHibernate("javaclient111", factory);
		auth=UsersTable.validateLoginHibCriteria("javaclient111", "new_password", factory);
		System.out.println(auth);
*/
     //UsersEntity ue=HibernateUsersTable.getDetailsByUseridHibernate("innocore", factory);
	//System.out.println(ue);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try{
			}catch(Exception e){}
		}
	}
}
