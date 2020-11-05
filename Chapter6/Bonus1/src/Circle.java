
public class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public String toString() {
		return "("+x+"," +y + ")¹ÝÁö¸§" + radius;
	}
	
	public boolean equals(Circle b) {
		if ((this.x == b.x) && (this.y == b.y)&&(this.radius == b.radius))
			return true;
		return false;
	}
}
