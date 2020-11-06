//클래스 선언
class Circle{
	//속성(field)
	int radius;
	String name;
	//Method(기능)
	void area() {
		//필드 와 지역변수를 구분해서 기억해야함.
		System.out.println(name+"의 면적은 "+radius*radius*3.14);
		
		
	}
}

public class Main {

	public static void main(String[] args) {
		System.out.println("클래스와 객체\n");
		Circle pizza = new Circle();//pizza 라는 객체생성
		pizza.radius=10;//필드값 저장
		System.out.println(pizza.radius); 	//참조
		System.out.println(pizza.name);
		pizza.name ="미스터피자";	//필드값 저장
		System.out.println();
		System.out.println(pizza.name+"\n");
		
		//호출
		pizza.area();
		
	}
	

}
