package ���Person;

public class Student extends Person{
	public void set() {
		age=30;	//����Ʈ�� ���ٰ���
		name = "ȫ�浿";	//public���ٰ���
		height = 175;	//protected ���ٰ���
		//weight = 99;	// private ���� �Ұ�
		setWeight(99);	//private������ �޼ҵ带 ���� �����ؾ���
		System.out.println("age : "+age);
		System.out.println("name : "+name);
		System.out.println("height : "+height);
		
		
	}
}
