package ch6;
import java.util.Scanner;
public class CH6 {

	public static void main(String[] args) {
		System.out.println(" [ Practice3-6 ]\n");
		System.out.println(" [ menu ]");
		System.out.println(" 0 : exit");
		System.out.println(" 1: input (array)");
		System.out.println(" 2 : show (array)");
		System.out.println(" 3 : menu");
		System.out.println();
		
		
		int[] result = new int[10];
		int len=0;
		int real_len=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">");
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("종료되었습니다.");
				break;
			}else if(num==1) {
				System.out.print("정수 (개수, 값) >");
				len = sc.nextInt();
				for(int i=0;i<len;i++) {
					result[i]=sc.nextInt();
				}
				real_len=len;
				System.out.print("입력 완료\n");
				System.out.println();
			}else if (num==2) {
				for(int i=0;i<real_len;i++) {
					System.out.print(result[i]+" ");
				}
				System.out.println();
				System.out.println();
			}else if (num==3) {
				System.out.println(" [ Practice3-6 ]\n");
				System.out.println(" [ menu ]");
				System.out.println(" 0 : exit");
				System.out.println(" 1: input (array)");
				System.out.println(" 2 : show (array)");
				System.out.println(" 3 : menu");
				System.out.println();
			}
		
		}
		sc.close();
		
		
		
	}

}
