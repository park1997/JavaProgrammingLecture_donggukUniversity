package quiz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
		System.out.println("----문제 1번----");
		Laundry boy = new Laundry("아들",4);
		boy.show();
		Laundry girl = new Laundry("딸",6);
		girl.show();
		//2번
		System.out.println("----문제 2번----");
		Washer tongdori = new Washer(15);
		tongdori.clean(boy);
		boy.setWeight(16);
		tongdori.clean(boy);
		//3번
		System.out.println("----문제 3번----");
		Washer trom = new Washer(20,90,30);
		trom.heater.show();
		//4번
		System.out.println("----문제 4번----");
		Laundry[] family = new Laundry[10];
		family[0] = new Laundry("Tom",2);
		family[1] = new Laundry("Jane",4);
		family[2] = new Laundry("Sam",5);
		
		
		Laundry sum;
		sum= tongdori.add(family, 3);
		sum.show();
	}

}
