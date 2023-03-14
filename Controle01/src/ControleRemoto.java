public class ControleRemoto {

    private Televisao tv; // referência para a televisão controlada pelo controle remoto

    /**

     Cria um novo controle remoto para a televisão especificada.
     @param tv a televisão a ser controlada pelo controle remoto
     */
    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }
    /**

     Aumenta o volume da televisão em uma unidade.
     */
    public void aumentarVolume() {
        this.tv.setVolumeAtual(this.tv.getVolumeAtual() + 1);
    }
    /**

     Diminui o volume da televisão em uma unidade.
     */
    public void diminuirVolume() {
        this.tv.setVolumeAtual(this.tv.getVolumeAtual() - 1);
    }
    /**

     Aumenta o canal da televisão em uma unidade.
     */
    public void aumentarCanal() {
        this.tv.setCanalAtual(this.tv.getCanalAtual() + 1);
    }
    /**

     Diminui o canal da televisão em uma unidade.
     */
    public void diminuirCanal() {
        this.tv.setCanalAtual(this.tv.getCanalAtual() - 1);
    }
    /**

     Troca para o canal especificado.
     @param novoCanal o novo canal a ser sintonizado na televisão
     */
    public void trocarParaCanal(int novoCanal) {
        this.tv.setCanalAtual(novoCanal);
    }
    /**

     Aumenta a potência da televisão (ou seja, o volume).
     Equivalente a chamar o método aumentarVolume().
     */
    public void aumentarPotencia() {
        this.aumentarVolume();
    }
    /**

     Diminui a potência da televisão (ou seja, o volume).
     Equivalente a chamar o método diminuirVolume().
     */
    public void diminuirPotencia() {
        this.diminuirVolume();
    }
    /**

     Imprime na saída padrão o canal e o volume atual da televisão.
     */
    public void consultarStatus() {
        System.out.println("Canal atual: " + this.tv.getCanalAtual());
        System.out.println("Volume atual: " + this.tv.getVolumeAtual());
    }
}