import java.util.*;
public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int[] arr_a= new int[10001];
		int[] arr_b= new int[10001];
		
		for(int i=1;i<Math.sqrt(a)+1;i++) {
			if(a%i==0) {
				arr_a[i]=i;
			}
		}
		
		for(int i=1;i<Math.sqrt(b)+1;i++) {
			if(b%i==0) {
				arr_b[i]=i;
			}
		}
		
		for(int i=1;i<Math.sqrt(a)+1;i++) {
			if(a%i==0) {
				arr_a[i]=i;
				System.out.println(i);
			}
		}
		
		
		
		sc.close();
		
		
		
		
		
		
	}

}
