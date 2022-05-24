import java.io.FileWriter;
import java.io.IOException;
class writefile
{
	public static void main(String args[])
	{
		try
		{
			FileWriter w=new FileWriter("/home/nabin/Documents/nabin.txt");
			w.write("I am a Nalem7");
			w.close();
			System.out.println("Sucessfully Written!!!");
		}
		catch(IOException e)
		{
			System.out.println("Errors occurs");
		}
		
	}
}
