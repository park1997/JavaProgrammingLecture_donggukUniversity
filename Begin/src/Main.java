//Ŭ���� ����
class Circle{
	//�Ӽ�(field)
	int radius;
	String name;
	//Method(���)
	void area() {
		//�ʵ� �� ���������� �����ؼ� ����ؾ���.
		System.out.println(name+"�� ������ "+radius*radius*3.14);
		
		
	}
}

public class Main {

	public static void main(String[] args) {
		System.out.println("Ŭ������ ��ü\n");
		Circle pizza = new Circle();//pizza ��� ��ü����
		pizza.radius=10;//�ʵ尪 ����
		System.out.println(pizza.radius); 	//����
		System.out.println(pizza.name);
		pizza.name ="�̽�������";	//�ʵ尪 ����
		System.out.println();
		System.out.println(pizza.name+"\n");
		
		//ȣ��
		pizza.area();
		
	}
	

}
