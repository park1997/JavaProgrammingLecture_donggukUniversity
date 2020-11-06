package ch7;
/* ------------------------
 *|         전자레인지                |
 * ------------------------
 *|가로길이 ,세로길이,높이,시간 ,이름|
 * ------------------------
 *|    전자레인지의 이름과 부피        |
 * ------------------------
 *|     전자레인지의 돌아가는 시간   |
 * ------------------------
 */
import java.util.Scanner;

class Square{
	int horizontal;
	int vertical;
	int height;
	int num;
	String name;
	
	void size() {
		System.out.println("전자레인지의 이름 "+name+" 의 부피는 "+horizontal*vertical*height);
		
	}
	void time() {
		System.out.println("전자레인지 다 돌아가려면 "+num+" 만큼 걸리니까 "+num+" 이후에 다시오세요.");
		
	}
}

public class CH7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Square microwave = new Square();
		microwave.horizontal=10;
		microwave.vertical=7;
		microwave.height=5;
		microwave.name="병현레인지";
		microwave.size();
		Scanner sc = new Scanner(System.in);
		System.out.print("전자레인지 몇 초 돌릴 겁니까? >> ");
		microwave.num=sc.nextInt();
		microwave.time();
		sc.close();
		
		
	}

}
