package 상속포인트;

public class Point {
	private int x,y;
	public Point() {
		// TODO Auto-generated constructor stub
		this.x=0;
		this.y=0;
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
				
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
	
	
}
