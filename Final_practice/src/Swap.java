
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,30,40,50};
		//swap �˰����� ���� => method �� �ٱź���
		swap(a,0,1);
		//�迭�� ���� �ٲ����.
		System.out.println("a[0] = "+a[0]+" , a[1]= "+a[1]);
				
	}
	
	static void swap(int[] m, int x, int y) { // int[] m = a; ���� �����ؼ� �Ѱܹ޴� ����
		int temp = 0;
		temp=m[x];
		m[x]=m[y];
		m[y]=m[0];
		
	}
	
	
}
