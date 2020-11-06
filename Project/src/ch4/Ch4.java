package ch4;
import java.util.Scanner;
public class Ch4 {

	public static void main(String[] args) {
		
		
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if (a <= b && b <= c) {
			System.out.println(c + " " + b + " " + a);
		}else if (b <= a && a <= c) {
			System.out.println(c + " " + a + " " + b);
		}else if (a <= c && c <= b) {
			System.out.println(b + " " + c + " " + a);
		}else if (c <= a && a<= b) {
			System.out.println(b + " " + a + " " + c);
		}else if (b <= c && c<= a) {
			System.out.println(a + " " + c + " " + b);
		}else {
			System.out.println(a + " " + b + " " + c);
		}
		sc.close();
	}
}