import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��ϼ���>>");
		int x = s.nextInt();	
		int a = x / 10;
		int b = x % 10;
		
		int count = 0;
		if ((a != 0) && (a % 3 ==0))
			count++;
		if ((b != 0) && (b % 3 ==0))
			count++;
		
		if (count == 2) System.out.print("�ڼ� ¦¦");
		else if (count == 1) System.out.print("�ڼ� ¦");
		else System.out.print("�ڼ� ����");
	}
}