import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCConnect
{
	static Connection con;
	public static Connection connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String user = "root";
			String password = "u:nz48UV";
			String url = "jdbc:mysql://localhost:3306/student";
			con = DriverManager.getConnection(url,user,password);
			return con;
		}catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
}
