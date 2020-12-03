package ch14;
import java.util.*;
public class Quiz {
	int speed;

	
	public int speed_limit() {
		Random rand = new Random();
		int rand_num=rand.nextInt(4);
		int[] arr = {60,70,80,90};
		return arr[rand_num];
	}
	
	public int count(String src,String s) {
		int count=0;
		for(int j=0; j<src.length()-s.length()+1;j++) {
			if (src.substring(j,j+s.length()).equals(s)) {
				count+=1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz quiz = new Quiz();
		System.out.println("제한속도 = "+ quiz.speed_limit()+"km");
		
		
		String source = "The old man and the sea";
		System.out.println(quiz.count(source,"he"));
		
	}
	
}
