package �߰�����ڵ������;

import java.util.Scanner;

public class ���ڸ����ڱ��ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int �Է¼� = scan.nextInt();
		
		int �����ڸ� = �Է¼� / 100;
		int �����ڸ� = (�Է¼�%100) / 10;
		int �����ڸ� = (�Է¼� %10) / 1 ;
		
		System.out.println(�����ڸ� + �����ڸ� +�����ڸ�);
	}
}
