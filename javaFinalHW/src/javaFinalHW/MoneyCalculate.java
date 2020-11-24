package javaFinalHW;

public class MoneyCalculate {
	private int real_hourly_wage;
	
	//생성자
	public MoneyCalculate() {
		// TODO Auto-generated constructor stub
		this.real_hourly_wage=real_hourly_wage;
	
	}
	//최저시급보다 덜 줬을 경우
		public void checkWage(PartTimeJob people) {
		if (people.getHourly_wage()<people.getMinimum_wage()) {
			System.out.printf("%d is less than minimum hourly wage %d You have to give more money!!!\n",people.getHourly_wage(),people.getMinimum_wage());
		}else {
			System.out.println("Your hourly wage : "+people.getHourly_wage());
			//검증된 시급 저장.
			this.real_hourly_wage=people.getHourly_wage();
		}
	
	}
	

	//입력된 시급을 패싱 받고, 내가 받아야하는 봉급을 계산한다.
	//최저시급보다 돈이 적다면 봉급을 계산하지않고 시급을 올려야한다는 문구 출력 
	public void calWage(PartTimeJob people) {
		if(people.cal(people.getHourly_wage())) {
			this.real_hourly_wage=people.getHourly_wage();
			System.out.printf("My wage : %d\n",(int)(real_hourly_wage*(people.getWorking_time_hour()+(double)people.getWorking_time_min()/60)));
		}else {
			System.out.println("You have to raise hourly wage!! over the "+people.getMinimum_wage());
		}
	}

	//최저시급이상인 검증된 시급이므로 set할 필요가 없다. 
	public int getReal_hourly_wage() {
		return real_hourly_wage;
	}
	
	
	
}
