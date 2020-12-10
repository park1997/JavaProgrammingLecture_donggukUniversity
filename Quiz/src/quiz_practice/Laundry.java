package quiz_practice;

public class Laundry {
	private String name;
	private int weight;
	
	Laundry(String name,int weight){
		this.name = name;
		this.weight = weight;
	}
	
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	void show() {
		System.out.println(name + "의 세탁물 중량: "+weight+"kg");
	}
}
