import java.util.Scanner;

public class GraphicEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Shape sp[] = new Shape[3];
		for (int i=0; i<3; i++)
			sp[i] = null;

		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int n = s.nextInt();
			
			switch(n) {
				case 1:
					System.out.print("���� ���� Line(1), Rect(2), Circle(3)>>");
					int a = s.nextInt();
					if ((a-1) == 0)
						sp[a-1] = new Line();
					else if ((a-1) == 1)
						sp[a-1] = new Rect();
					else
						sp[a-1] = new Circle();
					break;
				case 2:
					System.out.print("������ ������ ��ġ>>");
					int b = s.nextInt();
					if (sp[b-1] == null)
						System.out.println("������ �� �����ϴ�.");
					else
						sp[b-1] = null;
					break;
				case 3:
					for (int i=0; i<3; i++)
						if (sp[i] != null)
							sp[i].draw();
					break;
				case 4:
					System.exit(1);
					break;
				default:
					System.out.println("1~4 ������ ���ڸ� �Է��ؾ� �մϴ�.");
			}
		}
	}

}