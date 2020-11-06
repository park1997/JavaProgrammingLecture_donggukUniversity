import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int dig_r = 0;
		
		if(n/1000 == 0){
			sum = n/100+n%100/10+n%10;
			System.out.println(n+"의 자릿수 합: "+sum);
			for(;;) {
				if(sum>=10) {
					sum = sum/10+sum%10;
				}
				else {
					dig_r = sum;
					System.out.println(n+"의 디지털 루트 값: "+dig_r);
					break;
				}
			}
		}
		else if(n/100 == 0) {
			sum = n/10+n%10;
			System.out.println(n+"의 자릿수 합: "+sum);
			for(;;) {
				if(sum>=10) {
					sum = sum/10+sum%10;
				}
				else {
					dig_r = sum;
					System.out.println(n+"의 디지털 루트 값: "+dig_r);
					break;
				}
			}
		}
		
	}

}
