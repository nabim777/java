import java.awt.*;
import javax.swing.Frame;

public class Firstwindow extends Frame implements WindowsListener
{
	public Firstwindow()
	{
		Button b= new Button("Click");
		b.setBounds(100,200,100,70);
		setTitle("First Window");
		add(b);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		Firstwindow win= new Firstwindow();
	}
}
