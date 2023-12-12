package FactoryMethod;

import FactoryMethod.Factory.Dialog;
import FactoryMethod.Factory.HtmlDialog;
import FactoryMethod.Factory.WindowsDialog;

public class Run {
    private static Dialog dialog;
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //        configure
        String config = "windows";

        if (config.equals("windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }

        dialog.renderWindow();
    }
}
