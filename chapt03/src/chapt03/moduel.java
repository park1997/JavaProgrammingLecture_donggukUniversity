package chapt03;
import java.util.Scanner;

public class moduel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("�̸��� "+ name+", ");
		
		String city = scanner.next();
		System.out.print("���ô� "+city+", ");
		
		int age = scanner.nextInt();
		System.out.print("���̴� "+age+", ");
		
		double weight = scanner.nextDouble();
		System.out.print("ü���� "+weight+", ");
		
		boolean single = scanner.nextBoolean();
		System.out.println("���� ���δ� "+single+"�Դϴ�.");
		
		scanner.close();
		
		
		
		}
		
		
	}

