import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleInterest extends JFrame implements ActionListener
{
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4;
	JButton b;
	SimpleInterest()
	{
		setTitle("Simple Interest");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Principal");
		l2=new JLabel("Time");
		l3=new JLabel("Rate");
		l4=new JLabel("Simple interrest");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		
		b=new JButton("Simple Interest");
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
		b.addActionListener(this);
		add(b);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int p,t,r,si;
		p=Integer.parseInt(t1.getText());
		t=Integer.parseInt(t2.getText());
		r=Integer.parseInt(t3.getText());
		si=(p*t*r)/100;
		t4.setText(String.valueOf(si));
	}
	
	public static void main(String args[])
	{
		new SimpleInterest();
	}
}


