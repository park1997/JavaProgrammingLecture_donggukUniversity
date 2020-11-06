package quiz;

public class Heater {
	private int temperature;
	private int time;
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
		

	}
	void show() {
		System.out.println("»î´Â¿Âµµ:"+temperature+", »î´Â½Ã°£:"+time+"ºÐ");
		
	}
}
