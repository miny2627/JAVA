import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

public class Clock extends JFrame{
	String clockText;
	Clock()
	{
		setTitle("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(new ClockLabel(clockText));
		
		setSize(300,200);
		setVisible(true);
	}
	class ClockLabel extends JLabel implements Runnable
	{	
		String text;
		public ClockLabel(String text)
		{	
			new Thread(this).start();
			this.text=clockText;
		}
		public void run()
		{
			while(true)
			{
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) { return; }
				
				Calendar c=Calendar.getInstance();
				int hour=c.get(Calendar.HOUR_OF_DAY);
				int min=c.get(Calendar.MINUTE);
				int second=c.get(Calendar.SECOND);
				
				clockText=Integer.toString(hour);
				clockText=clockText.concat(":");
				clockText=clockText.concat(Integer.toString(min));
				clockText=clockText.concat(":");
				clockText=clockText.concat(Integer.toString(second));
				
				setFont(new Font("Arial", Font.BOLD, 50));
				setText(clockText);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Clock();
	}

}
