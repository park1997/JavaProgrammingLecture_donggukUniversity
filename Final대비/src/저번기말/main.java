package �����⸻;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1��
		BowlStorage storage = new BowlStorage("((((");
		storage.show();
		
		//2��
		storage.key_in();
		storage.show();
		System.out.println("�׸����� = "+storage.no_bowls());
		
		//3��
		System.out.println("���ڿ��׸� ���� : "+storage.total());
		
	}

}
