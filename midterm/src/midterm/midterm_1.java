package midterm;

import java.util.*;

public class midterm_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int y=0;
		Scanner sc = new Scanner(System.in);
		
		
		while(x!=-1) {
			System.out.println("�� x �� y ���� �Է��ϼ��� >> ");
			x=sc.nextInt();
			y=sc.nextInt();
		
			if (x>100 && y>100 && x<200 && y<200 ) {
				System.out.println("�� ("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
			}else {
				System.out.println("�� ("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
			}
		
		
		}
		System.out.println("���α׷� ����");
		sc.close();
	}

}
