package shapes;

import java.awt.Graphics;

public class Circle extends Shape{
	protected Point center;
	protected int r;

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
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(center.getX()-r, center.getY()-r, 2*r, 2*r);
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

}
