package javaFinalHW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartTimeJob worker1 = new PartTimeJob("byunghyun", 2016112568);
		MoneyCalculate cal = new MoneyCalculate();
		
		System.out.println("1. ");
		worker1.getInfo();	//아르바이트생 정보 출력
		System.out.println();
		
		System.out.println("2. ");
		worker1.workingTime(1,75);	//알바생이 일한 시간을 (시간,분) 의 형식으로 입력한다. 만약 1시간 75분을 입력했을 경우 2시간 15분으로 들어가게한다.
		worker1.getInfo();	//아르바이트생 정보 출력
		System.out.println();
		
		// 3시간 60 분이 아닌 4시간 0분이 나온다.
		System.out.println("3. ");
		worker1.workingTime(1, 45);
		worker1.getInfo();
		System.out.println();
		
		//setter를 통해 private값을 바꿀 수 있다.
		//알바생 정보, 일을 한 시간 , 시급 은 private로 getter 와 setter 로 접근해야만 정보변경이 가능하다.
		System.out.println("4. ");
		worker1.setName("Park Byunghyun");
		worker1.getInfo();
		System.out.println();
		
		//나의 시급을 입력한다.
		System.out.println("6. ");
		worker1.setHourly_wage(8000);
		worker1.getInfo();
		System.out.println();
		

		//최저시급보다 적은돈으로 봉급을 계산할때 최저시급보다 시급이 낮으면 계산조차 하지 않고 경고문 출력한다.
		System.out.println("7. ");
		cal.calWage(worker1);
		System.out.println();
		

		//나의 시급이 현재 얼마인지 그리고 적절한 시급인지 확인한다
		System.out.println("8. ");
		cal.checkWage(worker1);
		System.out.println();
		

		//최저시급보다 높은 적절한 시급을 입력한다.
		System.out.println("9. ");
		worker1.setHourly_wage(8560);
		worker1.getInfo();
		System.out.println();
		
		//입력된 시급으로 내가 현재 받아야 하는 돈을 계산한다.
		System.out.println("10. ");
		cal.calWage(worker1);
		System.out.println();
		
		//1000분 더 일했을 경우 
		System.out.println("11. ");
		worker1.workingTime(0, 1000);
		worker1.getInfo();
		System.out.println();
		
		//1000분 더 일했을경우 내가 받아야 하는 돈
		System.out.println("12. ");
		cal.calWage(worker1);
		
		
		
	}

}
