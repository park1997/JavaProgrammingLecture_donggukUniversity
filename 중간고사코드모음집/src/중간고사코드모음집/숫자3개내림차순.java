package �߰�����ڵ������;

import java.util.Scanner;

public class ����3���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int temp;
		if(a<b) {
			temp = a;
			a = b;
			b = temp;
		}
		if(b < c) {
			temp = b;
			b = c;
			c =temp;
		}
		if( a < b ) {
			temp = b;
			b = a;
			a = temp;
		}
		System.out.println("��������");
		System.out.println(a +" "+ b +" " + c);
		System.out.println("��������");
		System.out.println( c+" "+ b +" " + a);
		
	}

}
