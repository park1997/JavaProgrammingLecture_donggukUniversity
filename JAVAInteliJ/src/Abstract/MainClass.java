package Abstract;

public class MainClass {

    public static void main(String[] args) {
        Bank mybank = new MyBank("박찬호", "123-4567-80912",10000);

        mybank.deposit();
        mybank.withdraw();
        mybank.installmentSavings();
        mybank.cancellation();

        System.out.println();

        mybank.getInfo();

    }
}
