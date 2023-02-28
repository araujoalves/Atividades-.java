package Scanner.aula;

public class APLICACAO {

    public static void main(String[] args) {

        System.out.println("Inicio da aplicação");

         int valor= 10;

        if (valor == 20) {

            System.out.println("sim é igual a " + valor);

        }else if (valor ==30){

            System.out.println("sim é igual a " + valor);

        }else if (valor ==10) {

            System.out.println("sim é igual a " + valor);

        }else{

            System.out.println("fim da aplicação");
        }
    }

    public static class MinhaClasse01 {

        public static void escreverMensagem(String mensagem) {
            System.out.println(mensagem);
        }

        public static double calcularMedia(int num1, int num2, int num3) {
            double media = (num1 + num2 + num3) / 3.0;
            return media;
        }

        public static double mediaPonderada(double med1, double med2, double med3) {
            double mediaPeso = ((med1 * 3) + (med2 * 2) + (med3 * 4)) / (3 + 2 + 4);
            return mediaPeso;

        }

        public static void main(String[] args) {

            double mediaMedia = mediaPonderada(8.9, 7, 5);
            escreverMensagem("A media é: " + mediaMedia);

        }



            }
}
