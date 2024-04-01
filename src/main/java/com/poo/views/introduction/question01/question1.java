package com.poo.views.introduction.question01;

import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class question1 extends JPanel{
    
    public question1() {
        setLayout(new GridBagLayout());

        JLabel menuTitlelabel = new JLabel("Questão 01");
        menuTitlelabel.setHorizontalAlignment(JLabel.CENTER);
        menuTitlelabel.setFont(new Font("Arial", Font.BOLD, 20));

        setVisible(true);
    }
}
