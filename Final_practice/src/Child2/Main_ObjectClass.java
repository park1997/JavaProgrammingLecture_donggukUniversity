package Child2;

public class Main_ObjectClass {

	public static void main(String[] args) {
		// Ŭ�����κ��� �����Ǵ� ��ü���� ��δ� �ٸ������� ���縦 �Ѵ�.
		//�� ��ü�� ����Ű�°� ���۷��������
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		//Ŭ������ ���Ƶ� ��ü�� ���� �ٸ� �޸𸮿� �����
		System.out.println("obj1 = "+obj1);
		System.out.println("obj2 = "+obj2);
		System.out.println("obj3 = "+obj3);
		
		//�� ��µ�
		obj1.getInfo();
		//null�� �����ؼ� �ּҿ��ִ� ��ü�� ������
		obj1=null;
		System.out.println("obj1 = "+obj1);
		//null���� �����߱⶧���� ������ ��
		obj1.getInfo();
		
	}

}
