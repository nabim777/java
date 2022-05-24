import java.util.Scanner;
public class amount
{
	public static void main(String args[])
	{
		System.out.println("Input the total amount");
		Scanner sc= new Scanner(System.in);
		double num= sc.nextDouble();
		System.out.println("You have input this Charges="+ num);
		int i; 
		double sum=0;
		for(i=0;i<10;i++)
		{
			sum=sum+num;
			num=(0.1*num)+num;
			System.out.println("In"+ (i+1) +"year charges= "+ num);
		}
		System.out.println("Toatal Charges="+ sum);
	}
}

