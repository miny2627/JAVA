import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyEX extends JFrame{
	KeyEX()
	{
		setTitle("키 누르기 떼기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setBackground(Color.CYAN);
		c.addKeyListener(new MyKeyListener());
		setSize(250,150);
		setVisible(true);
		
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_R)
			{
				getContentPane().setBackground(Color.RED);
			}
		}
		public void keyReleased(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_R)
			{
				getContentPane().setBackground(Color.CYAN);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEX();
	}

}
