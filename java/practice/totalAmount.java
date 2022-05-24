import java.util.Scanner;
public class totalAmount
{
	public static void main(String args[])
	{
		System.out.println("Enter the Amount:");
		Scanner sc= new Scanner(System.in);
		double num= sc.nextDouble();
		System.out.println("The total Amount you have entered is:" + num);
		int i;
		double sum=0;
		for(i=0;i<10;i++)
		{
			sum=sum+num;
			num=(0.1*num)+num;
			System.out.println("The amount in " + (i+1)+ " year=" + num);
		}
		System.out.println("-----------------------------------------");
		System.out.println("The total amount in 10 year is "+ sum);
	}
}
