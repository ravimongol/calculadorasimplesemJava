import javax.swing.*;
import java.awt.*;

public class CalculadoraSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora simples em Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 600);
        frame.setLayout(null);

        int frameWidth = 500;
        int totalWidth = 340;
        int startX = (frameWidth - totalWidth) / 2;

        JLabel l1 = new JLabel("Primeiro valor:");
        l1.setBounds(450, 25, 100, 25);
        JTextField n1 = new JTextField();
        n1.setBounds(540, 25, 90, 25);

        JLabel l2 = new JLabel("Segundo valor:");
        l2.setBounds(645, 25, 100, 25);
        JTextField n2 = new JTextField();
        n2.setBounds(735, 25, 90, 25);

        JButton somar = new JButton("+");
        somar.setBounds(450, 90, 100, 55);
        somar.setBackground(Color.lightGray);
        somar.addActionListener(e -> {

            try {

                double valor1 = Double.parseDouble(n1.getText());
                double valor2 = Double.parseDouble(n2.getText());
                double r = valor1 + valor2;
                JOptionPane.showMessageDialog(frame, "Seu resultado é: " + r);

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(frame, "Por favor, insira um número valido!");

            }
        });

        JButton sub = new JButton("-");
        sub.setBounds(560, 90, 100, 55);
        sub.setBackground(Color.lightGray);
        sub.addActionListener(e -> {

            try {

                double valor1 = Double.parseDouble(n1.getText());
                double valor2 = Double.parseDouble(n2.getText());
                double r = valor1 - valor2;
                JOptionPane.showMessageDialog(frame, "Seu resultado é: " + r);

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(frame, "Por favor, insira um número valido!");

            }
        });
        JButton mult = new JButton("x");
        mult.setBounds(670, 90, 100, 55);
        mult.setBackground(Color.lightGray);
        mult.addActionListener(e -> {

            try {

                double valor1 = Double.parseDouble(n1.getText());
                double valor2 = Double.parseDouble(n2.getText());
                double r = valor1 * valor2;
                JOptionPane.showMessageDialog(frame, "Seu resultado é: " + r);

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(frame, "Por favor, insira um número valido!");

            }
        });
        JButton div = new JButton("÷");
        div.setBounds(780, 90, 100, 55);
        div.setBackground(Color.lightGray);
        div.addActionListener(e -> {
            try {
                double valor1 = Double.parseDouble(n1.getText());
                double valor2 = Double.parseDouble(n2.getText());
                if (valor2 == 0) {
                    JOptionPane.showMessageDialog(frame, "Não é possível dividir por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    double r = valor1 / valor2;
                    JOptionPane.showMessageDialog(frame, "Seu resultado é: " + r);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, insira um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(l1);
        frame.add(n1);
        frame.add(l2);
        frame.add(n2);
        frame.add(somar);
        frame.add(sub);
        frame.add(mult);
        frame.add(div);

        frame.setVisible(true);
    }
}