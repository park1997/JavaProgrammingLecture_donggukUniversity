import java.util.Arrays;
import java.util.Scanner;
public class array_practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[5];
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		while (cnt!=5) {
			int add = sc.nextInt();
			a[cnt]=add;
			cnt+=1;
			
		}
		
		sc.close();
		System.out.println(Arrays.toString(a));
		int result=0;
		//최대값 출력 알고리즘 
		for (int i =0; i<a.length-1; i++) {
			result=a[i];
			if (result<a[i+1]) {
				result=a[i+1];
			}else {
				result=a[i];
			}
			
		}
		
		System.out.println(result);
		//최대값을 출력
	
	
	
	}

}
