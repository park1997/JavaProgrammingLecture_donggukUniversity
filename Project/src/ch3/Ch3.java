package ch3;
import java.util.Scanner;
public class Ch3 {

	public static void main(String[] args) {
		int a,a_100,a_10,a_1;
	
		Scanner sc= new Scanner(System.in);
		
		a=sc.nextInt();
		
		a_100 = a/100;
		a_10 = (a%100)/10;
		a_1=a%10;
		System.out.printf("%d",(a_100+a_10+a_1));
		
				
		sc.close();
		
	}

}
