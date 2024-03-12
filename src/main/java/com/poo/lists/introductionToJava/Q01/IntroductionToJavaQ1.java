package com.poo.lists.introductionToJava.Q01;

/* Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado deverá ser informado pelo usuário. */

import javax.swing.JOptionPane;

public class IntroductionToJavaQ1 {
    public static void introductionToJava01() {

        double lado = 0;
        boolean valid = false;
        while (!valid) {
            String input = JOptionPane.showInputDialog("Digite o valor do lado do quadrado: ");
            if (input == null) {
                valid = true;
            } else {
                try {
                    lado = Double.parseDouble(input);
                    if (lado < 0) {
                        JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente");
                        continue;
                    } else {
                        JOptionPane.showMessageDialog(null, "A área do quadrado é:  " + Math.pow(lado, 2), "Questão 01",
                                JOptionPane.INFORMATION_MESSAGE);
                        valid = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente!");
                }
            }
        }
    }
}
