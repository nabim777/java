import java.util.Scanner;
import java.util.*;
public class Switch
{
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		switch(num)
		{
			case 1: System.out.println("Sunday");break;
			case 2: System.out.println("Monday");break;
			case 3: System.out.println("Tuesday");break;
			case 4: System.out.println("Wednesday");break;
			case 5: System.out.println("Thursaday");break;
			case 6: System.out.println("Friday");	break;
			case 7: System.out.println("saturday");break;
			default: System.out.println("Please type [1-7]");
		}
	}

}
