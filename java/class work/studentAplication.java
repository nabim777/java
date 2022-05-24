import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class studentAplication
{  
	public static void main(String[] args)
	 { 	 
	    
	    JFrame f=new JFrame("Student Application");  
	    JButton b=new JButton("Register");  
	    b.setBounds(50,100,95,30);  
	    f.add(b);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    
	    JButton c=new JButton("update");  
	    c.setBounds(50,200,95,30);  
	    f.add(c);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    
	    JButton d=new JButton("search");  
	    d.setBounds(200,100,95,30);  
	    f.add(d);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    
	    JButton e=new JButton("update");  
	    e.setBounds(200,200,95,30);  
	    f.add(e);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}  
}  
