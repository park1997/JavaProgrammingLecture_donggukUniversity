import java.util.*;
public class Main {

	public static void main(String[] args) {
		int count = 0;
		String str ="";
		char arr[] = new char[20];
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("---menu---");
		System.out.println("0.exit");
		System.out.println("1.input");
		System.out.println("2.output");
		System.out.println("3.no of X");
		System.out.println("4.score");
		System.out.println("---menu---");
		System.out.print("메뉴선택> ");
		for(;;) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			else if(n==1) {
				System.out.println(str);
				System.out.print("메뉴 선택>");
				
			}
			else if(n==2) {
				str = sc1.nextLine();
				System.out.print("메뉴 선택>");
			}
			else if(n==3) {
				for(int i = 0; i < str.length();i++) {
					arr[i] = str.charAt(i);
					if(arr[i]=='X') {
						count += 1;
					}
				}
				System.out.println("X의 개수: "+count);
				System.out.println("메뉴 선택>");
			}
			else if(n==4) {
				int score = 0;
				for(int i = 0; i< str.length();i++) {
					if(arr[i]=='O') {
						int plus = 1;
						if(i>=1) {
							if(arr[i-1]=='O') {
								plus = plus + 1;
							}
						}
						score = score + plus;
					}
					else if(arr[i]=='X') {
						score = score + 0;
					}
				}
				System.out.println("총점수: "+score);
			}
		}
	}

}
