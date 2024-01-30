package internship_tasks;
import java.util.Scanner;

class bankAccount{
    private double balance;

    public bankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit Successful!!..  New Balance: " + balance);
        }
        else{
            System.out.println("Invalid amount for deposit. ");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal Successful!!..  New Balance: " + balance);
        }
        else{
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

}

class atm {
    private bankAccount account;
    private Scanner sc;

    public atm(bankAccount account){
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("1: Check Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");
    }

    public void execute(){
        int choice;
        do{
            menu();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM service!!");
                    break;
                default:
                    System.out.println("Invalid choice!!..  Please! select the valid option.");
            }
        }
        while (choice != 4);
    }
    private void checkBalance(){
        System.out.println("Your current balance is: " + account.getBalance());
    }

    private void deposit(){
        System.out.println("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}
public class task3_atmInterface {
    public static void main(String[] args){
        System.out.println("Welcome to the ATM service!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your four digit Secrete pin: ");
        int secretePin = sc.nextInt();

        bankAccount account = new bankAccount(5000.0);
        atm atm = new atm(account);
        atm.execute();
    }
}
