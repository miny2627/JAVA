import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���� �׼��� �� �Է��ϼ���>>");
		int n = s.nextInt();
	
		System.out.print("������" + n/50000 + "��,");
		n = n % 50000;
		System.out.print("����" + n/10000 + "��,");
		n = n % 10000;
		System.out.print("õ��" + n/1000 + "��,");
		n = n % 1000;
		System.out.print("500��" + n/500 + "��,");
		n = n % 500;
		System.out.print("100��" + n/100 + "��,");
		n = n % 100;
		System.out.print("10��" + n/10 + "��,");
		n = n % 10;
		System.out.println("1��" + n + "��");
		
		
	}

}