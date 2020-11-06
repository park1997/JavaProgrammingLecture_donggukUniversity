package midmid;
import java.util.*;
public class 알파벳정렬출력할고임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력 하시오 >> ");
		String a = sc.next();
		char b= a.charAt(0);
		char c =0;
		//System.out.println(b);
		//System.out.println((int)b);
		for(int i =(int)b;i>96;i--) {
			for(int j=97; j<=i;j++) {
				c=(char)j;
				System.out.print(c);
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
