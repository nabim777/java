
import java.io.*;
public class bufferReader
{
public static void main(String args[]) throws IOException
{   
	InputStreamReader ins = new InputStreamReader(System.in);
	BufferedReader areader = new BufferedReader(ins);
	System.out.println("Enter a string");
	String a = areader.readLine();
    System.out.println("Enter a number");
	int n = Integer.parseInt(areader.readLine());
	System.out.println("Enter a number");
	int n1 = Integer.parseInt(areader.readLine());
	System.out.println("Entered number" + n);
	System.out.println("Entered number" + n1);
	System.out.println("Entered string" + a);
}
}