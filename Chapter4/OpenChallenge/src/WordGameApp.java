import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int num = s.nextInt();
		Player p[] = new Player[num];
		
		for (int i=0; i<3; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			p[i] = new Player(s.next());
		}
		
		String word = "아버지";
		int lastIndex = word.length() -1;
		char lastChar = word.charAt(lastIndex);
		
		System.out.println("시작하는 단어는 아버지입니다.");
		
		int n=0;
		while(true){
			System.out.print(p[n].getName() + ">>");
			
			word = s.next();
			p[n].sayWord(word);
			if (p[n].succeed(lastChar) == false) {
				System.out.print(p[n].getName() + "이 졌습니다.");
				break;
			}
				
			lastIndex = word.length() -1;
			lastChar = word.charAt(lastIndex);
			
			n++;
			n = n%num;
		}
	}

}
