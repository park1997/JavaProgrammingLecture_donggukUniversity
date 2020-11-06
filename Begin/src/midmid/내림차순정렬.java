package midmid;
import java.util.*;

public class 내림차순정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] arr = new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//버블 정렬
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j =0; j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
		
	}

}
