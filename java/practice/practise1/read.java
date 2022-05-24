import java.io.*;
import java.util.*;
public class read
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("/home/nabin/Documents/nabin.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
			{
				String data=sc.nextLine();
				System.out.println(data);
			}
			
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("an Error occured");
		}
	}
}
