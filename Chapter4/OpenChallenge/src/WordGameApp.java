import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int num = s.nextInt();
		Player p[] = new Player[num];
		
		for (int i=0; i<3; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			p[i] = new Player(s.next());
		}
		
		String word = "�ƹ���";
		int lastIndex = word.length() -1;
		char lastChar = word.charAt(lastIndex);
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		
		int n=0;
		while(true){
			System.out.print(p[n].getName() + ">>");
			
			word = s.next();
			p[n].sayWord(word);
			if (p[n].succeed(lastChar) == false) {
				System.out.print(p[n].getName() + "�� �����ϴ�.");
				break;
			}
				
			lastIndex = word.length() -1;
			lastChar = word.charAt(lastIndex);
			
			n++;
			n = n%num;
		}
	}

}