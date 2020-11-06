package midmid;
import java.util.*;
public class 소문자를대문자로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("소 - 대 변환");
		System.out.println();
		Scanner sc =new Scanner(System.in);
		System.out.println("문자를 입력하세요 >> ");
		char ch =sc.next().charAt(0);
		if (ch>=65 && ch<=90) {
			System.out.println("대문자를 입력했습니다. 대 -> 소 변환시작");
			ch+=32;
			System.out.println(ch);
		}else if(ch>=97 && ch<=122) {
			System.out.println("소문자를 입력했습니다. 소 -> 대 변환 시작");
			ch-=32;
			System.out.println(ch);
		}else {
			System.out.println("잘못입력함, 영문자를 입력하세요.");
		}
		System.out.println();
		sc.close();
	}

}
