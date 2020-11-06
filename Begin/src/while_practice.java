import java.util.Scanner;
public class while_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number : ");
		int i =0;
		int a = sc.nextInt();
		while(i<10) {
			System.out.printf("%d * %d = %d \n",a,i,a*i);
		i+=1;
			
		}
		
	}

}
