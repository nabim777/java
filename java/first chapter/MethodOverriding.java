class Shape {
String color;

public void area() 
{
	System.out.println("Shape: area()");
}

}

class  Circle extends Shape
{
double radius;

public Circle(double rad)
{
radius= rad;
}

public void area() {
	double a = radius* radius *3.14;
	System.out.println("Area of Circle="+ a);} 

}

class Rectangle extends Shape
{
double length,breadth;
public Rectangle( double len , double brd)
{
length = len;
breadth = brd;
} 
public void area()
{ 	double a= length*breadth;
	System.out.println("Area of Rectangle="+ a);}
}


public class MethodOverriding
{
	public static void main(String args[])
	{
		Shape s[] = { new Circle(4.2), new Rectangle(5.22,4.00)};
		
		for(int i=0; i<2;i++ )
		{
			s[i].area();
			
		}
	 
	}

}


