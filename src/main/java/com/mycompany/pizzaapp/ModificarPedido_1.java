/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pizzaapp;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author arjun
 */
public class ModificarPedido_1 extends javax.swing.JFrame {

    final JPopupMenu menu = new JPopupMenu("Options");
    public JButton btn1;
//    String[] productData = new String[3];
////    ArrayList<String> articulos = new ArrayList<>();//toda la Lista de articulos y o ings. 
    ArrayList<String> newArticuloCompra = new ArrayList<>();
    ArrayList<String> articuloCompra = new ArrayList<>();//lista de articulo solo nombre de los productos 
    String[] nameList = new String[]{
        "Mediterrania", "BBQ", "Margarita", "DiCabra", "Vegetariana", "4Estaciones", "Pepperoni", "Havaiana", "CuatroQuesos", "Prosciutto",//tipo 1
        "CocaCola", "Fanta", "CocaColaZero", "sinBebida", "Aquiarius", "Cerveza", "Nestea", "Agua",//tipo2
        "HalfBackedFroyo", "CookieDough", "FudgeBrownie", "SaltedCaramel", "sinPostre", "ChunckyMonkey", "CherryGracia"};//tipo 3
    String[] pizzas = new String[]{"Mediterrania", "BBQ", "Margarita", "DiCabra", "Vegetariana", "4Estaciones", "Pepperoni", "Havaiana", "CuatroQuesos", "Prosciutto"};
    String[] bebidas = new String[]{"CocaCola", "Fanta", "CocaColaZero", "sinBebida", "Aquiarius", "Cerveza", "Nestea", "Agua"};
    String[] postres = new String[]{"HalfBackedFroyo", "CookieDough", "FudgeBrownie", "SaltedCaramel", "sinPostre", "ChunckyMonkey", "CherryGracia"};
    String NewArticle = "";
    String Name = "";
    String ImagePath = "";
    String tipoDePedido = "";

    ArrayList<String> DatosDeClientes = new ArrayList<>();

    public ModificarPedido_1() {
        initComponents();
        editComponentes();
        GuardarImg.setIcon(new ImageIcon("IMG\\buttons\\guardar_main.png"));
    }

    public void getNewArticle(String articleName) {
        NewArticle = articleName;
    }

