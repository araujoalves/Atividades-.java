public class ExemploData {
    public static void main(String[] args) {
        try {
            Data data1 = new Data(10, 03, 2022);
            System.out.println("Data 1: " + data1.toString());

            Data data2 = new Data(31, 02, 2023);
            System.out.println("Data 2: " + data2.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

