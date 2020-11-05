import java.awt.*;
import javax.swing.*;

public class Grid extends JFrame{
	Grid()
	{
		setTitle("10x10 격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(400,400);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			int w=this.getWidth();
			int h=this.getHeight();
			
			int x=this.getWidth()/10;
			int y=this.getHeight()/10;
			
			for(int i=0; i<9; i++)
			{
				g.drawLine(x*(i+1), 0, x*(i+1), h);
			}
			for(int j=0; j<9; j++)
			{
				g.drawLine(0,y*(j+1),w, y*(j+1));
			}
				

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Grid();
	}

}
