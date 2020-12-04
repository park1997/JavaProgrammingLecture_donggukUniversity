package ch6_1;

class Point {
	int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
	
}
public class ObjectPropertyEX{
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
		
		System.out.println();
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println("1".equals("1"));
		
		
	}
	
}
