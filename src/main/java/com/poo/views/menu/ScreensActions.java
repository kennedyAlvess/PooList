package com.poo.views.menu;

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScreensActions {

    private static CardLayout screenLayout = new CardLayout();
    private static JPanel screens = new JPanel(screenLayout);
    private static JFrame frame = new JFrame("App View");

    public static void start() {
        initComponents();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(screens);
        frame.pack();
        Dimension size = frame.getSize();
        size.width += 100;
        size.height += 50;
        frame.setSize(size);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        screenLayout.show(screens, "appView");
    }

    private static void initComponents() {
        AppView appView = new AppView();
        IntroductionView introductionView = new IntroductionView();
        screens.add(appView, "appView");
        screens.add(introductionView, "introductionView");
    }

    public static void changeScreen(String screenName) {
        screenLayout.show(screens, screenName);
    }
}