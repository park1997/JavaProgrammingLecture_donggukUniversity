class Circle{
	static int radius;
	
	static double area() {	//static 을 붙히면 객체 생성없이 메소드 호출이 가능하다.
		//지역변수
		int radius =20;
		return 3.14*radius*radius;
	}
}
public class class_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체 생성
		//Circle pizza = new Circle();
		//pizza.radius=10;
		//System.out.println(pizza.area());
		
		// 객체 생성없이 메소드 호출
		System.out.println(Circle.area());
		
		
		
		
	}

}
