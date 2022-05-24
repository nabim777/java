import java.io.*;
class createfile1
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("/home/nabin/Documents/nabin.txt");
			if(f.createNewFile())
			{
				System.out.println("Created file:"+f.getName());
			}
			else
			{
				System.out.println("Not created of file");
			}
		}
		catch(IOException e)
		{
			System.out.println("Error occurs");
		}
		
	}
}
