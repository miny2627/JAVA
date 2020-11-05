import java.awt.*;
import javax.swing.*;

class TimeRunnable extends Thread
{
	JPanel p;
	
	public TimeRunnable(JPanel p)
	{
		this.p=p;
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			return;
		}
	}
}

public class ThreadEx extends JFrame{
	ThreadEx()
	{
		setTitle("실행 시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		JPanel jp=new JPanel();
		jp.setBackground(Color.YELLOW);
		contentPane.add(jp);
		
		TimeRunnable runnable = new TimeRunnable(jp);
		Thread th=new Thread(runnable);
		
		setSize(300,300);
		setVisible(true);
		
		th.start();
		
		try
		{
			th.join();
			setTitle("실행 종료");
			jp.setBackground(Color.BLUE);
		}
		catch(InterruptedException e)
		{
			return;
		}
		
		if(th.isAlive()) th.interrupt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadEx();
	}

}
