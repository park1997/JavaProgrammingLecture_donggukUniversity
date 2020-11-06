package midterm;

import java.util.*;

public class midterm_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int y=0;
		Scanner sc = new Scanner(System.in);
		
		
		while(x!=-1) {
			System.out.println("점 x 와 y 값을 입력하세요 >> ");
			x=sc.nextInt();
			y=sc.nextInt();
		
			if (x>100 && y>100 && x<200 && y<200 ) {
				System.out.println("점 ("+x+","+y+")는 사각형 안에 있습니다.");
			}else {
				System.out.println("점 ("+x+","+y+")는 사각형 안에 없습니다.");
			}
		
		
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
