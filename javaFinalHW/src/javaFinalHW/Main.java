package javaFinalHW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartTimeJob worker1 = new PartTimeJob("byunghyun", 2016112568);
		MoneyCalculate cal = new MoneyCalculate();
		worker1.getInfo();	//�Ƹ�����Ʈ�� ���� ���
		System.out.println();
		
		worker1.workingTime(1,75);	//�˹ٻ��� ���� �ð��� (�ð�,��) �� �������� �Է��Ѵ�. ���� 1�ð� 75���� �Է����� ��� 2�ð� 15������ �����Ѵ�.
		worker1.getInfo();	//�Ƹ�����Ʈ���� ���� �ð��� �Է��Ѵ�.
		System.out.println();
		
		worker1.workingTime(1, 45);
		// 3�ð� 60 ���� �ƴ� 4�ð� 0���� ���´�.
		worker1.getInfo();
		System.out.println();
		
		//setter�� ���� private���� �ٲ� �� �ִ�.
		//���� �� �ð�, ��, �Ƹ�����Ʈ�� ������ ��� private�� getter �� setter �� �����ؾ߸� ���������� �����ϴ�.
		worker1.setName("Park Byunghyun");
		worker1.getInfo();
		System.out.println();
		
		//���� �ñ��� �Է��Ѵ�.
		cal.setHourlyWage(8000);
		System.out.println();
		
		//���� �ñ��� ���� ������ �׸��� ������ �ñ����� Ȯ���Ѵ�
		cal.getInfo();
		System.out.println();
		
		//�����ñ޺��� ���� ������ �ñ��� �Է��Ѵ�.
		cal.setHourlyWage(8560);
		cal.getInfo();
		System.out.println();
		
		//�Էµ� �ñ����� ���� ���� �޾ƾ� �ϴ� ���� ����Ѵ�.
		worker1.calWage(cal);
		System.out.println();
		
		//1000�� �� ������ ��� 
		worker1.workingTime(0, 1000);
		worker1.getInfo();
		System.out.println();
		
		//1000�� �� ��������� ���� �޾ƾ� �ϴ� ��
		worker1.calWage(cal);
		
		
		
		
		
	}

}
