public class Elevador {
    private int andarAtual;
    private int capacidade;
    private int pessoasPresentes;
    private int totalAndares;

    public Elevador(int capacidade, int totalAndares) {
        this.andarAtual = 0;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
        this.totalAndares = totalAndares;
    }

    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (this.pessoasPresentes < this.capacidade) {
            this.pessoasPresentes++;
        } else {
            System.out.println("Elevador cheio");
        }
    }

    public void sai() {
        if (this.pessoasPresentes > 0) {
            this.pessoasPresentes--;
        } else {
            System.out.println("Elevador vazio");
        }
    }

    public void sobe() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        } else {
            System.out.println("Elevador já está no último andar");
        }
    }

    public void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
        } else {
            System.out.println("Elevador já está no térreo");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public int getTotalAndares() {
        return totalAndares;
    }
}
