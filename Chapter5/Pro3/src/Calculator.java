import java.util.Scanner;

public abstract class Calculator {
	protected int a, b;
	abstract protected int calc();
	protected void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		a = s.nextInt();
		b = s.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("���� ���� " + res);
	}
}