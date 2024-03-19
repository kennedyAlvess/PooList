package com.poo;

import javax.swing.SwingUtilities;

import com.poo.views.menu.AppView;

public class App  {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AppView app = new AppView();
            app.setVisible(true);
        });
    }
}
