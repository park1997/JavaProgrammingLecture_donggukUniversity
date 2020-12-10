import java.io.IOException;

import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	       int i=sc.nextInt();
	       int n=i;
	       int count=0;
	       while(n != i || count==0) {
	          int a=n/10;
	          int b=n%10;
	          int sum=(a+b)%10; 
	          a=b;
	            b=sum;
	          n=a*10+b;
	          count++; 
	       }   
	        System.out.println(count);
		
	}
}
