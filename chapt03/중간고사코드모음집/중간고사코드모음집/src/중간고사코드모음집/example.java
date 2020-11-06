package 중간고사코드모음집;

class Example1{
	public int squre(int a) {
		return a*a;
	}
	
	boolean odd(int a) {
		if(a%2 ==1) return true;
		return false;
	}
	
	char last(String h) {
		return h.charAt(h.length()-1);
	}
	
	int min(int[] arr) {
		int min =100;
		for(int i =0; i < arr.length; i++) {
			if(arr[i] < min) min = arr[i];
		}
		return min;
	}
}

public class example {
	
	static char next(char c) {
		return (char)((int)c + 1);
	}
	
	static void swap(int[] data, int a, int b) {
		int temp = 0;
		temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example1 ex = new Example1();
		
		System.out.println("1번--------------------------------");
		System.out.println(ex.squre(20));
		
		System.out.println("2번--------------------------------");
		if(ex.odd(8)) System.out.println("홀수입니다.");
		else System.out.println("짝수입니다.");
		
		System.out.println("3번--------------------------------");
		char ch = 'b';
		ch =next(ch);
		System.out.println(ch);
		
		System.out.println("4번--------------------------------");
		System.out.println(ex.last("hello"));
		
		System.out.println("5번--------------------------------");
		int[] data = {1,2,3,4,5,6,7,8};
		System.out.println(ex.min(data));
		
		System.out.println("6번--------------------------------");
		swap(data,2,5);
		for(int i=0; i <data.length; i++) {
			System.out.print(data[i]+" ");
		}
		
		
	}

}
