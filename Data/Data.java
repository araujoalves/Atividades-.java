public class Data {
    public class Data {
        private int dia;
        private int mes;
        private int ano;

        public Data(int dia, int mes, int ano) throws Exception {
            if (validaData(dia, mes, ano)) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            } else {
                throw new Exception("Data inválida!");
            }
        }

        private boolean validaData(int dia, int mes, int ano) {
            if (ano < 0) {
                return false;
            }
            if (mes < 1 || mes > 12) {
                return false;
            }
            int ultimoDia = 31;
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                ultimoDia = 30;
            } else if (mes == 2) {
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    ultimoDia = 29;
                } else {
                    ultimoDia = 28;
                }
            }
            if (dia < 1 || dia > ultimoDia) {
                return false;
            }
            return true;
        }

        public int getDia() {
            return dia;
        }

        public int getMes() {
            return mes;
        }

        public int getAno() {
            return ano;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public String toString() {
            return dia + "/" + mes + "/" + ano;
        }
    }

}
