import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=99; i++) {
			int count = 0;
			int a = i / 10;
			int b = i % 10;
			
			if ((a != 0) && (a %3 ==0))
				count += 1;
			if ((b != 0) && (b %3 ==0))
				count += 1;
			
			if (count == 2)
				System.out.println(i + "박수두번");
			else if (count == 1)
				System.out.println(i + "박수한번");
		}
	}
}
