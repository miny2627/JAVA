import java.util.Scanner;
import java.util.StringTokenizer;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		StringTokenizer st = new StringTokenizer(line, "+");
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken().trim());
		}
		System.out.println("гую╨ " + sum);
	}

}
