package pbh;
public class midterm_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String myname = "byunghyun";
        
        char[] array = new char[1024];
        
        for(int i=0 ; i < myname.length() ; i++) {
           array[i] = myname.charAt(i);
           System.out.print(array[i]);
        }
	}

}
