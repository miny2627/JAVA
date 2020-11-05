import java.awt.*;
import javax.swing.*;

public class ThreeCircle extends JFrame{
	ThreeCircle()
	{
		setTitle("»ï»ö¿ø");
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
			g.setColor(Color.RED);
			g.fillArc(20, 20, 80, 80, 90, 120);
			g.setColor(Color.BLUE);
			g.fillArc(20, 20, 80, 80, 210, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(20, 20, 80, 80, 330, 120);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreeCircle();
	}

}
