/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import java.util.Arrays;

/**
 *
 * @author arjun
 */
public class test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nombresBotones = {"Mediterránia JButton", "BBQ JButton", "Margarita JButton", "DiCabra JButton", "Vegetariana JButton", "Estaciones4 JButton", "Pepperoni JButton", "Havaiana JButton", "CuatroQuesos JButton", "Prosciutto JButton"};

for (int i = 0; i < nombresBotones.length; i++) {
  nombresBotones[i] = nombresBotones[i].replace(" JButton", "");
}
        System.out.println(Arrays.toString(nombresBotones));
    }
    
}
