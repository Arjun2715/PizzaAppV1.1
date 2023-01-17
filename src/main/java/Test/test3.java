/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arjun
 */
public class test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pizzaStringFileData = "";
//        String pizzaData = "";
        try {
            File folder = new File("Articulos\\Pizzas");
            System.out.println(folder.canRead());
            
            String[] files = folder.list();
            System.out.println(Arrays.toString(folder.list()));
            String fileName = "";
            
            for (int i = 0; i < files.length; i++) {
                if (files[i].equals("Margarita.txt")) {
                    fileName+=files[i];
                    
                }System.out.println(files[i]);
            }
            
            File openSelectedFile = new File("Articulos\\Pizzas\\" + fileName);
            Scanner lectura = new Scanner(openSelectedFile);
            while (lectura.hasNext()) {
                pizzaStringFileData += lectura.nextLine();
            }
            //Arrays.asList();
            System.err.println(pizzaStringFileData);
            List<String> list = Arrays.asList(pizzaStringFileData.split(","));
            
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
                
            }
            
            } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
            
    }
    
}
