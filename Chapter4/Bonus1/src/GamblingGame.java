import java.util.Scanner;

public class GamblingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Player p[] = new Player[2];
		
		for (int i=0; i<2; i++) {
			System.out.print("���� �̸� �Է� >>");
			p[i] = new Player(s.next());
		}
		
		int n=0;
		while(true) {
			System.out.print(p[n].getName() + " <Enter �� �ƹ�Ű�� ġ����>");
			s.next();
			int val[] = new int [3];
			for(int i=0;i<val.length;i++) {
				val[i] = (int)(Math.random()*3);
				System.out.print(val[i] + "\t");
			}
			System.out.println();
			if ((val[0] == val[1]) && (val[0] == val[1])) {
				System.out.println(p[n].getName() + "�� �¸��Ͽ����ϴ�.");
				break;
			}
			n++;
			n = n%2;
		}
	}
}
