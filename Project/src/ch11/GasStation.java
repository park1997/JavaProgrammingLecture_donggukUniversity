package ch11;

public class GasStation {
	private int gas;
	public void set_gas(int g) {
		gas =g;
	}
	public void show() {
		System.out.println("현재 재고량: "+gas+"L");
	}
	int refuel(int g) {
		if(gas<g) {
			return 0;
		}else {
			gas-=g;
			return g;
		}
		
	}
}
