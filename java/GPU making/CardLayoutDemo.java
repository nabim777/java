import java.awt.*;
import javax.swing.*;

public class CardLayoutDemo extends Frame
{
	JPanel p1,p2,p3;
	static CardLayout cl;
	JLabel lb1,lb2,lb3;
	
	public CardLayoutDemo()
	{
		cl=new CardLayout();
		p1= new JPanel();
		p2= new JPanel();
		p3= new JPanel();
		lb1= new JLabel("First Panel");
		lb2= new JLabel("Second Panel");
		lb3= new JLabel("Third Panel");
		
		
		p1.add(lb1);
		p2.add(lb2);
		p3.add(lb3);
		
		setTitle("Card layout Demo");
		setLayout(cl);
		add("fp1",p1);
		add("fp2",p2);
		add("fp3",p3);
		setSize(400,300);
		setVisible(true);	
	}
	public static void main(String args[])
	{
		CardLayoutDemo win = new CardLayoutDemo();
		cl.next(win);
		CardLayoutDemo win1 = new CardLayoutDemo();
		cl.next(win1);
		cl.show(win1,"fp2");
		cl.previous(win1);
		
	}
}

