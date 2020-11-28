package extendPractice;

public class Main {
	public static void main(String[] args) {
		
		ChildClass childclass = new ChildClass();	//부모클래스의 생성자가 먼저 호출됨
		
		childclass.childFunc();
		childclass.parentFunc();//상속받은 메소드 
		//childclass.privateFunc();//부모클래스에서 private였기때문에 상속에서 제외됨
		
		
	}
}
