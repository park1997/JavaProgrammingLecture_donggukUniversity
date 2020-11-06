
public class Test {
	int[] speed = {60,70,100};
	
	public int speed_limit() {
		int index = (int)(Math.random()*3);
		return speed[index];
	}
	
	public void search(String s) {
		int max=0;
		int cnt=0;
		for(int i = 0; i<s.length();i++) {
			for(int j = 0; j<s.length();i++) {
				if(s.charAt(i)==s.charAt(j)) {
					cnt++;
				}
			}
			if(cnt > max) {
				max = cnt;
			}
		}
		System.out.println("°³¼ö: "+max);
	}
}
