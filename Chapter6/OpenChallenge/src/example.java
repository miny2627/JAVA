import java.util.Scanner;

public class example {
	static String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner s = new Scanner(System.in);
		while (true) {
			String line = s.nextLine();
			if (line.length() == 1 && line.charAt(0) == ';')
				break;
			sb.append(line);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = readString();
		System.out.println(text);
		int intArray[] = new int[26];
		for (int i=0; i<intArray.length; i++)
			intArray[i] = 0;
		
		for (int i=0; i<text.length(); i++) {
			if (65<= text.charAt(i) &&  text.charAt(i) <=90)
				intArray[text.charAt(i)-65] += 1;
			else 
				intArray[text.charAt(i)-97] += 1;
			
		}
		System.out.println("������׷��� �׸��ϴ�.");
		for (int i=0; i<intArray.length; i++) {
			System.out.print((char)(i+65));
			for(int j=0; j< intArray[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

}