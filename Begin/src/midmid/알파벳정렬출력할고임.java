package midmid;
import java.util.*;
public class ���ĺ���������Ұ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է� �Ͻÿ� >> ");
		String a = sc.next();
		char b= a.charAt(0);
		char c =0;
		//System.out.println(b);
		//System.out.println((int)b);
		for(int i =(int)b;i>96;i--) {
			for(int j=97; j<=i;j++) {
				c=(char)j;
				System.out.print(c);
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
