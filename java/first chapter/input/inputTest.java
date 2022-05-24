import java.util.Scanner;
public class inputTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("n="+ n);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		System.out.println("n="+ n);
	    System.out.println("Enter a Floating point:");
		float x= sc.nextFloat();
		System.out.println("Input number = " +x);
		sc.nextLine();
		System.out.println("Enter a string:");
		String a= sc.nextLine();
		System.out.println("Input String = " +a);
		System.out.println("Enter a string:");
		a= sc.nextLine();
		System.out.println("Input String = " +a);
	}
}