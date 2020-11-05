 import java.awt.*;
import javax.swing.*;

class CPanel extends JPanel implements Runnable
{
	public CPanel()
	{
		new Thread(this).start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				return;
			}
			repaint();
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int x=(int)(Math.random()*getWidth());
		int y=(int)(Math.random()*getHeight());
		g.drawOval(x, y, 50, 50);
	}
}

public class CircleTh extends JFrame{
	CircleTh()
	{
		setTitle("원을 0.5초 간격으로 랜덤 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CPanel p=new CPanel();
		setContentPane(p);
		
		setVisible(true);
		setSize(600,600);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CircleTh();
	}

}
