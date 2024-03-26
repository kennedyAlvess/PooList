package com.poo.views.menu;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class GenericCollectionsView extends JScrollPane{
    
    public GenericCollectionsView() {
        
        JPanel genericCollectionPanel = new JPanel();
        genericCollectionPanel.setLayout(new BoxLayout(genericCollectionPanel, BoxLayout.Y_AXIS));

        JPanel buttoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        TitledBorder title = new TitledBorder("Coleções genéricas");
        title.setTitleFont(new Font("Arial", Font.BOLD, 20));

        genericCollectionPanel.setBorder(title);
        
        genericCollectionPanel.add(buttoPanel);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        getVerticalScrollBar().setUnitIncrement(16);
        setViewportView(genericCollectionPanel);
    }
}
