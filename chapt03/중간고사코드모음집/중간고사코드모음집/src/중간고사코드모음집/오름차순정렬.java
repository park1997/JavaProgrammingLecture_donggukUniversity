package 중간고사코드모음집;

import java.util.Scanner;

public class 오름차순정렬 {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			int num[] = new int[5];
			System.out.println("정수 5개 입력 : ");
			
			for(int i =0; i< num.length;i++) {
				num[i] = sc.nextInt();
			}
			
			for(int i=0; i< num.length;i++) {
				for(int j=0; j< num.length-1;j++) {
					if(num[j]>num[j+1]) {
						int temp = num[j];
						num[j] = num[j+1];
						num[j+1] = temp;
					}
				}
			}
			
			System.out.print("오름차순 정렬: ");
			for(int i=0;i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			System.out.println("최대값 : " + num[4]);
			System.out.println("최소값 : " + num[0]);
			
		}

	}
