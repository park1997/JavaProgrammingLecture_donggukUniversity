package inheritancePractice;

class Car{
	private int fuel;
	Car(){}
	Car(int f){
		System.out.println("나는 차");
		fuel=f;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	void show() {
		System.out.println("연료 : "+fuel+"L");
	}
}
//상속
class Truck extends Car{
	//부모에 없는 특화된 기능을 넣어서 사용 할 수 있음 
	private int load;
	Truck(){}
	Truck(int f, int l){
		super(f);
		System.out.println("나는 트럭");
		load=1;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	
	void show_load() {	//부모와 prototype이 똑같음 그럴땐 부모껄 무시하고 자식거만 실행됨
		System.out.println("짐 : "+load+"kg");
	}
	
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sonata = new Car();
		sonata.setFuel(50);
		sonata.show();
		System.out.println();
		
		//자동차의 기능을 그대로 물려받아 내가 마치 자동차인것처럼 기능을 그대로 쓸 수 있음
		Truck titan = new Truck();
		titan.setFuel(30);
		titan.setLoad(80);
		titan.show();	
		titan.show_load();
		//수업듣고 여기 밑부분 추가하자
		
	}

}
