package ���;
import java.util.*;
public class �����Լ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����� ��ȣ 9 �� ���");
		for(int i=0; i<9;i++) {
			System.out.print((int)(Math.random()*45)+1+" ");
		}
		System.out.println();
		
		//���� �ϳ� �����̱�
		
		Random rd = new Random();
		int a=rd.nextInt(5);
		System.out.println(a);
		
		
	}

}
