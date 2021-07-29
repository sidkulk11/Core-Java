package arraylist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



/*1.	Create a connection
2.	Create a query/statement
3.	Execute the statement 
4.	Close connection 
*/


public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {
		
		// Connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborc1","hr","hr");
		
		// Create a query/statement
		Statement stmt=con.createStatement();
		//String s="insert into student values(101, 'Scott')";
		String s="update student set sname ="KIM" where sid=105";
		
		//Execute statement/Query
		stmt.executeQuery(s);
		
		//Close the connection
		con.close();
		
		System.out.println("Program is completed");

	}

}
