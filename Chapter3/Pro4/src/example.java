import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day[] = {"일", "월", "화", "수", "목", "금", "토"};
		Scanner s = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("정수를 입력하세요>>");
				int num = s.nextInt();
				if (num <0) {
					System.out.println("프로그램을 종료합니다...");
					break;
				}
				System.out.println(day[num%7]);
			}catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				s.next();
			}
		}
	}
}
