package midmid;

import java.util.Scanner;

public class ����3������Ұ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int time =sc.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		System.out.println(time+"�ʴ�");
		System.out.println(hour+"�ð�");
		System.out.println(minute+"��");
		System.out.println(second+"��");
		sc.close();
	}

}
