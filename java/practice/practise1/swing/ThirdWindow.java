import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class ThirdWindow extends Frame implements KeyListener
{
	JLabel l1,l2,l3;
	JTextField tf1, tf2, tf3;
	public ThirdWindow()
	{
		l1 = new JLabel("First Number");
		l2 = new JLabel("Second Nummber");
		l3 = new JLabel("Result");
		tf1 = new JTextField();
		tf1.setPreferredSize(new Dimension(150,50));
		tf2 = new JTextField();
		tf2.setPreferredSize(new Dimension(150,50));
		tf3 = new JTextField("Press a-ADD and s-SUB");
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
	
		setTitle("Third Window for KeyEvent");

			

		add(l1);add(tf1);
		add(l2);add(tf2);
		add(l3);add(tf3);
		setSize(600,600);
		setVisible(true);
		addKeyListener(this);
	}

	public static void main(String args[])
	{
		ThirdWindow win = new ThirdWindow();
	}

	public void keyPressed(KeyEvent evt)
	{
		int n1,n2,n3,res;
		n1 = Integer.parseInt(tf1.getText());
		n2 = Integer.parseInt(tf2.getText());
		if(evt.getKeyChar()=='s')
		{
			res=n1-n2;
		}
		else if(evt.getKeyChar()=='a')
		{
			res=n1+n2;
		}
		else
		{
			tf3.setText("Press a or s");return;
		}
		tf3.setText(String.valueOf(res));
		
	}

	public void keyTyped(KeyEvent evt)
	{
		
	}
	
	public void keyReleased(KeyEvent evt)
	{
		
	}
		
}
