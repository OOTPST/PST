package shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.w3c.dom.DOMConfiguration;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		System.out.println(p1.getX());
		p1.setX(5);
		System.out.println(p1.getX());
		//ispisati udaljenost tacke p1 od tacke 
		//sa koordinatama 10,15
		double distance = p1.distance(10,15);
		System.out.println(distance);
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(15);
		l1.setEndPoint(p2);
		System.out.println("x startPoint l1: "+l1.getStartPoint().getX());
		// ispisati na konzolu duzinu linije l1
		double length = l1.length();
		System.out.println(length);
		
		// postaviti x startPoint l1 na vrednost 10
		l1.getStartPoint().setX(10);
		//ispisati x startPoint l1
		System.out.println("x startPoint l1: "+l1.getStartPoint().getX());
		
		// postaviti x startPoint l1 na vrednost 
		// x p2
		// znamo za l1 i p2
		l1.getStartPoint().setX(p2.getX());
		System.out.println("x startPoint l1: "+l1.getStartPoint().getX());
		
		Rectangle r1 = new Rectangle();
		r1.setUpperLeft(p1);
		r1.getUpperLeft().setX(10);
		System.out.println("X upperLeft r1: "+r1.getUpperLeft().getX());
		
		Circle c1 = new Circle();
		c1.setCenter(p2);
		c1.getCenter().setX(10);
		
		// postaviti y centra c1 na vrednost y p2
		// ne znamo koordinate tacke p2
		c1.getCenter().setY(p2.getY());
		System.out.println("Y center c1: "+c1.getCenter().getY());
		
		// postaviti x centra c1 na vrednost povrsine r1
		c1.getCenter().setX(r1.area());
		System.out.println("X center c1: "+c1.getCenter().getX());
		
		Point p3 = new Point(5, 10);
		System.out.println("Xp3:"+p3.getX());
		
		Point p4 = new Point(5, 6, true); 
		System.out.println("P4 selected: "+p4.isSelected());
	
		Line l2 = new Line(new Point(5, 7), new Point(15, 17), true);
		System.out.println("l2 length: "+l2.length());
		
		// kreirati pravougaonik r2 sa koordinatama 
		// upperLeft 7, 8
		// width 5
		// height vrednost zbira koordinata p2
		
		Rectangle r2 = new Rectangle(new Point(7, 8), 5, p2.getX() + p2.getY());
		System.out.println("Pr2: "+r2.area());
		
		System.out.println(p1);
		System.out.println(p4);
		System.out.println(l2);
		System.out.println(c1);
		System.out.println(r2);
		
		Point p5 = new Point(5, 6);
		Point p6 = p5;
		Point p7 = new Point(5, 6);
		
		System.out.println("p5 == p6 "+ (p5 == p6));
		System.out.println("p5 == p7 "+ (p5 == p7));
		
		System.out.println("p5 equals p6 "+p5.equals(p6));
		System.out.println("p5 equals p7 "+p5.equals(p7));
		
		Point p8 = new Point(10, 11);
		System.out.println(p8.contains(16, 11));
		
		//kreirati Donut d1 centar 10, 20, r = 50, innerR = 25;
		Donut d1 = new Donut(new Point(10, 20), 50, 25);
		System.out.println("X:"+ d1.getCenter().getX());
		System.out.println(d1.isSelected());
		
		Shape s = new Point();
		s.contains(10, 15);
		
		int[] niz = {3,2,5,4};
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		
		Arrays.sort(niz);
		System.out.println("sortiran niz:");
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		
		Line l10 = new Line(new Point(10, 10), new Point(100, 100));
		Line l20 = new Line(new Point(10, 10), new Point(200, 200));
		Line l30 = new Line(new Point(10, 10), new Point(300, 300));

		Line [] lines = {l20, l10, l30};
		System.out.println("nesortiran niz:");
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i].length());
		}
		
		Arrays.sort(lines);
		
		System.out.println("sortiran niz:");
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i].length());
		}
		
		Circle d = new Donut();
		// Donut c = new Circle(); ne moze
		// Shape s = new Shape(); ne moze
		Moveable m = new Point();
		Shape l = new Line();
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(l1);
		shapes.add(r1);
		shapes.add(c1);
		shapes.add(d1);
		
		shapes.get(0).isSelected();
		
		shapes.add(1, p2);
		shapes.remove(3);
		
		System.out.println("prolaz kroz listu pomocu iteratora");
		Iterator<Shape> it = shapes.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//System.out.println(it.next());
		}
		
		try {
			System.out.println(lines[2]);
			Integer.parseInt("5");
			c1.setR(-50);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("niz nema toliko elemenata!");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ne mogu da pretvorim String u int");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("ispisao sam se na konzolu");
		
		
	}

}
