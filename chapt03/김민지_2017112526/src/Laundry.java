
class Laundry {
	private String name;
	private int weight;
	
	Laundry() {}
	
	Laundry(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	void show() {
		System.out.println(name+"�� ��Ź�� �߷�:"+weight+"kg");
	}

	int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
