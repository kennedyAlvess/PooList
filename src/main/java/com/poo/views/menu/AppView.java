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

public class AppView extends JPanel {

    private static JButton introButton, cls1Button, cls2Button, arrayButton, reusButton, absButton, colectionButton, exButton, exitButton;
    private final Dimension buttonSize = new Dimension(250, 30);
    private final Border roundedBorder = new LineBorder(Color.BLACK, 1, true);
    private final  Insets buttonMargin = new Insets(10, 0, 1, 0);

    public AppView() {
        
        setSize(500, 500);
        setLayout(new GridBagLayout());
        setBorder(new LineBorder(Color.BLACK, 1, true));
                GridBagConstraints gbc = new GridBagConstraints();

        JLabel menuTitlelabel = new JLabel("Lista de Exercícios");
        menuTitlelabel.setHorizontalAlignment(JLabel.CENTER);
        menuTitlelabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 20, 0);
        add(menuTitlelabel, gbc);

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
            add(button, gbc);
            gbc.gridy++;
        }
       
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AppViewController.exitButtonAction();
            }
        });

        introButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AppViewController.introButtonAction();
            }
        });
    
        setVisible(true);
    }
}
