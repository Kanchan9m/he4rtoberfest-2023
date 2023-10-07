import java.util.Scanner;

public class ATM_interface{
    private static double balance = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("***** WELCOME TO ATM *****");
        while(true){
            
            System.out.println("ATM MENU");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");1
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                checkbalance();
                break;

                case 2:
                System.out.println("amount to be withdrawn");
                double withdrawn = sc.nextDouble();
                withdraw(withdrawn);
                break;
                    

                case 3:
                System.out.print("Enter amount to be deposit: ");
                    double deposited = sc.nextDouble();
                    deposit(deposited);
                    break;

                case 4:
                    System.out.println("Exit");
                    System.exit(0); 
                    break;
                default:
                System.out.println("Invalid choice");
            }
        }
    }
    public static void checkbalance(){
        System.out.println("Balance: "+balance);
    }
    public static void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("remaining amount: "+ balance);
        }
        System.out.println("Insufficient balance");
    }
    public static void deposit(double amount){
        balance += amount;
        System.out.println("Total amount: "+ balance);
        System.out.println(balance);
    }
}
