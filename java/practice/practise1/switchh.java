import java.util.Scanner;
public class switchh
{
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("You have enter this number:"+ num);
		switch(num)
		{
			case 1: System.out.println("Sunday"); break;
			case 2: System.out.println("Monday"); break;
			case 3: System.out.println("tuesday"); break;
			case 4: System.out.println("wednesday"); break;
			case 5: System.out.println("Thursday"); break;
			case 6: System.out.println("Friday"); break;
			case 7: System.out.println("Satday"); break;
			default: System.out.println("please Enter upto [1-7]");
		}
	}
}
