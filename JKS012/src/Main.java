import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		//2015112579정구섭
		System.out.println("ㅡㅡㅡ2-1ㅡㅡㅡㅡ");
		ArrayList<Integer> a = new ArrayList<>(30);
		
		for(int i =0;i<30;i++) {
			a.add((int)(Math.random()*90+10));
		}
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		
		
		System.out.println();
		System.out.println("ㅡㅡㅡ2-2ㅡㅡㅡㅡ");
	
		try {
			FileOutputStream fout = new FileOutputStream("rand.out");
			for(int i=0;i<a.size();i++) {
				fout.write(a.get(i));
			}
			System.out.println("입력완료");
			
		}catch(IOException e) {
			System.out.println("입출력오류");
		}
		/*실험
		try {
			FileInputStream fin = new FileInputStream("rand.out");
			byte b[] = new byte[30];
			int count=0,c;
			while((c=fin.read())!=-1) {
				b[count]=(byte)c;
				count++;
			}
			
			for(int i =0;i<30;i++) {
				System.out.print(b[i]+" ");
			}
			
			
		}catch(IOException e) {
			System.out.println("입출력오류");
		}
		
		System.out.println();
		*/
		System.out.println("ㅡㅡㅡ2-3ㅡㅡㅡㅡ");
		Collections.sort(a);
		for(int i=0; i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		
	}

}
