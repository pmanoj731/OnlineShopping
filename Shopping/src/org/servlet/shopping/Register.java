package org.servlet.shopping;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shopping.hibernate.DBHibernateSession;
import com.sample.jdbc.DBConnection;
import com.sample.jdbc.UsersTable;
import com.shopping.hibernate.HibernateUsersTable;

public class Register extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		process(req,res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		process(req,res);
	}
	
	public void process(HttpServletRequest req,HttpServletResponse res)
	{
		//Connection conn=null;
		try{
			SessionFactory session=DBHibernateSession.factory;
		
			// For hibernate 
              //For JDBC
		//	conn=DBConnection.getDBConnection("mysql");
		//	conn.setAutoCommit(false);
			String firstname=req.getParameter("firstname");
			String lastname=req.getParameter("lastname");
			String Email=req.getParameter("emailID");
			String userid=req.getParameter("regid");
			String password=req.getParameter("pwd");
			String confirmpassword=req.getParameter("pwd");
			System.out.println(firstname);
			System.out.println(lastname);
			System.out.println(Email);
			System.out.println(userid);
			System.out.println(password);
			System.out.println(confirmpassword);
			//FOR Hibernate
			boolean reg=HibernateUsersTable.RegisterUserHibernate(firstname, lastname, Email, userid, password, confirmpassword,session);
		     //for JDBC 
			// boolean reg=UsersTable.Register(firstname, lastname, Email, userid, password, confirmpassword, conn);
			if(reg){
				System.out.println("in if statement : "+reg);
				res.sendRedirect("registersucessfull.html");
			}
			else{
				System.out.println("in else statement : "+reg);
				res.sendRedirect("error.html");
			}
			//conn.commit();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		finally{
			
		}
	}
}