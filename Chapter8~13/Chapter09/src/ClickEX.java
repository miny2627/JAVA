import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickEX extends JFrame{
	ClickEX()
	{
		setTitle("클릭 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		cp.setLayout(null);
		
		JLabel c=new JLabel("C");
		c.addMouseListener(new MyMouseListener());
		c.setLocation(50, 50);
		c.setSize(20,20);
		cp.add(c);
		
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener
	{
		public void mouseClicked(MouseEvent e)
		{
			JLabel la=(JLabel)e.getSource();
			Container co=la.getParent();
			int xBound=co.getWidth()-la.getWidth();
			int yBound=co.getHeight()-la.getHeight();
			
			int x=(int)(Math.random()*xBound);
			int y=(int)(Math.random()*yBound);
			
			la.setLocation(x, y);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickEX();
	}

}
