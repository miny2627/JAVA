import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("�ο���>>");
		int num = s.nextInt();
		Phone PhoneArray[] = new Phone[num];
		
		for (int i=0; i<num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�) >>");
			String name = s.next(); 
			String tel = s.next();
			PhoneArray[i] = new Phone(name, tel);
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		while(true){
			System.out.print("�˻��� �̸�>>");
			String name = s.next();
			if (name.equals("exit"))
				break;
			
			int idx = -1;
			
			for (int i=0; i<num; i++) {
				if (name.equals(PhoneArray[i].getName())) {
					idx = i;
					break;
				}
			}
			
			if (idx != -1) {
				System.out.println(name + "�� ��ȣ�� " + PhoneArray[idx].getTel() + " �Դϴ�.");
			}else {
				System.out.println(name + "�� �����ϴ�.");
			}
		}
	}

}