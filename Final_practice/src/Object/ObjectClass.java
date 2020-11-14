package Object;

public class ObjectClass {
	
	//전역변수 x,y
	public int x;
	public int y;
	public ObjectClass(String s, int[] iArr) {
		// TODO Auto-generated constructor stub
		System.out.println(" -- ObjectClass() -- ");
		
		System.out.println("S = "+s);
		System.out.println("iArr = "+iArr);
		
	}
	public ObjectClass(int x, int y) {
		// this.x => 전역변수
		// x => 지역변수
		this.x=x;
		this.y=y;
		
	}
	public void getInfo() {
		System.out.println("x ---> "+x);
		System.out.println("y ---> "+y);
		
	}
	
}
