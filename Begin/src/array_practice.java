import java.util.Arrays;
import java.util.Scanner;
public class array_practice {

	public static void main(String[] args) {
		
		String[] name = {"����ȣ","�̽¿�","�ں�ȣ","�̺���","������"};
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		System.out.printf("%s �� ���� �Է�",name[0]);
		score[0]=sc.nextInt();
		System.out.printf("%s �� ���� �Է�",name[1]);
		score[1]=sc.nextInt();
		System.out.printf("%s �� ���� �Է�",name[2]);
		score[2]=sc.nextInt();
		System.out.printf("%s �� ���� �Է�",name[3]);
		score[3]=sc.nextInt();
		System.out.printf("%s �� ���� �Է�",name[4]);
		score[4]=sc.nextInt();
		
		System.out.printf("%s �� ���� �� \t %.2f\n",name[0],(double)score[0]);
		System.out.printf("%s �� ���� �� \t %.2f\n",name[1],(double)score[1]);
		System.out.printf("%s �� ���� �� \t %.2f\n",name[2],(double)score[2]);
		System.out.printf("%s �� ���� �� \t %.2f\n",name[3],(double)score[3]);
		System.out.printf("%s �� ���� �� \t %.2f\n",name[4],(double)score[4]);
		
		
		
		
		
		double avg = (double)(score[0]+score[1]+score[2]+score[3]+score[4])/score.length;
		System.out.printf("---------------\n ���� : \t %.2f",avg);
		sc.close();
		
		System.out.println();
		
		
		
		
	}

}
