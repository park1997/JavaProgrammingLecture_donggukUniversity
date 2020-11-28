package InnerClass;

public class OuterClass {
	int num =10;
	String str1 ="java";
	static String str11 = "world";
	public OuterClass() {
		System.out.println("Outer class constructor");
	}
	
	class InnerClass{
		int num =100;
		String str2 =str1;
		
		public InnerClass() {
			// TODO Auto-generated constructor stub
			System.out.println("InnerClass constructor");
		}
		
	}
	
	static class SInnerClass{
		int num=1000;
		String str3 =str11;
		
		public SInnerClass() {
			System.out.println("static InnerClass constructor");
		}
		
	}
}
