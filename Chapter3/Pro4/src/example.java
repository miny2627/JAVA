import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day[] = {"��", "��", "ȭ", "��", "��", "��", "��"};
		Scanner s = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("������ �Է��ϼ���>>");
				int num = s.nextInt();
				if (num <0) {
					System.out.println("���α׷��� �����մϴ�...");
					break;
				}
				System.out.println(day[num%7]);
			}catch(InputMismatchException e) {
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
				s.next();
			}
		}
	}
}