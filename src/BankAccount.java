//1. Create a new class for a bank account
//2. Create fields for the following:
//account number = 123456789
//balance = 50.0
//customer name = your name
//email = your email address
//phone number = your phone number
//3.Create three methods in the class:
//To allow the customer to deposit funds (this should increment the balance field).
//To allow the customer to withdraw funds. This should deduct from the balance field, but not allow the withdrawal to
//complete if there are insufficient
//funds and print the balance with name of customer
//4.Create another method to print Customer Name, Account Number, Balance, Email and Phone Number
//5.Create another class with main method for entry point of your program
//Give user options to Show Account Balance, Deposit Money, Withdraw Money and Exit out of program
//Add some System.out.println's in all methods above as well.

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName, String emailAddress, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public double depositFunds(double amount) {
        balance = amount + balance;
        return balance;

    }

    public void withdrawFunds(double amount) {
        if (amount < balance) {
            balance = balance - amount;
            System.out.println("Your new balance after withdrawing money is: ");
        } else {
            System.out.println( "Your withdrawal denied due to insufficient funds; " + customerName + "'s balance is: ");
        }

    }
}
