package com.poo.views.menu;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScreensActions {

    private static CardLayout screenLayout = new CardLayout();
    private static JPanel screens = new JPanel(screenLayout);
    private static JFrame frame = new JFrame("PooList");

    public static void start() {
        initComponents();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(screens);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        screenLayout.show(screens, "appView");
    }

    private static void initComponents() {
        screens.add(new AppView(), "appView");
        screens.add(new IntroductionView(), "introductionView");
        screens.add(new ClassCreationPart1View(), "classCreationPart1View");
        screens.add(new ClassCreationPart2View(), "classCreationPart2View");
        screens.add(new ArrayArrayListView(), "arrayArrayListView");
        screens.add(new ClassReuseView(), "classReuseView");
        screens.add(new InterfacesView(), "abstractInterfaceView");
        screens.add(new GenericCollectionsView(), "genericCollectionView");
        screens.add(new ExceptionsView(), "exceptionsView");
    }

    public static void changeScreen(String screenName) {
        screenLayout.show(screens, screenName);
    }
}
