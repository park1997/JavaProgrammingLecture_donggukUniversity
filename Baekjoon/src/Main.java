import java.io.IOException;
import java.util.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int[][] dp= new int[a.length()+1][b.length()+1];
		for(int i=1;i<dp.length+1;i++) {
			for(int j=1; j<dp[i].length+1;j++) {
				if(a.charAt(i-1)==(b.charAt(j-1))) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			
			}
		}
		System.out.println(dp[a.length()][a.length()]);
		sc.close();
	}
}
