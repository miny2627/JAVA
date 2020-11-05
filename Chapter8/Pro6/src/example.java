import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class example extends JFrame {
	Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, 
					  Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, 
					  Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK,
					  Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA};
	example(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		
		for (int i=0; i<20; i++){
			JLabel label = new JLabel();
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			System.out.println(x + " " + y);
			label.setLocation(x, y);
			label.setSize(10,10);
			label.setOpaque(true);
			label.setBackground(Color.BLUE);
			contentPane.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new example();
	}

}