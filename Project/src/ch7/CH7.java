package ch7;
/* ------------------------
 *|         ���ڷ�����                |
 * ------------------------
 *|���α��� ,���α���,����,�ð� ,�̸�|
 * ------------------------
 *|    ���ڷ������� �̸��� ����        |
 * ------------------------
 *|     ���ڷ������� ���ư��� �ð�   |
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
		System.out.println("���ڷ������� �̸� "+name+" �� ���Ǵ� "+horizontal*vertical*height);
		
	}
	void time() {
		System.out.println("���ڷ����� �� ���ư����� "+num+" ��ŭ �ɸ��ϱ� "+num+" ���Ŀ� �ٽÿ�����.");
		
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
		microwave.name="����������";
		microwave.size();
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڷ����� �� �� ���� �̴ϱ�? >> ");
		microwave.num=sc.nextInt();
		microwave.time();
		sc.close();
		
		
	}

}
