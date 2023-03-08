package poo.exercicios;

import javax.swing.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public enum Aplicacao {
    ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        int num = sc.nextInt();

        ParImpar parImpar = new ParImpar();

        String msg = "O número é par: " + parImpar.ePar(num);
        JOptionPane.showMessageDialog(null, msg);
        //System.out.println(msg);


    }
}
