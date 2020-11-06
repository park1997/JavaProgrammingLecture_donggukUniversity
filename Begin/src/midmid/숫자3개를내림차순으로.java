package midmid;
import java.util.*;
public class 숫자3개를내림차순으로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];  
		
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		int temp=a[0];
		for (int i =0;i<3;i++) {
			for(int j=0;j<3-i-1;j++) {
				if (a[j]<a[j+1]) {
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
