
public class method_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int a =increase(n);
		
		System.out.println("method 를 갔다와도 n 의 값은 "+n); // 그냥 숫자를 복사해서 m으로 넣어준 것이기 때문
		System.out.println();
		System.out.println("a = "+a);
		
		
	}
	//method 구현 부분
	static int increase(int m) {// int m =n; 이라고 컴파일러가 이해함.
		m+=1;
		System.out.println("m = "+m);
		return m;
	}
	
}
