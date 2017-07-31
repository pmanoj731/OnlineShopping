package com.shopping.hibernate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.sample.jdbc.UsersTable;

import com.shopping.dao.CreditCard;
import com.shopping.dao.ProductsEntity;
import com.shopping.dao.UsersEntity;
import com.shopping.dao.address;


public class HibernateUsersTable {

	static Logger log=Logger.getLogger(UsersTable.class);
	
	public static boolean RegisterUserHibernate(String firstname,String lastname,String Email,String userid,String pwd,String confirmpwd,SessionFactory factory) throws  SQLException
    {
		  Session session = factory.openSession();
	      Transaction tx = null;
	      String employeeuserid= null;
	      try{
	    	  System.out.println("entered in try block of RegisterUserHibernate method");
	         tx = session.beginTransaction();
	         UsersEntity employee = new UsersEntity (firstname,lastname,Email,userid,pwd,confirmpwd);
	         employeeuserid = (String) session.save(employee);
	         tx.commit();
	         System.out.println("end of try block of RegisterUserHibernate method");
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return true;
    }	
	
	/*public static String retriveUser(String userid,Connection conn) throws SQLException 
    {
		log.info("entered into reteiveuser method : "+userid);
		
		
		Session session=factory.openSession(
		
    }*/

 
		public static void insertUserHibernate(String userid,String password, String company,SessionFactory factory) throws  SQLException
	    {
			  Session session = factory.openSession();
		      Transaction tx = null;
		      String employeeuserid= null;
		      try{
		         tx = session.beginTransaction();
		         UsersEntity employee = new UsersEntity(userid,password,company);
		         employeeuserid = (String) session.save(employee);
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
	    }
		
		
		public static ProductsEntity insertProducts(String username ,String productName,String productPrice, String quantity ,SessionFactory factory) throws  SQLException
	    {
			ProductsEntity products = null;
			  Session session = factory.openSession();
		      Transaction tx = null;
		      String employeeuserid= null;
		      try{
		         tx = session.beginTransaction();
		         products = new ProductsEntity(productName,productPrice,quantity,username);
		         employeeuserid = (String) session.save(products);
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      return products;
	    }
		

		public static address insertAddresss(String doornumber ,String city,String state, String zip ,SessionFactory factory) throws  SQLException
	    {
			address addr = new address();
			  Session session = factory.openSession();
		      Transaction tx = null;
		      
		      try{
		    	  tx = session.beginTransaction(); 
		    	  addr.setDoornumber(doornumber);
		    	  addr.setCity(city);
		    	  addr.setState(state);
		    	  addr.setZip(zip);
		    	  session.save(addr);
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      return addr;
	    }
		
		
		public static boolean validateDetails(String nameoncard ,String cardnumber,String month, String year,String cvv ,SessionFactory factory) throws  SQLException
	    {
			CreditCard card = null;
			  Session session = factory.openSession();
		      Transaction tx = null;
		      String employeeuserid= null;
            try
		        {
				
					session.beginTransaction();
					Criteria criteria = session.createCriteria(CreditCard.class);
					criteria.add(Restrictions.eq("name", nameoncard));
					criteria.add(Restrictions.eq("cnumber", cardnumber));
					criteria.add(Restrictions.eq("month", month));
					criteria.add(Restrictions.eq("year", year));
					criteria.add(Restrictions.eq("cvv", cvv));
					 card = (CreditCard ) criteria.uniqueResult();
	 				if(card!=null)
						return true;
					else
						return false;
		        }
		        catch (Exception e)
		        {
		        	System.out.println("Exception occired");
		        	e.printStackTrace();
		            throw e;
		        }
		        finally
		        {
		        }
		      
	    }
		
 		public static void updatePwdHibernate(String uid,String pwd, SessionFactory factory) throws  SQLException
	    {
		      Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		         
		         UsersEntity employee =  (UsersEntity)session.get(UsersEntity.class, uid); 
		         if(employee!=null){
			         employee.setpwd(pwd);
					 session.update(employee); 			          
		         }
				 tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }

	    }
		

 		public static void deleteUserHibernate(String delUid,SessionFactory factory) throws  SQLException
	    {
			      Session session = factory.openSession();
			      Transaction tx = null;
			      try{
			         tx = session.beginTransaction();
			         UsersEntity employee = new UsersEntity(delUid);
			         session.delete(employee); 
			         tx.commit();
			      }catch (HibernateException e) {
			         if (tx!=null) tx.rollback();
			         e.printStackTrace(); 
			      }finally {
			         session.close(); 
			      }
	    }
 		
 		public static UsersEntity getDetailsByUseridHibernate(String userid,SessionFactory factory) throws SQLException 
	    {
			Session session = factory.openSession();
		    
			Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		         Object result=session.get(UsersEntity.class, userid);
		         
		         if(result==null)
		        	 return null; // -1 if recrd not found
		         UsersEntity employee = (UsersEntity) result;
		         return employee;
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		         return null;// -2 if internal hibernate error.
		      }finally {
		         session.close(); 
		      }
	    }
	
 
 		public static boolean validateLoginHibCriteria(String userid,String pwd,SessionFactory sf) throws SQLException 
	    {
			try
	        {
				Session session = sf.openSession();
				session.beginTransaction();
				Criteria criteria = session.createCriteria(UsersEntity.class);
				criteria.add(Restrictions.eq("uname", userid));
				criteria.add(Restrictions.eq("pwd", pwd));
				UsersEntity employee = (UsersEntity ) criteria.uniqueResult();
 				if(employee!=null)
					return true;
				else
					return false;
	        }
	        catch (Exception e)
	        {
	        	System.out.println("Exception occired");
	        	e.printStackTrace();
	            throw e;
	        }
	        finally
	        {
	        }
	    }
 		// list similar to executeQuery in sql
 		public static boolean validateLoginHibernateHQuery(String userid,String pwd,SessionFactory sf) throws SQLException 
	    {
			try
	        {
				Session session = sf.openSession();
				session.beginTransaction();
				// FROM com.sample.dao.UsersEntity empl where empl.uid= and empl.pwd=
				String hql = "FROM UsersEntity E WHERE E.uid= :inputUserid and E.pwd= :inputPass";
				Query query = session.createQuery(hql);
				query.setParameter("inputUserid", userid);
				query.setParameter("inputPass", pwd);
				List<UsersEntity> results = query.list();
				
				if(results==null || results.size()==0)
					return false;
				else
					return true;
	        }
	        catch (Exception e)
	        {
	        	System.out.println("Exception occired");
	        	e.printStackTrace();
	            throw e;
	        }
	        finally
	        {
	        }
	    }

 		//executeUpdate similar to sql executeUpdate used for update,delete,insert
 		public static void updatePwdHibernateHquery(String uid,String pwd, SessionFactory factory) throws  SQLException
	    {
		      Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		         
		         Query query=session.createQuery("update UsersEntity set pwd = :inputPwd where uid = :inputUser");
		         query.setParameter("inputUser", uid);
		         query.setParameter("inputPwd", pwd);
				 int result = query.executeUpdate();
					
				 tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }

	    }

}