    public void DataLogin(String Nombre, ArrayList<String> OgList, ArrayList<String> newList, String FrameName) { //metodo para sacar nombre del usuario de la pagina login

//        System.out.println(articuloCompra.size());
//        System.out.println(articuloCompra);
//    boton.setText(name);
//    boton.setIcon(new ImageIcon(imagePath));
        jLabel1.setText(Nombre.substring(0, 1).toUpperCase() + "" + Nombre.substring(1));
        jLabel1.setBorder(
                new EmptyBorder(0, 10, 0, 0));
        jLabel1.setOpaque(
                true);

        switch (FrameName) {
            case "OgFrame" -> {
                articuloCompra = OgList;
                System.out.println("original list used");
                System.out.println(OgList);
            }
            case "NewFrame" -> {
                articuloCompra = newList;
                System.out.println("new article added/changed");
                System.out.println(newList);
            }
            default -> {
                articuloCompra = newList;
                System.out.println("new article added/changed");
            }
        }
        switch (articuloCompra.size()) {
            case 0 -> {
                JOptionPane.showMessageDialog(null, "No Article in this List");
//                dispose();

            }
            case 1 -> {
                setImgData(button1, 0);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                button6.setVisible(false);
                button7.setVisible(false);
                button8.setVisible(false);
                button9.setVisible(false);
                button10.setVisible(false);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 2 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                button6.setVisible(false);
                button7.setVisible(false);
                button8.setVisible(false);
                button9.setVisible(false);
                button10.setVisible(false);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 3 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                button5.setVisible(false);
                button6.setVisible(false);
                button7.setVisible(false);
                button8.setVisible(false);
                button9.setVisible(false);
                button10.setVisible(false);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 4 -> {
                //button0
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                button5.setVisible(false);
                button6.setVisible(false);
                button7.setVisible(false);
                button8.setVisible(false);
                button9.setVisible(false);
                button10.setVisible(false);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 5 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                button6.setVisible(false);
                button7.setVisible(false);
                button8.setVisible(false);
                button9.setVisible(false);
                button10.setVisible(false);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 6 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                setImgData(button6, 5);
                button7.setVisible(false);
                button8.setVisible(false);
                button9.setVisible(false);
                button10.setVisible(false);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 7 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                setImgData(button6, 5);
                setImgData(button7, 6);
                button8.setVisible(false);
                button9.setVisible(false);
                button10.setVisible(false);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 8 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                setImgData(button6, 5);
                setImgData(button7, 6);
                setImgData(button8, 7);
                button9.setVisible(false);
                button10.setVisible(false);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 9 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                setImgData(button6, 5);
                setImgData(button7, 6);
                setImgData(button8, 7);
                setImgData(button9, 8);
                button10.setVisible(false);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 10 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                setImgData(button6, 5);
                setImgData(button7, 6);
                setImgData(button8, 7);
                setImgData(button9, 8);
                setImgData(button10, 9);
                button11.setVisible(false);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 11 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                setImgData(button6, 5);
                setImgData(button7, 6);
                setImgData(button8, 7);
                setImgData(button9, 8);
                setImgData(button10, 9);
                setImgData(button11, 10);
                button12.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 12 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                setImgData(button6, 5);
                setImgData(button7, 6);
                setImgData(button8, 7);
                setImgData(button9, 8);
                setImgData(button10, 9);
                setImgData(button11, 10);
                setImgData(button12, 11);
                button13.setVisible(false);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 13 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                setImgData(button6, 5);
                setImgData(button7, 6);
                setImgData(button8, 7);
                setImgData(button9, 8);
                setImgData(button10, 9);
                setImgData(button11, 10);
                setImgData(button12, 11);
                setImgData(button13, 12);
                button14.setVisible(false);
                button15.setVisible(false);

            }
            case 14 -> {
                setImgData(button1, 0);
                setImgData(button2, 1);
                setImgData(button3, 2);
                setImgData(button4, 3);
                setImgData(button5, 4);
                setImgData(button6, 5);
                setImgData(button7, 6);
                setImgData(button8, 7);
                setImgData(button9, 8);
                setImgData(button10, 9);
                setImgData(button11, 10);
                setImgData(button12, 11);
                setImgData(button13, 12);
                setImgData(button14, 13);
                button15.setVisible(false);

            }

        } //

//        for (int i = 0; i < newList.size(); i++) {
//            System.out.println("Changed list: "+newList.get(i));
//            
//        }
    }

//    private void hideExtraBotons(JButton boton) {
//        boton.setVisible(false);
//    }
    private void setImgData(JButton boton, int index) {
//        String path = "";
        String folder = "";
        boton.setText(articuloCompra.get(index));
//find exact folder for the Imgage
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i].contains(articuloCompra.get(index))) {
                folder = "pizzas";
            } else {
                for (int j = 0; j < bebidas.length; j++) {
                    if (bebidas[j].contains(articuloCompra.get(index))) {
                        folder = "bebidas";
                    } else {
                        for (int k = 0; k < postres.length; k++) {
                            if (postres[k].contains(articuloCompra.get(index))) {
                                folder = "postres";

                            }
                        }
                    }

                }
            }

        }
        boton.setIcon(new ImageIcon("IMG\\" + folder + "\\" + boton.getText() + ".png"));

