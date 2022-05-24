import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends Frame
{
	JButton b1,b2,b3,b4,b5,b6;
	public GridLayoutDemo()
	{
		b1= new JButton("First Button");
		b2= new JButton("Second Button");
		b3= new JButton("Third Button");
		b4= new JButton("Fourth Button");
		b5= new JButton("Fifth Button");
		b6= new JButton("sixth Button");
		
		setTitle("Grid layout Demo");
		setLayout(new GridLayout(2,3));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		setSize(400,300);
		setVisible(true);	
	}
	public static void main(String args[])
	{
		GridLayoutDemo win = new GridLayoutDemo();
	}
}
