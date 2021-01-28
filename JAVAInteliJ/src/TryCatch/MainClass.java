package TryCatch;

public class MainClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int r = 0;
        System.out.println("Exception Before");

        try{
            r = i / j;
        }catch (Exception e){
            //어떠한 예외가 발생했는지 보여줌
            e.printStackTrace();
            //예외를 간략하게 보여줌
            String msg = e.getMessage();
            System.out.println("msg : " + msg);

        }finally {
            System.out.println("finally Start");
        }
        System.out.println("Exception After");
    }
}
