import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		while(true) {
			int target = (int)(Math.random()*100);
			System.out.println("���� �����Ͽ����ϴ�. ���߾����");
			int min = 0;
			int max = 99;
			int count = 1;
			while(true){
				System.out.println(min + "-" + max);
				System.out.print(count + ">>");
				int num = s.nextInt();
				if (num > target){
					System.out.println("�� ����");
					max = num;
				}else if (num < target){
					System.out.println("�� ����");
					min = num;
				}else{
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}
				count += 1;
			}
		System.out.print("�ٽ� �Ͻðڽ��ϱ�(y/n)>>");
		String a = s.next();
		if (a.equals("n"))
			break;
		}
	}
}
