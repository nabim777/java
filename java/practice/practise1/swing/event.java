import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class event extends JFrame implements ActionListener
{
	static JButton b;
	event()
	{
		this.setSize(400,400);
		this.setTitle("Buttons Example");
		this.setLayout(null);
		//this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		b=new JButton("Click Me");
		b.setBounds(200,200,100,60);
		b.addActionListener(this);//adding features for b buttons
		this.add(b);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Nalem7");
	}
	public static void main(String args[])
	{
		new event();
	}
}
