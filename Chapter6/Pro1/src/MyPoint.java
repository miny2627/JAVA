
public class MyPoint {
	private int x,y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "MyPoint(" + this.x + "," + this.y + ")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a = new MyPoint(3, 20);
		System.out.println(a);
		
	}

}
