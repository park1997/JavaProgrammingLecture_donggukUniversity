package privateEx;

public class Student {
	private String name;
	private int score;
	
	public Student(String n,int s) {
		this.name=n;
		this.score=s;
	}
	public void getInfo() {
		System.out.println(" -- getInfo() -- ");
		System.out.println("name : "+name);
		System.out.println("score : "+score);
		
	}
	//속성의 data를 리턴
	public String getName() {
		return name;
	}
	//data를 set함  set을지우면 이름은 영구적으로 변하지 않음
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score>50) {
			this.score=score;
		}
	//최저ㅣ임금보다 적게 임금 못주게 그런 안전장치를 할 수있음
	//개터세터  필요한 경우에 필요한 만큼만 만들어서 사용하면됨.
		
	}
	
}
