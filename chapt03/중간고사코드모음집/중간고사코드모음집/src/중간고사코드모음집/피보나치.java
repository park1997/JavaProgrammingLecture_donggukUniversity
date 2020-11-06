package 중간고사코드모음집;

import java.util.Scanner;

public class 피보나치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 출력 개수를 입력하세요: ");
		int number = sc.nextInt();
		
		int n1 =1 , n2 =1, n3;
		for(int i =3 ; i<=number; i++) {
			if(i ==3) {
				System.out.print(n1+" "+n2+" ");
			}
			n3= n1+ n2;
			System.out.print(n3 +" ");
			n1 =n2;
			n2 = n3;
		}
	}

}
