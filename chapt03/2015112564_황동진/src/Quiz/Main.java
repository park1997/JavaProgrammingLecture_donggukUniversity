package Quiz;

public class Main {

	public static void main(String[] args) {
		// 1������ main
		Drone drone = new Drone(20);
		drone.setWeight(5);
		drone.show();
		System.out.println(drone.balance()+"kg ž�簡��");
		
		// 2������ main
		Delivery_drone gs25 = new Delivery_drone(30,"JAE");
		gs25.setWeight(3);
		gs25.show();
		System.out.println(gs25.balance()+"kg ž�簡��");
		
		// 3������ main
		Delivery_drone yes24 = new Delivery_drone(10,"ABC");
		Goods book = new Goods(12,"GAHFIBDCEJ");
		yes24.load(book);
		yes24.show();
		System.out.println();
		
		Delivery_drone aladdin = new Delivery_drone(10,"DCI");
		Goods cd = new Goods(6,"JDBFIEACHG");
		aladdin.load(cd);
		aladdin.show();
	}

}
