package �߰�����ڵ������;

import java.util.Scanner;

public class �ﰢ���̵Ǵ°� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3���� �Է��ϼ���: ");
		int a = sc.nextInt();
		System.out.print(" ");
		int b = sc.nextInt();
		
		System.out.print(" ");
		int c = sc.nextInt();
		if((a+b)>c || (a+c) > b || (b+c) > a) {
			System.out.println("�ﰢ���� �˴ϴ�");
		}
	}

}
