package ch11;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자동차와 주유소");
	    Car SM5 = new Car();
	    GasStation GS = new GasStation();
	    
	    SM5.set_gas(10);
	    GS.set_gas(500);
	    SM5.show();
	    GS.show();
	    SM5.fill_gas(50,GS);
	    SM5.show();
	    GS.show();
	      
	    SM5.fill_gas(460,GS);
	}

}
