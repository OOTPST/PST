package shapes;

public class Rectangle {
	private Point upperLeft;
	private int width;
	private int height;
	private boolean selected;

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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
