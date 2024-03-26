package com.poo.views.menu;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.poo.controllers.menu.AppViewController;

public class AppView extends JPanel{

    private final Dimension buttonSize = new Dimension(250, 30);
    private final Border roundedBorder = new LineBorder(Color.BLACK, 1, true);
    private final  Insets buttonMargin = new Insets(10, 0, 1, 0);

    public AppView() { 


        JButton introButton, cls1Button, cls2Button, arrayButton, reusButton, absButton, colectionButton, exButton, exitButton;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel menuTitlelabel = new JLabel("Lista de Exercícios");
        menuTitlelabel.setHorizontalAlignment(JLabel.CENTER);
        menuTitlelabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 20, 0);
        add(menuTitlelabel, gbc);

        introButton = new JButton("Introdução ao Java");
        introButton.setName("introButton");

        cls1Button = new JButton("Criação de classes - Parte 1");
        cls1Button.setName("cls1Button");

        cls2Button = new JButton("Criação de classes - Parte 2");
        cls2Button.setName("cls2Button");

        arrayButton = new JButton("Arrays e ArrayLists");
        arrayButton.setName("arrayButton");

        reusButton = new JButton("Reúso de classes");
        reusButton.setName("reusButton");

        absButton = new JButton("Classes abstratas, polimorfismo e interfaces");
        absButton.setFont(new Font(absButton.getFont().getName(), absButton.getFont().getStyle(), 10));
        absButton.setName("absButton");

        colectionButton = new JButton("Coleções genéricas");
        colectionButton.setName("colectionButton");

        exButton = new JButton("Exceções");
        exButton.setName("exButton");

        exitButton = new JButton("Sair");
        exitButton.setName("exitButton");

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                
                switch (command) {
                    case "introButton" -> AppViewController.introButtonAction();
                    case "cls1Button" -> AppViewController.cls1ButtonAction();
                    case "cls2Button" -> AppViewController.cls2ButtonAction();
                    case "arrayButton" -> AppViewController.arrayButtonAction();
                    case "reusButton" -> AppViewController.reusButtonAction();
                    case "absButton" -> AppViewController.absButtonAction();
                    case "colectionButton" -> AppViewController.colectionButtonAction();
                    case "exButton" -> AppViewController.exButtonAction();
                    case "exitButton" -> AppViewController.exitButtonAction();
                }  
            }
        };

        for (JButton button : new JButton[] { introButton, cls1Button, cls2Button, arrayButton, reusButton, absButton, colectionButton, exButton,
                exitButton }) {
            gbc.gridy++;
            button.setActionCommand(button.getName());
            button.addActionListener(actionListener);
            button.setPreferredSize(buttonSize);
            button.setBorder(roundedBorder);
            gbc.insets = buttonMargin;
            add(button, gbc);
        }

        setVisible(true);
    }
}
