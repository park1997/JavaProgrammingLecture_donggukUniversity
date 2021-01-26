package Extend;

public class FirstChildClass extends ParentClass{
    public FirstChildClass() {
        System.out.println("FirstChildClass Constructor");
    }

    @Override
    public void makeJJAjang() {
        System.out.println("FirstChildClass make JJajang "+super.openyear);
    }
}
