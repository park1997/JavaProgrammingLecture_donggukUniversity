package pbh;
import java.util.*;
public class midterm_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("=== menu ===");
	    System.out.println("0. exit");
	    System.out.println("1. menu");
	    System.out.println("2. deposit");
	    System.out.println("3. withdrawal");
	    System.out.println("4. show\n");
	    System.out.print("�޴� ���� > ");
	      
	    int a = 0;
	    int b = 0;
	      
	    while(true) {
	       int n = sc.nextInt();   
	       switch(n) {
	          case 0:
	             System.out.println("�����մϴ�.");
	             System.exit(0);
	             break;
	          case 1:
	             System.out.println("=== menu ===");
	             System.out.println("0. exit");
	             System.out.println("1. menu");
	             System.out.println("2. deposit");
	             System.out.println("3. withdrawal");
	             System.out.println("4. show\n");
	             System.out.print("�޴� ���� > ");
	             break;
	          case 2:
	             System.out.print("�Ա�(��) > ");
	             b=sc.nextInt();
	             a=a+b;
	             System.out.println();
	             System.out.print("�޴� ���� > ");
	             break;
	          case 3:
	             System.out.print("���(��) > ");
	             b=sc.nextInt();
	             a=a-b;
	             System.out.println();
	             System.out.print("�޴� ���� > ");
	             break;
	          case 4:
	             System.out.print("�ܾ�: "+a+"��\n");
	             System.out.print("�޴� ���� > ");
	             break;
	       	}
	   }
	    	
	}

}
