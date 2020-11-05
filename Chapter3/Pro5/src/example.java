import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[] = new int[10];
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수 10개 입력>>");
		for (int i=0; i<10;i++) {
			intArray[i] = s.nextInt();
		}
		// 선택 정렬
		for (int i=9; i>0; i--) {
			int max = 0;
			for (int j=1;j<=i;j++) {
				if (intArray[j] > intArray[max])
					max = j;
			}
			int temp;
			temp = intArray[max];
			intArray[max] = intArray[i];
			intArray[i] = temp;
		}

		for (int i=0; i<10;i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
