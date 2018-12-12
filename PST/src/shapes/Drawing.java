package shapes;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {
	public Drawing() {
	}
 	public static void main(String[] args) {
 		JFrame frame = new JFrame("Drawing");
		frame.setSize(800, 600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
 	}
	
	public void paint(Graphics g) {
		Point p1 = new Point(50,50);
		p1.setSelected(true);
		p1.draw(g);
		
		Line l1 = new Line(new Point(100, 50), new Point(200, 100));
		l1.setSelected(true);
		l1.draw(g);
		
		Rectangle r1 = new Rectangle(new Point(10, 100), 100, 50);
		r1.setSelected(true);
		r1.draw(g);
		
		Circle c1 = new Circle(new Point(400, 150), 100);
		c1.setSelected(true);
		c1.draw(g);
		
		Donut d1 = new Donut(new Point(400, 500), 150, 75);
		d1.setSelected(true);
		d1.draw(g);
		d1.moveBy(20, 20);
		//d1.draw(g);
	}
 }