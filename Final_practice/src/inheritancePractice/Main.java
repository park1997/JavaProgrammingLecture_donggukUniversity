package inheritancePractice;

class Car{
	private int fuel;
	Car(){}
	Car(int f){
		System.out.println("���� ��");
		fuel=f;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	void show() {
		System.out.println("���� : "+fuel+"L");
	}
}
//���
class Truck extends Car{
	//�θ� ���� Ưȭ�� ����� �־ ��� �� �� ���� 
	private int load;
	Truck(){}
	Truck(int f, int l){
		super(f);
		System.out.println("���� Ʈ��");
		load=1;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	
	void show_load() {	//�θ�� prototype�� �Ȱ��� �׷��� �θ� �����ϰ� �ڽİŸ� �����
		System.out.println("�� : "+load+"kg");
	}
	
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sonata = new Car();
		sonata.setFuel(50);
		sonata.show();
		System.out.println();
		
		//�ڵ����� ����� �״�� �����޾� ���� ��ġ �ڵ����ΰ�ó�� ����� �״�� �� �� ����
		Truck titan = new Truck();
		titan.setFuel(30);
		titan.setLoad(80);
		titan.show();	
		titan.show_load();
		//������� ���� �غκ� �߰�����
		
	}

}
