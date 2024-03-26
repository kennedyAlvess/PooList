package com.poo.views.menu;

import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class ArrayArrayListView extends JScrollPane{

    public ArrayArrayListView() {
        
        JPanel arrayArrayListPanel = new JPanel();
        arrayArrayListPanel.setLayout(new BoxLayout(arrayArrayListPanel, BoxLayout.Y_AXIS));

        JPanel buttoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        TitledBorder title = new TitledBorder("Array e ArrayList");
        title.setTitleFont(new Font("Arial", Font.BOLD, 20));

        arrayArrayListPanel.setBorder(title);
        
        arrayArrayListPanel.add(buttoPanel);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        getVerticalScrollBar().setUnitIncrement(16);
        setViewportView(arrayArrayListPanel);
    }
    
}
