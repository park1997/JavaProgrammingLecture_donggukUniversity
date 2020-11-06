import java.util.*;

public class Main {
	public static void menu() {
		System.out.println("[menu]");
		System.out.println("0:종료");
		System.out.println("1:menu");
		System.out.println("2:상품 입력");
		System.out.println("3:상품 목록 출력");
		System.out.println("4:상품 삭제");
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		//1번
		Test test = new Test();
		System.out.println("도로 제한속도= "+test.speed_limit()+"km");
		
		//2번
		/*
		System.out.print("문자열 입력>");*/
		Scanner sc = new Scanner(System.in);
		/*
		String str = sc.next();
		test.search(str);
		*/
		//3번
		Goods watch = new Goods("패션시계",10);
		watch.showGoods();
		//4번
		Goods[] arr = new Goods[20];
		String name;
		int price;
		int index = 0;
		menu();
		for(;;) {
			System.out.print("menu>");
			int option = sc1.nextInt();
			if(option == 0) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			else if(option == 1) {
				menu();
			}
			else if(option == 2) {
				System.out.print("가격(만원) 상품명>");
				price = sc1.nextInt();
				name = sc1.next();
				arr[index] = new Goods(name,price);
				index++;
			}
			else if(option == 3) {
				for(int i = 0;i<index;i++) {
					System.out.println(i+".상품명:"+arr[i].getName()+"\t가격:"+arr[i].getPrice()+"만원");
				}
			}
			//5번
			else if(option == 4) {
				System.out.print("삭제(index)>");
				int del = sc1.nextInt();
				for(int i = del; i<index-1;i++) {
					arr[i] = arr[i+1];
				}
				index--;
				for(int i = 0;i<index;i++) {
					System.out.println(i+".상품명:"+arr[i].getName()+"\t가격:"+arr[i].getPrice()+"만원");
				}
			}
		}
	}

}
