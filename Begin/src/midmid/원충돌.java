package midmid;
import java.util.*;

public class ���浹 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �߽ɰ� ������ �Է� >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է� >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		if (x1==x2 && y1==y2) {
			if (r1==r2) {
				System.out.println("�ο��� �����ֽ��ϴ�.");
			}
		}
		
		double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		if (r1>d+r2 || r2>d+r1||d>r1+r2) {
			System.out.println("�� ���� ������ �����ϴ�.");
		}else if (r1==d+r2 || r2==d+r1 || r1+r2 ==d) {
			System.out.println("�� ���� ���� �ֽ��ϴ�.");
		}else {
			System.out.println("�ο��� �� ������ �����ϴ�.");
		}
			
		
	}
}