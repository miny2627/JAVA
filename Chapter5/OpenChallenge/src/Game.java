import java.util.Scanner;

public class Game {
	private int width, height;
	private int map[][];
	private Bear b;
	private Fish f;
	public Game() {
		width = 20;
		height = 10;
		map = new int[height][width];
		b = new Bear(0, 0, 1, 'B'); // x��ǥ, y��ǥ, �̵��Ÿ�, shape
		f = new Fish(5, 5, 1, '@'); // x��ǥ, y��ǥ, �̵��Ÿ�, shape
	}
	
	public void drawMap(){
		for (int i=0; i<map.length; i++){
			for(int j=0;j<map[i].length; j++){
				if ((b.getX() == i) && (b.getY() == j))
					System.out.print(b.getShape());
				else if((f.getX() == i) && (f.getY() == j))
					System.out.print(f.getShape());
				else
					System.out.print('-');
			}
			System.out.println();
		}
	}
	
	public void GameStart(){
		Scanner s = new Scanner(System.in);
		System.out.println("**Bear�� Fish �Ա� ������ �����մϴ�.**");
		drawMap(); // �ʱ� �� �׸���
		while(true){
			System.out.print("����(a), �Ʒ�(s), ��(d), ������(f) >>");
			b.setA(s.next().charAt(0)); // bear�� �̵��� ���� ����
			b.move(); // bear �̵�
			f.move(); // fish �̵�
			drawMap(); // �� �ٽ� �׸���
			if (b.collide(f)){ // ���� bear�� fish�� ������(�浹 �߻�) => ���� ����
				System.out.println("Bear Wins!!");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Game g = new Game();
		g.GameStart();
	}

}
