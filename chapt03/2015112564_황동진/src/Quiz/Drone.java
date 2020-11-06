package Quiz;

public class Drone {
	private int max;
	private int weight;
	Drone(int max){
		this.max = max;
	}
	int getMax() {
		return max;
	}
	void setMax(int max) {
		this.max = max;
	}
	int getWeight() {
		return weight;
	}
	void setWeight(int weight) {
		this.weight = weight;
	}
	int balance() {
		return max - weight;
	}
	void show(){
		System.out.println("드론최대중량:"+max+"kg, 탑재중량:"+weight+"kg");
	}
}
