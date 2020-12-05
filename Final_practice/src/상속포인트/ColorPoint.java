package 상속포인트;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.color=color;
		
	}
	public void setColor(String color) {
		this.color=color;
		
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
