package javaFinalHW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartTimeJob worker1 = new PartTimeJob("byunghyun", 2016112568);
		MoneyCalculate cal = new MoneyCalculate();
		
		System.out.println("1. ");
		worker1.getInfo();	//�Ƹ�����Ʈ�� ���� ���
		System.out.println();
		
		System.out.println("2. ");
		worker1.workingTime(1,75);	//�˹ٻ��� ���� �ð��� (�ð�,��) �� �������� �Է��Ѵ�. ���� 1�ð� 75���� �Է����� ��� 2�ð� 15������ �����Ѵ�.
		worker1.getInfo();	//�Ƹ�����Ʈ�� ���� ���
		System.out.println();
		
		// 3�ð� 60 ���� �ƴ� 4�ð� 0���� ���´�.
		System.out.println("3. ");
		worker1.workingTime(1, 45);
		worker1.getInfo();
		System.out.println();
		
		//setter�� ���� private���� �ٲ� �� �ִ�.
		//�˹ٻ� ����, ���� �� �ð� , �ñ� �� private�� getter �� setter �� �����ؾ߸� ���������� �����ϴ�.
		System.out.println("4. ");
		worker1.setName("Park Byunghyun");
		worker1.getInfo();
		System.out.println();
		
		//���� �ñ��� �Է��Ѵ�.
		System.out.println("6. ");
		worker1.setHourly_wage(8000);
		worker1.getInfo();
		System.out.println();
		

		//�����ñ޺��� ���������� ������ ����Ҷ� �����ñ޺��� �ñ��� ������ ������� ���� �ʰ� ��� ����Ѵ�.
		System.out.println("7. ");
		cal.calWage(worker1);
		System.out.println();
		

		//���� �ñ��� ���� ������ �׸��� ������ �ñ����� Ȯ���Ѵ�
		System.out.println("8. ");
		cal.checkWage(worker1);
		System.out.println();
		

		//�����ñ޺��� ���� ������ �ñ��� �Է��Ѵ�.
		System.out.println("9. ");
		worker1.setHourly_wage(8560);
		worker1.getInfo();
		System.out.println();
		
		//�Էµ� �ñ����� ���� ���� �޾ƾ� �ϴ� ���� ����Ѵ�.
		System.out.println("10. ");
		cal.calWage(worker1);
		System.out.println();
		
		//1000�� �� ������ ��� 
		System.out.println("11. ");
		worker1.workingTime(0, 1000);
		worker1.getInfo();
		System.out.println();
		
		//1000�� �� ��������� ���� �޾ƾ� �ϴ� ��
		System.out.println("12. ");
		cal.calWage(worker1);
		
		
		
	}

}
