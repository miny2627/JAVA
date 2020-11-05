import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LabelEX extends JFrame{
	LabelEX()
	{
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		JLabel label=new JLabel("�ڱ��");
		label.addMouseListener(new MyMouseListener());
		contentPane.add(label);
		
		setSize(250,120);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener
	{
		JLabel la;
		public void mouseEntered(MouseEvent e)
		{
			la=(JLabel)e.getSource();
			la.setText("�����");
		}
		public void mouseExited(MouseEvent e)
		{
			la=(JLabel)e.getSource();
			la.setText("�ڱ��");
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEX();
	}
}
