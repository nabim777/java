import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Movie 
{ 
	private int ID;
	private String genre,title;
	public Movie(int ID, String genre, String title)
	{
		this.ID=ID;
		this.genre=genre;
		this.title=title;
	}
	public void display()
	{
		System.out.println("ID:"+ ID+ "\nGenre:"+ genre + "\nTitle:" +title);
	}
	public int getId()
	{
		return ID;
	}
	public String getGenre()
	{
		return genre;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void setId(int ID)
	{
		this.ID=ID;
	}
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
}

class Actor
{
	int ID;
	String name;
	Movie movieList[];
	public Actor(int ID, String name, Movie list[])
	{
		this.ID=ID;
		this.name=name;
		movieList=list;
	}
	
}

public class MovieDriver
{
	public static void main(String args[]) throws IOException
	{
		int i;
		Movie m[]= new Movie[3];
		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader areader = new BufferedReader(ins);
		for(i=0;i<3;i++)
		{
	
			System.out.println("Enter movie ID:");
			int id = Integer.parseInt(areader.readLine());
			System.out.println("Enter genre of the movie:");
			String genre = areader.readLine();
			System.out.println("Enter title of the movie:");
			String title = areader.readLine();
			m[i] = new Movie(id,genre,title);
			System.out.println("__________________________________________________________________________________________");
		}

		System.out.println("Enter ID of actor:");
		int id = Integer.parseInt(areader.readLine());
		System.out.println("Enter name of actor:");
		String name = areader.readLine();
		Actor a1= new Actor(id,name,m);		
		System.out.println("__________________________________________________________________________________________");
		System.out.println("Actor:"+ a1.name);
		System.out.println("list of movies of "+a1.name + " :" );
		a1.movieList[0].display();
		a1.movieList[1].display();
		a1.movieList[2].display();
	}
}