package ���;

public class Ŭ�����޼ҵ�Ȱ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a+" �� ���̴� "+a.length()); //���ڿ��� ����
		System.out.println(a.contains("#")); //���ڿ��� ���԰���
		
		a=a.concat(b);//���ڿ� ����
		System.out.println(a);
		
		a=a.trim();	//��������
		System.out.println(a); 
		
		a=a.replace("C#","Java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for(int i=0;i<s.length;i++) {
			System.out.println("�и��� ���ڿ� "+i+" : "+s[i]);
		}
		
		a=a.substring(5);	// 5���� ������ ����
		System.out.println(a);
		
		char c = a.charAt(1);
		System.out.println(c);
	}

}
