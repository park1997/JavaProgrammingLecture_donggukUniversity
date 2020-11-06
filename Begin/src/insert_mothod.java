import java.util.Arrays;
import java.util.Scanner;
public class insert_mothod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      
	      System.out.print("입력할 숫자 개수> ");
	      int number = sc.nextInt();
	      int num2[] = new int[number]; 
	      System.out.print("배열의 원소를 입력하세요> ");
	      for(int i =0 ; i < number ; i++) {
	         num2[i] = sc.nextInt();
	         
	      }
	      System.out.println("");
	      System.out.println("원본: "+Arrays.toString(num2)); 
	      
	      int num2_수정[] = new int[number+1];
	      System.out.println("");
	      System.out.print("삽입할 index입력> ");
	      int index = sc.nextInt();
	      System.out.println("삽입할 값 입력하기> ");
	      int n = sc.nextInt();
	      
	      for(int i = 0 ; i < number ; i ++ ) {
	         num2_수정[i] =  num2[i];
	         
	         if( i >= index) {
	         num2_수정[i+1] =  num2[i];
	         }
	      }
	      num2_수정[index] = n;
	      
	      System.out.println("삽입후: "+Arrays.toString(num2_수정));
	      sc.close();
	}

}
