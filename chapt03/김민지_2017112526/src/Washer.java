
class Washer {
	private int max;
	Heater boil;
	
	Washer() {}
	
	Washer(int max) {
		this.max = max;
	}
	
	Washer(int weight,int temperature,int time) {
		this.max=max;
		boil=new Heater(temperature,time);
	}


	void clean(Laundry laundry) {
		if(laundry.getWeight()<=max) {
			System.out.println("��Ź����ð�:"+laundry.getWeight()*8+"��");
		} else {
			System.out.println("��Ź �߷� �ʰ�");
		}
	}
	
	Laundry add(Laundry [] laundry, int num) {
		String familyname = "";
		int familylaundry=0;
		for(int i=num-1;i>=0;i--) {
			if(i!=num-1) {
				familyname=laundry[i].getName()+","+familyname;
			} else {
				familyname=laundry[i].getName()+familyname;
			}
			familylaundry=familylaundry+laundry[i].getWeight();
		}
		Laundry sum=new Laundry();
		sum.setName(familyname);
		sum.setWeight(familylaundry);
		return sum;
		
	}
	
}
