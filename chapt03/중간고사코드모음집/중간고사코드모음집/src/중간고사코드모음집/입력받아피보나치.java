package �߰�����ڵ������;

import java.util.Scanner;

public class �Է¹޾��Ǻ���ġ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int[] sum = new int[50];
		
		sum[0] = 1;
		sum[1] = 1;
		
		for(int i = 1; i<=input; i++) {
			System.out.print(sum[i-1]+ " ");
			sum[i+1] = sum[i]+sum[i-1];
			
			if(i%5 == 0) {
				System.out.println();
				continue;
			}
		}
	}

}
