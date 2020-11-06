package midmid;

import java.util.Scanner;

public class 숫자3개계산할거임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int time =sc.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		System.out.println(time+"초는");
		System.out.println(hour+"시간");
		System.out.println(minute+"분");
		System.out.println(second+"초");
		sc.close();
	}

}
