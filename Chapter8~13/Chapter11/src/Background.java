import java.awt.*;
import javax.swing.*;

public class Background extends JFrame {
	Background()
	{
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		
		setSize(400,400);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		ImageIcon icon=new ImageIcon("Chobee.jpg");
		Image img=icon.getImage();
		
		MyPanel()
		{
			setLayout(new FlowLayout());
			JButton a=new JButton("Hello");
			add(a);
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Background();
	}

}
