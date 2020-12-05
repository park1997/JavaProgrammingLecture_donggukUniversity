package 상속Person;

public class Student extends Person{
	public void set() {
		age=30;	//디폴트는 접근가능
		name = "홍길동";	//public접근가능
		height = 175;	//protected 접근가능
		//weight = 99;	// private 접근 불가
		setWeight(99);	//private변수는 메소드를 통해 접근해야함
		System.out.println("age : "+age);
		System.out.println("name : "+name);
		System.out.println("height : "+height);
		
		
	}
}
