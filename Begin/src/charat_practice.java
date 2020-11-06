import java.util.*;
public class charat_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("문자열 입력 >> ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(name + "출력");
		sc.close();
		System.out.println();
		System.out.println();
		char ch = name.charAt(0);
		System.out.println(name + " 첫번째 문자는 : "+ch);
		
		
		
	}

}
