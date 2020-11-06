
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[1번 출력결과]");
		Laundry boy = new Laundry("아들",4);
		boy.show();
		Laundry girl = new Laundry("딸",6);
		girl.show();
		
		System.out.println("[2번 출력결과]");
		Washer tongdori = new Washer(15);
		tongdori.clean(boy);
		boy.setWeight(16);
		tongdori.clean(boy);
		
		System.out.println("[3번 출력결과]");
		Washer trom = new Washer(20,90,30);
		trom.boil.show();
		
		System.out.println("[4번 출력결과]");
		Laundry[] family = new Laundry[10];
		family[0]=new Laundry("Tom",2);
		family[1]=new Laundry("Jane",4);
		family[2]=new Laundry("Sam",5);
		
		Laundry sum;
		sum = tongdori.add(family,3);
		sum.show();
	}

}
