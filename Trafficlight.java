package helloworld;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

 public class TrafficLight  extends JFrame implements ActionListener 
	{
	 JLabel l;
	 JTextField d;
	 JRadioButton r1,r2,r3;
	 ButtonGroup bg;
	 Container c;
	 TrafficLight()
	    {
		 setLayout(new FlowLayout());
		 c=getContentPane();
		 l=new JLabel(" Traffic Light");
		 d =new JTextField(10);
		 r1=new JRadioButton("Red");
		 r2=new JRadioButton("Yellow");
		 r3=new JRadioButton("Green");
		 bg=new ButtonGroup();
		 c.add(l);
		 c.add(r1);
		 c.add(r2);
		 c.add(r3);
		 c.add(d);
		 bg.add(r1);
		 bg.add(r2);
		 bg.add(r3);
		 r1.addActionListener(this);
		 r2.addActionListener(this);
		 r3.addActionListener(this);
		 setSize(1920,1080);
		 setVisible(true);
		 c.setBackground(Color.blue);
	    }
	 
	public void actionPerformed(ActionEvent ie)
    	{
		  if(ie.getSource()==r1)
		  	{
			  c.setBackground(Color.red);
			  d.setText("Red light");
		  	}
		  else if (ie.getSource()==r2)
		  	 {
			  c.setBackground(Color.yellow);
			  d.setText("Yellow light");
		  	 }
		  else if (ie.getSource()==r3)
		  	{
			  c.setBackground(Color.green);
			  d.setText("Green light");
		  	}
    	}
	
	public static void main(String[] args) 
		{
	      new TrafficLight ();
		}
	}
