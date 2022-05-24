import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
class delete
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
			//step 3: execute a sql query or update
			String deleteQuery ="delete from students where id=2";
			myStatement.executeUpdate(deleteQuery);
			System.out.println("Delete Completed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
