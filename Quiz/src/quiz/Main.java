package quiz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1��
		System.out.println("----���� 1��----");
		Laundry boy = new Laundry("�Ƶ�",4);
		boy.show();
		Laundry girl = new Laundry("��",6);
		girl.show();
		//2��
		System.out.println("----���� 2��----");
		Washer tongdori = new Washer(15);
		tongdori.clean(boy);
		boy.setWeight(16);
		tongdori.clean(boy);
		//3��
		System.out.println("----���� 3��----");
		Washer trom = new Washer(20,90,30);
		trom.heater.show();
		//4��
		System.out.println("----���� 4��----");
		Laundry[] family = new Laundry[10];
		family[0] = new Laundry("Tom",2);
		family[1] = new Laundry("Jane",4);
		family[2] = new Laundry("Sam",5);
		
		
		Laundry sum;
		sum= tongdori.add(family, 3);
		sum.show();
	}

}
