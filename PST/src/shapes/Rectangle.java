package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{
	private Point upperLeft;
	private int width;
	private int height;

	public Rectangle() {

	}

	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height);
		this.selected = selected;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Rectangle) {
			Rectangle temp = (Rectangle) o;
			return this.area() - temp.area(); 
		}
		return 0;
	}
	
	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		this.upperLeft.moveBy(byX, byY);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.drawRect(upperLeft.getX(), upperLeft.getY(), width, height);
		if(selected) {
			g.setColor(Color.BLUE);
			g.drawRect(upperLeft.getX()-3, upperLeft.getY()-3, 6, 6);
			g.drawRect(upperLeft.getX()+width-3, upperLeft.getY()-3, 6, 6);
			g.drawRect(upperLeft.getX()-3, upperLeft.getY()+height-3, 6, 6);
			g.drawRect(upperLeft.getX()+width-3, upperLeft.getY()+height-3, 6, 6);
		}
	}

	public boolean contains(int x, int y) {
		if (x >= upperLeft.getX() && x <= upperLeft.getX() + width 
				&& y >= upperLeft.getY()
				&& y <= upperLeft.getY() + height)
			return true;
		else
			return false;
	}

	// upper left point: (xUpperLeft,yUpperLeft), width: width, height: height
	public String toString() {
		return "upper left point: " + upperLeft + " width: " + width + ", height: " + height;
	}

	public int area() {
		return width * height;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}

	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
