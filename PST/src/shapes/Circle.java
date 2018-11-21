package shapes;

public class Circle {
	protected Point center;
	protected int r;
	protected boolean selected;

	public Circle() {

	}

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	public Circle(Point center, int r, boolean selected) {
		this(center, r);
		this.selected = selected;
	}

	public boolean contains(int x, int y) {
		double d = center.distance(x, y);
		if (d <= r)
			return true;
		else
			return false;
	}

	// center: (xCenter,yCenter), radius: r
	public String toString() {
		return "center: " + center + ", radius: " + r;
	}

	public double area() {
		return r * r * Math.PI;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
