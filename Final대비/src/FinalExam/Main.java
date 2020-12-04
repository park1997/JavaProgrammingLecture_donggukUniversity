package FinalExam;
import java.util.*;
public class Main {
	public static void menu() {
		System.out.println("[menu]");
		System.out.println("0:종료");
		System.out.println("1.menu");
		System.out.println("2.상품입력");
		System.out.println("3.상품 목록 출력");
		System.out.println("4.상품 삭제");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1번
		Test t= new Test();
		System.out.println("도로 제한속도 = "+t.speedLimit()+"km");
		
		//2번
		System.out.print("문자열 입력 >");
		String str = sc.next();
		t.search(str);
		
		//3번
		Goods watch = new Goods("패션시계",10);
		watch.showGoods();
		
		//4번
		Goods[] arr = new Goods[20];
		String name;
		int price;
		int index=0;
		menu();
		while(true) {
			System.out.println("menu > ");
			int option = sc.nextInt();
			if(option==0) {
				System.out.println("프로그램이 종료됩니다");
				break;
			}else if(option ==1) {
				menu();
			}else if(option ==2) {
				System.out.print("가격(만원) 상품명 > ");
				price=sc.nextInt();
				name=sc.next();
				arr[index]= new Goods(name,price);
				index+=1;
			}else if(option ==3) {
				for(int i=0; i<index;i++) {
					System.out.println(i+"상풍명 : "+arr[i].getName()+"\t가격 : "+arr[i].getPrice()+"만원");
				}
			}else if(option ==4) {
				System.out.println("삭제(index) >");
				int del = sc.nextInt();
				for(int i=0;i<index;i++) {
					System.out.println(i+"상품명 : "+arr[i].getName()+"\t가격"+arr[i].getPrice()+"만원");
				}
			}
			
		}
		
		
		
	}

}
