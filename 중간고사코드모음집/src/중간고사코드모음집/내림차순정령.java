package �߰�����ڵ������;

import java.util.Scanner;

public class ������������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		System.out.println("���� 5�� �Է� : ");
		
		for(int i =0; i< num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i=0; i< num.
				length;i++) {
			for(int j=0; j< num.length-1;j++) {
				if(num[j]<num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		System.out.print("�������� ����: ");
		for(int i=0;i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		
	}

}
