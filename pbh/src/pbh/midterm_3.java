package pbh;
import java.util.*;
public class midterm_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[20];
		System.out.println("3.1�� ");
		System.out.print("����, �� �Է� > ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i =0; i<num;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("3.2��");
		System.out.print("��ȯ�� index��ȣ 2�� �Է� >  ");
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
		System.out.println("3.3��");
		System.out.print("�˻��� �� �Է� > ");
		int number = sc.nextInt();
		int result=0;
		for(int i=0; i<num;i++) {
			if(number==arr[i]) {
				result=i;
				break;
			}
		}
		System.out.println(number +"(��) ó�� ������ index��ȣ�� "+result);
		sc.close();
	}

}
