
public class Goods {
	private String name;
	private int price;
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showGoods() {
		System.out.println("��ǰ��:"+getName()+"  ����:"+getPrice());
	}
}
