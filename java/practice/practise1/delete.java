import java.io.*;
class delete
{
	public static void main(String args[])
	{
		File f=new File("/home/nabin/Documents/nabin.txt");
		if(f.delete())
		{
			System.out.println("Deleted the file"+ f.getName());
		}
		else
		{
			System.out.println("An error occurs");
		}
	}
}
