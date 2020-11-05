
public class Bear extends GameObject{
	private char shape;
	private char a;
	public Bear(int startX, int startY, int distance, char shape) {
		super(startX, startY, distance);
		this.shape = shape;
		this.a = 's';
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
	public void setA(char m){ this.a = m;}
	public char getShape() { return shape; }

	@Override
	public void move() {
		// TODO Auto-generated method stub
		switch (this.a){
			case 's': setX(1); break;
			case 'f': setY(1); break;
			case 'a': setY(-1); break;
			case 'd': setX(-1); break;
		}
	}
}
