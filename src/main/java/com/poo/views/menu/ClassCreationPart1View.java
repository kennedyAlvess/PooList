package com.poo.views.menu;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class ClassCreationPart1View extends JScrollPane{
    
    public ClassCreationPart1View() {
        
        JPanel classCreationPart1Panel = new JPanel();
        classCreationPart1Panel.setLayout(new BoxLayout(classCreationPart1Panel, BoxLayout.Y_AXIS));

        JPanel buttoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        TitledBorder title = new TitledBorder("Criação de classes - parte 1");
        title.setTitleFont(new Font("Arial", Font.BOLD, 20));

        classCreationPart1Panel.setBorder(title);
        
        classCreationPart1Panel.add(buttoPanel);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        getVerticalScrollBar().setUnitIncrement(16);
        setViewportView(classCreationPart1Panel);
    }
}
