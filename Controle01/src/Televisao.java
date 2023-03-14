
public class Televisao {
    private int canalAtual;
    private int volumeAtual;
    public Televisao() {
        this.canalAtual = 1;
        this.volumeAtual = 50;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }
}