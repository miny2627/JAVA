import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		try {
			int num = s.nextInt();
			
			if(num %2 == 0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");
		}catch(InputMismatchException e) {
			System.out.println("���� �Է����� �ʾ� ���α׷��� �����մϴ�.");
		}

	}
}
