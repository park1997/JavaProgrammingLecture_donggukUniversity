package Interface;

public class InterfaceClass implements InterfaceA,InterfaceB{
    public InterfaceClass() {
        System.out.println("InterfaceClass Constructor");
    }

    @Override
    public void funA() {
        System.out.println(" funA() ");
    }

    @Override
    public void funB() {
        System.out.println(" funB() ");
    }
    //인터페이스는 다형성을 제공함
    //인터페이스는 작업명세서만 있는 껍데기임
    //상속은 쉼표로 여러개 상속할수 없지만 인터페이스는 쉼표를 구분으로 여러개를 implements 받을 수 있다
    //인터페이스를 사용하는 이유는 1금융권 2금융권 사채와 같이 각은행권마다 이자율이 다른데 이를 한꺼번에 관리 하면 너무 복잡하고 관리도 힘듬
    // 그래서 인터페이스를 이용하여 유지 보수도 조금더 원활하게 할 수 있게끔 만든다!

}
