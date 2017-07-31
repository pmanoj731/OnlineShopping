
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

import com.shopping.dao.ProductsEntity;
import com.shopping.hibernate.DBHibernateSession;
import com.sample.jdbc.DBConnection;
import com.sample.jdbc.UsersTable;
import com.shopping.hibernate.HibernateUsersTable;

public class Products extends HttpServlet{

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
			String productname=req.getParameter("productName");
			String productprice=req.getParameter("productPrice");
			String productquantity=req.getParameter("quantity");
			String username=req.getParameter("username");
			
			log.info(productname);
			log.info(productquantity);
			log.info(productquantity);
			log.info(username);
		
			
			if (productname!=null && productname!="")
			{
				ProductsEntity Products =HibernateUsersTable.insertProducts(username,productname, productprice, productquantity, session);
				
				if(Products!=null)
				{
					
					log.info("ProductName : "+Products.getPname());
					req.setAttribute("ProductName",Products.getPname());
					log.info("ProductPrice : "+Products.getPprice());
					req.setAttribute("ProductPrice",Products.getPprice());
					log.info("ProductQuantity : "+Products.getQuantity());
					req.setAttribute("quantity",Products.getQuantity());
					req.setAttribute("username",username);
					RequestDispatcher dispatcher = req.getRequestDispatcher("payment.jsp");
					dispatcher.forward(req, res);
					}
				
				else{
						RequestDispatcher dispatcher = req.getRequestDispatcher("error.html");
						dispatcher.forward(req, res);
					}
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