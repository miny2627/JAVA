import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하세요>>");
		int x = s.nextInt();
		int y = s.nextInt();
		
		System.out.print("점 (" + x + "," + y + ")은 ");
		System.out.print("(50, 50)과 (100, 100)의 사각형 내에 ");
		
		if ((50<=x && x<=100) && (50<=y && y<=100))
			System.out.print("있습니다.");
		else
			System.out.print("없습니다.");
		
		
		
	}

}