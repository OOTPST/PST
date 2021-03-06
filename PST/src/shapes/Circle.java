package shapes;

import java.awt.Color;
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
	public int compareTo(Object o) {
		if(o instanceof Circle) {
			Circle temp = (Circle) o;
			return (int) (this.area() - temp.area()); 
		}
		return 0;
	}

	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		center.moveBy(byX, byY);
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.drawOval(center.getX()-r, center.getY()-r, 2*r, 2*r);
		if(selected) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX()-3, center.getY()-3, 6, 6);
			g.drawRect(center.getX()-3, center.getY()-r-3, 6, 6);
			g.drawRect(center.getX()-r-3, center.getY()-3, 6, 6);
			g.drawRect(center.getX()+r-3, center.getY()-3, 6, 6);
			g.drawRect(center.getX()-3, center.getY()+r-3, 6, 6);
		}
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

	public void setR(int r) throws Exception{
		if(r < 0)
			throw new Exception("Broj je negativan");
		this.r = r;
	}

}
