import java.util.Scanner;
import java.util.StringTokenizer;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while (true) {
			String line = s.nextLine();
			if (line.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			StringTokenizer st = new StringTokenizer(line, " ");
			int n = st.countTokens();
			System.out.println("���� ������ " + n);

		}
	}

}