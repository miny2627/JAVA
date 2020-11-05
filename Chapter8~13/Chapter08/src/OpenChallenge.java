import java.awt.*;
import javax.swing.*;

public class OpenChallenge extends JFrame{
	OpenChallenge()
	{
		setTitle("Open Challenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		
		NorthPanel np=new NorthPanel();
		CenterPanel cp=new CenterPanel();
		
		contentPane.add(np, BorderLayout.NORTH);
		contentPane.add(cp, BorderLayout.CENTER);
		
		setSize(300,250);
		setVisible(true);
	}
	class NorthPanel extends JPanel
	{
		public NorthPanel()
		{
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout());
			
			JButton open=new JButton("Open");
			JButton read=new JButton("Read");
			JButton close=new JButton("Close");
			
			add(open);
			add(read);
			add(close);
		}
	}
	class CenterPanel extends JPanel
	{
		public CenterPanel()
		{
			setLayout(null);
			JLabel label=new JLabel("Java");
			label.setSize(30,20);
			label.setLocation(120, 50);
			add(label);
			
			setSize(100,20);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OpenChallenge();
	}

}
