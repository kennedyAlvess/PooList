package com.poo.screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Exit {
        public static void LoadingExitScreen() {
        JOptionPane pane = new JOptionPane("Saindo...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION,
                null, new Object[] {});
        final JDialog dialog = pane.createDialog("");
        Timer timer = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
        dialog.setVisible(true);
        System.exit(0);
    }
}
