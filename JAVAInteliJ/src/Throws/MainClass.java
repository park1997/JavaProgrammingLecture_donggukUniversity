package Throws;

public class MainClass {
    public static void main(String[] args) {
        //예외를 잡고 나를 호출한곳으로 계속 Throws 한다.
        
        MainClass mainclass = new MainClass();
        try{
            mainclass.firstMethod();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void firstMethod() throws Exception{
        secondMethod();
    }
    public void secondMethod() throws Exception{
        thirdMethod();
    }
    public void thirdMethod() throws Exception{
        System.out.println("10 / 0 : "+(10/0));
    }
}
