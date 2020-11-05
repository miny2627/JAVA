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
		b = new Bear(0, 0, 1, 'B'); // x좌표, y좌표, 이동거리, shape
		f = new Fish(5, 5, 1, '@'); // x좌표, y좌표, 이동거리, shape
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
		System.out.println("**Bear의 Fish 먹기 게임을 시작합니다.**");
		drawMap(); // 초기 맵 그리기
		while(true){
			System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >>");
			b.setA(s.next().charAt(0)); // bear가 이동할 방향 설정
			b.move(); // bear 이동
			f.move(); // fish 이동
			drawMap(); // 맵 다시 그리기
			if (b.collide(f)){ // 만약 bear가 fish를 먹으면(충돌 발생) => 게임 종료
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
