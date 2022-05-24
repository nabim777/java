//proessing multiple result sets in jdbc


import java.sql.*;
class MultipleResultSetTest
{
	public static void main(String [] args)
{
	try
	{
		Connection con;
		int rsCount=0;
		String query= "select * from student; select * from student where scity ='pkra';" ;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?allowMultiQueries=true","root","u:nz48UV");
		Statement stmt= con.createStatement();
		boolean results =stmt.execute(query);
		do
		{
			if(results)
			{
				ResultSet rs= stmt.getResultSet();
				rsCount++;
				System.out.println("Result Set no:"+ rsCount);
				while(rs.next())
				{
					System.out.println("ID:"+rs.getInt("id"));
					System.out.println("Name:"+rs.getString("sname"));
					System.out.println("Phone:"+rs.getString("sphone"));
					System.out.println("City:"+rs.getString("scity"));
				}
				rs.close();
				results = stmt.getMoreResults();

			}
			
		}while(results);
		
			con.close();
			stmt.close();
	}catch(Exception e)
		{
			System.out.println(e);
		}


}				
}			
