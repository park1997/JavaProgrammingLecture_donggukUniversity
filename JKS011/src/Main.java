import java.util.*;
public class Main {

	public static void main(String[] args) {
		//2015112579������
		System.out.println("�ѤѤѹ���1-1�ѤѤѤ�");
		Laundry boy = new Laundry("�Ƶ�",4);
		boy.show();
		Laundry girl = new Laundry("��",6);
		girl.show();
		
		System.out.println("�ѤѤѹ���1-2�ѤѤѤ� and�ѤѤѹ���1-3�ѤѤѤ�");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("20����� �Է°���,0: �״�����, 1:�������� ���>>");
		int n=sc.nextInt();
		int menu = sc.nextInt();
		Laundry laundry[] = new Laundry[20];
		
		for(int i=0;i<n;i++) {
			String name= sc.next();
			int weight = sc.nextInt();
			laundry[i]=new Laundry(name,weight);
		}
		
		if(menu==0) {
		for(int i=0;i<n;i++) {
			System.out.println(laundry[i].getName()+" "+laundry[i].getWeight());
		}
		}else if(menu==1) {
		 for(int i=n-1;i>=0;i--) {
			 System.out.println(laundry[i].getName()+" "+laundry[i].getWeight());
		 }
		}
		
		
		
		
		
	
		
	}

}
