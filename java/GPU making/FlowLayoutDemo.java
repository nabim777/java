import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends Frame
{
	JButton b1,b2,b3,b4,b5;
	public FlowLayoutDemo()
	{
		b1= new JButton("First Button");
		b2= new JButton("Second Button");
		b3= new JButton("Third Button");
		b4= new JButton("Fourth Button");
		b5= new JButton("Fifth Button");
		
		setTitle("Flow layout Demo");
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setSize(400,300);
		setVisible(true);	
	}
	public static void main(String args[])
	{
		FlowLayoutDemo win = new FlowLayoutDemo();
	}
}
