import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ���>>");
		boolean a = s.nextBoolean();
		String op = s.next();
		boolean b = s.nextBoolean();
		
		switch(op){
			case "AND":
				System.out.println(a & b);
				break;
			case "OR":
				System.out.println(a | b);
				break;
		}
	}
}