
public class if_practice {

	public static void main(String[] args) {
		
		int num1 =10;
		int num2 = 20;
		 if (num1<num2) {
			 System.out.println("num1이 num2보다 작다");
		 }
		 
		System.out.println();
		
		num1=20;
		num2=10;
		
		if (num1<num2) {
			System.out.println("num1이 num2 보다 작다");
		} else {
			System.out.println("num1이 num2보다 크다");
		}
		System.out.println();
		
		num1=10;
		num2=20;
		
		
		if (num1<num1) {
			System.out.println("num1이 num2 보다 작다");
		}else if (num1>num2){
			System.out.println("num1이 num2보다 크다");
		}else {
			System.out.println("둘이 같다");
		}
		
		if (true) {
			System.out.println("반드시 실행되는 문장");
		}
		
		if(false) {
			System.out.println("실행되지 않음");
		}
		
		
		
		
	}

}
