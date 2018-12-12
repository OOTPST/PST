package shapes;

import java.awt.Color;
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
		g.setColor(Color.BLACK);
		g.drawOval(center.getX()-innerR, center.getY()-innerR, 2*innerR, 2*innerR);
		if(selected) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX()-3, center.getY()-innerR-3, 6, 6);
			g.drawRect(center.getX()-innerR-3, center.getY()-3, 6, 6);
			g.drawRect(center.getX()+innerR-3, center.getY()-3, 6, 6);
			g.drawRect(center.getX()-3, center.getY()+innerR-3, 6, 6);
		}
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
