import java.awt.*;
import java.awt.event.*;

class PaintBrush extends Frame implements ItemListener,ActionListener
{
	int last_x,last_y,t=1;
	Label l1,l2;
	Button erase;
	Button clr;
	Color c=Color.black;
	Choice c1,c2;
	PaintBrush(String s)
	{
		super(s);
		setVisible(true);
		setSize(900,700);
		setLayout(new FlowLayout());
		addWindowListener(new WindowAdapter()
									{
										public void windowClosing(WindowEvent e)
										{
											System.exit(0);
										}
									}
							);
		
		addMouseListener(new MouseAdapter()
							{
								public void mousePressed(MouseEvent e)
								{
									last_x=e.getX();
									last_y=e.getY();
								}
							});
		addMouseMotionListener(new MouseAdapter()
							{
								public void mouseDragged(MouseEvent e)
								{
									Graphics g=getGraphics();
									g.setColor(c);
									g.fillOval(last_x,last_y,t,t);
									int x=e.getX();
									int y=e.getY();
									g.fillOval(x,y,t,t);							
								}
							});
		
		l1=new Label("Choose Thickness:");
		l2=new Label("Choose Color:");
		c1=new Choice();
		c2=new Choice();
		clr=new Button("CLEAR ALL");
		erase=new Button("ERASER");
		c1.add("1");c1.add("2");c1.add("3");c1.add("4");c1.add("5");
		c1.add("6");c1.add("7");c1.add("8");c1.add("9");c1.add("10");
		c1.add("11");c1.add("12");c1.add("13");c1.add("14");c1.add("15");
		c1.add("16");c1.add("17");c1.add("18");c1.add("19");c1.add("20");
		
		c2.add("Black");c2.add("Magenta");c2.add("Blue");c2.add("Orange");c2.add("Gray");
		c2.add("Green");c2.add("Yellow");c2.add("Red");c2.add("Pink");c2.add("Cyan");
		
		add(l1);add(c1);add(l2);add(c2);add(erase);add(clr);
		c1.addItemListener(this);
		c2.addItemListener(this);
		clr.addActionListener(this);
		erase.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("CLEAR ALL"))
		{
			repaint();
		}
		if(s.equals("ERASER"))
		{
			t=15;
			c=Color.white;
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		
		String m1=c1.getSelectedItem();
		String m2=c2.getSelectedItem();
		if(m1.equals("1"))
		{
			t=1;
		}
		if(m1.equals("2"))
		{
			t=2;
		}
		if(m1.equals("3"))
		{
			t=3;
		}
		if(m1.equals("4"))
		{
			t=4;
		}
		if(m1.equals("5"))
		{
			t=5;
		}
		if(m1.equals("6"))
		{
			t=6;
		}
		if(m1.equals("7"))
		{
			t=7;
		}
		if(m1.equals("8"))
		{
			t=8;
		}
		if(m1.equals("9"))
		{
			t=9;
		}
		if(m1.equals("10"))
		{
			t=10;
		}
		if(m1.equals("11"))
		{
			t=11;
		}
		if(m1.equals("12"))
		{
			t=12;
		}
		if(m1.equals("13"))
		{
			t=13;
		}
		if(m1.equals("14"))
		{
			t=14;
		}
		if(m1.equals("15"))
		{
			t=15;
		}
		if(m1.equals("16"))
		{
			t=16;
		}
		if(m1.equals("17"))
		{
			t=17;
		}
		if(m1.equals("18"))
		{
			t=18;
		}
		if(m1.equals("19"))
		{
			t=19;
		}
		if(m1.equals("20"))
		{
			t=20;
		}
		if(m2.equals("Black"))
		{
			c=Color.black;
		}
		if(m2.equals("Red"))
		{
			c=Color.red;
		}
		if(m2.equals("Blue"))
		{	
			c=Color.blue;
		}
		if(m2.equals("Magenta"))
		{
		c=Color.magenta;
		}
		if(m2.equals("Orange"))
		{
		c=Color.orange;
		}
		if(m2.equals("Gray"))
		{
		c=Color.gray;
		}
		if(m2.equals("Green"))
		{
		c=Color.green;
		}
		if(m2.equals("Yellow"))
		{
		c=Color.yellow;
		}
		if(m2.equals("Pink"))
		{
		c=Color.pink;
		}
		if(m2.equals("Cyan"))
		{
		c=Color.cyan;
		}
	}
}

public class PBDemo 
{
public static void main(String args[])
{
	PaintBrush p1=new PaintBrush("PAINT BRUSH");
}
}