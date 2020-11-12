package ch11;

public class Car {
	private int gas;
	public void set_gas(int g) {
		gas=g;
	}
	public void show() {
		System.out.println("현재 주유량 : "+gas+"L");
	}
	public void fill_gas(int g, GasStation st) {
		if(g==st.refuel(g)) {
			gas+=g;
		}else {
			System.out.println("주유실패");
		}
		
	}
}




