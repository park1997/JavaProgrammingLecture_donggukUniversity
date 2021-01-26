package Extend;

public class SecondChildClass extends ParentClass{
    public SecondChildClass() {
        System.out.println("SecondChildClass Constructor");
    }

    @Override
    public void makeJJAjang() {
        System.out.println("SecondChildClass make JJajang "+super.openyear);
    }

}
