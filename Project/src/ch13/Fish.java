package ch13;

public class Fish extends Animal{
	private int deep;
	Fish(String f,int d) {
		super(f);
		deep=d;
	}
	public void show() {
		System.out.println("���� �� : "+getFeed()+ ", ������� : "+deep+"m");
	}
}
