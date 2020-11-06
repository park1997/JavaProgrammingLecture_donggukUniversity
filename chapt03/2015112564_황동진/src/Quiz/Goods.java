package Quiz;

public class Goods {
	private int real_weight;
	private String barcode;
	Goods(int real_weight, String barcode){
		this.real_weight = real_weight;
		this.barcode = barcode;
	}
	String getBarcode() {
		return barcode;
	}
	void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	int getReal_weight() {
		return real_weight;
	}
	void setReal_weight(int real_weight) {
		this.real_weight = real_weight;
	}
}
