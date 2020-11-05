import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ImageKey extends JFrame{
	ImageIcon icon=new ImageIcon("Chobee.jpg");
	Image img=icon.getImage();
	
	double x=img.getWidth(this);
	double y=img.getHeight(this);
	
	ImageKey()
	{
		setTitle("그래픽 이미지 10% 확대 축소");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel p=new MyPanel();
		setContentPane(p);
		
		setSize(800,800);
		setVisible(true);
		p.requestFocus();
	}
	class MyPanel extends JPanel
	{
		MyPanel()
		{
			addKeyListener(new MyKeyListener());
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img,10,10,(int)x, (int)y, this);
		}
	}
	class MyKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyChar()=='+')
			{
				x=x*(1.1);
				y=y*(1.1);
				repaint();
			}
			else if(e.getKeyChar()=='-')
			{
				x=x*(0.9);
				y=y*(0.9);
				repaint();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageKey();
	}

}
