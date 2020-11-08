package BOJ;
import java.util.*;


public class boj_12865 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int volume=sc.nextInt();
		int weight=0;
		int value=0; 
		int[][] dp = new int[num+1][volume+1];
		
		for(int i=1; i<num+1;i++) {
			weight=sc.nextInt();
			value=sc.nextInt();
			for (int j=1;j<volume+1;j++) {
				if(j>=weight) {
					dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-weight]+value);
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		System.out.println(dp[num][volume]);
		sc.close();
		
	}

}
