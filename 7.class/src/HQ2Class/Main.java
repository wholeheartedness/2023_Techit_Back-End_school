package HQ2Class;

public class Main {
    public static void main(String[] args) {
        BankAccount 계좌1 = new BankAccount("12345678", "0001", 10000);
        계좌1.deposit(10000);
        계좌1.deposit(10000);
        계좌1.withdraw(5000, "0001");
        계좌1.accountInfo();

        BankAccount 계좌2 = new BankAccount("12345678", "0001", 10000);
        계좌2.deposit(10000);
        계좌2.deposit(1000);
        계좌2.withdraw(5000, "0001");
        계좌2.accountInfo();

        계좌2.allAccounInfo();

    }
}
