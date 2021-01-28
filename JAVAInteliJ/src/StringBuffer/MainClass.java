package StringBuffer;

public class MainClass {
    public static void main(String[] args) {
        //String str = "java";
        String str = new String("java");
        System.out.println("str");
        str += "-8";

        //StringBuffer

        StringBuffer sb = new StringBuffer("JAVA");
        System.out.println("sb : "+sb);
        sb.append(" World");
        System.out.println("sb : "+sb);
        System.out.println("sb.length() : "+sb.length());
        sb.insert(sb.length(),"----");
        System.out.println("sb.insert(sb.length(),\"----\""+sb);
        sb.delete(4,8);
        System.out.println("sb.delete(4,8)"+sb);


        System.out.println();

        //StringBuilder
        StringBuilder sbil = new StringBuilder("Java World!!");
        System.out.println("sbil : "+sbil);





    }
}
