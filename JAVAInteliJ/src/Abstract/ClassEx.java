package Abstract;

public class ClassEx extends AbstractClassEX{

    public ClassEx() {
        System.out.println("ClassEx constructor");
    }

    public ClassEx(int num, String str) {
        super(num, str);    //  상속을 해주고있는 것들
    }

    @Override
    public void fun2() {
        System.out.println(" fun2() START ");
    }
}
