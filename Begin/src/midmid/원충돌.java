package midmid;
import java.util.*;

public class 원충돌 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 원의 중심과 반지름 입력 >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		
		System.out.println("두번째 원의 중심과 반지름 입력 >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		if (x1==x2 && y1==y2) {
			if (r1==r2) {
				System.out.println("두원은 겹쳐있습니다.");
			}
		}
		
		double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		if (r1>d+r2 || r2>d+r1||d>r1+r2) {
			System.out.println("두 원은 교점이 없습니다.");
		}else if (r1==d+r2 || r2==d+r1 || r1+r2 ==d) {
			System.out.println("두 원은 접해 있습니다.");
		}else {
			System.out.println("두원은 두 점에서 만납니다.");
		}
			
		
	}
}