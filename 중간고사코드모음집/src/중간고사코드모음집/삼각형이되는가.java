package 중간고사코드모음집;

import java.util.Scanner;

public class 삼각형이되는가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print(" ");
		int b = sc.nextInt();
		
		System.out.print(" ");
		int c = sc.nextInt();
		if((a+b)>c || (a+c) > b || (b+c) > a) {
			System.out.println("삼각형이 됩니다");
		}
	}

}
