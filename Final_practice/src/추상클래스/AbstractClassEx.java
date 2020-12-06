package 추상클래스;

public abstract class AbstractClassEx {
	int num;
	String str;
	public AbstractClassEx() {
		// TODO Auto-generated constructor stub
		System.out.println("AbstractClass Constructor1");
	}
	
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClass Constructor2");
		this.num=i;
		this.str=s;
		
	}
	
	public void fun1() {
		System.out.println("fun1() Start");
		
	}
	public abstract void fun2();
	
}
