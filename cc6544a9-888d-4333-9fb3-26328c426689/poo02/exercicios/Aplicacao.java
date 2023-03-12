package poo.exercicios;

import javax.swing.*;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ParImpar parImpar = new ParImpar();

        String msg = "O número é par: " + parImpar.ePar(num);
        JOptionPane.showMessageDialog(null, msg );
        //System.out.println(msg);


    }
}
