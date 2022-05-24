import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class resturant extends JFrame implements ActionListener
{
	private JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	
	public resturant()
	{
		super("Potk Resturant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		l1=new JLabel("MOMO Price:100");
		l2=new JLabel("Chowmein price:140");
		l3=new JLabel("Total price");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		
		b1=new JButton("Total Price");
		
		b1.addActionListener(this);

		
		setLayout(new FlowLayout(FlowLayout.LEFT,140,5));
		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
	
		add(b1);
		
		setSize(400,300);
		setVisible(true);				
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int x,y,z;
		x=Integer.parseInt(t1.getText());
		y=Integer.parseInt(t2.getText());
		
		z=x*100+y*140;
		t3.setText(String.valueOf(z));
	
	}
	
	public static void main(String a[])
	{
		new resturant();
	}
}

