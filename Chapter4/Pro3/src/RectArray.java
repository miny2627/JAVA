import java.util.Scanner;

public class RectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Rect rectArray[] = new Rect[4];
		
		for (int i=0; i<4; i++) {
			System.out.print((i+1) + " �ʺ�� ���� >>");
			int width = s.nextInt();
			int height = s.nextInt();
			rectArray[i] = new Rect(width, height);
		}
		
		System.out.println("�����Ͽ����ϴ�...");
		
		int sum = 0;
		for( int i=0;i<4; i++) {
			sum += rectArray[i].getArea();
		}
		
		System.out.println("�簢���� ��ü ���� " + sum);
	}

}