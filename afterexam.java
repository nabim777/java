import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class afterexam extends JFrame implements ActionListener
{
	private JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	
	public afterexam()
	{
		super("Potk calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		l1=new JLabel("Num 1");
		l2=new JLabel("Num 2");
		l3=new JLabel("Result");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT,140,5));
		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
	
		add(b1);
		add(b2);
		add(b3);
		
		setSize(400,300);
		setVisible(true);				
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int x,y,z;
		x=Integer.parseInt(t1.getText());
		y=Integer.parseInt(t2.getText());
		
		if(ae.getActionCommand()=="+")
			z=x+y;
		else if(ae.getActionCommand()=="-")
			z=x-y;
		else
			z=x*y;
		t3.setText(String.valueOf(z));
	
	}
	
	public static void main(String a[])
	{
		new afterexam();
	}
}

