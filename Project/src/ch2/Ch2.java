package ch2;
import java.util.Scanner;
public class Ch2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.print(c+" "+b+" "+a);
		
		sc.close(); //윈도우는 공유자원이라 스캐너를 쓴다음에는 close를 쓰는게 좋음
		
		
		
		
	}

}
