import java.awt.*;
import javax.swing.*;

public class TwoImage extends JFrame{
	TwoImage()
	{
		setTitle("�� �̹��� ������ ���̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(400,400);
		setVisible(true);
	}
	class MyPanel extends JPanel
	{
		ImageIcon a=new ImageIcon("Chobee.jpg");
		ImageIcon b=new ImageIcon("â�����α�.png");
		
		Image one=a.getImage();
		Image two=b.getImage();
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(one,0,0, this.getWidth()/2, this.getHeight(),this);
			g.drawImage(two,this.getWidth()/2,0, this.getWidth()/2, this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TwoImage();
	}

}
