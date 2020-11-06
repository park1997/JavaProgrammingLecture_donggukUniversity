package quiz_practice;

public class Washer {
	private int max;
	int sum = 0;
	String all = "";
	Heater heater = new Heater();
	
	Washer(int max){
		this.max = max;
	}
	Washer(int max, int temp, int time){
		this.max = max;
		heater.setTemp(temp);
		heater.setTime(time);
	}
	
	void clean(Laundry L) {
		if(L.getWeight() <= max) {
			System.out.println("세탁예상시간:"+(L.getWeight()*8)+"분");
		}
		else {
			System.out.println("세탁 중량 초과");
		}
	}
	
	Laundry add(Laundry[] family, int num) {
		for(int i = 0; i < num; i++) {
			sum += family[i].getWeight();
			all += family[i].getName()+",";
		}
		all = all.substring(0, all.length() -1);
		Laundry total = new Laundry(all,sum);
		return total;
	}
}
