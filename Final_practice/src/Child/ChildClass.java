package Child;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("-- ChildClass constructor --");
	}
	
	public void setInfo(String n, String g, int a) {
		System.out.println(" --setInfo()-- ");
		name=n;
		gender=g;
		age=a;
	}
	//함수이름이 같아도되지만 매개변수의 차이가 있어야함.
	public void getInfo() {
		System.out.println(" -- getInfo -- ");
		System.out.println("name : "+name);
		System.out.println("gender : "+gender);
		System.out.println("age : "+age);
		
	}
	//외부에서는 접근할 수 없는 메소드
	private void mySecret() {
		System.out.println("-- mySecret() --");
	}
	
	
	
}
