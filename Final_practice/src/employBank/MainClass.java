package employBank;

public class MainClass {
	public static void main(String[] args) {
	
		EmployBank parkBank = new EmployBank("¹ÚÂùÈ£");
		EmployBank leeBank = new EmployBank("ÀÌ½Â¿±");
		parkBank.saveMoney(100);
		leeBank.saveMoney(300);
		
		leeBank.getBankInfo();
		
		parkBank.spendMoney(400);
		
		parkBank.getBankInfo();
		System.out.println();
		leeBank.spendMoney(20);
		leeBank.getBankInfo();
	}
}