//        File file = new File("IMG\\" + folder + "\\" + boton.getText() + ".png");
//        System.out.println(file.canRead());
//        System.out.println(file.getName());
    }

    private void editComponentes() {
//        menu.add("Cambiar");
//        menu.add("Modificar");
//        menu.add("Eliminar");
        //imagenes de los componentes
        btn_crearNuevoPedido.setIcon(new ImageIcon("IMG\\pizza.png"));
        btn_crearNuevoPedido.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_crearNuevoPedido.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_crearNuevoPedido.setFocusable(false);
        btn_modificarPedido.setIcon(new ImageIcon("IMG\\modificar_pedido.png"));
        btn_modificarPedido.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_modificarPedido.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_modificarPedido.setFocusable(false);
        //set date 
        date.setText(date());
        //logout button
        logOut.setIcon(new ImageIcon("IMG\\logout.png"));
        logOut.setBorder(new EmptyBorder(2, 2, 2, 2));
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        button1.setVerticalTextPosition(SwingConstants.BOTTOM);
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button2.setVerticalTextPosition(SwingConstants.BOTTOM);
        button2.setHorizontalTextPosition(SwingConstants.CENTER);
        button3.setVerticalTextPosition(SwingConstants.BOTTOM);
        button3.setHorizontalTextPosition(SwingConstants.CENTER);
        button4.setVerticalTextPosition(SwingConstants.BOTTOM);
        button4.setHorizontalTextPosition(SwingConstants.CENTER);
        button5.setVerticalTextPosition(SwingConstants.BOTTOM);
        button5.setHorizontalTextPosition(SwingConstants.CENTER);
        button6.setVerticalTextPosition(SwingConstants.BOTTOM);
        button6.setHorizontalTextPosition(SwingConstants.CENTER);
        button7.setVerticalTextPosition(SwingConstants.BOTTOM);
        button7.setHorizontalTextPosition(SwingConstants.CENTER);
        button8.setVerticalTextPosition(SwingConstants.BOTTOM);
        button8.setHorizontalTextPosition(SwingConstants.CENTER);
        button9.setVerticalTextPosition(SwingConstants.BOTTOM);
        button9.setHorizontalTextPosition(SwingConstants.CENTER);
        button10.setVerticalTextPosition(SwingConstants.BOTTOM);
        button10.setHorizontalTextPosition(SwingConstants.CENTER);
        button11.setVerticalTextPosition(SwingConstants.BOTTOM);
        button11.setHorizontalTextPosition(SwingConstants.CENTER);
        button12.setVerticalTextPosition(SwingConstants.BOTTOM);
        button12.setHorizontalTextPosition(SwingConstants.CENTER);
        button13.setVerticalTextPosition(SwingConstants.BOTTOM);
        button13.setHorizontalTextPosition(SwingConstants.CENTER);
        button14.setVerticalTextPosition(SwingConstants.BOTTOM);
        button14.setHorizontalTextPosition(SwingConstants.CENTER);
        button15.setVerticalTextPosition(SwingConstants.BOTTOM);
        button15.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    private String date() {
        String setDate;
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        setDate = dateTime.format(format);

        return setDate;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PizzasPanel = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button13 = new javax.swing.JButton();
        button14 = new javax.swing.JButton();
        button15 = new javax.swing.JButton();
        TopBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        RightSideNav = new javax.swing.JPanel();
        btn_crearNuevoPedido = new javax.swing.JButton();
        btn_modificarPedido = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        GuardarImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        MainPanel.setMaximumSize(new java.awt.Dimension(1070, 2000));
        MainPanel.setPreferredSize(new java.awt.Dimension(1070, 780));

        jScrollPane1.setBorder(null);

        PizzasPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        PizzasPanel.setMaximumSize(new java.awt.Dimension(1100, 320));
        PizzasPanel.setMinimumSize(new java.awt.Dimension(1100, 320));
        PizzasPanel.setPreferredSize(new java.awt.Dimension(1400, 2000));

        button1.setBackground(new java.awt.Color(245, 245, 236));
        button1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button1.setFocusable(false);
        button1.setMaximumSize(new java.awt.Dimension(300, 250));
        button1.setPreferredSize(new java.awt.Dimension(300, 250));
        button1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button1MousePressed(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(245, 245, 236));
        button2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button2.setFocusable(false);
        button2.setMaximumSize(new java.awt.Dimension(300, 250));
        button2.setPreferredSize(new java.awt.Dimension(300, 250));
        button2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button2MousePressed(evt);
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(245, 245, 236));
        button3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button3.setFocusable(false);
        button3.setMaximumSize(new java.awt.Dimension(300, 250));
        button3.setPreferredSize(new java.awt.Dimension(300, 250));
        button3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button3MousePressed(evt);
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(245, 245, 236));
        button4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button4.setFocusable(false);
        button4.setMaximumSize(new java.awt.Dimension(300, 250));
        button4.setPreferredSize(new java.awt.Dimension(300, 250));
        button4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button4MousePressed(evt);
            }
        });
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(245, 245, 236));
        button5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button5.setFocusable(false);
        button5.setMaximumSize(new java.awt.Dimension(300, 250));
        button5.setPreferredSize(new java.awt.Dimension(300, 250));
        button5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button5MousePressed(evt);
            }
        });
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(245, 245, 236));
        button6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button6.setFocusable(false);
        button6.setMaximumSize(new java.awt.Dimension(300, 250));
        button6.setPreferredSize(new java.awt.Dimension(300, 250));
        button6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button6MousePressed(evt);
            }
        });
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(245, 245, 236));
        button7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button7.setFocusable(false);
        button7.setMaximumSize(new java.awt.Dimension(300, 250));
        button7.setPreferredSize(new java.awt.Dimension(300, 250));
        button7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button7MousePressed(evt);
            }
        });
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(245, 245, 236));
        button8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button8.setFocusable(false);
        button8.setMaximumSize(new java.awt.Dimension(300, 250));
        button8.setPreferredSize(new java.awt.Dimension(300, 250));
        button8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button8MousePressed(evt);
            }
        });
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(245, 245, 236));
        button9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button9.setFocusable(false);
        button9.setMaximumSize(new java.awt.Dimension(300, 250));
        button9.setPreferredSize(new java.awt.Dimension(300, 250));
        button9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button9MousePressed(evt);
            }
        });
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button10.setBackground(new java.awt.Color(245, 245, 236));
        button10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button10.setFocusable(false);
        button10.setMaximumSize(new java.awt.Dimension(300, 250));
        button10.setPreferredSize(new java.awt.Dimension(300, 250));
        button10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button10MousePressed(evt);
            }
        });
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button11.setBackground(new java.awt.Color(245, 245, 236));
        button11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button11.setFocusable(false);
        button11.setMaximumSize(new java.awt.Dimension(300, 250));
        button11.setPreferredSize(new java.awt.Dimension(300, 250));
        button11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button11MousePressed(evt);
            }
        });
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        button12.setBackground(new java.awt.Color(245, 245, 236));
        button12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button12.setFocusable(false);
        button12.setMaximumSize(new java.awt.Dimension(300, 250));
        button12.setPreferredSize(new java.awt.Dimension(300, 250));
        button12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button12MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button12MousePressed(evt);
            }
        });
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        button13.setBackground(new java.awt.Color(245, 245, 236));
        button13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button13.setFocusable(false);
        button13.setMaximumSize(new java.awt.Dimension(300, 250));
        button13.setPreferredSize(new java.awt.Dimension(300, 250));
        button13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button13MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button13MousePressed(evt);
            }
        });
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        button14.setBackground(new java.awt.Color(245, 245, 236));
        button14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button14.setFocusable(false);
        button14.setMaximumSize(new java.awt.Dimension(300, 250));
        button14.setPreferredSize(new java.awt.Dimension(300, 250));
        button14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button14MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button14MousePressed(evt);
            }
        });
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });

        button15.setBackground(new java.awt.Color(245, 245, 236));
        button15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        button15.setFocusable(false);
        button15.setMaximumSize(new java.awt.Dimension(300, 250));
        button15.setPreferredSize(new java.awt.Dimension(300, 250));
        button15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button15MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button15MousePressed(evt);
            }
        });
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PizzasPanelLayout = new javax.swing.GroupLayout(PizzasPanel);
        PizzasPanel.setLayout(PizzasPanelLayout);
        PizzasPanelLayout.setHorizontalGroup(
            PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzasPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PizzasPanelLayout.createSequentialGroup()
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PizzasPanelLayout.createSequentialGroup()
                        .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PizzasPanelLayout.setVerticalGroup(
            PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzasPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PizzasPanelLayout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PizzasPanelLayout.createSequentialGroup()
                        .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PizzasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(532, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(PizzasPanel);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(254, 227, 142));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Cajero : ");
        jLabel2.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(254, 227, 142));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel1.setOpaque(true);

        date.setBackground(new java.awt.Color(254, 227, 142));
        date.setText("jLabel2");
        date.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        date.setMinimumSize(new java.awt.Dimension(18, 16));
        date.setOpaque(true);

        logOut.setBackground(new java.awt.Color(254, 227, 142));
        logOut.setBorder(null);
        logOut.setFocusable(false);
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopBarLayout = new javax.swing.GroupLayout(TopBar);
        TopBar.setLayout(TopBarLayout);
        TopBarLayout.setHorizontalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TopBarLayout.setVerticalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBarLayout.createSequentialGroup()
                .addGroup(TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        btn_crearNuevoPedido.setBackground(new java.awt.Color(245, 245, 236));
        btn_crearNuevoPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_crearNuevoPedido.setText("Nuevo Pedido");
        btn_crearNuevoPedido.setBorder(null);
        btn_crearNuevoPedido.setFocusable(false);
        btn_crearNuevoPedido.setMinimumSize(new java.awt.Dimension(101, 390));
        btn_crearNuevoPedido.setPreferredSize(new java.awt.Dimension(202, 380));
        btn_crearNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearNuevoPedidoActionPerformed(evt);
            }
        });

        btn_modificarPedido.setBackground(new java.awt.Color(245, 245, 236));
        btn_modificarPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_modificarPedido.setText("Modificar Pedido");
        btn_modificarPedido.setBorder(null);
        btn_modificarPedido.setFocusable(false);
        btn_modificarPedido.setMinimumSize(new java.awt.Dimension(101, 390));
        btn_modificarPedido.setPreferredSize(new java.awt.Dimension(202, 380));
        btn_modificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightSideNavLayout = new javax.swing.GroupLayout(RightSideNav);
        RightSideNav.setLayout(RightSideNavLayout);
        RightSideNavLayout.setHorizontalGroup(
            RightSideNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightSideNavLayout.createSequentialGroup()
                .addGroup(RightSideNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_modificarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crearNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RightSideNavLayout.setVerticalGroup(
            RightSideNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightSideNavLayout.createSequentialGroup()
                .addComponent(btn_crearNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_modificarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        GuardarImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GuardarImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarImgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GuardarImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GuardarImgMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RightSideNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(TopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightSideNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
//        int reply = JOptionPane.showConfirmDialog(null, "¿Queries salir del sistema?", "Exit", JOptionPane.YES_NO_OPTION);
//        if (reply == JOptionPane.YES_OPTION) {
//            dispose();
//            String path = "Pedidos\\" + genDailyFile();
//            File file = new File(path);
//            File[] files = file.listFiles();
//            System.out.println(Arrays.toString(files));
//            for (File f : files) {
//                if (f.isFile() && f.exists()) {
//                    System.out.println(f.isFile());
//                    System.out.println(f.exists());
//                    f.delete(); 
//                    System.out.println("successfully deleted");
//                } else {
//                    System.out.println("cant delete a file due to open or error");
//                }
//            }
//        } else {
////            JOptionPane.showMessageDialog(null, "No confirmado el metodo de pago!!", "Canceled", JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_formWindowClosed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        dispose();
        Login v1 = new Login();
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);

        v1.setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    private void btn_crearNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearNuevoPedidoActionPerformed
        // TODO add your handling code here:
//        int reply = JOptionPane.showConfirmDialog(null, "¿queres hacer el pedido de nuevo?", "Nuevo Pedido", JOptionPane.YES_NO_OPTION);
//        if (reply == JOptionPane.YES_OPTION) {
        CrearPedido v1 = new CrearPedido();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setVisible(true);
        v1.DataLogin(jLabel1.getText());
        dispose();
//        }
    }//GEN-LAST:event_btn_crearNuevoPedidoActionPerformed

    private void btn_modificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarPedidoActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null, "¿Buscar un pedido?", "Buscar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido v1 = new ModificarPedido();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText());
            dispose();
        }

    }//GEN-LAST:event_btn_modificarPedidoActionPerformed

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        // TODO add your handling code here:
        button1.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        // TODO add your handling code here:
        button1.setBackground(new java.awt.Color(245, 245, 236));

    }//GEN-LAST:event_button1MouseExited

    private void button1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MousePressed
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
        List.add("Margarita");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 0);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button1.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button1.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, 1);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button1.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button1.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button1MousePressed

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
        // TODO add your handling code here:
        button2.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button2MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
        // TODO add your handling code here:
        button2.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button2MouseExited

    private void button2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MousePressed
        // TODO add your handling code here:
        //--------------array de datos
