import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class TheCounter
{
		private String sentence;
		TheCounter(String sentence)
		{
			this.sentence=sentence;
		}
		public int countWords()
		{
			StringTokenizer st = new StringTokenizer(sentence," ");
			return st.countTokens();
		}
		public int countFa()
		{
			String words;
			int count =0;
			StringTokenizer st = new StringTokenizer(sentence," ");
			while(st.hasMoreTokens())
			{
				words = st.nextToken();
				if(words.startsWith("fa")) 
				{
					count ++;
				}
				
			}
			return count;
		}
		public int countPalindrome()
		{	
			int count = 0;
			String words,rev;
			StringTokenizer st = new StringTokenizer(sentence," ");
			while(st.hasMoreTokens())
			{
				words = st.nextToken();
				StringBuilder sb = new StringBuilder(words);
			sb.reverse();
			rev = sb.toString();
				if(words.equals(rev)) 
				{
					count++;
				}
				
			}
			return count;
		}
		public void displayPrepo()
		{
			String word;
			StringTokenizer st = new StringTokenizer(sentence, " ");
			while(st.hasMoreTokens())
			{
				word = st.nextToken();
				if(word.equals("in") || word.equals("on") || word.equals("over") || word.equals("under") || word.equals("at"))
				{
					System.out.println(word);
				}
			}
		}
}
class CounterDriver1
{
	public static void main (String args[]) throws IOException
	{
		InputStreamReader ins =new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(ins);
		System.out.println("Enter a sentence:");
		String sentence = reader.readLine();
		TheCounter counter =  new TheCounter(sentence);
		while(true)
		{	
			
			System.out.println("Enter your choice: \n1 \t Count total number of words");
			System.out.println("2 \t Count total number of words starting with fa");
			System.out.println("3 \t Count total number of palindrome words");
			System.out.println("4 \t Display prepositions contained in the sentence");
			System.out.println("5 \t Exit!!");
			int choice= Integer.parseInt(reader.readLine());
			
			switch(choice)
			{	
				default : System.out.println("Invalid choice!! Please Enter valid choice [0-5]"); break;
				case 1 : System.out.println("Total number of words in sentence :" + counter.countWords()); break;
				case 2 : System.out.println("Total number of words starting with in sentence :" + counter.countFa()); break;
				case 3 : System.out.println("Total number of palindrome words in sentence :" + counter.countPalindrome()); break;
				case 4 : System.out.println("The prepositions contained in the sentence ae:\n"); counter.displayPrepo(); break;
				case 5 : System.out.println("Thank you!! Bye Bye!!"); return;
			}
			System.out.println("_____________________________________________________________________________________________");
		}
	}
}