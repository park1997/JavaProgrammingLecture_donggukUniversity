package midmid;
import java.util.*;
public class �簢���ȿ���ǥ�����ұ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p1 =100, p2 =200;
		System.out.println("�� (x,y)�� ��ǥ�� �Է��ϼ���");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (((p1<=x)&&(p1<=y))&&((p2>=x)&&(p2>=y))){
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �����Ѵ�.");
		}else {
			System.out.println("�簢�� �ȿ� ����.");
		}
		
		sc.close();
	}

}
