
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,30,40,50};
		//swap 알고리즘을 구현 => method 로 바궈보장
		swap(a,0,1);
		//배열을 만들어서 바꿔야함.
		System.out.println("a[0] = "+a[0]+" , a[1]= "+a[1]);
				
	}
	
	static void swap(int[] m, int x, int y) { // int[] m = a; 값을 복사해서 넘겨받는 형식
		int temp = 0;
		temp=m[x];
		m[x]=m[y];
		m[y]=m[0];
		
	}
	
	
}
