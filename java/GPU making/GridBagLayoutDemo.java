import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo extends Frame
{
	JButton b1,b2,b3,b4,b5;
	GridBagConstraints gc;
	
	public GridBagLayoutDemo()
	{
		b1= new JButton("B1");
		b2= new JButton("B2");
		b3= new JButton("B3");
		b4= new JButton("B4");
		b5= new JButton("B5");
		
		setTitle("GridBag layout Demo");
		setSize(500,250);
		setLayout(new GridBagLayout());
		gc = new GridBagConstraints();
		
		gc.gridx=0;
		gc.gridy=0;
		gc.fill = GridBagConstraints.HORIZONTAL;
		add(b1, gc);
		
		gc.gridx=1;
		gc.gridy=0;
		add(b2,gc);
		
		gc.gridx=2;
		gc.gridy=0;
		add(b3,gc);
		
		gc.gridx=0;
		gc.gridy=1;
		gc.ipady=5;
		gc.gridwidth=3;
		add(b4,gc);
		
		gc.gridx=1;
		gc.gridy=2;
		gc.ipady=0;
		gc.gridwidth=2;
		gc.weighty=0.5;
		gc.anchor = GridBagConstraints.PAGE_END;
		add(b5,gc);
		
		setSize(400,300);
		setVisible(true);	
	}
	public static void main(String args[])
	{
		GridBagLayoutDemo win = new GridBagLayoutDemo();
	}
}
