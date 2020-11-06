package midmid;
import java.util.*;
public class 삼각형될까용말까용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요: ");
		int a = sc.nextInt();
		System.out.println(" ");
		int b= sc.nextInt();
		System.out.println(" ");
		int c = sc.nextInt();
		if((a+b)>c||(a+c)>b||(b+c)>a) {
			System.out.println("삼각형이 됩니다.");
		}
		sc.close();
		
		
	}

}
