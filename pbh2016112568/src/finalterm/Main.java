package finalterm;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		//1-1��
		Example ex = new Example();
		System.out.println(ex.count("oxxoooxoox","o" ));
		
		//1-2��
		Example.capital('n');
		
		//2��
		Appliance tv = new Appliance("�ں���tv",110);
		System.out.println(tv.getName()+"("+tv.getPower()+"V)");
		
		//3��
		Aircon cool = new Aircon("�ں���������",220,20);
		cool.show();
		
		//4��
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int count=0;
		int p=N;
		while(true) {
			int a=(int)(p/10)+(p%10);
			int b=a%10+p%10*10;
			p=b;
			count+=1;
			if(p==N) {
				System.out.println(count);
				break;
			}
		}
		
		sc.close();
		
	}

}
