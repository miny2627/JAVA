import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String abc[] = {"����", "����", "��"};
		
		while(true) {
			System.out.print("����(1), ����(2), ��(3), ������(4)>>");
			int n = s.nextInt();
			if (n == 4)
				break;
			String user = abc[n-1];
			String com = abc[(int)(Math.random()*3)];
			System.out.println("�����  " + user + " : " + "��ǻ�� " + com);
			if (user.equals("����")) {
				if (com.equals("����")) {
					System.out.println("�����ϴ�.");
				}else if(com.equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else { //com == "��"
					System.out.println("����ڰ� �̰���ϴ�.");
				}
			}else if(user.equals("����")) {
				if (com.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
				}else if(com.equals("����"))
					System.out.println("�����ϴ�.");
				else { //com == "��"
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}else { // user == "��"
				if (com.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}else if(com.equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else { //com == "��"
					System.out.println("�����ϴ�.");
				}
			}
		}
	}

}