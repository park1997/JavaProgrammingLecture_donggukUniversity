package pbh;
import java.util.*;
public class midterm_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[20];
		System.out.println("3.1번 ");
		System.out.print("개수, 값 입력 > ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i =0; i<num;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("3.2번");
		System.out.print("교환할 index번호 2개 입력 >  ");
		int index1= sc.nextInt();
		int index2= sc.nextInt();
		int temp;
		temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		for(int i=0; i<num;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("3.3번");
		System.out.print("검색할 값 입력 > ");
		int number = sc.nextInt();
		int result=0;
		for(int i=0; i<num;i++) {
			if(number==arr[i]) {
				result=i;
				break;
			}
		}
		System.out.println(number +"(이) 처음 나오는 index번호는 "+result);
		sc.close();
	}

}
