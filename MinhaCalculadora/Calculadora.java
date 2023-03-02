package MinhaCalculadora;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonMais, buttonMenos, buttonVezes, buttonDividir, buttonResultado, buttonLimpar;
    JTextField textField;

    double primeiroNumero, segundoNumero, resultado;
    int operacao;

    public Calculadora() {
        this.setSize(300, 300);
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final JPanel panel = new JPanel(new GridLayout(4, 4));

        this.button1 = new JButton("1");
        this.button2 = new JButton("2");
        this.button3 = new JButton("3");
        this.button4 = new JButton("4");
        this.button5 = new JButton("5");
        this.button6 = new JButton("6");
        this.button7 = new JButton("7");
        this.button8 = new JButton("8");
        this.button9 = new JButton("9");
        this.button0 = new JButton("0");
        this.buttonMais = new JButton("+");
        this.buttonMenos = new JButton("-");
        this.buttonVezes = new JButton("*");
        this.buttonDividir = new JButton("/");
        this.buttonResultado = new JButton("=");
        this.buttonLimpar = new JButton("C");

        this.textField = new JTextField(15);

        panel.add(this.button1);
        panel.add(this.button2);
        panel.add(this.button3);
        panel.add(this.buttonMais);
        panel.add(this.button4);
        panel.add(this.button5);
        panel.add(this.button6);
        panel.add(this.buttonMenos);
        panel.add(this.button7);
        panel.add(this.button8);
        panel.add(this.button9);
        panel.add(this.buttonVezes);
        panel.add(this.button0);
        panel.add(this.buttonResultado);
        panel.add(this.buttonLimpar);
        panel.add(this.buttonDividir);

        this.add(this.textField, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);

        this.button1.addActionListener(this);
        this.button2.addActionListener(this);
        this.button3.addActionListener(this);
        this.button4.addActionListener(this);
        this.button5.addActionListener(this);
        this.button6.addActionListener(this);
        this.button7.addActionListener(this);
        this.button8.addActionListener(this);
        this.button9.addActionListener(this);
        this.button0.addActionListener(this);
        this.buttonMais.addActionListener(this);
        this.buttonMenos.addActionListener(this);
        this.buttonVezes.addActionListener(this);
        this.buttonDividir.addActionListener(this);
        this.buttonResultado.addActionListener(this);
        this.buttonLimpar.addActionListener(this);

        this.setVisible(true);
    }

    public static void main(final String[] args) {
        new Calculadora();
    }

    public final void actionPerformed(@NotNull ActionEvent e) {
        if (e.getSource() == button1) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == button2) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == button3) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == button4) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == button5) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == button6) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == button7) {
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == button8) {
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == button9) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == button0) {
            textField.setText(textField.getText() + "0");
        } else if (e.getSource() == buttonMais) {
            primeiroNumero = Double.parseDouble(textField.getText());
            operacao = 1; // 1 significa adição
            textField.setText("");
        } else if (e.getSource() == buttonMenos) {
            primeiroNumero = Double.parseDouble(textField.getText());
            operacao = 2; // 2 significa subtração
            textField.setText("");
        } else if (e.getSource() == buttonResultado) {
            segundoNumero = Double.parseDouble(textField.getText());
            if (1 == this.operacao) { // adição
                resultado = primeiroNumero + segundoNumero;
            } else if (2 == this.operacao) { // subtração
                resultado = primeiroNumero - segundoNumero;
            }
            textField.setText(Double.toString(resultado));
        } else if (e.getSource() == buttonLimpar) {
            textField.setText("");
        }
    }
}


