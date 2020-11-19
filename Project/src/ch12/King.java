package ch12;

public class King {
	private String name;
	private int sequence;
	public King(String n, int s) {
		// TODO Auto-generated constructor stub
		this.name=n;
		this.sequence=s;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	public void show() {
		System.out.println("Á¶¼± "+this.sequence+" ´ë¿Õ "+this.name);
		
	}
	
	
}
