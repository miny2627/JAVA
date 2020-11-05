import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CircleDrag extends JFrame{
	CircleDrag()
	{
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(400,400);
		setVisible(true);
	}
	class MyPanel extends JPanel implements MouseMotionListener
	{
		ImageIcon icon=new ImageIcon("Chobee.jpg");
		Image img=icon.getImage();
		Point start=null;
		
		public MyPanel()
		{
			setLayout(null);
			addMouseMotionListener(this);
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img, 0,0,this.getWidth(), this.getHeight(), this);
		
			g.setColor(Color.GREEN);
			g.fillOval(start.x, start.y, 20, 20);
		}
		
		public void mouseDragged(MouseEvent e) 
		{
			start=e.getPoint();
			repaint();
		}
		public void mouseMoved(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CircleDrag();
	}

}
