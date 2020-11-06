package ch5;
import java.util.Scanner;
public class CH5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=0;
		for(char c =32; c<=a; c++) {
			System.out.printf("%c ",c);
			i+=1;
			if (i%16==0) {
				System.out.println();
			}
		}
		sc.close();
	}

}
