package com.sample.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class UsersTable {
		static SessionFactory factory=new Configuration().configure().buildSessionFactory();
		static Logger log=Logger.getLogger(UsersTable.class);
		public static void insertUser(String userid,String password, String company,Connection conn) throws  SQLException
	    {
	        PreparedStatement stmt = null;
	        try
	        {
	        	System.out.println("enttered into try block");
	            stmt = conn.prepareStatement("insert into users (user,password,company) values (?,?,?)");
	            stmt.setString(1, userid);
	            stmt.setString(2, password);
	            stmt.setString(3, company);
	            try{
	            	stmt.executeUpdate();
	            }
	           catch(SQLException e)
	            {
	        	   e.printStackTrace();
	        	   System.out.println("executed not command"); 
	            }
	          
	        }
	        catch (SQLException e)
	        {
	        	throw e;
	        }
	        finally
	        {
	            try{
	            	stmt.close();} catch(SQLException s){}
	        }
	    }

		
		//updateOrder("john","new_pasword")
		public static void updatePwd(String uid,String pwd, Connection conn) throws  SQLException
	    {
	        PreparedStatement stmt = null;
	        try
	        {
	            stmt = conn.prepareStatement("update users set password=? where user=?");
	            stmt.setString(1, pwd);
	            stmt.setString(2, uid);
	            stmt.executeUpdate();
	        }
	        catch (SQLException e)
	        {
	        	throw e;
	        }
	        finally
	        {
	            try{
	            	stmt.close();} catch(SQLException s){}
	        }
	     
	    }
		

		public static void deleteUser(String delUid,Connection conn) throws  SQLException
	    {
	        PreparedStatement stmt = null;
	        try
	        {
	            stmt = conn.prepareStatement("delete from users where user=?");
	            stmt.setString(1, delUid);
	            int rowsupdated=stmt.executeUpdate();
	        }
	        catch (SQLException e)
	        {
	        	throw e;
	        }
	        finally
	        {
	            try{
	            	stmt.close();} catch(SQLException s){}
	        }
	     
	    }

		public static boolean getUsersByCopmany(String company,Connection conn) throws SQLException 
	    {
			//date="03/20/15"
	        PreparedStatement stmt = null;
	        ResultSet resultSet = null;
	        boolean result=false;
	        try
	        {
	        	stmt = conn.prepareStatement("select user from users where company=?");
	            stmt.setString(1, company);
	            resultSet = stmt.executeQuery();
	            while (resultSet.next())
	            {
	            	System.out.println(resultSet.getString("user"));
	            }
	        }
	        catch (SQLException e)
	        {
	        	System.out.println("Exception occired");
	        	e.printStackTrace();
	            throw e;
	        }
	        finally
	        {
	        	try{
	        		resultSet.close(); } catch(SQLException s){}
	            try{
	            	stmt.close();} catch(SQLException s){}
	        }
	        
	        return result;
	    }

	

		public static boolean validateLogin(String userid,String pwd,Connection conn) throws SQLException 
	    {
			//date="03/20/15"
	        PreparedStatement stmt = null;
	        ResultSet resultSet = null;
	        boolean result=false;
	        try
	        {
	        	System.out.println("in usersTable entered in try block ");
	        	stmt = conn.prepareStatement("select pwd from customer where username=? and pwd=?");
	        	stmt.setString(1, userid);
	        	stmt.setString(2, pwd);
	        	try{
	            resultSet = stmt.executeQuery();
	        	}catch(Exception e){
	        		e.printStackTrace();
	        	}
	            if(resultSet.next())
	            	return true;
	            else
	            	return false;
	        }
	        catch (SQLException e)
	        {
	        	System.out.println("Exception occired");
	        	e.printStackTrace();
	            throw e;
	        }
	        finally
	        {
	        	try{
	        		resultSet.close(); } catch(SQLException s){}
	            try{
	            	stmt.close();} catch(SQLException s){}
	        }
	        
	    }



		public static boolean validateuser(String validateusername,Connection conn) throws SQLException 
	    {
			//date="03/20/15"
	        PreparedStatement stmt = null;
	        ResultSet resultSet = null;
	        boolean result=false;
	        try
	        {
	        	System.out.println("in validateuser method "+validateusername);
	        	stmt = conn.prepareStatement("select username from customer where username=?");
	        	stmt.setString(1, validateusername);
	        	try{
	            resultSet = stmt.executeQuery();
	        	}catch(SQLException e){
	        		System.out.println("error at executeQuery");
	        	}
	            if(resultSet.next())
	            	return true;
	            else
	            	return false;
	        }
	        catch (SQLException e)
	        {
	        	System.out.println("Exception occired");
	        	e.printStackTrace();
	            throw e;
	        }
	        finally
	        {
	        	try{
	        		resultSet.close(); } catch(SQLException s){}
	            try{
	            	stmt.close();} catch(SQLException s){}
	        }
	        
	    }




	

		public static boolean Register(String firstname,String lastname,String Email,String userid,String pwd,String confirmpwd,Connection conn) throws SQLException 
	    {
		
	        PreparedStatement stmt = null;
	        try
	        {
	        	stmt = conn.prepareStatement("insert into customer (firstname,lastname,Email,username,pwd,confirmpwd) values(?,?,?,?,?,?)");
	        	stmt.setString(1, firstname);
	        	stmt.setString(2, lastname);
	        	stmt.setString(3, Email);
	        	stmt.setString(4, userid);
	        	stmt.setString(5, pwd);
	        	stmt.setString(6, confirmpwd);
	            stmt.executeUpdate();
	            
	            
	        }
	        catch (SQLException e)
	        {
	        	System.out.println("Exception occired");
	        	e.printStackTrace();
	            throw e;
	        }
	        finally
	        {
	        		            try{
	            	stmt.close();} catch(SQLException s){}
	        }
	       return true; 
	    }


}

