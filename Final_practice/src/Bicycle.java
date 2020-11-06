
public class Bicycle {
	
	public String color;
	public int price;
	
	
	public Bicycle() {
		// TODO Auto-generated constructor stub
		System.out.println("Bicycle constructor");
	}
	public Bicycle(String c, int p) {
		System.out.println("Bicycle constructor2");
		color =c;
		price=p;
	}
	
	public void info() {
		System.out.println("    info()    ");
		System.out.println("color : "+color);
		System.out.println("price : "+price);
	}
	
	
	
	
	
}
