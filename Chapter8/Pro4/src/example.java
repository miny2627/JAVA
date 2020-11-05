import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class example extends JFrame {
	Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
						Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
	example(){
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout(1,10));
		for (int i=0; i<10; i++){
			JButton button = new JButton(Integer.toString(i));
			button.setOpaque(true);
			button.setBackground(color[i]);
			contentPane.add(button);
		}
		setSize(1000, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new example();
	}

}
