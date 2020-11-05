import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("돈의 액수를 를 입력하세요>>");
		int n = s.nextInt();
	
		System.out.print("오만원" + n/50000 + "개,");
		n = n % 50000;
		System.out.print("만원" + n/10000 + "개,");
		n = n % 10000;
		System.out.print("천원" + n/1000 + "개,");
		n = n % 1000;
		System.out.print("500원" + n/500 + "개,");
		n = n % 500;
		System.out.print("100원" + n/100 + "개,");
		n = n % 100;
		System.out.print("10원" + n/10 + "개,");
		n = n % 10;
		System.out.println("1원" + n + "개");
		
		
	}

}