//        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 1);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button2.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button2.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, 2);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button2.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button2.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());

        //----------------------

    }//GEN-LAST:event_button2MousePressed

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
        // TODO add your handling code here:
        button3.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button3MouseEntered

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
        // TODO add your handling code here:
        button3.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button3MouseExited

    private void button3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MousePressed
        // TODO add your handling code here:
        //---array de datos 
        ArrayList<String> List = new ArrayList<>();
//        List.add("Barbacoa");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Bacon");
//        List.add("Pollo");
//        List.add("Ternera");
//        List.add("Cebolla");
        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 2);
                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button3.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button3.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, 3);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button3.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button3.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button3MousePressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered
        // TODO add your handling code here:
        button4.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button4MouseEntered

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
        // TODO add your handling code here:
        button4.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button4MouseExited

    private void button4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MousePressed
        // TODO add your handling code here:
        ArrayList<String> List = new ArrayList<>();
//        List.add("Barbacoa");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Bacon");
//        List.add("Pollo");
//        List.add("Ternera");
//        List.add("Cebolla");
        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 3);
                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button4.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button4.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,4);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button4.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button4.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button4MousePressed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseEntered
        // TODO add your handling code here:
        button5.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button5MouseEntered

    private void button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseExited
        // TODO add your handling code here:
        button5.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button5MouseExited

    private void button5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 4);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button5.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button5.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,5);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button5.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button5.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button5MousePressed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseEntered
        // TODO add your handling code here:
        button6.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button6MouseEntered

    private void button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseExited
        // TODO add your handling code here:
        button6.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button6MouseExited

    private void button6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 5);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button6.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button6.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,6);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button6.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button6.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button6MousePressed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseEntered
        // TODO add your handling code here:
        button7.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button7MouseEntered

    private void button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseExited
        // TODO add your handling code here:
        button7.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button7MouseExited

    private void button7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 6);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button7.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button7.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,7);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button7.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button7.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button7MousePressed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button7ActionPerformed

    private void button8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseEntered
        // TODO add your handling code here:
        button8.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button8MouseEntered

    private void button8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseExited
        // TODO add your handling code here:
        button8.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button8MouseExited

    private void button8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 7);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button8.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button8.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,8);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button8.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button8.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button8MousePressed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void button9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseEntered
        // TODO add your handling code here:
        button9.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button9MouseEntered

    private void button9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseExited
        // TODO add your handling code here:
        button9.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button9MouseExited

    private void button9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 8);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button9.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button9.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,9);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button9.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button9.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button9MousePressed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button9ActionPerformed

    private void button10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MouseEntered
        // TODO add your handling code here:
        button10.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button10MouseEntered

    private void button10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MouseExited
        // TODO add your handling code here:
        button10.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button10MouseExited

    private void button10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 9);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button10.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button10.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,10);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button10.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button10.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button10MousePressed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button10ActionPerformed

    private void button11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MouseEntered
        // TODO add your handling code here:
        button11.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button11MouseEntered

    private void button11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MouseExited
        // TODO add your handling code here:
        button11.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button11MouseExited

    private void button11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 10);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button11.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button11.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,11);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button11.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button11.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button11MousePressed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button11ActionPerformed

    private void button12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MouseEntered
        // TODO add your handling code here:
        button12.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button12MouseEntered

    private void button12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MouseExited
        // TODO add your handling code here:
        button12.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button12MouseExited

    private void button12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 11);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

       menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button13.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button13.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,13);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button12.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button12.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button12MousePressed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button12ActionPerformed

    private void button13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button13MouseEntered
        // TODO add your handling code here:
        button13.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button13MouseEntered

    private void button13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button13MouseExited
        // TODO add your handling code here:
        button13.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button13MouseExited

    private void button13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button13MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
        List.add("CuatroQuesos");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        List.add("Queso de Cabra");
        List.add("Emmental");
        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 12);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button14.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button14.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,14);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button13.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button13.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button13MousePressed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button13ActionPerformed

    private void button14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button14MouseEntered
        // TODO add your handling code here:
        button14.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button14MouseEntered

    private void button14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button14MouseExited
        // TODO add your handling code here:
        button14.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button14MouseExited

    private void button14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button14MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 13);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));
