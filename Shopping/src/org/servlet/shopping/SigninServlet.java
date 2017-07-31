package org.servlet.shopping;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import com.sample.jdbc.DBConnection;
import com.sample.jdbc.UsersTable;
import com.shopping.dao.UsersEntity;
import com.shopping.hibernate.DBHibernateSession;
import com.shopping.hibernate.HibernateUsersTable;


public class SigninServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		process(req,res);
		doPost(req,res);	
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		String validateusername = req.getParameter("uid");
		System.out.println("in signInservlet doPost "+validateusername);
		try{
		validateusername(req,res,validateusername);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	public void process(HttpServletRequest req,HttpServletResponse res)
	{
		
		Connection conn=null;
		SessionFactory session=DBHibernateSession.factory;
		Logger log=Logger.getLogger(SigninServlet.class);		
	try{
			
			conn=DBConnection.getDBConnection("mysql");
			conn.setAutoCommit(false);
			
			String userid=req.getParameter("id");
			String password=req.getParameter("pwd");
			
			//System.out.println(userid);
			//System.out.println(password);
			log.info("entered=" +userid  +password);
			try{
			boolean isValid=UsersTable.validateLogin(userid, password, conn);
			
			
			if(isValid){
				UsersEntity username = HibernateUsersTable.getDetailsByUseridHibernate(userid, session);
				log.info("username="+username.getfirst());
				
				if(username!=null){
				log.info("username : "+username.getfirst());
				req.setAttribute("username",username.getfirst());
				RequestDispatcher dispatcher = req.getRequestDispatcher("products.jsp");
				dispatcher.forward(req, res);
				}else{
					
					RequestDispatcher dispatcher = req.getRequestDispatcher("error.html");
					dispatcher.forward(req, res);
				}
			}else{
				
				res.sendRedirect("error.html");
			}
			}catch(Exception e){
				log.debug("error");
			
		   //	log.info("error"+e);
			//	log.error("error msg",e);
				e.printStackTrace();
			}
			conn.commit();
		}
		catch(Exception e)
		{
			try {
				conn.rollback();
			} catch (SQLException e1) {
				log.info("error"+e);
				
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally{
			try{conn.close();}catch(Exception e){}
		}
	}
	
	
	public void validateusername(HttpServletRequest req,HttpServletResponse res,String validateusername){
		
		Connection conn=null;
		try {
			conn=DBConnection.getDBConnection("mysql");
			
			
			System.out.println("in servlets "+validateusername);
			if (validateusername != "")
			{
				// AJAX call from the client
				try{
				System.out.println("in validteusername method, calling usertable.vlidateuser "+validateusername);
				boolean valid=UsersTable.validateuser( validateusername,conn);
				if(valid){
					System.out.println("after calling userTable.validateuser : "+valid);
					PrintWriter pw = res.getWriter();
					pw.write("success");
					pw.close();
				}
				else{
					System.out.println("after calling userTable.validateuser : "+valid);
					System.out.println("valid"+valid);
					PrintWriter pw = res.getWriter();
					pw.write("failed");
					pw.close();
				}
				}catch(Exception e){
					e.printStackTrace();
				}
			
			}
		
		}
		catch(Exception e)
		{
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally{
			try{conn.close();}catch(Exception e){}
		}
			
		
	}}

	
	


