import java.util.Scanner;

public class GamblingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Player p[] = new Player[2];
		
		for (int i=0; i<2; i++) {
			System.out.print("선수 이름 입력 >>");
			p[i] = new Player(s.next());
		}
		
		int n=0;
		while(true) {
			System.out.print(p[n].getName() + " <Enter 외 아무키나 치세요>");
			s.next();
			int val[] = new int [3];
			for(int i=0;i<val.length;i++) {
				val[i] = (int)(Math.random()*3);
				System.out.print(val[i] + "\t");
			}
			System.out.println();
			if ((val[0] == val[1]) && (val[0] == val[1])) {
				System.out.println(p[n].getName() + "이 승리하였습니다.");
				break;
			}
			n++;
			n = n%2;
		}
	}
}
