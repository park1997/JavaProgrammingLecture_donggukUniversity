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
	//�Լ��̸��� ���Ƶ������� �Ű������� ���̰� �־����.
	public void getInfo() {
		System.out.println(" -- getInfo -- ");
		System.out.println("name : "+name);
		System.out.println("gender : "+gender);
		System.out.println("age : "+age);
		
	}
	//�ܺο����� ������ �� ���� �޼ҵ�
	private void mySecret() {
		System.out.println("-- mySecret() --");
	}
	
	
	
}
