package ch8;

public class Example {
	boolean odd(int n) {
		if(n%2!=1) {
			return false;
		}else {
			return true;
		}
	}
	
	static char next(char ch) {
		return (char)(ch+1);
	}
	
	int min(int[] arr) {
		int num = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(num>arr[i]) {
				num=arr[i];
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex = new Example();
		//1번
		int a =5;
		System.out.print("1번문제 = ");
		if(ex.odd(a)) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		//2번
		char c ='s';
		c=next(c);
		System.out.println("2번문제 = "+c);
		
		//3번
		
		int[] data = {10,5,8,20,7,3,30,25,15};
		System.out.println("3번문제 = "+ex.min(data));
	}

}
