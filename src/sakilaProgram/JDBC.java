package sakilaProgram;
import java.sql.*;

public class JDBC {
	
	
	static final String JDBC_Driver = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/sakila";
	static final String Username = "root";
	static final String Password = "AstroA50";
	
	public void accessDB() {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, Username, Password);
			System.out.println("Connection Made.");
		}
		
		catch (SQLException error) {
			System.out.println(error);
			} 
		
		catch (Exception e) {
			  System.out.println(e);
			} 
		
		finally {
			try {
				if (stmt != null)
					conn.close();
			  } 
			  
			  catch (SQLException se) { 
			  }
			
			  try {
			    if (conn != null) 
			      conn.close();
			  } 
			  
			  catch (SQLException se) {
			    System.out.println("Connection Closed");
			  }

			}
	}
	
}	



