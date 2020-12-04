package 단어개수세기;

import java.util.Scanner;

public class cnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 입력 >");
		String str= sc.next();
		System.out.print("찾을 단어 >");
		String str1 = sc.next();
		int cnt=0;
		for(int i=0;i<str.length()-str1.length()+1;i++) {
			if(str.substring(i,i+str1.length()).equals(str1)) {
				cnt+=1;
			}
		}
		System.out.println(str1+"은 총 "+cnt+"개 있습니다.");
	}

}
