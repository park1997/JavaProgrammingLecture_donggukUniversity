package FinalExam;
import java.util.*;
public class Main {
	public static void menu() {
		System.out.println("[menu]");
		System.out.println("0:����");
		System.out.println("1.menu");
		System.out.println("2.��ǰ�Է�");
		System.out.println("3.��ǰ ��� ���");
		System.out.println("4.��ǰ ����");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1��
		Test t= new Test();
		System.out.println("���� ���Ѽӵ� = "+t.speedLimit()+"km");
		
		//2��
		System.out.print("���ڿ� �Է� >");
		String str = sc.next();
		t.search(str);
		
		//3��
		Goods watch = new Goods("�мǽð�",10);
		watch.showGoods();
		
		//4��
		Goods[] arr = new Goods[20];
		String name;
		int price;
		int index=0;
		menu();
		while(true) {
			System.out.println("menu > ");
			int option = sc.nextInt();
			if(option==0) {
				System.out.println("���α׷��� ����˴ϴ�");
				break;
			}else if(option ==1) {
				menu();
			}else if(option ==2) {
				System.out.print("����(����) ��ǰ�� > ");
				price=sc.nextInt();
				name=sc.next();
				arr[index]= new Goods(name,price);
				index+=1;
			}else if(option ==3) {
				for(int i=0; i<index;i++) {
					System.out.println(i+"��ǳ�� : "+arr[i].getName()+"\t���� : "+arr[i].getPrice()+"����");
				}
			}else if(option ==4) {
				System.out.println("����(index) >");
				int del = sc.nextInt();
				for(int i=0;i<index;i++) {
					System.out.println(i+"��ǰ�� : "+arr[i].getName()+"\t����"+arr[i].getPrice()+"����");
				}
			}
			
		}
		
		
		
	}

}
