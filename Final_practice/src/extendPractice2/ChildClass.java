package extendPractice2;

public class ChildClass extends Parentclass{
	int openYear=2020;
	public ChildClass() {
		System.out.println("-- ChildClass constructor -- ");
	}
	@Override
	public void makeJJajang() {
		System.out.println(" -- ChildClass make JJajang START -- ");
	}
	//super (상위클래스로 올라가란 소리)
	public void getOpenYear() {
		System.out.println("ChildClass's Open Year : "+this.openYear);
		System.out.println("ParentClass's Open Year : "+super.openYear);
	}
	
}
