import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		//2015112579������
		System.out.println("�ѤѤ�2-1�ѤѤѤ�");
		ArrayList<Integer> a = new ArrayList<>(30);
		
		for(int i =0;i<30;i++) {
			a.add((int)(Math.random()*90+10));
		}
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		
		
		System.out.println();
		System.out.println("�ѤѤ�2-2�ѤѤѤ�");
	
		try {
			FileOutputStream fout = new FileOutputStream("rand.out");
			for(int i=0;i<a.size();i++) {
				fout.write(a.get(i));
			}
			System.out.println("�Է¿Ϸ�");
			
		}catch(IOException e) {
			System.out.println("����¿���");
		}
		/*����
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
			System.out.println("����¿���");
		}
		
		System.out.println();
		*/
		System.out.println("�ѤѤ�2-3�ѤѤѤ�");
		Collections.sort(a);
		for(int i=0; i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		
	}

}
