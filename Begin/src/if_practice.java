
public class if_practice {

	public static void main(String[] args) {
		
		int num1 =10;
		int num2 = 20;
		 if (num1<num2) {
			 System.out.println("num1�� num2���� �۴�");
		 }
		 
		System.out.println();
		
		num1=20;
		num2=10;
		
		if (num1<num2) {
			System.out.println("num1�� num2 ���� �۴�");
		} else {
			System.out.println("num1�� num2���� ũ��");
		}
		System.out.println();
		
		num1=10;
		num2=20;
		
		
		if (num1<num1) {
			System.out.println("num1�� num2 ���� �۴�");
		}else if (num1>num2){
			System.out.println("num1�� num2���� ũ��");
		}else {
			System.out.println("���� ����");
		}
		
		if (true) {
			System.out.println("�ݵ�� ����Ǵ� ����");
		}
		
		if(false) {
			System.out.println("������� ����");
		}
		
		
		
		
	}

}
