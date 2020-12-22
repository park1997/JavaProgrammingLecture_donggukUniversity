package finalterm;
public class Example {
	private int cnt=0;
	
	public int count(String src, char c) {
		for(int i=0; i<src.length();i++) {
			if(src.substring(i, i+1).equals(c)) {
				cnt+=1;
			}
		}
		return cnt;
	}
	
	public static void capital(char c) {
		int ch=(int)c;
		if(97<=ch && ch<=122) {
			System.out.println((char)(ch-32));
		}
		
	}
	
	
	
	
}
