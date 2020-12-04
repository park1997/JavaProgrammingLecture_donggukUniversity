package InterfaceToy;

public class ToyAirplane implements Toy{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("The airplane can not walk");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The airplane can not run");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("The airplane has alarm function");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("The airplane has no light function");
	}
	
}
