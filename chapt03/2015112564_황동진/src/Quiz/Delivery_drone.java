package Quiz;

public class Delivery_drone extends Drone{
	String code;
	Delivery_drone(int max, String code){
		super(max);
		this.code = code;
	}
	void load(Goods good){
		if(super.getMax() < good.getReal_weight()) {
			System.out.println("탑재량 초과: "+good.getReal_weight()+"kg > "+super.getMax()+"kg");
		}
		else {
			super.setWeight(good.getReal_weight());
			System.out.println("*탑재 성공: "+good.getReal_weight()+"kg");
		}
		String confirm = "";
		for(int i=0;i<good.getBarcode().length();i++) {
			for(int j=0;j<code.length();j++) {
				if(code.charAt(j) == good.getBarcode().charAt(i)) {
					confirm += good.getBarcode().charAt(i);
				}
			}
		}
		if(confirm.equals(code)) {
			System.out.println("*지역코드 일치:"+good.getBarcode());
		}
		else {
			System.out.println("지역코드 불일치:"+good.getBarcode());
		}
	}
	void show(){
		super.show();
		System.out.println("지역코드:"+code);
	}
}
