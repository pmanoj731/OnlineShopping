package com.sample.jdbc;
import java.sql.Connection;


public class TestDBCalls {

	public static void main(String args[]) throws Exception
	{
		
		Connection conn=DBConnection.getDBConnection("mysql");
		try{
		conn.setAutoCommit(false);
		UsersTable.Register("jhon", "cena", "pmanoj731@gmail.com", "pmanoj731","manoj","manoj", conn);
		//UsersTable.updatePwd("javaclient", "new_password", conn);
		//UsersTable.deleteUser("javaclient", conn);
		//UsersTable.getUsersByCopmany("3", conn);
		conn.commit();
		}catch(Exception e)
		{
			conn.rollback();
		}
		finally{
			try{
				conn.close();
			}catch(Exception e){}
		}
	}
}
