package Extend;

public class Main {
    public static void main(String[] args) {
        ParentClass child[] = new ParentClass[2] ;
        child[0]= new FirstChildClass();
        child[1] = new SecondChildClass();

        for (int i = 0; i < 2; i++) {
            child[i].makeJJAjang();
        }


    }
}
