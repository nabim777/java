import java.io.*;  // Import the File class
import java.io.*;
import java.util.Scanner;


public class employee 
{
  public static void main(String[] args)
   {
   	int id;
   	String name;
   	float salary;
   	Scanner sc= new Scanner(System.in);
   	File f = new File("/home/nabin/Documents/emp.txt");
   	FileWriter writer = new FileWriter(f,true);
   	BufferedWriter bwriter = new BufferedWriter(writer);
   	
   	System.out.println("Enter id");
   	id=sc.nextInt();
   	
   	System.out.println("Enter name");
   	name=sc.next();
   	
   	System.out.println("Enter Salary");
   	salary=sc.nextFloat();
   	
 	String record = id + "," +name +","+ salary + "\n";
 	bwriter.writer(record);
 	bwriter.close();
 	writer.close();
   	
    
  }
}
