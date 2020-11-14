package Child2;

public class Main_ObjectClass {

	public static void main(String[] args) {
		// 클래스로부터 생성되는 객체들은 모두다 다른공간에 존재를 한다.
		//그 객체를 가르키는건 레퍼런스라고함
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		//클래스가 같아도 객체는 각기 다른 메모리에 저장됨
		System.out.println("obj1 = "+obj1);
		System.out.println("obj2 = "+obj2);
		System.out.println("obj3 = "+obj3);
		
		//잘 출력됨
		obj1.getInfo();
		//null값 대입해서 주소에있는 객체가 삭제됨
		obj1=null;
		System.out.println("obj1 = "+obj1);
		//null값을 대입했기때문에 오류가 뜸
		obj1.getInfo();
		
	}

}
