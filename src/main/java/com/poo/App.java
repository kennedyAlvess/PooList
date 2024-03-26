package com.poo;

import javax.swing.SwingUtilities;

import static com.poo.views.menu.ScreensActions.start;

public class App  {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            start();
        });       
    }
}
