public class Account {
    private int accNumber;
    private String accHolderName;
    private int balance;

    // constructor to get details
    public Account(int accNumber, String accHolderName, int balance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    // prints details method
    public void showDetails() {
        System.out.println("Account Number = " + accNumber);
        System.out.println("Account Holder Name = " + accHolderName);
        System.out.println("Account Balance = " + balance);
    }

    // method for deposit
    public void deposit(int amount) {
        this.balance = balance + amount;
    }

    // method for withdrawal
    public void withdraw(int amount) {
        if (this.balance > amount) {
            this.balance = balance - amount;
        } else {
            System.out.println("No Sufficient Amount of Money for Withdrawal");
        }
    }

    public static void main(String[] args) {

        // creation of an object called Dasuni
        Account Dasuni = new Account(20020309, "Dasuni Gamage", 5000);
        Dasuni.showDetails();

        System.out.println();
        System.out.println("----Withdrawal----");
        Dasuni.withdraw(1000);
        Dasuni.showDetails();

        System.out.println();
        System.out.println("----Deposit----");
        Dasuni.deposit(1000);
        Dasuni.showDetails();

        System.out.println();
        System.out.println("----Withdrawal----");
        Dasuni.withdraw(6000);
        Dasuni.showDetails();
    }
}
