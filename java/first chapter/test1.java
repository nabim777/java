import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import java.util.StringTokenizer;
import java.io.EOFException;
class test1
{
	public static void main(String args[]) throws IOException
	{
		/*try{
	
		InputStreamReader ins =new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(ins);
		File f= new File("test1.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outt= new PrintWriter(bw);
		System.out.println("Enter a sentence:");
		String sentence = reader.readLine();
		outt.print(sentence + "\n");
		System.out.println("Enter a sentence:");
		sentence = reader.readLine();
		outt.print(sentence + "\n");
		System.out.println("Enter a sentence:");
		sentence = reader.readLine();
		outt.print(sentence + "\n");
		outt.close();
		bw.close();
		fw.close();
		}catch(Exception e)
	 	{
	 		System.out.println(e);
	 	}
	 	*/
	 	
		try
		{
			
			FileReader fr = new FileReader("test1.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
			br.close();
			fr.close();
		}catch(EOFException e)
	 	{
	 		System.err.println("End of Stream");
	 	}
		
		
		
		
		
	}

}