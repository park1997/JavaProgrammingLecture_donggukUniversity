package javaFinalHW;

public class PartTimeJob {
	private String name;
	private int worker_num;
	private int working_time_hour=0;
	private int working_time_min=0;

	
	
	public PartTimeJob(String n, int w) {
		this.name=n;
		this.worker_num=w;
		
	}
	
	public void workingTime (int h,int m) {
		//일한 시간 계산하기
		if (m>=60 || this.working_time_min>=60) {
			this.working_time_hour+=m/60;
			this.working_time_min+=m%60;
			this.working_time_hour+=h;
		}else {
			this.working_time_hour+=h;
			this.working_time_min+=m;
		}		
		if (this.working_time_min>=60) {
			this.working_time_hour+=this.working_time_min/60;
			this.working_time_min-=(this.working_time_min/60)*60;
		}
	}
	
	public void getInfo() {
		System.out.println("Worker name : "+name);
		System.out.println("Worker number : "+worker_num);
		System.out.printf("Working time : %d 시간  %d 분\n",working_time_hour,working_time_min);
	}
	
	//getter setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorker_num() {
		return worker_num;
	}

	public void setWorker_num(int worker_num) {
		this.worker_num = worker_num;
	}
	
	public void calWage(MoneyCalculate calculate) {
		if(calculate.cal(calculate.getHourlyWage())) {
			System.out.println("My wage : "+calculate.getHourlyWage()*(working_time_hour+(float)working_time_min/60));
		}else {
			System.out.println("You have to give more money!!");
		}
	}
	
	
}
