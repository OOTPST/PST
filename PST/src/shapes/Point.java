package shapes;

import java.awt.Graphics;

public class Point extends Shape{
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		this(x, y);
		this.selected = selected;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Point) 
			return (int) (this.distance(0, 0) - ((Point) o).distance(0,0));
		return 0;
	}
	
	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		this.x = this.x + byX;
		this.y += byY;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y-2, x, y+2);
	}

	public boolean contains(int x, int y) {
		if (this.distance(x, y) <= 2)
			return true;
		else
			return false;
	}

	public String toString() {
		// (x,y)
		return "(" + x + "," + y + ")";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point temp = (Point) obj;
			if (this.getX() == temp.getX() && this.getY() == temp.getY())
				return true;
			else
				return false;
		} else
			return false;
	}

	public double distance(int x, int y) {
		int dX = this.x - x;
		int dY = this.y - y;
		double d = Math.sqrt(dX * dX + dY * dY);
		return d;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
