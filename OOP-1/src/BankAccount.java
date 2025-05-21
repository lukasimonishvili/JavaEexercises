public class BankAccount {
    private double balance;
    private String holder;

    public BankAccount(double balance, String holder) {
        this.balance = balance;
        this.holder = holder;
    }

    public String getHolder() {
        return  this.holder;
    }

    public void depositMoney(double deposit) {
        this.balance += deposit;
        System.out.println(deposit + "$" + " deposited successfully");
        checkBalance();
    }

    public void withdrawMoney(double withdraw){
        if(withdraw > balance) {
            System.err.println("Not enough deposit in account");
        }else {
            this.balance -= withdraw;
            System.out.println("withdraw successfully");
            checkBalance();
        }
    }

    public void checkBalance() {
        System.out.println("Balance left on account " + this.balance + "$");
    }
}
