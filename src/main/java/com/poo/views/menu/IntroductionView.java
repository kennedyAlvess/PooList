package com.poo.views.menu;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class IntroductionView extends JPanel{

    public IntroductionView() {
    
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel menuTitlelabel = new JLabel("Introdução ao Java");
        menuTitlelabel.setHorizontalAlignment(JLabel.CENTER);
        menuTitlelabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 20, 0);
        add(menuTitlelabel, gbc);

        setVisible(true);
    }
    
}
