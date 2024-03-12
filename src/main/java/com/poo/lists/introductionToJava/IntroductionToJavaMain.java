package com.poo.lists.introductionToJava;

import javax.swing.JOptionPane;

import static com.poo.menus.Menus.LoadingExitScreen;
import static com.poo.menus.Menus.LoadingScreen;
import static com.poo.menus.Menus.introductionToJavaMenu;
import static com.poo.lists.introductionToJava.Q01.IntroductionToJavaQ1.introductionToJava01;

public class IntroductionToJavaMain {

    public static void introductionToJavaMain() throws InterruptedException {

        int questionChoose;
        do {

            questionChoose = introductionToJavaMenu();
            switch (questionChoose) {
                case 0 -> introductionToJava01();
                case 1 -> {}//introductionToJava02();
                case 2 -> {}//introductionToJava03();
                case 3 -> {}//introductionToJava04();
                case 4 -> {}//introductionToJava05();
                case 5 -> {}//introductionToJava06();
                case 6 -> {}//introductionToJava07();
                case 7 -> {}//introductionToJava08();
                case 8 -> {}//introductionToJava09();
                case 9 -> JOptionPane.showMessageDialog(null, "QUESTÃO ABERTA");
                case 10 -> {}//introductionToJava11();
                case 11 -> {}//introductionToJava12();
                case 12 -> {}//introductionToJava13();
                case 13 -> {}//introductionToJava14();
                case 14 -> LoadingScreen();
                case -1 -> LoadingExitScreen();
            }
        } while (questionChoose != 14 && questionChoose != -1);
    }
}
