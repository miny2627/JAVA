import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("식을 입력하세요>>");
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
					System.out.println("0으로 나눌 수 없습니다..");
					return;
				}
				result = op1 / op2; break;
			default:
				System.out.println("연산 기호가 잘못되었습니다.");
				break;
		}
		System.out.println("연산결과 " + result);
	}
}