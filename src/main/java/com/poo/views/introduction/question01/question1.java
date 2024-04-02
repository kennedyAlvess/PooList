package com.poo.views.introduction.question01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class question1 extends JPanel {

    public question1() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(0, 0, 0, 20));

        JLabel menuTitlelabel = new JLabel("Questão 01");
        menuTitlelabel.setHorizontalAlignment(JLabel.CENTER);
        menuTitlelabel.setFont(new Font("Arial", Font.BOLD, 25));
        add(menuTitlelabel, BorderLayout.NORTH);

        JLabel side = new JLabel("Informe o valor do lado de um quadrado:");
        side.setFont(new Font("Arial", Font.BOLD, 15));
        side.setBorder(new EmptyBorder(0, 0, 10, 0));

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        TextField sideValue = new TextField(15);

        centerPanel.setBorder(new EmptyBorder(40, 10, 0, 0));
        centerPanel.add(side);
        centerPanel.add(sideValue);

        add(centerPanel, BorderLayout.CENTER);

        JLabel result = new JLabel("O valor do lado do quadrado é: ");
        result.setFont(new Font("Arial", Font.BOLD, 15));
        result.setBorder(new EmptyBorder(0, 10, 50, 0));
        add(result, BorderLayout.SOUTH);
    }
}