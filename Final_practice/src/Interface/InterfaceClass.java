package Interface;

public class InterfaceClass implements InterfaceA, InterfaceB {

	public InterfaceClass() {
		// TODO Auto-generated constructor stub
		System.out.println(" --InterfaceClass Constructor -- ");
	}
	
	
	@Override
	public void funA() {
		// TODO Auto-generated method stub
		System.out.println(" -- funA -- ");
	}
	

	@Override
	public void funB() {
		// TODO Auto-generated method stub
		System.out.println(" -- funB -- ");
	}

	
	
}
