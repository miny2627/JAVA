import java.awt.*;
import javax.swing.*;

public class Square extends JFrame{
	Square()
	{
		setTitle("¸¶¸§¸ð");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(250,200);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			int w=this.getWidth();
			int h=this.getHeight();
			
			int []x= {w/2, 0, w/2, w};
			int []y= {0, h/2, h, h/2};
			g.drawPolygon(x, y, 4);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Square();
	}

}
