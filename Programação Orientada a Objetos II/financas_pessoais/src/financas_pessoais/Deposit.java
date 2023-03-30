package financas_pessoais;

import java.util.Date;

public class Deposit implements FinancialTransaction {
    private double value;
    private Date date;
    private String description;

    public Deposit(double value, Date date, String description) {
        this.value = value;
        this.date = date;
        this.description = description;
    }

    public double getValue() {
        return this.value;
    }

    public Date getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }
}