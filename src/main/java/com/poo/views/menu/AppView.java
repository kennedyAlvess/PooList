package com.poo.views.menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import com.poo.controllers.menu.AppViewController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AppView extends JFrame {

    private static JButton introButton, cls1Button, cls2Button, arrayButton, reusButton, absButton, colectionButton, exButton, exitButton;
    private final Dimension buttonSize = new Dimension(250, 30);
    private final Border roundedBorder = new LineBorder(Color.BLACK, 1, true);
    private final  Insets buttonMargin = new Insets(10, 0, 1, 0);

    public AppView() {

        setTitle("Menu");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel menuPrincipal = new JPanel();
        menuPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel menuTitlelabel = new JLabel("Lista de Exercícios");
        menuTitlelabel.setHorizontalAlignment(JLabel.CENTER);
        menuTitlelabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 20, 0);
        menuPrincipal.add(menuTitlelabel, gbc);

        introButton = new JButton("Introdução ao Java");
        cls1Button = new JButton("Criação de classes - Parte 1");
        cls2Button = new JButton("Criação de classes - Parte 2");
        arrayButton = new JButton("Arrays e ArrayLists");
        reusButton = new JButton("Reúso de classes");

        absButton = new JButton("Classes abstratas, polimorfismo e interfaces");
        absButton.setFont(new Font(absButton.getFont().getName(), absButton.getFont().getStyle(), 10));

        colectionButton = new JButton("Coleções genéricas");
        exButton = new JButton("Exceções");
        exitButton = new JButton("Sair");

        for (JButton button : new JButton[] { introButton, cls1Button, cls2Button, arrayButton, reusButton, absButton, colectionButton, exButton,
                exitButton }) {
            gbc.gridy++;
            button.setPreferredSize(buttonSize);
            button.setBorder(roundedBorder);
            gbc.insets = buttonMargin;
            menuPrincipal.add(button, gbc);
            gbc.gridy++;
        }

        setResizable(false);
        add(menuPrincipal);


        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AppViewController.exitButtonAction();
            }
        });

    }
}
