import java.util.Scanner;
public class switch_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score =sc.nextInt();
		
		switch(score) {
		case 100:
		case 90:
		System.out.println("��");
		break;
		case 80:
		System.out.println("��");
		break;
		case 70:
		System.out.println("��");
		break;
		default:
			System.out.println("try again");
		break;
		}
		sc.close();
		
	}

}
