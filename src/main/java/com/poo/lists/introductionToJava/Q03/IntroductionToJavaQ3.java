package com.poo.lists.introductionToJava.Q03;

import javax.swing.JOptionPane;

public class IntroductionToJavaQ3 {
    public static void introductionToJava03() {
        boolean valid = false;
        while (!valid) {
            try {
                String input = JOptionPane.showInputDialog("Informe um ângulo em graus:");
                if (input == null) {
                    valid = true;
                } else {
                    double degrees = Double.parseDouble(input);

                    double radians = Math.toRadians(degrees);

                    double sin = Math.sin(radians);
                    double cos = Math.cos(radians);
                    double tan = Math.tan(radians);
                    double csc = 1 / sin;
                    double sec = 1 / cos;
                    double cot = 1 / tan;

                    String output = "Ângulo em radianos: " + radians + "\n"
                            + "Seno: " + sin + "\n"
                            + "Coseno: " + cos + "\n"
                            + "Tangente: " + tan + "\n"
                            + "Cossecante: " + csc + "\n"
                            + "Secante: " + sec + "\n"
                            + "Cotangente: " + cot;
                    JOptionPane.showMessageDialog(null, output);
                    valid = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente!");
            }
        }
    }
}
