package 중간고사코드모음집;

import java.util.Scanner;

public class 각자리숫자구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int 입력수 = scan.nextInt();
		
		int 백의자리 = 입력수 / 100;
		int 십의자리 = (입력수%100) / 10;
		int 일의자리 = (입력수 %10) / 1 ;
		
		System.out.println(백의자리 + 십의자리 +일의자리);
	}
}
