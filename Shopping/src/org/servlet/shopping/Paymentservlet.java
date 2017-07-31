package org.servlet.shopping;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.shopping.dao.CreditCard;
import com.shopping.dao.ProductsEntity;
import com.shopping.dao.address;
import com.shopping.hibernate.DBHibernateSession;
import com.sample.jdbc.DBConnection;
import com.sample.jdbc.UsersTable;
import com.shopping.hibernate.HibernateUsersTable;



public class Paymentservlet extends HttpServlet{

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
			Logger log=Logger.getLogger(Products.class);	
			// For hibernate 
              //For JDBC
		//	conn=DBConnection.getDBConnection("mysql");
		//	conn.setAutoCommit(false);
			
			String doornumber=req.getParameter("address");
			String city=req.getParameter("city");
			String state=req.getParameter("state");
			String zip=req.getParameter("zip");
			
			log.info(doornumber);
			log.info(city);
			log.info(state);
			log.info(zip);
			
			String nameoncard=req.getParameter("nameoncard");
			String cardnumber=req.getParameter("creditcardnumber");
			String month=req.getParameter("month");
			String year=req.getParameter("year");
			String cvv=req.getParameter("cvv");
			String username=req.getParameter("username");
			
			log.info(cardnumber);
			log.info(month);
			log.info(year);
			log.info(cvv);
		
			address insert=HibernateUsersTable.insertAddresss(doornumber, city, state, zip, session);
 if(insert!=null)

 {
	 log.info("insertaddress");
	
			if (cardnumber!=null)
			{
				boolean cardresult =HibernateUsersTable.validateDetails(nameoncard, cardnumber, month, year, cvv,session);
				if(cardresult)
				{
					req.setAttribute("address",insert.getDoornumber());
					req.setAttribute("city",insert.getCity());
					req.setAttribute("state",insert.getState());
					req.setAttribute("zip",insert.getZip());
					req.setAttribute("username",username);
					 log.info("carddetails");
					RequestDispatcher dispatcher = req.getRequestDispatcher("paymentconfirmation.jsp");
					dispatcher.forward(req, res);
					}
				
				else{
						RequestDispatcher dispatcher = req.getRequestDispatcher("error.html");
						dispatcher.forward(req, res);
					}
				}
 }
 else
 { 
	 
	 RequestDispatcher dispatcher = req.getRequestDispatcher("error.html");
	dispatcher.forward(req, res);
	 
 }
				
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		finally{
			
		}
	}
}