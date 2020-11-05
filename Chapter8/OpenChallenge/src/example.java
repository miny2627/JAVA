
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class example extends JFrame {
	String a [] = {"Open", "Read", "Close"};
	
	example(){
		setTitle("Open Challenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		
		NorthPanel np = new NorthPanel();
		for (int i=0; i<3; i++){
			JButton button = new JButton(a[i]);
			button.setSize(10,10);
			np.add(button);
		}
		contentPane.add(np, BorderLayout.NORTH);
		
		
		CenterPanel cp = new CenterPanel();
		cp.setLayout(null);
		JLabel label = new JLabel("Java");
		label.setSize(30, 20);
		label.setLocation(175, 75);
		cp.add(label);
		
		contentPane.add(cp, BorderLayout.CENTER);
		setSize(400, 250);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new example();
	}

}
