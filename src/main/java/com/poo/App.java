package com.poo;

import static com.poo.lists.introductionToJava.IntroductionToJavaMain.introductionToJavaMain;
import static com.poo.menus.Menus.LoadingExitScreen;
import static com.poo.menus.Menus.mainMenu;


public class App {
    
    public static void main(String[] args) throws InterruptedException {
        int listChoose;
        do{
            listChoose = mainMenu();
            switch (listChoose){
                case 0 -> introductionToJavaMain();

                case 1 -> System.out.println();

                case 2 -> System.out.println();

                case 3 -> System.out.println();

                case 4 -> System.out.println();

                case 5 -> System.out.println();

                case 6 -> System.out.println();

                case 7 -> LoadingExitScreen();
                case -1 -> LoadingExitScreen();
            }
            
        }while (listChoose != 7 && listChoose != -1);

    }
  
}