//
        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPizza = false;
                for (int j = 0; j < pizzas.length; j++) {
                    if (pizzas[j].equalsIgnoreCase(button15.getText())) {
                        isPizza = true;
                    }

                }
                if (isPizza == true) {
                    List<String> ingArray = new ArrayList<>();
                    try {
                        String fileName = "";
                        String fileData = "";
                        File folder = new File("Articulos");
                        String[] files = folder.list();
                        String btnName = button15.getText();//change it to button that it coresponds
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].contains(btnName)) {
                                fileName = files[i];
                            }
                        }
                        String path = "Articulos\\" + fileName;
                        File openfile = new File(path);
                        Scanner lectura = new Scanner(openfile);
                        while (lectura.hasNext()) {
                            fileData += lectura.nextLine();
                        }
                        ingArray = Arrays.asList(fileData.split(";"));
                        System.out.println(Arrays.toString(folder.list()));

                        System.out.println(ingArray);
                    } catch (FileNotFoundException a) {
                        System.out.println("error: " + a);
                    }
                    //Loading v2 = new Loading();
                    ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                    v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                    v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                    v1.setVisible(true);
                    v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra,15);
                    v1.getIngList(ingArray);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button14.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button14.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button14MousePressed

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button14ActionPerformed

    private void button15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button15MouseEntered
        // TODO add your handling code here:
        button15.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_button15MouseEntered

    private void button15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button15MouseExited
        // TODO add your handling code here:
        button15.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_button15MouseExited

    private void button15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button15MousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //--------------array de datos
