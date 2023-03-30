package financas_pessoais;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        FinancialTransaction deposit = new Deposit(1000, new Date(), "Depósito inicial");
        account.addTransaction(deposit);

        FinancialTransaction withdrawal = new Withdrawal(500, new Date(), "Saque");
        account.addTransaction(withdrawal);

        FinancialTransaction transfer = new Transfer(200, new Date(), "Transferência");
        account.addTransaction(transfer);

        double balance = account.calculateBalance();
        System.out.println("Saldo atual: " + balance);
    }
}