import java.util.Arrays;
import java.util.Scanner;

public class array_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int data[] = new int[100];
		int size = sc.nextInt();
		for (int i=0; i<size; i++) {
			data[i]=sc.nextInt();
		}
		
		int position = sc.nextInt();
		int value = sc.nextInt();
		for (int i=size; i>position; i--) {
			data[i] = data[i-1];
			
		}
		data[position] = value;
		size=size+1;
		
		
		
		sc.close();
		
		System.out.println(Arrays.toString(data));
		
		
		
		
		
	}

}
