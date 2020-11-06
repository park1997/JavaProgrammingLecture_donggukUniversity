
public class Laundry {

	private String name;
	private int weight;
	public Laundry(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	void show() {
		System.out.println(name+"의 세탁물 중량:"+weight+"kg");
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
