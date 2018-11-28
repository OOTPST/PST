package shapes;

import java.awt.Graphics;

public class Line extends Shape{
	private Point startPoint;
	private Point endPoint;

	public Line() {

	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line temp = (Line) obj;
			if (this.getStartPoint().equals(temp.getStartPoint()) && 
					this.getEndPoint().equals(temp.getEndPoint()))
				return true;
			else
				return false;
		} else
			return false;
	}
	

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
	}

	public boolean contains(int x, int y) {
		double d1 = startPoint.distance(x, y);
		double d2 = endPoint.distance(x, y);
		double d = d1 + d2;
		if (this.length() + 1 <= d)
			return true;
		else
			return false;
	}

	// (xStartPoint,yStartPoint)-->(xEndPoint,yEndPoint)
	public String toString() {
		return startPoint.toString() + "-->" + endPoint.toString();
	}

	public double length() {
		double l = startPoint.distance(endPoint.getX(), endPoint.getY());
		return l;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}


}
