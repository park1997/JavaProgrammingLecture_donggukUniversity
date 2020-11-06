package quiz;

public class Washer {
	private int max;


	Heater heater = new Heater();

	Washer(){}
	Washer(int max){
		this.max=max;
	}
	Washer(int max, int temperature,int time){
		this.max=max;
		heater.setTemperature(temperature);
		heater.setTime(time);
	}


	void clean(Laundry l) {
		if(l.getWeight()<max) {
			System.out.println("��Ź����ð�:"+l.getWeight()*8+"��");
		}else {
			System.out.println("��Ź �߷� �ʰ�");
		}
	}

	Laundry add(Laundry[] family, int number) {
		String sumname=null;
		for(int i =0;i<number;i++) {
			if(i==0) {
				sumname=family[i].getName().concat(",");
			}else if(i==number-1) {
				sumname+=family[i].getName();
			}
			else {
				sumname+=family[i].getName().concat(",");
			}
		}
	
		int totalweight=0;
		for(int i =0;i<number;i++) {
			totalweight+=family[i].getWeight();
		}
		
		Laundry sum = new Laundry(sumname,totalweight);
		return sum;
	}
}
