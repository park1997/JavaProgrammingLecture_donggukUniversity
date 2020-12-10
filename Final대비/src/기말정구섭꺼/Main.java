package ±â¸»Á¤±¸¼·²¨;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" --  ¹®Á¦ 1-1 ----");
		Laundry boy = new Laundry("¾Æµé", 4);
		Laundry girl = new Laundry("µþ", 6);
		boy.show();
		girl.show();
		
		
		System.out.println("¹®Á¦ 1-2  ans ¹®Á¦ 1-3");
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int menu= sc.nextInt();
		Laundry laundry[] = new Laundry[20];
		
		for(int i=0; i<n;i++) {
			String name=sc.next();
			int weight = sc.nextInt();
			laundry[i]=new Laundry(name, weight);
			
		}
		
		if(menu==0) {
			for(int i=0;i<n;i++) {
				System.out.println(laundry[i].getName()+" "+laundry[i].getWeight());
				
			}
		}else if(menu ==1) {
			for(int j =n-1;j>=0;j-- ) {
				System.out.println(laundry[j].getName()+ " "+laundry[j].getWeight());
				
			}
		}
		
		
		
	}

}
