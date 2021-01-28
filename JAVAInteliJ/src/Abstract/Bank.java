package Abstract;

public abstract class Bank {
    String name;
    String account;
    int totalAmount;

    public Bank() {
        System.out.println("Bank constructor ");
    }

    public Bank(String name, String account, int totalAmount) {
        this.name = name;
        this.account = account;
        this.totalAmount = totalAmount;
    }

    //예금
    public void deposit(){
        System.out.println("deposit Start");

    }
    //출금
    public void withdraw(){
        System.out.println("withdraw Start");

    }

    public abstract void installmentSavings();

    public abstract void cancellation();

    public void getInfo(){
        System.out.printf("name : %s\n", name);
        System.out.printf("account : %s\n",account);
        System.out.printf("totalAmount : %d\n",totalAmount);

    }
}
