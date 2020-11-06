/*2017112526 �����*/
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> ar = new ArrayList<>(30);
		for(int i=0;i<30;i++) {
			ar.add((int)(Math.random()*89)+10);
		}
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i)+" ");
		}
		System.out.println();
		
		try {
			FileOutputStream fout = new FileOutputStream("\\Desktop:2017112526 �����test.out");
			for(int i=0;i<ar.size();i++) {
				fout.write(ar.get(i));
			} fout.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("\\Desktop:2017112526 �����test.out ��θ��� Ȯ���� �ּ���.");
			
			return;
		}
		System.out.println("\\Desktop:2017112526 �����test.out"+"�� �����Ͽ����ϴ�.");
		/* �� ���� �����Ű��ƿ�............����...........*/
		
	}



}
