package javaFinalHW;

public class MoneyCalculate {
	private int minimum_wage=8560;	//현재 2020년도의 최저 시급
	private int hourlyWage;
	
	public void getInfo() {
		if (hourlyWage<minimum_wage) {
			System.out.printf("%d is less than minimum wage %d You have to give more money",hourlyWage,minimum_wage);
		}else {
			System.out.println("Your hourly wage : "+hourlyWage);
		}
	
	}
	
	// getter , setter
	public MoneyCalculate() {
	}

	public int getMinimum_wage() {
		return minimum_wage;
	}

	public void setMinimum_wage(int minimum_wage) {
		this.minimum_wage = minimum_wage;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
		
	}
	
	boolean cal(int hourlyWage) {
		if(hourlyWage<minimum_wage) {
			return false;
		}else {
			return true;
			
		}
	}

	
	
	
	
}
