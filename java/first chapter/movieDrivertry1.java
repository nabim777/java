import java.util.*;
class movie 
{ int ID;
 String genre; String title;
 public movie(int ID, String genre, String title)
{this.ID=ID;
this.genre=genre;
this.title=title;
}

}

class actor
{
int ID;
String name;
List movieList;
public actor(int ID, String name, List list)
{this.ID=ID;
this.name=name;
movieList=list;
}
}

public class movieDrivertry1
{
	public static void main(String args[])
	{
	movie m1 = new movie(101,"Fantasy","Jumanji: Welcome to the Jungle");
	movie m2 = new movie(102, "Action","Fast & Furious 7");
	movie m3 = new movie(103, "Thriller", "Skyscrapper");
	List <movie> list = new ArrayList<movie>();
	list.add(m1);
	list.add(m2);
	list.add(m3);
	actor a1= new actor(1, "Dwayne Johnson",list);
	
	System.out.println("Actor:"+ a1.name);
	System.out.println("list of movies:");
	for(movie m:list)
		{
			System.out.println("ID:"+m.ID +"\n" +"Genre:"+ m.genre + "\n"+ "Title:"+ m.title);
		}
	}
}