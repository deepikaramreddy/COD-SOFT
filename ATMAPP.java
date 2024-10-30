import java.util.Scanner;
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:$" +amount);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw:$" +amount);
        }else{
            System.out.println("Invalid or insufficient balance for withdrawal.");

        }
    }
}
class ATM{
    private BankAccount account;
    public ATM(BankAccount account){
        this.account=account;
    }
    public void showMenu(){
        Scanner scanner=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nATM Menu:");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Choose an option: ");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                   checkBalance();
                   break;
                case 2:
                   System.out.print("Enter deposit amount: ");
                   double depositAmount = scanner.nextDouble();
                   deposit(depositAmount);
                   break;
                case 3:
                   System.out.print("Enter withdrawal amount: ");
                   double withdrawAmount=scanner.nextDouble();
                   withdraw(withdrawAmount);
                   break;
                case 4:
                   System.out.println("Exiting ATM. Thank you!");
                   break;
                default:
                   System.out.println("Invalid choice.Try again");
            }
        }while(choice!=4);
        scanner.close();
    }
    private void checkBalance(){
        System.out.println("Current balance:$" + account.getBalance());
    }
    private void deposit(double amount){
        account.deposit(amount);
    }
    private void withdraw(double amount){
        account.withdraw(amount);
        }
    }
        public class ATMAPP{
            public static void main(String[] args){
                BankAccount userAccount=new BankAccount(500);
                ATM atm =new ATM(userAccount);
                atm.showMenu();
            }
        }