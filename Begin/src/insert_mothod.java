import java.util.Arrays;
import java.util.Scanner;
public class insert_mothod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      
	      System.out.print("�Է��� ���� ����> ");
	      int number = sc.nextInt();
	      int num2[] = new int[number]; 
	      System.out.print("�迭�� ���Ҹ� �Է��ϼ���> ");
	      for(int i =0 ; i < number ; i++) {
	         num2[i] = sc.nextInt();
	         
	      }
	      System.out.println("");
	      System.out.println("����: "+Arrays.toString(num2)); 
	      
	      int num2_����[] = new int[number+1];
	      System.out.println("");
	      System.out.print("������ index�Է�> ");
	      int index = sc.nextInt();
	      System.out.println("������ �� �Է��ϱ�> ");
	      int n = sc.nextInt();
	      
	      for(int i = 0 ; i < number ; i ++ ) {
	         num2_����[i] =  num2[i];
	         
	         if( i >= index) {
	         num2_����[i+1] =  num2[i];
	         }
	      }
	      num2_����[index] = n;
	      
	      System.out.println("������: "+Arrays.toString(num2_����));
	      sc.close();
	}

}
