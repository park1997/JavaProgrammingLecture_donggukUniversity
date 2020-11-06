package midterm;

import java.util.Scanner;

public class midterm_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력 하세요 >> ");
		int a =sc.nextInt();
		for(int i=0;i<a+1;i++) {
			
			for(int k=i;k<a;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<a+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
				
		sc.close();
		
	}

}
