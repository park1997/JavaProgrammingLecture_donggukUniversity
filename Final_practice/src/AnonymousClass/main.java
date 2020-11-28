package AnonymousClass;

public class main {

	public static void main(String[] args) {
		
		//익명(anonymous class) 클래스 한번만쓰고 버릴거임
		//이름이 없는 클래스로 주로 메소드를 재정의 하는 목적으로 사용된다.
		new AnonymousClass() {
			@Override
			public void method() {
				System.out.println(" -- AnonymousClass's Override method START -- ");
			}
		}.method();
		
		
	}

}
