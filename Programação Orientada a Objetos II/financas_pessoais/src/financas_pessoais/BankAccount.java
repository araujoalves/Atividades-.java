package financas_pessoais;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

    private double balance;
    private List<FinancialTransaction> transactions;

    public BankAccount() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(FinancialTransaction transaction) {
        this.transactions.add(transaction);
    }

    public double calculateBalance() {
        double currentBalance = this.balance;
        for (FinancialTransaction transaction : this.transactions) {
            currentBalance += transaction.getValue();
        }
        return currentBalance;
    }
}