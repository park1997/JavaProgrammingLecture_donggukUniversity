package AnonymousClass;

public class main {

	public static void main(String[] args) {
		
		//�͸�(anonymous class) Ŭ���� �ѹ������� ��������
		//�̸��� ���� Ŭ������ �ַ� �޼ҵ带 ������ �ϴ� �������� ���ȴ�.
		new AnonymousClass() {
			@Override
			public void method() {
				System.out.println(" -- AnonymousClass's Override method START -- ");
			}
		}.method();
		
		
	}

}
