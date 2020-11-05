import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeySizeEX extends JFrame{
	KeySizeEX()
	{
		setTitle("키로 프레임 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p=new JPanel();
		setContentPane(p);
		
		p.setLayout(new FlowLayout());
		JButton b=new JButton("A");
		p.add(b);
		
		p.addKeyListener(new MyKeyListener());
		setSize(15,150);
		setVisible(true);
		setResizable(true);
		p.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			JPanel jp=(JPanel)e.getSource();
			//Container c=jp.getParent();
			int x=jp.getWidth();
			int y=jp.getHeight();
			
			if(e.getKeyChar()=='q') System.exit(0);
			else if(e.getKeyCode()==KeyEvent.VK_F1)
			{
				x+=10; y+=10;
				jp.setPreferredSize(new Dimension(x,y));
			}
			else if(e.getKeyCode()==KeyEvent.VK_F2)
			{
				x-=10; y-=10;
				jp.setPreferredSize(new Dimension(x,y));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeySizeEX();
	}

}
