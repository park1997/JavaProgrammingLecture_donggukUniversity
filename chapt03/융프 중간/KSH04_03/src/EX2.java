import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, tmp = 0, max = 0, max2 = 0;
		int arr[] = {10, 25, 15, 90, 80, 5, 40, 70, 85, 35};
		
		System.out.println("�迭�� ����� ���� �Ʒ��� �����ϴ�.");
		for(i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		for(i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		for(i = 0; i <arr.length; i++)
		{
			if( arr[i] != max && max2 < arr[i] )
				max2 = arr[i];
		}
		System.out.println("�ִ� ���� ="+max);
		System.out.println("�ι�° �ִ밪�� ="+max2);		
		
	}
}
