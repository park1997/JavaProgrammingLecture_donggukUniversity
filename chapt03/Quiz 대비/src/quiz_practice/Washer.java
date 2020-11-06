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
			System.out.println("��Ź����ð�:"+(L.getWeight()*8)+"��");
		}
		else {
			System.out.println("��Ź �߷� �ʰ�");
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
