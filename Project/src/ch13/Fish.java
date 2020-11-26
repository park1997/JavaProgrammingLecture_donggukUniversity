package ch13;

public class Fish extends Animal{
	private int deep;
	Fish(String f,int d) {
		super(f);
		deep=d;
	}
	public void show() {
		System.out.println("먹은 것 : "+getFeed()+ ", 현재수심 : "+deep+"m");
	}
}
