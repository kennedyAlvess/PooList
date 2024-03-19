package com.poo.views.menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class AppView extends JFrame {
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;

    public AppView() {

        setTitle("Menu");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel menuPrincipal = new JPanel();
        menuPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel label = new JLabel("Escolha o tópico que deseja");
        label.setHorizontalAlignment(JLabel.CENTER);

        button1 = new JButton("Introduction to Java");
        button2 = new JButton("Criação de classes - Parte 1");
        button3 = new JButton("Criação de classes - Parte 2");
        button4 = new JButton("Arrays e ArrayLists");
        button5 = new JButton("Reúso de classes");
        button6 = new JButton("Classes abstratas, polimorfismo e interfaces");
        button7 = new JButton("Coleções genéricas");
        button8 = new JButton("Exceções");
        button9 = new JButton("Exit");

        Dimension buttonSize = new Dimension(200, 30);

        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        button5.setPreferredSize(buttonSize);
        button6.setPreferredSize(buttonSize);
        button7.setPreferredSize(buttonSize);
        button8.setPreferredSize(buttonSize);
        button9.setPreferredSize(buttonSize);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 50, 0);
        menuPrincipal.add(label, gbc);

        // Crie uma borda arredondada
        Border roundedBorder = new LineBorder(Color.BLACK, 1, true);

        // Crie uma margem entre os botões
        Insets buttonMargin = new Insets(10, 0, 10, 0); // 10 pixels de margem no topo e na parte inferior
        gbc.gridy++;
        // Aplique a borda e a margem a cada botão
        for (JButton button : new JButton[] { button1, button2, button3, button4, button5, button6, button7, button8,
                button9 }) {
            button.setBorder(roundedBorder);
            gbc.insets = buttonMargin;
            menuPrincipal.add(button, gbc);
            gbc.gridy++;
        }

        setResizable(false);
        add(menuPrincipal);

    }
}
