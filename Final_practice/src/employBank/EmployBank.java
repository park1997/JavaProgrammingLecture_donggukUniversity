package employBank;

public class EmployBank {
	public String name;
	//static 은 변수를 공유해줌 
	static int amount=0;
	
	public EmployBank(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		
	}
	
	public void saveMoney(int money) {
		amount+=money;
		System.out.println("amount : "+amount);
	}
	
	public void spendMoney(int money) {
		amount-=money;
		System.out.println("amount : "+amount);
	}

	public void getBankInfo() {
		System.out.println("Employee name : "+this.name);
		System.out.println("amount : "+amount);
		
	}
	
	
}
