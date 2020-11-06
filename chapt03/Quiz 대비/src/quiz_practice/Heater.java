package quiz_practice;

public class Heater {
	private int temp;
	private int time;
	int getTemp() {
		return temp;
	}
	void setTemp(int temp) {
		this.temp = temp;
	}
	int getTime() {
		return time;
	}
	void setTime(int time) {
		this.time = time;
	}
	void show() {
		System.out.println("»î´Â¿Âµµ:"+temp+", »î´Â½Ã°£:"+time+"ºÐ");
	}
	
}
