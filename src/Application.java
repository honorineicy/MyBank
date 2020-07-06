import javax.swing.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(123456789, 50.0, "Hono", "honorinicy@gmail.com", "543-563-2523");


        System.out.println("Choose one option:");
        System.out.println("1. Show balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit out");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int options = Integer.parseInt(s);

        switch (options) {
            case 1:
                System.out.println("Show Account balance : " + bankAccount.getBalance());
                break;
            case 2:
                bankAccount.depositFunds(1000);
                System.out.println("Your new balance after depositing money is: " + bankAccount.getBalance());
                break;
            case 3:
                bankAccount.withdrawFunds(200);
                System.out.println(bankAccount.getBalance());
                break;
            case 4:
                System.exit(0);

            default:
                System.out.println("Enter a valid option");


        }
    }
}

