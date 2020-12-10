package javaFinalHW;

public class PartTimeJob {
	private String name;
	private int worker_num;
	private int working_time_hour=0;
	private int working_time_min=0;
	private int hourly_wage=0;
	private int minimum_wage=8560;

	
	//������1
	public PartTimeJob(String n, int w) {
		this.name=n;
		this.worker_num=w;
	}
	
	//������2
	public PartTimeJob(String n,int w,int h) {
		// TODO Auto-generated constructor stub
		this.name=n;
		this.worker_num=w;
		this.hourly_wage=h;
	}
	
	public void workingTime (int h,int m) {
		//���� �ð� ����ϱ�
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
		System.out.printf("Working time : %d �ð�  %d ��\n",working_time_hour,working_time_min);
		System.out.println("Hourly wage : "+hourly_wage);
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
	
	public int getHourly_wage() {
		return hourly_wage;
	}

	public void setHourly_wage(int hourly_wage) {
		this.hourly_wage = hourly_wage;
	}
	
	public int getMinimum_wage() {
		return minimum_wage;
	}

	public void setMinimum_wage(int minimum_wage) {
		this.minimum_wage = minimum_wage;
	}
	
	public int getWorking_time_hour() {
		return working_time_hour;
	}

	public void setWorking_time_hour(int working_time_hour) {
		this.working_time_hour = working_time_hour;
	}

	public int getWorking_time_min() {
		return working_time_min;
	}

	public void setWorking_time_min(int working_time_min) {
		this.working_time_min = working_time_min;
	}

	
	//boolean���·� �����ñ޺��� �� ���� �ñ��� ���ٸ� False ���� return �Ѵ�.
	boolean cal(int hourly_wage) {
		if(hourly_wage<minimum_wage) {
			return false;
		}else {
			return true;
			
		}
	}
	
	
}
