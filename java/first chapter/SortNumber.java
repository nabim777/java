/*
WAP in java that takes 3 numbers as input and search them in ascending order
input         output
15,4,19       4,15,19
*/ 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SortNumber
{
	static int n1,n2,n3;

	public static void main(String args[]) throws IOException
	{
		int tmp;
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 3 numbers");
		n1=Integer.parseInt(reader.readLine());
		n2=Integer.parseInt(reader.readLine());
		n3=Integer.parseInt(reader.readLine());
		
		if(n1>n2)
		{
			swap1();
		}
		if(n2>n3)
		{
			swap2();
			if(n1>n3)
			{
				swap1();
			}
		}
		System.out.println(n1 +" " + n2 + " " + n3);
	}
		
		
	public static void swap1()
	{
		int tmp;
		tmp=n1;
		n1=n2;
		n2=tmp;
	}
	
	public static void swap2()
	{
		int tmp;
		tmp=n2;
		n2=n3;
		n3=tmp;
	}
}