package midterm;

public class midterm_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,25,15,90,80,5,40,70,85,35};
		int max=0;
		int second_max = 0;
		System.out.println("배열의 저장된 값은 아래와 같습니다");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int j=0;j<arr.length;j++) {
			if (max<arr[j]) {
				max=arr[j];
			}
		}
		System.out.println("최대값은 "+max);
		for(int k = 0;k<arr.length;k++) {
			if (second_max<arr[k] && arr[k]!=max) {
				second_max=arr[k];
			}
		}
		System.out.println("두번째 최대값은 "+second_max);
		
		
	}

}
