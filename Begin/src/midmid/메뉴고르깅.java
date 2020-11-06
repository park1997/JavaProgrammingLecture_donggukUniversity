package midmid;
import java.util.*;
public class 메뉴고르깅 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[menu]");
		System.out.println("0 : Exit");
		System.out.println("1 : Menu");
		System.out.println("2 : Input(Array)");
		System.out.println("3 : show(Array)");
		System.out.println("4 : ");
		int mode =5;
		int num=0;
		int arr[]=new int[50];
		Scanner sc = new Scanner(System.in);
		while(mode!=0) {
			System.out.println("메뉴입력 >> ");
			mode = sc.nextInt();
			if (mode==0) {
				System.out.println("시스템이 종료되었습니다.");
			}else if(mode==1) {
				System.out.println("[menu]");
				System.out.println("0 : Exit");
				System.out.println("1 : Menu");
				System.out.println("2 : Input(Array)");
				System.out.println("3 : show(Array)");
				System.out.println("4 :");
			}else if(mode ==2) {
				System.out.println("정수(개수, 값) >> ");
				num=sc.nextInt();
				for (int i =0; i<num;i++) {
					arr[i]=sc.nextInt();
				}
				System.out.println("입력완료");
			}else if(mode==3) {
				for(int i=0;i<num;i++) {
					System.out.println(arr[i]+" ");
				}
			}else if(mode==4) {
				System.out.println("삽입(index), 값>> ");
				int index = sc.nextInt();
				int New = sc.nextInt();
				for(int i =num;i>index;i--) {
					arr[i]=arr[i-1];
				}
				num++;
				arr[index]=New;
				for(int i=0; i<num;i++) {
					System.out.println(arr[i]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
		
	}

}
