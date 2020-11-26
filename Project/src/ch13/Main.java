package ch13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Animal Class");
		Animal Tiger = new Animal("Åä³¢");
		System.out.println("¸ÔÀº °Í : "+Tiger.getFeed());
		System.out.println();
		System.out.println("2. Fish Class");
		Fish fish1 = new Fish("ÂüÄ¡",30);
		fish1.show();
		
		
	}

}
