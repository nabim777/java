//import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
class insert
{
	public static void main(String ... args)
	{
		String dbUrl="jdbc:mysql://localhost:3306/student";
		String user="root";
		String password="u:nz48UV";
		try
		{
			//step1: getting the connection
			Connection myConnection= DriverManager.getConnection(dbUrl,user,password);
			//step2: to create a statement objects
			Statement myStatement = myConnection.createStatement();
			//step3: execute a sql query or update
			String sqlQuery= "insert into students(id, firstname, lastname) values(2,'Hari','Grg');";
			myStatement.executeUpdate(sqlQuery);
			System.out.println("Insertion completed");		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
