import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���>>");
		double op1 = s.nextDouble();
		String opr = s.next();
		double op2 = s.nextDouble();
		
		double result = 0;
		switch(opr){
			case "+": result = op1 + op2; break;
			case "-": result = op1 - op2; break;
			case "*": result = op1 * op2; break;
			case "/":
				if (op2==0){
					System.out.println("0���� ���� �� �����ϴ�..");
					return;
				}
				result = op1 / op2; break;
			default:
				System.out.println("���� ��ȣ�� �߸��Ǿ����ϴ�.");
				break;
		}
		System.out.println("������ " + result);
	}
}