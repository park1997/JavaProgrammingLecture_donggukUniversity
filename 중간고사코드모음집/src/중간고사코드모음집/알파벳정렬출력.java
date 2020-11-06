package 중간고사코드모음집;

import java.util.Scanner;

public class 알파벳정렬출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//입력 알파벳 전까지의 소문자 함께해서 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하시오>> ");
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
