package com.poo.views.menu;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class ClassReuseView extends JScrollPane{
    
    public ClassReuseView() {
        
        JPanel classReusePanel = new JPanel();
        classReusePanel.setLayout(new BoxLayout(classReusePanel, BoxLayout.Y_AXIS));

        JPanel buttoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        TitledBorder title = new TitledBorder("Reúso de classes");
        title.setTitleFont(new Font("Arial", Font.BOLD, 20));

        classReusePanel.setBorder(title);
        
        classReusePanel.add(buttoPanel);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        getVerticalScrollBar().setUnitIncrement(16);
        setViewportView(classReusePanel);
    }
}
