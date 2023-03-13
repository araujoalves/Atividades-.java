class ControleRemoto {
    private TV tv;

    public ControleRemoto(TV tv) {
        this.tv = tv;
    }

    public void ligarTV() {
        if (!this.tv.isLigada()) {
            System.out.println("Ligando TV...");
            this.tv.setLigada(true);
        } else {
            System.out.println("TV já está ligada.");
        }
    }

    public void desligarTV() {
        if (this.tv.isLigada()) {
            System.out.println("Desligando TV...");
            this.tv.setLigada(false);
        } else {
            System.out.println("TV já está desligada.");
        }
    }

    public void mudarCanal(int canal) {
        if (this.tv.isLigada()) {
            System.out.println("Mudando para o canal " + canal + "...");
            this.tv.setCanal(canal);
        } else {
            System.out.println("Não é possível mudar de canal porque a TV está desligada.");
        }
    }

    public void aumentarVolume() {
        if (this.tv.isLigada()) {
            System.out.println("Aumentando o volume...");
            this.tv.setVolume(this.tv.getVolume() + 1);
        } else {
            System.out.println("Não é possível aumentar o volume porque a TV está desligada.");
        }
    }

    public void diminuirVolume() {
        if (this.tv.isLigada()) {
            System.out.println("Diminuindo o volume...");
            this.tv.setVolume(this.tv.getVolume() - 1);
        } else {
            System.out.println("Não é possível diminuir o volume porque a TV está desligada.");
        }
    }

    public int getCanal() {
        return this.tv.getCanal();
    }

    public int getVolume() {
        return this.tv.getVolume();
    }
}
