package javaFinalHW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartTimeJob worker1 = new PartTimeJob("byunghyun", 2016112568);
		MoneyCalculate cal = new MoneyCalculate();
		worker1.getInfo();	//아르바이트생 정보 출력
		System.out.println();
		
		worker1.workingTime(1,75);	//알바생이 일한 시간을 (시간,분) 의 형식으로 입력한다. 만약 1시간 75분을 입력했을 경우 2시간 15분으로 들어가게한다.
		worker1.getInfo();	//아르바이트생의 일한 시간을 입력한다.
		System.out.println();
		
		worker1.workingTime(1, 45);
		// 3시간 60 분이 아닌 4시간 0분이 나온다.
		worker1.getInfo();
		System.out.println();
		
		//setter를 통해 private값을 바꿀 수 있다.
		//일을 한 시간, 분, 아르바이트생 정보는 모두 private로 getter 와 setter 로 접근해야만 정보변경이 가능하다.
		worker1.setName("Park Byunghyun");
		worker1.getInfo();
		System.out.println();
		
		//나의 시급을 입력한다.
		cal.setHourlyWage(8000);
		System.out.println();
		
		//나의 시급이 현재 얼마인지 그리고 적절한 시급인지 확인한다
		cal.getInfo();
		System.out.println();
		
		//최저시급보다 높은 적절한 시급을 입력한다.
		cal.setHourlyWage(8560);
		cal.getInfo();
		System.out.println();
		
		//입력된 시급으로 내가 현재 받아야 하는 돈을 계산한다.
		worker1.calWage(cal);
		System.out.println();
		
		//1000분 더 일했을 경우 
		worker1.workingTime(0, 1000);
		worker1.getInfo();
		System.out.println();
		
		//1000분 더 일했을경우 내가 받아야 하는 돈
		worker1.calWage(cal);
		
		
		
		
		
	}

}
