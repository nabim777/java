import java.util.Scanner;

public class input
{
	public static void main(String args[])
	{
		System.out.println("Input the strings:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		System.out.println("Enter the number");
		int num=sc.nextInt();	
		
		System.out.println("You have input this string:"+ name);	
		System.out.println("You have type this number:" + num);
		
	 
			
	}
}
