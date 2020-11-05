import java.awt.*;
import javax.swing.*;

public class Pro6 extends JFrame{
	Pro6()
	{
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		for(int i=0; i<20; i++)
		{
			JLabel label=new JLabel();
			int x=(int)(Math.random()*200)+50;
			int y=(int)(Math.random()*200)+50;
			label.setLocation(x,y);
			label.setSize(10,10);
			label.setBackground(Color.BLUE);
			label.setOpaque(true);
			
			contentPane.add(label);
		}
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pro6();
	}

}
