package 저번기말;
import java.util.*;
public class BowlStorage {
	private String bowl;
	private int cnt;
	private int height;
	public BowlStorage(String s) {
		// TODO Auto-generated constructor stub
		this.bowl=s;

	}
	
	public void show() {
		System.out.println(bowl);
	}
	
	public void key_in() {
		Scanner sc= new Scanner(System.in);
		this.cnt=0;
		this.bowl=sc.next();
	}
	
	
	public int no_bowls() {
		for(int i =0;i<bowl.length();i++) {
			if(bowl.substring(i, i+1).equals("(")) {
				this.cnt+=1;
			}
			if(bowl.substring(i,i+1).equals(")")) {
				this.cnt+=1;
			}
		}
		return cnt;
	}
	
	
	
	public int total() {
		int height=10;
		for(int i=0;i<this.bowl.length()-1;i++) {
			if(this.bowl.substring(i,i+1).equals(this.bowl.substring(i+1,i+2))) {
				height+=5;
			}else {
				height+=10;
			}
		}
		return height;		
	}
	
}
