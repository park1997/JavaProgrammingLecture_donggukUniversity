package �߰�����ڵ������;

import java.util.Scanner;

public class ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1���׸�--------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int a = sc.nextInt();
		for(int i = a; i>0;i-- ) {
			for(int j = 0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("2���׸�--------------------------------------");
		for(int i = 1 ; i<5; i++) {
			for(int j=4;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println("3���׸�--------------------------------------");
		for(int i =0; i <5;i++) {
			for(int j =1 ;j<= i ; j++) {
				System.out.print(" ");
			}
			for(int k = 9; k >= i*2+1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("4���׸�--------------------------------------");
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0; j < 3 ;j ++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("5���׸�--------------------------------------");
		System.out.println("������ �Է� �ϼ��� >> ");
		a =sc.nextInt();
		for(int i=0;i<a+1;i++) {
			
			for(int k=i;k<a;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<a+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		
	}

}
