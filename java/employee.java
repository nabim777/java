import java.io.*;  // Import the File class
import java.util.Scanner;


public class employee 
{
  public static void main (String[] args) throws IOException,FileNotFoundException
   {
   	int id;
   	String name;
   	float salary;
   	Scanner sc= new Scanner(System.in);
   	FileWriter w= new FileWriter("/home/nabin/Documents/emp.txt",true);

   	BufferedWriter bw= new BufferedWriter(w);
   	System.out.println("Enter ID");
   	id=sc.nextInt();
   	
   	System.out.println("Enter name");
   	name=sc.next();
   	
   	System.out.println("Enter Salary");
   	salary=sc.nextFloat();
   	System.out.println("\n");
   	
 	String record = id + "," +name +","+ salary + "\n";
 	bw.write(record);
 	bw.close();
 	w.close();
   	
    
  }
}
