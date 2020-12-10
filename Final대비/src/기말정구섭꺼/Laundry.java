package ±â¸»Á¤±¸¼·²¨;

public class Laundry {
	private String name;
	private int weight;
	
	public Laundry(String name, int weight) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.weight=weight;
	}
	
	public void show() {
		System.out.println(name+"¼¼Å¹¹°ÀÇ Áß·® : "+weight+"kg");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
}
