/*2017112526 �����*/
class Laundry {
	private String name;
	private int weight;
	
	Laundry() {}
	
	Laundry(String name, int weight) {
		this.name = name;
		this.weight = weight;
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

	void show() {
		System.out.println(name+"�� ��Ź�� �߷� : "+weight+"kg");
	}
	
	
}
