import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class try extends Frame implements ActionListener
{
	Button red,green,blue;
	public try()
	{
		red= new Button("red");
		green = new Button("green");
		blue = new Button("blue");
		setTitle("Second Window");
		
		setLayout(new FlowLayout());
		add(red);add(green);add(blue);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
	}
	
	public static void main(String args[])
	{
		SecondWindow win= new SecondWindow();
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		Button b= (Button) evt.getSource();
		if(b==red){ setBackground(Color.RED); }
		if(b==green){ setBackground(Color.GREEN); }
		if(b==blue){ setBackground(Color.BLUE); }
	}
}
