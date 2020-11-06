package 중간고사코드모음집;

import java.util.Scanner;

public class 메뉴고르기 {

	private static void menu() {
		System.out.println("[menu]");
		System.out.println("0 : Exit");
		System.out.println("1 : Menu");
		System.out.println("2 : Input(Array)");
		System.out.println("3 : show(Array)");
		System.out.println("4 : ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
		int mode = 5;
		int num = 0;
		int arr[] = new int[50];
		Scanner sc = new Scanner(System.in);
		while(mode != 0) {
			System.out.println("메뉴 입력>> ");
			mode = sc.nextInt();
			switch(mode) {
			case 0:
				System.out.println("시스템이 졸류됨");
			case 1:
				menu();
				break;
			case 2:
				System.out.println("정수(개수, 값)>>  ");
				num = sc.nextInt();
				for(int i =0; i < num; i++) {
					arr[i] = sc.nextInt();
				}
				System.out.println("입력완료");
				break;
			case 3:
				for(int i = 0 ; i < num ; i++) {
					System.out.print(arr[i]+ " ");
				}
				break;
			case 4:
				System.out.println("삽인(index), 값 >> ");
				int index = sc.nextInt();
				int New = sc.nextInt();
				for(int i = num; i> index; i--) {
					arr[i] = arr[i-1];
				}
				num++;
				arr[index] = New;
				for(int i = 0; i < num; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();

			}
		}
	}

}
