package com.mycompany.pizzaapp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class PizzaApp {

    public static void main(String[] args) {
        Login v1 = new Login();
//        Main v1 = new Main();
        v1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setVisible(true);
        
        
        
        

    }

}
