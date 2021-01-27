package Abstract;

public abstract class AbstractClassEX {
    int num;
    String str;

    public AbstractClassEX() {
        System.out.println("AbstractClass constructor");
    }

    public AbstractClassEX(int num, String str) {
        System.out.println("AbstractClass Constructor");
        this.num = num;
        this.str = str;
    }

    public void fun1() {
        System.out.println(" fun1() START ");
    }

    public abstract void fun2();    // 이렇게 선언만 되어있고 정의는 되어있지 않음 ! 이것의 구현은 abstract를 상속한 메소드에서 구현을 한다!

}
