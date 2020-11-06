package midmid;
import java.util.*;
public class 사각형안에좌표존재할깡 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p1 =100, p2 =200;
		System.out.println("점 (x,y)의 좌표를 입력하세요");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (((p1<=x)&&(p1<=y))&&((p2>=x)&&(p2>=y))){
			System.out.println("("+x+","+y+")는 사각형 안에 존재한다.");
		}else {
			System.out.println("사각형 안에 없음.");
		}
		
		sc.close();
	}

}
