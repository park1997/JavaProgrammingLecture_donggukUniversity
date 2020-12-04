package 대비;

public class 클래스메소드활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a+" 의 길이는 "+a.length()); //문자열의 길이
		System.out.println(a.contains("#")); //문자열이 포함관계
		
		a=a.concat(b);//문자열 연결
		System.out.println(a);
		
		a=a.trim();	//공백제거
		System.out.println(a); 
		
		a=a.replace("C#","Java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for(int i=0;i<s.length;i++) {
			System.out.println("분리된 문자열 "+i+" : "+s[i]);
		}
		
		a=a.substring(5);	// 5부터 끝까지 리턴
		System.out.println(a);
		
		char c = a.charAt(1);
		System.out.println(c);
	}

}
