package �߰�����ڵ������;

import java.util.Scanner;

public class ���ĺ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�Է� ���ĺ� �������� �ҹ��� �Բ��ؼ� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
		String a = sc.next();
		char b = a.charAt(0);
		char c = 0;
		for(int i =(int)b; i > 96 ; i--) {
			for(int j = 97; j<=i; j++) {
				c = (char)j;
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
