package FinalExam;
import java.util.*;
public class Test {
	int[] speed = {60,70,100};
	
	public int speedLimit() {
		Random rand = new Random();
		int index=rand.nextInt(3);
		return speed[index];
	}
	public void search(String s) {
		int max=0;
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					cnt+=1;
				}	
			}
			if(cnt>max) {
				max=cnt;
			}
		}
		System.out.println("°³¼ö : "+max);
	}
	
	
}
