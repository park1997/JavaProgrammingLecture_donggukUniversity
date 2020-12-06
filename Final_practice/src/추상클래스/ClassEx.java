package 추상클래스;

public class ClassEx extends AbstractClassEx{
	public ClassEx() {
		// TODO Auto-generated constructor stub
		System.out.println("ClassEx Constructor1");
	}
	
	public ClassEx(int i, String s) {
		super(i,s);
		System.out.println("ClassEx Constructor2");
	}
	
	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun2() Start");
		
	}
}
