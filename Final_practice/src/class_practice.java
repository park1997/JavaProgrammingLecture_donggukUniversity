class Circle{
	static int radius;
	
	static double area() {	//static �� ������ ��ü �������� �޼ҵ� ȣ���� �����ϴ�.
		//��������
		int radius =20;
		return 3.14*radius*radius;
	}
}
public class class_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ��ü ����
		//Circle pizza = new Circle();
		//pizza.radius=10;
		//System.out.println(pizza.area());
		
		// ��ü �������� �޼ҵ� ȣ��
		System.out.println(Circle.area());
		
		
		
		
	}

}
