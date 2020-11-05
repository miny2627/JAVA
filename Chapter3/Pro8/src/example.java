import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = {"가위", "바위", "보"};
		Scanner s = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			String a = s.next();
			if (a.equals("그만")) {
				System.out.print("게임을 종료합니다...");
				break;
			}
			
			int n = (int)(Math.random()*3);
			System.out.print("사용자 = " + a + ", 컴퓨터 = " + str[n] + ", ");
			if (a.equals("가위")) {
				if (str[n].equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}else if (str[n].equals("보")) {
					System.out.println("사용자가 이겼습니다.");
				}else{
					System.out.println("비겼습니다.");
				}
			}else if (a.equals("바위")){
				if (str[n].equals("바위")) {
					System.out.println("비겼습니다.");
				}else if (str[n].equals("보")) {
					System.out.println("사용자가 이겼습니다.");
				}else{
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}else { // 보
				if (str[n].equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
				}else if (str[n].equals("보")) {
					System.out.println("비겼습니다.");
				}else{
					System.out.println("컴퓨터가 이겼습니다.");
				}	
			}
		}
	}
}
