
/*
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

class buttonss extends JFrame
{
	static JButton b;
	buttonss()
	{
		this.setSize(400,400);
		this.setTitle("Buttons Example");
		this.setLayout(null);
		//this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		b=new JButton("Click Me");
		b.setBounds(200,200,100,60);
		this.add(b);
		this.setVisible(true);
	}
	public static void main(String args[])
	{
		new buttonss();
	}
}
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

class buttonss extends JFrame
{
	JButton b;
	buttonss()
	{
		setTitle("Example");
		setSize(400,400);
		
		b= new JButton("Click me");
		b.setBounds(200,200,100,40);
		setLayout(null);
		add(b);
		
		setVisible(true);
			
	}
	public static void main(String args[])
	{
		new buttonss();
	}
	
}



