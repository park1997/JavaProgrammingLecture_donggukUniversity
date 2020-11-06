package midmid;
import java.util.*;
public class 박수369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하세요 >> ");
		int a = sc.nextInt();
		if ((a/10)==3||(a/10)==6||(a/10)==9) {
			if ((a%10)==3||(a%10)==6||(a%10)==9) {
				System.out.println("박수 두번 짝짝");
			}else {
				System.out.println("박수 한번 짝");
			}
		}else if((a%10)==3||(a%10)==6||(a%10)==9){
			System.out.println("박수 한번 짝");
		}
		
		sc.close();
	}

}
