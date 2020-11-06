package midmid;
import java.util.*;
public class 각자리숫자구할거임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int a_100 = a/100;
		int a_10 = (a%100)/10;
		int a_1 = (a%10);
		
		System.out.println(a_100 + a_10 + a_1);
		sc.close();
	}

}
