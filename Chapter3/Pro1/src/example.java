import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
		
		String a = s.next();
		char c = a.charAt(0);
		
		for (int i=97; i<=(int)c; i++) {
			for (int j=i; j<=(int)c; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}