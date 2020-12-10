package 대비;

public class 상속1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "  hello my name is byunghyun";
		a=a.trim();
		String[] arr = a.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		String b ="    0123456";
		b=b.trim();
		System.out.println(b);
		System.out.println(b.subSequence(0, 2));
		System.out.println(b.substring(0,1));
		
		char c =b.charAt(0);
		System.out.println(c);
		
	}

}