//        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Cambiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
//                listaProductosP3.setText(listaProductosP3.getText() + str);

                EligirProductov2Mod v1 = new EligirProductov2Mod();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
                v1.DataLogin(jLabel1.getText(), articuloCompra, newArticuloCompra, "OgFrame", 14);
//                v1.getChangeArticleName(0,articuloCompra);
                // este es para pasar datos
//                v1.getIngList(List);

                dispose();

            }
        }));
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i].contains(button15.getText())) {
                menu.add(new JMenuItem(new AbstractAction("Modificar") {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        List<String> ingArray = new ArrayList<>();
                        try {
                            String fileName = "";
                            String fileData = "";
                            File folder = new File("Articulos");
                            String[] files = folder.list();
                            String btnName = button15.getText();//change it to button that it coresponds
                            for (int i = 0; i < files.length; i++) {
                                if (files[i].contains(btnName)) {
                                    fileName = files[i];
                                }
                            }
                            String path = "Articulos\\" + fileName;
                            File openfile = new File(path);

                            Scanner lectura = new Scanner(openfile);
                            while (lectura.hasNext()) {
                                fileData += lectura.nextLine();
                            }
                            ingArray = Arrays.asList(fileData.split(";"));

                            System.out.println(Arrays.toString(folder.list()));

                            System.out.println(ingArray);
                        } catch (FileNotFoundException a) {
                            System.out.println("error: " + a);
                        }
                        //Loading v2 = new Loading();
                        ModificarPizzav2Mod v1 = new ModificarPizzav2Mod();
                        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                        v1.setVisible(true);
//                v1.getlistdata(listaProductosP3.getText());
//                v1.DataLogin(jLabel1.getText(), tipoDePedido, DatosDeClientes);

                        // este es para pasar datos
                        v1.getIngList(ingArray);

                        dispose();
                    }
                }));
            } else {
                JOptionPane.showMessageDialog(null, "Este producto no se puede modificar!", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        }

        menu.add(new JMenuItem(new AbstractAction("Eliminar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "¿Eliminar este producto?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    button15.setText("Articulo Eliminado");
//                    button1.setIcon(new ImageIcon("IMG\\deleted.png"));
                    button15.setEnabled(false);

                }
            }

        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_button15MousePressed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button15ActionPerformed

    private void GuardarImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarImgMouseClicked
        // TODO add your handling code here:
//        getPizzaData();
        Main v1 = new Main();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setVisible(true);
//        sendCompra =getCompra;
//        v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
        //        v1.getModifiedPizza(ModifiedPizza, ListaDeProductos);
        //        System.out.println(ListaDeProductos);
        //        v1.DataLogin(jLabel1.getText(), tipoDePedido, DatosDeClientes);
        dispose();
    }//GEN-LAST:event_GuardarImgMouseClicked

    private void GuardarImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarImgMouseEntered
        // TODO add your handling code here:
        GuardarImg.setIcon(new ImageIcon("IMG\\buttons\\guardar_hover.png"));
    }//GEN-LAST:event_GuardarImgMouseEntered

    private void GuardarImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarImgMouseExited
        // TODO add your handling code here:
        GuardarImg.setIcon(new ImageIcon("IMG\\buttons\\guardar_main.png"));
    }//GEN-LAST:event_GuardarImgMouseExited
    private String dateSerialNum() {
        DateTimeFormatter d = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDate now = LocalDate.now();
        return d.format(now);
    }

    private String genDailyFile() {
        String serialNum;
        //String date = dateSerialNum();
        serialNum = dateSerialNum();
        return serialNum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido_1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido_1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido_1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPedido_1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPedido_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GuardarImg;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PizzasPanel;
    private javax.swing.JPanel RightSideNav;
    private javax.swing.JPanel TopBar;
    private javax.swing.JButton btn_crearNuevoPedido;
    private javax.swing.JButton btn_modificarPedido;
    private javax.swing.JButton button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button13;
    private javax.swing.JButton button14;
    private javax.swing.JButton button15;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}
