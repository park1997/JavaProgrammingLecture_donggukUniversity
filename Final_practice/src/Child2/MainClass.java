package Child2;

public class MainClass {
	public static void main(String[] args) {
		
		ChildClass2 child1 = new ChildClass2();
		child1.setInfo("byunghyun", "man", 24); //data�� Ÿ���� �� �����ִ°� �߿�
		child1.getInfo();
		
		// �ߺ� �޼ҵ� ==> overloading(�����ε�)
		System.out.println();
		child1.getInfo(10, 20);
		
		System.out.println();
		child1.getInfo("im", "byunghyun");
		
		System.out.println();
		child1.mysecret();
		
		
	}
}
