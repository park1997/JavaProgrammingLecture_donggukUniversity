
public class method_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int a =increase(n);
		
		System.out.println("method �� ���ٿ͵� n �� ���� "+n); // �׳� ���ڸ� �����ؼ� m���� �־��� ���̱� ����
		System.out.println();
		System.out.println("a = "+a);
		
		
	}
	//method ���� �κ�
	static int increase(int m) {// int m =n; �̶�� �����Ϸ��� ������.
		m+=1;
		System.out.println("m = "+m);
		return m;
	}
	
}
