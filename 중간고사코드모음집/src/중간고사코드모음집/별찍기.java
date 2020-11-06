package 중간고사코드모음집;

import java.util.Scanner;

public class 별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1번그림--------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int a = sc.nextInt();
		for(int i = a; i>0;i-- ) {
			for(int j = 0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("2번그림--------------------------------------");
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
		
		System.out.println("3번그림--------------------------------------");
		for(int i =0; i <5;i++) {
			for(int j =1 ;j<= i ; j++) {
				System.out.print(" ");
			}
			for(int k = 9; k >= i*2+1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("4번그림--------------------------------------");
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0; j < 3 ;j ++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("5번그림--------------------------------------");
		System.out.println("정수를 입력 하세요 >> ");
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
