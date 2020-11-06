import java.util.Arrays;

public class array_practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr1 = {10,20,30,40,50,60};
		int[] arr2 =null;
		int[] arr3=null;
		
		System.out.println("arr1 의 길이 : "+arr1.length);
		System.out.println("배열의 요소 : "+Arrays.toString(arr1));
		Arrays.toString(arr1);
		//배열요소복사
		arr3=Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr3 : "+arr3);
		System.out.println();
		
		arr2=arr1;
		System.out.printf("arr1 "+arr1+"\n");
		System.out.printf("arr2 "+arr2+"\n");
		System.out.printf("arr3 "+arr3+"\n"); //값은 같지만 주소값이 다르다 
		
		System.out.println();
		
		System.out.printf("arr1 "+Arrays.toString(arr1)+"\n");
		System.out.printf("arr2 "+Arrays.toString(arr2)+"\n");
		System.out.printf("arr3 "+Arrays.toString(arr3)+"\n");
		
		
		
		
	}

}
