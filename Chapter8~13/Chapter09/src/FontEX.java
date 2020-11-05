import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FontEX extends JFrame{
	JLabel label=new JLabel("Love Java");
	Font f=label.getFont();
	int size=f.getSize();
	
	FontEX()
	{
		setTitle("+,-키로 폰트 크기 조절하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		label.addKeyListener(new MyKeyListener());
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		c.add(label);
		
		setSize(300,200);
		setVisible(true);
		
		label.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter
	{
		
		public void keyPressed(KeyEvent e)
		{
			switch(e.getKeyChar()){
			case '+' :
				label.setFont(new Font("Arial", Font.PLAIN, size+5));
				size+=5;
				break;
				
			case '-':
				if(size>5)
				{
					label.setFont(new Font("Arial", Font.PLAIN, size-5));
					size-=5;
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FontEX();
	}

}
