import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[3];

		while(true) {
			for (int i=0; i<intArray.length; i++) {
				intArray[i] = (int)(Math.random() * 3) + 1;
				System.out.print(intArray[i] + "\t");
			}
			System.out.println();
			
			if ((intArray[0] == intArray[1]) && (intArray[1] == intArray[2])) {
				System.out.println("����");
				break;
			}
		}
	}
}
