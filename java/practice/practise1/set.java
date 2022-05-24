class Box
{
	private int l;
	private int b;
	private int h;
	public void setdata(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
	}
	public int area()
	{
		return l*b;
	}
	public int volume()
	{
		return l*b*h;
	}
}

public class set
{
	public static void main(String args[])
	{
		Box b=new Box();
		b.setdata(2,3,4);
		int d=b.area();
		int c=b.volume();
		System.out.println("Area="+d);
		System.out.println("Volume="+ c);
		
		
	}
}
