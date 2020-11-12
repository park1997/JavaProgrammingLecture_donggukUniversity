package Child2;

public class ChildClass2 {
	
	public String name;
	public String gender;
	public int age;
	
	
	public ChildClass2() {
		System.out.println("-- ChildClass2 constructor --");
	}
	public void setInfo(String n, String g, int a) {
		System.out.println("-- setInfo() --");
		name =n;
		gender=g;
		age=a;	
	}
	
	
	public void getInfo() {
		System.out.println(" -- getInfo() --");
		System.out.println(" name : "+name);
		System.out.println(" gender : "+gender);
		System.out.println(" age : "+age);
		
	}
	
	public void getInfo(int x, int y) {
		System.out.println("-- getInfo(int x, int y) --");
		System.out.printf("paremater --> x :%d , y : %d\n",x,y);

	}
	
	public void getInfo(String s1, String s2) {
		System.out.println("-- getInfo(String s1, Strinig s2) --");
		System.out.printf("parameter --> s1 : %s , s2 : %s\n",s1,s2);
	}
	
	public void mysecret() {
		System.out.println("-- mySecret() --");
	}
	
	
	
}
