package ch10;
import java.util.*;
public class CH10 {
	
	public static void show() {
		System.out.println("[menu]");
		System.out.println("0 : Exit");
		System.out.println("1 : Menu");
		System.out.println("2 : Input(Array)");
		System.out.println("3 : show(Array)");
		System.out.println("4 : insert");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		show();
		int size=0;
		int[] arr = new int[10];
		int location=0;
		int num=0;
		while(true) {
			System.out.print("메뉴입력 >");
			int a= sc.nextInt();
			if(a==1) {
				show();
			}else if(a==2) {
				System.out.println("정수 (개수, 값)");
				size=sc.nextInt();
				for(int i=0;i<size;i++) {
					arr[i]=sc.nextInt();
				}
				System.out.println("입력완료");
			}else if(a==3) {
				for(int i=0; i<size;i++) {
					System.out.print(arr[i]+" ");
				}
				
				System.out.println();
			}else if(a==4) {
				System.out.println("삽입(index, 값) >");
				location=sc.nextInt();
				num=sc.nextInt();
				for(int i=size;i>=location;i--) {
					System.out.println(i);
					if(i==location) {
						arr[i]=num;
					}else {
						arr[i]=arr[i-1];
					}
					
				}
				System.out.println("삽입완료");
				size+=1;
			
			}else if(a==0) {
				break;
			}
			
		}
	
		sc.close();
		
	}

}
