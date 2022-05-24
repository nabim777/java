import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
class FirstApp
{
	public static void main(String ... args)
	{
		try
		{
			String dbUrl="jdbc:mysql://localhost:3306/student";
			String username="root";
			String password="u:nz48UV";
			//step 1: get a connection
			Connection myConnection= DriverManager.getConnection(dbUrl,username,password);
			//step 2: get a statement object
			Statement myStatement=myConnection.createStatement();
			//step 3:execute query
			ResultSet myResultSet=myStatement.executeQuery("Select * from students");
			//process the result set.
			while(myResultSet.next())
			{
				System.out.println("Student full name:" + myResultSet.getString("firstname")+ " " + myResultSet.getString("lastname"));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
