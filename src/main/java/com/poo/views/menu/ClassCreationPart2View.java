package com.poo.views.menu;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class ClassCreationPart2View extends JScrollPane{
    
    public ClassCreationPart2View() {

        JPanel classCreationPart2Panel = new JPanel();
        classCreationPart2Panel.setLayout(new BoxLayout(classCreationPart2Panel, BoxLayout.Y_AXIS));

        JPanel buttoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        TitledBorder title = new TitledBorder("Criação de classes - parte 2");
        title.setTitleFont(new Font("Arial", Font.BOLD, 20));

        classCreationPart2Panel.setBorder(title);
        
        classCreationPart2Panel.add(buttoPanel);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        getVerticalScrollBar().setUnitIncrement(16);
        setViewportView(classCreationPart2Panel);
    }
}
