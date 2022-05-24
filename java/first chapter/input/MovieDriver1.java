import java.util.Scanner;
 class Movie
 {
	String genre;
	int id;
	String title;
	
	public void setdata(String g, int idd, String titlee)
	{
		genre=g;
		id=idd;
		title=titlee;
	}
public void display()

	{
System.out.println("Id:"+id+"\nGenre:"+genre +"\n Title:" +title);
	}
 }

 class Actor
 {
	String name;
	int id;
	Movie movieList[];
	public void setdata(String name, int idd, Movie list[])
	{
		this.name=name;
		this.id=idd;
		movieList=list;
	}
 }
 public class MovieDriver1
 { 
   public static void main(String[] args)
   {
    
      int i;
     Movie m[] = new Movie[3];
     for(i=0;i<3;i++)
{
Scanner obj = new Scanner(System.in);
     Scanner obj1 = new Scanner(System.in);
System.out.println("Enter the genre:"); String genre = obj.nextLine();
System.out.println("\n The genre is" + genre);
   System.out.println("Enter the id:"); int id = obj.nextInt();
   System.out.println("\nThe id is: "+id); 
   System.out.println("\nEnter the title:"); 
   String title = obj1.nextLine();
   System.out.println("\nThe title is: "+title); 
m[i]= new Movie();
m[i].setdata(genre,id,title);
   }
Scanner obj2 = new Scanner(System.in);
    Actor ac = new Actor();
   System.out.println("\nEnter the actor name:"); String name = obj2.nextLine();
   System.out.println("\nThe name is: "+name); 
   System.out.println("\nEnter the id:"); int id = obj2.nextInt();
   System.out.println("\nThe id is: "+id); 
ac.setdata(name,id,m);
    System.out.println("list of movies:");
	m[0].display();
	m[1].display();
	m[2].display();
	
   }
 }