package �߰�����ڵ������;

import java.util.Scanner;

public class ���浹 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		if(((x1+r1)>(x2-r2) && (x1+r1)<(x2+r2)) || ((y1+r1)>(y2-r2) && (y1+r1)<(y2+r2))){
			System.out.println("�ο��� ��ģ��.");
		}
		else {
			System.out.println("�ο��� ���� ��ġ�� �ʴ´�.");
		}
	}
	

}
