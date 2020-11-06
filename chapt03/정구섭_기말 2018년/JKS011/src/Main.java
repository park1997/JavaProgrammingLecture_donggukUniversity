import java.util.*;
public class Main {

	public static void main(String[] args) {
		//2015112579정구섭
		System.out.println("ㅡㅡㅡ문제1-1ㅡㅡㅡㅡ");
		Laundry boy = new Laundry("아들",4);
		boy.show();
		Laundry girl = new Laundry("딸",6);
		girl.show();
		
		System.out.println("ㅡㅡㅡ문제1-2ㅡㅡㅡㅡ andㅡㅡㅡ문제1-3ㅡㅡㅡㅡ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("20명까지 입력가능,0: 그대로출력, 1:역순으로 출력>>");
		int n=sc.nextInt();
		int menu = sc.nextInt();
		Laundry laundry[] = new Laundry[20];
		
		for(int i=0;i<n;i++) {
			String name= sc.next();
			int weight = sc.nextInt();
			laundry[i]=new Laundry(name,weight);
		}
		
		if(menu==0) {
		for(int i=0;i<n;i++) {
			System.out.println(laundry[i].getName()+" "+laundry[i].getWeight());
		}
		}else if(menu==1) {
		 for(int i=n-1;i>=0;i--) {
			 System.out.println(laundry[i].getName()+" "+laundry[i].getWeight());
		 }
		}
		
		
		
		
		
	
		
	}

}
