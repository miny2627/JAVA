import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String eng[] = {"student", "love", "jave", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			String str = s.next();
			if (str.equals("exit"))
				break;
			
			int idx = -1;
			for (int i=0;i<5;i++)
				if(str.equals(eng[i]))
					idx = i;
			
			if (idx != -1)
				System.out.println(kor[idx]);
			else
				System.out.println("그런 영어 단어가 없습니다.");
		}
	}
}
