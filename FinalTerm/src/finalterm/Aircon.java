package finalterm;

public class Aircon {
	private String name;
	private int volt;
	private int tem;
	public Aircon(String name, int volt, int tem) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.volt=volt;
		this.tem=tem;
	
	}
	
	public String getName() {
		return name;
	}

	public int getVolt() {
		return volt;
	}

	public int getTem() {
		return tem;
	}

	public void show() {
		System.out.println(getName()+"("+getVolt()+"V)의 온도는 "+getTem()+"도");
	}
}
