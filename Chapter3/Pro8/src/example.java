import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = {"����", "����", "��"};
		Scanner s = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
			System.out.print("���� ���� ��!>>");
			String a = s.next();
			if (a.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				break;
			}
			
			int n = (int)(Math.random()*3);
			System.out.print("����� = " + a + ", ��ǻ�� = " + str[n] + ", ");
			if (a.equals("����")) {
				if (str[n].equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}else if (str[n].equals("��")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				}else{
					System.out.println("�����ϴ�.");
				}
			}else if (a.equals("����")){
				if (str[n].equals("����")) {
					System.out.println("�����ϴ�.");
				}else if (str[n].equals("��")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				}else{
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}else { // ��
				if (str[n].equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				}else if (str[n].equals("��")) {
					System.out.println("�����ϴ�.");
				}else{
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}	
			}
		}
	}
}