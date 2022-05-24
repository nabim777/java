import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;;
import java.util.Scanner;


public class StudentQuery
{
	static Connection con;
	public StudentQuery()
	{
		try
		{
			con = JDBCConnect.connect();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void insertStudent(Student s)
	{
		try
		{
			String query = "insert into student(sname,sphone,scity) values(?,?,?)"; 
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,s.getName());
			stmt.setString(2,s.getPhone());
			stmt.setString(3,s.getCity());
			stmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}

	public void listAllStudents()
	{
		String phone, name, city;
		int id;
		try
		{
			Statement stmt = con.createStatement();
			String query = "select * from student ";
			ResultSet rs = stmt.executeQuery(query);			
			while(rs.next())
			{
				id = rs.getInt("id");
				name = rs.getString("sname");
				phone = rs.getString("sphone");
				city = rs.getString("scity");
			
				Student s= new Student (id, name, phone, city);
				System.out.println(s);			

			}

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void searchStudent(String stdname)
	{
		String phone, name, city;
		int id;
		try
		{
			Statement stmt = con.createStatement();
			String query = "select * from student ";
			ResultSet rs = stmt.executeQuery(query);			
			while(rs.next())
			{
				name = rs.getString("sname");
				if(stdname.equals(name))
				{
					id = rs.getInt("id");
					phone = rs.getString("sphone");
					city = rs.getString("scity");
				
					Student s= new Student (id, name, phone, city);
					System.out.println("Success!" + stdname+ "found");
					System.out.println(s);	
					return;
				}
						

			}
			System.out.println(stdname +"not found");

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public boolean searchStudent(int id)
	{
		String phone, name, city;
		int aid;
		try
		{
			Statement stmt = con.createStatement();
			String query = "select * from student ";
			ResultSet rs = stmt.executeQuery(query);			
			while(rs.next())
			{
				name = rs.getString("id");
				if(aid==id)
				{
					return true;
				}
						

			}
			return false;
		}catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public void searchStudentById(int id)
	{
		
	}
	public void updateCity(int idd)
	{
		/*String phone, name, city;
		try
		{
			boolean flag = this.searchStudentByID(idd);
			if(flag== false)
			{
				System.out.println("Student with id:"+ idd+ "doesnot exist");
				return;
			}
			String query = "update student set scity=? where id=?";
			PreparedStatement stmt= con.preparestatement
		}
		*/
	}
	
	
}
