import java.time.LocalDate;



class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(String data) throws IllegalArgumentException {
        String[] partes = data.split("/");
        if (partes.length != 3) {
            throw new IllegalArgumentException("Formato de data inválido. Use dd/mm/aaaa.");
        }
        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
            LocalDate hoje = LocalDate.now();
            int anoAtual = hoje.getYear();
            if (ano < 2023 || ano > anoAtual) {
                throw new IllegalArgumentException("Data inválida!");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato de data inválido. Use apenas números.");
        }
        if (!validar()) {
            throw new IllegalArgumentException("Data inválida!");
        }
    }

    public boolean validar() {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > diasNoMes()) {
            return false;
        }
        return true;
    }

    public int diasNoMes() {
        if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public LocalDate toLocalDate() {
        return LocalDate.of(ano, mes, dia);
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

}