package com.poo.menus;

import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menus {

    public static int mainMenu() {

        String[] options = { "Introdução ao Java",
                "Criação de classes",
                "Arrays e ArraysLists",
                "Reúso de classes",
                "Abstratas, polimorfismo e interfaces",
                "Coleções genéricas",
                "Exceções",
                "Sair" };

        JList<String> list = new JList<>(options);
        JScrollPane pane = new JScrollPane(list);
        pane.setPreferredSize(new Dimension(400, options.length * 18));
        JOptionPane.showOptionDialog(null, pane, "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, null, null);

        return list.getSelectedIndex();
    }

    public static int introductionToJavaMenu() {
        String[] options = { "Questão 01",
                "Questão 02",
                "Questão 03",
                "Questão 04",
                "Questão 05",
                "Questão 06",
                "Questão 07",
                "Questão 08",
                "Questão 09",
                "Questão 10",
                "Questão 11",
                "Questão 12",
                "Questão 13",
                "Questão 14",
                "Voltar" };

        JList<String> list = new JList<>(options);
        JScrollPane pane = new JScrollPane(list);
        pane.setPreferredSize(new Dimension(200, options.length * 18));
        JOptionPane.showOptionDialog(null, pane, "Introdução ao Java", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, null, null);

        return list.getSelectedIndex();
    }

    public static void LoadingScreen() {
        JOptionPane pane = new JOptionPane("Loading...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION,
                null, new Object[] {});
        final JDialog dialog = pane.createDialog("");
        Timer timer = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
        dialog.setVisible(true);
    }

    public static void LoadingExitScreen() {
        JOptionPane pane = new JOptionPane("Saindo...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION,
                null, new Object[] {});
        final JDialog dialog = pane.createDialog("");
        Timer timer = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
        dialog.setVisible(true);
        System.exit(0);
    }
   
}
