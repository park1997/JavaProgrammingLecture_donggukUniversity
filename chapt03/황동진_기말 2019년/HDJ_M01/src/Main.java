import java.util.*;

public class Main {
	public static void menu() {
		System.out.println("[menu]");
		System.out.println("0:����");
		System.out.println("1:menu");
		System.out.println("2:��ǰ �Է�");
		System.out.println("3:��ǰ ��� ���");
		System.out.println("4:��ǰ ����");
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		//1��
		Test test = new Test();
		System.out.println("���� ���Ѽӵ�= "+test.speed_limit()+"km");
		
		//2��
		/*
		System.out.print("���ڿ� �Է�>");*/
		Scanner sc = new Scanner(System.in);
		/*
		String str = sc.next();
		test.search(str);
		*/
		//3��
		Goods watch = new Goods("�мǽð�",10);
		watch.showGoods();
		//4��
		Goods[] arr = new Goods[20];
		String name;
		int price;
		int index = 0;
		menu();
		for(;;) {
			System.out.print("menu>");
			int option = sc1.nextInt();
			if(option == 0) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}
			else if(option == 1) {
				menu();
			}
			else if(option == 2) {
				System.out.print("����(����) ��ǰ��>");
				price = sc1.nextInt();
				name = sc1.next();
				arr[index] = new Goods(name,price);
				index++;
			}
			else if(option == 3) {
				for(int i = 0;i<index;i++) {
					System.out.println(i+".��ǰ��:"+arr[i].getName()+"\t����:"+arr[i].getPrice()+"����");
				}
			}
			//5��
			else if(option == 4) {
				System.out.print("����(index)>");
				int del = sc1.nextInt();
				for(int i = del; i<index-1;i++) {
					arr[i] = arr[i+1];
				}
				index--;
				for(int i = 0;i<index;i++) {
					System.out.println(i+".��ǰ��:"+arr[i].getName()+"\t����:"+arr[i].getPrice()+"����");
				}
			}
		}
	}

}
