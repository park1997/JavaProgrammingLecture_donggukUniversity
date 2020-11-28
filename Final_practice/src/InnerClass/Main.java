package InnerClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		System.out.println("oc.num : "+oc.num);
		System.out.println("oc.str1 : "+oc.str1);
		
		System.out.println();
		
		//¸É¹ö inner class
		OuterClass.InnerClass in = oc.new InnerClass();
		System.out.println("in.num : "+in.num);
		System.out.println("in.str2 : "+in.str2);
		
		System.out.println();
		
		//static inner Å¬·¡½º
		OuterClass.SInnerClass si = new OuterClass.SInnerClass();
		System.out.println("si.num : "+si.num);
		System.out.println("si.str3 : "+si.str3);
		
		System.out.println();
		
	}

}
