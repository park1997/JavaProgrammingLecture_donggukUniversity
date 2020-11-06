/*2017112526 김민지*/
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[1.1번 출력 결과]");
		Laundry boy = new Laundry("아들",4);
		boy.show();
		Laundry girl = new Laundry("딸",6);
		girl.show();
		
		System.out.println("[1.2번, 1.3번 출력 결과]");
		Scanner scanner = new Scanner(System.in);
		Laundry [] them = new Laundry[20];
		int number = scanner.nextInt();
		int sunseo = scanner.nextInt();
		if(sunseo==0) {
			for(int i=0;i<number;i++) {
				them[i] = new Laundry();
				String name = scanner.next();
				int kg = scanner.nextInt();
				them[i].setName(name);
				them[i].setWeight(kg);
			}
			for(int i=0;i<number;i++) {
				System.out.println(them[i].getName()+" "+them[i].getWeight());
			}
		}else if(sunseo==1) {
			for(int i=0;i<number;i++) {
				them[i] = new Laundry();
				String name = scanner.next();
				int kg = scanner.nextInt();
				them[i].setName(name);
				them[i].setWeight(kg);
			}
			for(int i=number-1;i>=0;i--) {
				System.out.println(them[i].getName()+" "+them[i].getWeight());
			}
		}
		
		
		
	}
	


}
