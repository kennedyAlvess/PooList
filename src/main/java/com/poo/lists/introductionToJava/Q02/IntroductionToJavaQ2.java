package com.poo.lists.introductionToJava.Q02;

import java.text.DecimalFormat;

/* Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3valores reais serão informados pelo usuário */

import javax.swing.JOptionPane;

public class IntroductionToJavaQ2 {

    public static void introductionToJava02() {
        double num1 = 0, num2 = 0, num3 = 0;
        boolean valid = false;
        while (!valid) {
            String input1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
            if(input1 == null) break;
            String input2 = JOptionPane.showInputDialog("Digite o segundo número: ");
            if(input2 == null) break;
            String input3 = JOptionPane.showInputDialog("Digite o terceiro número: ");
            if(input3 == null) break;

            try {
                num1 = Double.parseDouble(input1);
                num2 = Double.parseDouble(input2);
                num3 = Double.parseDouble(input3);
                JOptionPane.showMessageDialog(null, "Números informados: \n" + num1 + "\n" + num2 + "\n" + num3
                        + "\nA soma dos números é: " + (num1 + num2 + num3)
                        + "\nA média dos números é: " + new DecimalFormat("#.##").format((num1 + num2 + num3) / 3),
                        "Questão 02", JOptionPane.INFORMATION_MESSAGE);

                valid = true;

            } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor(es) inválido(s), tente novamente");}
        }
    }
}
