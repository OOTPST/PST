package shapes;

import java.awt.Graphics;

public class Donut extends Circle {
	private int innerR;

	public Donut() {

	}

	public Donut(Point center, int r, int innerR) {
		super(center, r);
		this.innerR = innerR;
	}

	public Donut(Point center, int r, int innerR, boolean selected) {
		super(center, r, selected);
		this.innerR = innerR;
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		super.draw(g);
		g.drawOval(center.getX()-innerR, center.getY()-innerR, 2*innerR, 2*innerR);
	}
	
	public boolean contains(int x, int y) {
		if (super.contains(x, y) && center.distance(x, y) >= innerR)
			return true;
		else
			return false;
	}
	
	// toString 
	// Center:(xCenter,yCenter), radius = <radius>, inner radius = <innerRadius>
	public String toString() {
		return super.toString()+", inner radius = "+innerR;
	}
	public double area() {
		return super.area() - innerR * innerR * Math.PI;
	}

	public int getInnerR() {
		return innerR;
	}

	public void setInnerR(int innerR) {
		this.innerR = innerR;
	}

}
