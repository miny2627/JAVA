import java.util.Scanner;

public class Modify {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print(">>");
			String line = s.nextLine();
			StringBuffer sb = new StringBuffer(line);
			if (line.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			int index = (int)(Math.random()*line.length());
			while (true) {
				int i = (int)(Math.random()*26);
				char c = (char)('a' + i);
				if ((char)line.charAt(i) != c){
					sb.replace(i, i+1, Character.toString(c));
					break;
				}
			}
			System.out.println(sb);
		}
	}

}
