public class Circle {
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	public int getRadius( ) { return this.radius; }
	public void setRadius(int radius) { this.radius = radius; }
}

class CircleManager {
	static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	
	static boolean equals(Circle a, Circle b) {
		if (a.getRadius() == b.getRadius())
			return true;
		else
			return false;
	}
}
