import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String eng[] = {"student", "love", "jave", "happy", "future"};
		String kor[] = {"�л�", "���", "�ڹ�", "�ູ��", "�̷�"};
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>>");
			String str = s.next();
			if (str.equals("exit"))
				break;
			
			int idx = -1;
			for (int i=0;i<5;i++)
				if(str.equals(eng[i]))
					idx = i;
			
			if (idx != -1)
				System.out.println(kor[idx]);
			else
				System.out.println("�׷� ���� �ܾ �����ϴ�.");
		}
	}
}