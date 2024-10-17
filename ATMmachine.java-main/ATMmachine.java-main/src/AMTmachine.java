import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = xxxx;

    public void checkpin(){
        Scanner scanner  =new Scanner(System.in);
        System.out.print("Enter your PIN : ");
        int atmpin = scanner.nextInt();
        if (atmpin == PIN){
            menu();
        }else {
            System.out.println("Entered PIN is incorrect Please enter valid PIN : ");
            menu();
        }
    }
    public void menu(){
        System.out.println("************ Welcome to ATM Service ********");
        System.out.println("Select your options :");
        System.out.println("1. Check A/C Balance :");
        System.out.println("2. Withdraw Money :");
        System.out.println("3. Deposit Money :");
        System.out.println("4. Exit :");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your preference : ");
        int option = scanner.nextInt();

        if (option == 1){
            checkBalance();
        } else if (option == 2) {
            withDrawMoney();
        } else if (option == 3) {
            depositeMoney();
        } else if (option == 4) {
            return;
        }else {
            System.out.println("!! You have Entered incorrect option !!");
        }
    }
    public void checkBalance(){
        System.out.println("Balance : " + Balance );
        menu();
    }
    public void withDrawMoney(){
        System.out.println("Enter with draw amount : ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance ");
        }else {
            Balance = Balance - amount;
            System.out.println(" Money Withdraw Successfully ");
        }
        menu();

    }
    public void depositeMoney(){
        System.out.print("Enter amount : ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();

    }
}

public class AMTmachine {
    public static void main(String[] args){

        ATM atm1 = new ATM();
        atm1.checkpin();

    }
}
