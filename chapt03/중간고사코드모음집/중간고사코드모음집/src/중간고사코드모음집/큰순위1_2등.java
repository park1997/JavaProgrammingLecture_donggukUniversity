package �߰�����ڵ������;

import java.util.Scanner;

public class ū����1_2�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {10,25,15,90,80,5,40,70,85,35};
		
		//���� ���ϴ� �迭�� ũ��� ����
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for(int i = 0 ; i < 8 ; i++) {
			int k  = sc.nextInt();
			arr[i] = k;
		}
		
		int max=0;
		int second_max = 0;
		System.out.println("�迭�� ����� ���� �Ʒ��� �����ϴ�");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int j=0;j<arr.length;j++) {
			if (max<arr[j]
					) {
				max=arr[j];
			}
		}
		System.out.println("�ִ밪�� "+max);
		for(int k = 0;k<arr.length;k++) {
			if (second_max<arr[k] && arr[k]!=max) {
				second_max=arr[k];
			}
		}
		System.out.println("�ι�° �ִ밪�� "+second_max);
		
		
	}

}
