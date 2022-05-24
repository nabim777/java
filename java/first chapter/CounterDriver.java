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
		public int countThe()
		{	String words;
			int count=0;
			StringTokenizer st = new StringTokenizer(sentence," ");
			while(st.hasMoreTokens())
			{
				words = st.nextToken();
				if(words.equalsIgnoreCase("the")) 
				{
					count ++;
				}
			}
			return count;
		}
		
}
class CounterDriver
{
	public static void main (String args[]) throws IOException
	{
		InputStreamReader ins =new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(ins);
		System.out.println("Enter a sentence:");
		String sentence = reader.readLine();
		TheCounter counter =  new TheCounter(sentence);
		System.out.println("Total occuernce of 'the':" + counter.countThe());
		
	}
}