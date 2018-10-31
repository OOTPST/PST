package shapes;

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

	}

}
