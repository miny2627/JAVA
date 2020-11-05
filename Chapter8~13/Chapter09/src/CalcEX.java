import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalcEX extends JFrame{
	JLabel label;
	JButton p2=new JButton("+2");
	JButton m1=new JButton("-1");
	JButton four=new JButton("%4");
	
	CalcEX()
	{
		setTitle("0으로 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new BorderLayout());
		
		LaPanel la=new LaPanel();
		c.add(la, BorderLayout.CENTER);
		
		ButtonPanel bp=new ButtonPanel();
		c.add(bp, BorderLayout.SOUTH);
		
		setSize(250,150);
		setVisible(true);
		
	}
	
	class LaPanel extends JPanel
	{
		public LaPanel()
		{
			setLayout(new FlowLayout());
			int n=(int)(Math.random()*60+1);
			
			label=new JLabel(Integer.toString(n));
			label.setFont(new Font("Arial", Font.PLAIN, 20));
			add(label);
		}
	}
	
	class ButtonPanel extends JPanel
	{
		public ButtonPanel()
		{
			setLayout(new FlowLayout());
			
			p2.addActionListener(new MyActionListener());
			m1.addActionListener(new MyActionListener());
			four.addActionListener(new MyActionListener());
			
			add(p2);
			add(m1);
			add(four);
		}
	}
	
	class MyActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton a=(JButton)e.getSource();
			String s=label.getText();
			int n=Integer.parseInt(s);
			
			if(a.getText().equals("+2"))
			{
				n+=2;
				label.setText(Integer.toString(n));
				a.setEnabled(false);
					
				if(n==0) 
				{
					n=(int)(Math.random()*60+1);
					label.setText(Integer.toString(n));
					p2.setEnabled(true);
					m1.setEnabled(true);
					four.setEnabled(true);
				}
			}
			else if(a.getText().equals("-1"))
			{
				n-=1;
				label.setText(Integer.toString(n));
				a.setEnabled(false);
					
				if(n==0) 
				{
					n=(int)(Math.random()*60+1);
					label.setText(Integer.toString(n));
					p2.setEnabled(true);
					m1.setEnabled(true);
					four.setEnabled(true);
				}
			}
			else if(a.getText().equals("%4"))
			{
				n%=4;
				label.setText(Integer.toString(n));
				a.setEnabled(false);
					
				if(n==0) 
				{
					n=(int)(Math.random()*60+1);
					label.setText(Integer.toString(n));
					p2.setEnabled(true);
					m1.setEnabled(true);
					four.setEnabled(true);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalcEX();
	}

}
