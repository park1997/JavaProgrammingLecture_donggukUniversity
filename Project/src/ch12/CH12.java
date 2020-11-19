package ch12;
import java.util.*;
public class CH12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Menu mn = new Menu();
		King[] king = new King[27];
		int num=0;
		String king_name;
		int king_index;
		int dog_water=0;
		mn.menu();
		while(true) {
			num=sc.nextInt();
			if(num==0) {
				System.out.println("종료되었습니다.");
				break;
			}else if(num==1) {
				System.out.print("왕의 이름 >");
				king_name=sc.next();
				System.out.println();
				System.out.print("왕의 순서 >");
				king_index=sc.nextInt();
				king[dog_water]=new King(king_name,king_index);
				dog_water+=1;
			}else if(num==2) {
				for (int i=0; i<dog_water;i++) {
					king[i].show();
				}
			}else if(num==3) {
				System.out.print("왕의 이름 >");
				king_name=sc.next();
				for (int j=0;j<dog_water;j++) {
					if(king[j].getName().equals(king_name)) {
						System.out.println("왕의 순서  = "+king[j].getSequence());
						break;
					}
				}
			}else if(num==4) {
				mn.menu();
			}
		}
		
		sc.close();
	}

}
