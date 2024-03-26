package com.poo.views.menu;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class InterfacesView extends JScrollPane{
    
    public InterfacesView() {
        
        JPanel interfacesPanel = new JPanel();
        interfacesPanel.setLayout(new BoxLayout(interfacesPanel, BoxLayout.Y_AXIS));

        JPanel buttoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        TitledBorder title = new TitledBorder("Classes abstratas, polimorfismo e interfaces");
        title.setTitleFont(new Font("Arial", Font.BOLD, 20));

        interfacesPanel.setBorder(title);
        
        interfacesPanel.add(buttoPanel);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        getVerticalScrollBar().setUnitIncrement(16);
        setViewportView(interfacesPanel);
    }
}
