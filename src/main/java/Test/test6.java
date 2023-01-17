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

/**
 *
 * @author arjun
 */
public class test6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        try{
            String fileName = "";
        String fileData ="";
        File folder = new File("Articulos");
        String[] files = folder.list();
        String btnName = "BBQ";//change it to button that it coresponds
        for (int i = 0; i < files.length; i++) {
            if (files[i].contains(btnName)) {
                fileName = files[i];
            }
        }
        String path = "Articulos\\" + fileName;
        File openfile = new File(path);
        
        Scanner lectura = new Scanner(openfile);
        while(lectura.hasNext()){
            fileData+=lectura.nextLine();
        }
        List<String> ingArray = Arrays.asList(fileData.split(";"));
        
        
        System.out.println(Arrays.toString(folder.list()));
        
        System.out.println(ingArray);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }

}
