package ch10;
import java.util.*;
public class CH10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("[menu]");
		System.out.println("0 : Exit");
		System.out.println("1 : Menu");
		System.out.println("2 : Input(Array)");
		System.out.println("3 : show(Array)");
		System.out.println("4 : insert");
		int size =0;
		int[] arr = new int[10];
		int location =0;
		int num=0;
		int temp=0;
		while (true) {
			System.out.print("메뉴 입력>");
			int a=sc.nextInt();
			if (a==1) {
				System.out.println("[menu]");
				System.out.println("0 : Exit");
				System.out.println("1 : Menu");
				System.out.println("2 : Input(Array)");
				System.out.println("3 : show(Array)");
				System.out.println("4 : insert");
			}else if(a==2) { 
				System.out.print("정수 (개수, 값)");
				size = sc.nextInt();
				for (int i =0; i<size;i++) {
					arr[i]=sc.nextInt();
				}
				System.out.println("입력 완료");
			}else if (a==3) {
				for (int i =0; i<size; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}else if (a==4) {
				System.out.print("삽입 (index, 값)> ");
				location=sc.nextInt();
				num=sc.nextInt();
				temp=arr[location];
				arr[location]=num;
				for (int i =size; i>location;i--) {
					arr[i]=arr[i-1];
				}
				size++;
				arr[location+1]=temp;
			
				System.out.println("삽입 완료");
			}else if(a==0) {
				break;
			}
				
		}
		
		
		sc.close();
		
	}

}
