package financas_pessoais;

import java.util.Date;

public interface FinancialTransaction {
    double getValue();
    Date getDate();
    String getDescription();
}
