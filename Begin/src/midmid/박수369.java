package midmid;
import java.util.*;
public class �ڼ�369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 ������ ������ �Է��ϼ��� >> ");
		int a = sc.nextInt();
		if ((a/10)==3||(a/10)==6||(a/10)==9) {
			if ((a%10)==3||(a%10)==6||(a%10)==9) {
				System.out.println("�ڼ� �ι� ¦¦");
			}else {
				System.out.println("�ڼ� �ѹ� ¦");
			}
		}else if((a%10)==3||(a%10)==6||(a%10)==9){
			System.out.println("�ڼ� �ѹ� ¦");
		}
		
		sc.close();
	}

}
