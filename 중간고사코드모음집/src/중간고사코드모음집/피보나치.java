package �߰�����ڵ������;

import java.util.Scanner;

public class �Ǻ���ġ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ��� ������ �Է��ϼ���: ");
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
