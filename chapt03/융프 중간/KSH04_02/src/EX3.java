import java.util.Scanner;

public class EX3 {

		public static void main(String[] args) {
			
			int i, j;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력하세요 >> ");

			int num = sc.nextInt();
			
			for(i = 1; i<=num; i++)
			{
		
				for(j = 1; j < i; j++)
				{
					System.out.print(" ");
				}
				for(j = i; j <= num; j++)
				{
					System.out.print("*");
				}
				System.out.println(" ");
			}

		}	

}

