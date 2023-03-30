package projeto_Car_Rental;

import java.util.Scanner;

public class Alugar {
    private Carro carro;
    private boolean alugado;

    public void alugarCarro(Carro carro) {
        this.carro = carro;
        this.alugado = true;
    }

    public void devolverCarro() {
        this.carro = null;
        this.alugado = false;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public Carro getCarro() {
        return carro;
    }
}