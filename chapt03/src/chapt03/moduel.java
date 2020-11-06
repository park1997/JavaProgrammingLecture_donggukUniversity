package chapt03;
import java.util.Scanner;

public class moduel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 "+ name+", ");
		
		String city = scanner.next();
		System.out.print("도시는 "+city+", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 "+age+", ");
		
		double weight = scanner.nextDouble();
		System.out.print("체중은 "+weight+", ");
		
		boolean single = scanner.nextBoolean();
		System.out.println("독신 여부는 "+single+"입니다.");
		
		scanner.close();
		
		
		
		}
		
		
	}

