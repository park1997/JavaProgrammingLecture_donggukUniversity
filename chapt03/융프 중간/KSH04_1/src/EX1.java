import java.util.Scanner;

public class EX1{
	
	public static void main(String[] args) {
		
		int x=0, y=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(x != -1) 
		{
			System.out.println("점 x와 y값을 입력하세요 >> ");
			x = sc.nextInt();
			y = sc.nextInt();
		
		if(x > 100 && y > 100 && x < 200 && y < 200) {
			System.out.println("점 ("+x+","+y+")는 사각형 안에있습니다.");
		
		}
		else
			System.out.println("점 ("+x+","+y+")는 사각형 안에 없습니다.");
		}
		System.out.println("프로그램 종료");
	}
}


