package midmid;
import java.util.*;
public class �ҹ��ڸ��빮�ڷ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�� - �� ��ȯ");
		System.out.println();
		Scanner sc =new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� >> ");
		char ch =sc.next().charAt(0);
		if (ch>=65 && ch<=90) {
			System.out.println("�빮�ڸ� �Է��߽��ϴ�. �� -> �� ��ȯ����");
			ch+=32;
			System.out.println(ch);
		}else if(ch>=97 && ch<=122) {
			System.out.println("�ҹ��ڸ� �Է��߽��ϴ�. �� -> �� ��ȯ ����");
			ch-=32;
			System.out.println(ch);
		}else {
			System.out.println("�߸��Է���, �����ڸ� �Է��ϼ���.");
		}
		System.out.println();
		sc.close();
	}

}
