package 중간고사코드모음집;

import java.util.Scanner;

public class 중간값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		int a = sc.nextInt();
		System.out.print(" ");
		int b = sc.nextInt();
		System.out.print(" ");
		int c = sc.nextInt();
		System.out.print(" ");
		
		int result = 0;
		
		if((a > b) && (b > c) || (c > b) && (b >a)) result = b;
		else if((b > a) && (a > c) || (c > a) && (a >b)) result = b;
		else if((a > c) && (c > b) || (b > c) && (c >a)) result = b;
		System.out.print(result);
	}

}
