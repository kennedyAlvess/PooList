package com.poo.controllers.menu;

import static com.poo.views.menu.ScreensActions.changeScreen;

public class AppViewController{
   
    public static void introButtonAction(){
        changeScreen("introductionView");
    }

    public static void cls1ButtonAction(){
        changeScreen("cls1View");
    }

    public static void cls2ButtonAction(){
        changeScreen("cls2View");
    }

    public static void arrayButtonAction(){
        changeScreen("arrayView");
    }

    public static void reusButtonAction(){
        changeScreen("reusView");
    }

    public static void absButtonAction(){
        changeScreen("absView");
    }

    public static void colectionButtonAction(){
        changeScreen("colectionView");
    }

    public static void exButtonAction(){
        changeScreen("exView");
    }

    public static void exitButtonAction() {
        System.exit(0);
    }
    
}