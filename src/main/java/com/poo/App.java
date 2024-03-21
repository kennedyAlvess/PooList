package com.poo;

import static com.poo.views.menu.MainScreen.start;

import javax.swing.SwingUtilities;



public class App  {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            start();
        });       
    }
}
