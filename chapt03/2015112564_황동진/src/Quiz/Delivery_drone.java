package Quiz;

public class Delivery_drone extends Drone{
	String code;
	Delivery_drone(int max, String code){
		super(max);
		this.code = code;
	}
	void load(Goods good){
		if(super.getMax() < good.getReal_weight()) {
			System.out.println("ž�緮 �ʰ�: "+good.getReal_weight()+"kg > "+super.getMax()+"kg");
		}
		else {
			super.setWeight(good.getReal_weight());
			System.out.println("*ž�� ����: "+good.getReal_weight()+"kg");
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
			System.out.println("*�����ڵ� ��ġ:"+good.getBarcode());
		}
		else {
			System.out.println("�����ڵ� ����ġ:"+good.getBarcode());
		}
	}
	void show(){
		super.show();
		System.out.println("�����ڵ�:"+code);
	}
}
