import java.util.Scanner;
public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���>>");
		System.out.print("ö��>>");
		String a = s.next();
		System.out.print("����>>");
		String b = s.next();
		
		if (a.equals("����")){
			if (b.equals("����"))
				System.out.println("�����ϴ�.");
			else if (b.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else // ��
				System.out.println("ö���� �̰���ϴ�.");
		}else if (a.equals("����")){
			if (b.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if (b.equals("����"))
				System.out.println("�����ϴ�..");
			else // ��
				System.out.println("���� �̰���ϴ�.");
		}else{ // ö�� => ��
			if (b.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if (b.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
	}
}
