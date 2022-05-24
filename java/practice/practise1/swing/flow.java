import java.awt.*;
import javax.swing.Frame;

public class flow extends Frame implements WindowsListener
{
	public flow()
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
		flow win= new flow();
	}
}
