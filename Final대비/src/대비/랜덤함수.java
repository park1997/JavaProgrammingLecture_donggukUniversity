package 대비;
import java.util.*;
public class 랜덤함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("행운의 번호 9 개 출력");
		for(int i=0; i<9;i++) {
			System.out.print((int)(Math.random()*45)+1+" ");
		}
		System.out.println();
		
		//숫자 하나 랜덤뽑기
		
		Random rd = new Random();
		int a=rd.nextInt(5);
		System.out.println(a);
		
		
	}

}
