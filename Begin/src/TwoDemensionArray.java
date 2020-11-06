import java.lang.reflect.Array; //2차원배열 쓸라면 이거 import 해야 하는것 같다.
import java.util.Arrays;

public class TwoDemensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arrMul = new int[3][2];
		arrMul[0][0]=10;
		arrMul[0][1]=100;
		
		arrMul[1][0]=20;
		arrMul[1][1]=200;
		arrMul[2][0]=3000;
		arrMul[2][1]=300;
		
		System.out.println("arrMUl[0] : "+Arrays.toString(arrMul[0]));
		System.out.println("arrMUl[1] : "+Arrays.toString(arrMul[1]));
		System.out.println("arrMUl[2] : "+Arrays.toString(arrMul[2]));
		
		
	}

}
