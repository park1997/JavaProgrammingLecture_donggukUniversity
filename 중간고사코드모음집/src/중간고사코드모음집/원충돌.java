package 중간고사코드모음집;

import java.util.Scanner;

public class 원충돌 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 원의 중심과 반지름 입력>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		
		System.out.println("두번째 원의 중심과 반지름 입력>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		if(((x1+r1)>(x2-r2) && (x1+r1)<(x2+r2)) || ((y1+r1)>(y2-r2) && (y1+r1)<(y2+r2))){
			System.out.println("두원은 겹친다.");
		}
		else {
			System.out.println("두원은 서로 겹치지 않는다.");
		}
	}
	

}
