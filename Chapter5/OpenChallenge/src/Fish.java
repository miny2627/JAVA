
public class Fish extends GameObject{
	private char shape;
	private int count;
	public Fish(int startX, int startY, int distance, char shape) {
		super(startX, startY, distance);
		this.shape = shape;
		count = 0;
	}
	
	public void setX(int a){ 
		this.x = this.x + a;
		if (this.x == 9)
			this.x = 0;
		if (this.x == -1)
			this.x = 9;
	}
	public void setY(int a){ 
		this.y = this.y + a;
		if (this.y == 19)
			this.y = 0;
		if (this.y == -1)
			this.y = 19;
	}
	
	@Override
	public void move() {
		int randn = (int)(Math.random()*5);
		if (randn > 3){
			int move = (int)(Math.random()*4);
			switch (move){
				case 0: setX(-1); break;
				case 1: setX(-1); break;
				case 2: setY(-1); break;
				case 3: setY(-1); break;
			}
		}
	}
	public char getShape() { return shape; }
}
