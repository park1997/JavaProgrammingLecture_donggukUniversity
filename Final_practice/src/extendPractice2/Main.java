package extendPractice2;

public class Main {
	public static void main(String[] args) {
		Parentclass childs[] = new Parentclass[2];
		childs[0]= new ChildClass();
		childs[1]= new SecondChildClass();
		
		for(int i=0; i<childs.length;i++) {
			childs[i].makeJJajang();
		}
		System.out.println();
		
		//super
		ChildClass c = new ChildClass();
		c.getOpenYear();
		
		
	}
}
