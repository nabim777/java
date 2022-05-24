class Fan
{
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	final static  int SLOW=1,MEDIUM=2,FAST = 3,OFF=0;
	public Fan(int spd, boolean bool, double rad, String clr)
	{
		speed=spd;
		on= bool;
		radius=rad;
		color=clr;
	}
	
	public void setSpeed(int spd)
	{
		speed=spd;
	}
	public void setOn(boolean bool)
	{
		on=bool;
	} 
	public void setRadius(double rad)
	{
		radius=rad;
	}
	public void setColor(String clr)
	{
		color=clr;
	}
	public int getSpeed()
	{
		return speed;
	}
	public boolean  getOn()
	{
		return on;
	} 
	public double getRadius()
	{
		return radius;
	}
	public String getColor(String clr)
	{
		return color;
	}
	
	public String toString()
	{
		return "speed :"+ speed +" On:" + on +" radius of fan:"+ radius +" color of fan:"+ color;
	}
	
	

}

public class FanTest{

    public static void main(String args[]) 
    {
    	Fan f = new Fan(Fan.OFF,false,10,"yellow");
    	f.setOn(true);
    	f.setSpeed(Fan.FAST);
    	System.out.println(f);
    }
    
    
}