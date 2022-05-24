class Shape {
String color;

public String getColor()
{
return color;}
public void area() 
{
	System.out.println("Shape: area");
}

}

class  Circle extends Shape
{
double radius;

public Circle(String color, double rad)
{
super.color=color;
radius= rad;
}
public void area() {System.out.println("Area of Circle="+ area());} 

}

class Rectangle extends Shape
{
double length,breadth;
public Rectangle(String color, double len , double brd)
{super.color= color;
length = len;
breadth = brd;
} 
public void area(){ System.out.println("Area of Rectangle="+ area());}
}


public class polymorphismExample
{
	public static void main(String args[])
	{
		Shape s[2]= {new Circle("yellow",4.2), new Rectangle("green", 5.22) };
		
		for(int i=0; i<2;i++ )
		{
			s[i].area();
			
		}
	 
	}

}


