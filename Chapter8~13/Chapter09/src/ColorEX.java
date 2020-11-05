import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorEX extends JFrame{
	ColorEX()
	{
		setTitle("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		JPanel p=new JPanel();
		setContentPane(p);
		
		p.setBackground(Color.GREEN);
		p.addMouseListener(new MyMouseListener());
		p.addMouseMotionListener(new MyMouseListener());
		
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener
	{
		public void mousePressed(MouseEvent e)
		{
			Component comp=(Component)e.getSource();
			comp.setBackground(Color.GREEN);
		}
		public void mouseReleased(MouseEvent e)
		{
			Component comp=(Component)e.getSource();
			comp.setBackground(Color.GREEN);
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		
		public void mouseDragged(MouseEvent e)
		{
			Component comp=(Component)e.getSource();
			comp.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e)
		{
			Component comp=(Component)e.getSource();
			comp.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorEX();
	}

}
