import java.awt.*;
import javax.swing.*;

public class FiveCircle extends JFrame{
	FiveCircle()
	{
		setTitle("¿À·û±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(400,300);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawOval(20, 20, 80, 80);
			g.setColor(Color.BLACK);
			g.drawOval(110, 20, 80, 80);
			g.setColor(Color.RED);
			g.drawOval(200, 20, 80, 80);
			
			g.setColor(Color.YELLOW);
			g.drawOval(60,60,80,80);
			g.setColor(Color.GREEN);
			g.drawOval(150,60,80,80);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FiveCircle();
	}

}
