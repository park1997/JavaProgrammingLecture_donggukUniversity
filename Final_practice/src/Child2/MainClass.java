package Child2;

public class MainClass {
	public static void main(String[] args) {
		
		ChildClass2 child1 = new ChildClass2();
		child1.setInfo("byunghyun", "man", 24); //data의 타입을 잘 정해주는게 중요
		child1.getInfo();
		
		// 중복 메소드 ==> overloading(오버로딩)
		System.out.println();
		child1.getInfo(10, 20);
		
		System.out.println();
		child1.getInfo("im", "byunghyun");
		
		System.out.println();
		child1.mysecret();
		
		
	}
}
