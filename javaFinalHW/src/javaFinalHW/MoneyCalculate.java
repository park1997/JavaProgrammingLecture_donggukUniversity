package javaFinalHW;

public class MoneyCalculate {
	private int real_hourly_wage;
	
	//������
	public MoneyCalculate() {
		// TODO Auto-generated constructor stub
		this.real_hourly_wage=real_hourly_wage;
	
	}
	//�����ñ޺��� �� ���� ���
		public void checkWage(PartTimeJob people) {
		if (people.getHourly_wage()<people.getMinimum_wage()) {
			System.out.printf("%d is less than minimum hourly wage %d You have to give more money!!!\n",people.getHourly_wage(),people.getMinimum_wage());
		}else {
			System.out.println("Your hourly wage : "+people.getHourly_wage());
			//������ �ñ� ����.
			this.real_hourly_wage=people.getHourly_wage();
		}
	
	}
	

	//�Էµ� �ñ��� �н� �ް�, ���� �޾ƾ��ϴ� ������ ����Ѵ�.
	//�����ñ޺��� ���� ���ٸ� ������ ��������ʰ� �ñ��� �÷����Ѵٴ� ���� ��� 
	public void calWage(PartTimeJob people) {
		if(people.cal(people.getHourly_wage())) {
			this.real_hourly_wage=people.getHourly_wage();
			System.out.printf("My wage : %d\n",(int)(real_hourly_wage*(people.getWorking_time_hour()+(double)people.getWorking_time_min()/60)));
		}else {
			System.out.println("You have to raise hourly wage!! over the "+people.getMinimum_wage());
		}
	}

	//�����ñ��̻��� ������ �ñ��̹Ƿ� set�� �ʿ䰡 ����. 
	public int getReal_hourly_wage() {
		return real_hourly_wage;
	}
	
	
	
}
