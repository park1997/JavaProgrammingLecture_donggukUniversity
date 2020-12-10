package 저번기말;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번
		BowlStorage storage = new BowlStorage("((((");
		storage.show();
		
		//2번
		storage.key_in();
		storage.show();
		System.out.println("그릇개수 = "+storage.no_bowls());
		
		//3번
		System.out.println("문자열그릇 높이 : "+storage.total());
		
	}

}
