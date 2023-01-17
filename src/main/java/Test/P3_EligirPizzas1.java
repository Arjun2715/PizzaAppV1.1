/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Test;

import com.mycompany.pizzaapp.Login;
import com.mycompany.pizzaapp.Main;
import com.mycompany.pizzaapp.ElegirBebidas;
import com.mycompany.pizzaapp.ModificarPizza;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arjun
 */
public class P3_EligirPizzas1 extends javax.swing.JFrame {

    final JPopupMenu menu = new JPopupMenu("Options");
    public String updateLista;
    public String tipoDePedido;
    public DefaultTableModel model;
    public List<String> pizzaData;
    public String pizzaStringFileData = "";

    public P3_EligirPizzas1() {
        initComponents();
        editComponentes();
        String listData = listaProductosP3.getText();
    }

    public void DataLogin(String Nombre, String TipoDePedido) { //metodo para sacar nombre del usuario de la pagina login
        jLabel1.setText(Nombre.substring(0, 1).toUpperCase() + "" + Nombre.substring(1));
        jLabel1.setBorder(new EmptyBorder(0, 10, 0, 0));
        jLabel1.setOpaque(true);

        //tipo
        tipoDePedido = TipoDePedido;

    }

    public void getModifiedPizza(ArrayList<String> list, String data) {
        updateLista = data;
        System.out.println(list);
        System.out.println(list.size());
        list.removeAll(Arrays.asList("", null));
        String ModifiedPizza = "";
        String NombrePizza = "";
        NombrePizza += list.get(0);
        for (int i = 1; i < list.size(); i++) {
            ModifiedPizza += "\t" + list.get(i) + "\n";

        }
        listaProductosP3.setText(updateLista + "\n" + NombrePizza + "\n" + ModifiedPizza);

    }

    private void editComponentes() {
        menu.add("Añadir");
        menu.add("Modificar");
        menu.add(new Button());
        //lista font
        listaProductosP3.setFont(new Font("Plain", Font.BOLD, 18));
        //imagenes de los componentes
        btn_crearNuevoPedido.setIcon(new ImageIcon("IMG\\pizza.png"));
        btn_crearNuevoPedido.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_crearNuevoPedido.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_crearNuevoPedido.setFocusable(false);
        btn_modificarPedido.setIcon(new ImageIcon("IMG\\modificar_pedido.png"));
        btn_modificarPedido.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_modificarPedido.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_modificarPedido.setFocusable(false);

        //pizza1
        Margarita.setIcon(new ImageIcon("IMG\\pizzas\\" + Margarita.getText() + ".png"));
//        pizza1.setBorder(new EmptyBorder(5,5,5,5));
        Margarita.setVerticalTextPosition(SwingConstants.BOTTOM);
        Margarita.setHorizontalTextPosition(SwingConstants.CENTER);
        Margarita.setFocusable(false);

        //pizza2
        CuatroQuesos.setIcon(new ImageIcon("IMG\\pizzas\\" + CuatroQuesos.getText() + ".png"));
//        pizza2.setBorder(new EmptyBorder(5,5,5,5));
        CuatroQuesos.setVerticalTextPosition(SwingConstants.BOTTOM);
        CuatroQuesos.setHorizontalTextPosition(SwingConstants.CENTER);
        CuatroQuesos.setFocusable(false);

        //pizza3
        Prosciutto.setIcon(new ImageIcon("IMG\\pizzas\\" + Prosciutto.getText() + ".png"));
//        pizza3.setBorder(new EmptyBorder(5,5,5,5));
        Prosciutto.setVerticalTextPosition(SwingConstants.BOTTOM);
        Prosciutto.setHorizontalTextPosition(SwingConstants.CENTER);
        Prosciutto.setFocusable(false);

        //pizza4
        BBQ.setIcon(new ImageIcon("IMG\\pizzas\\" + BBQ.getText() + ".png"));
//        pizza4.setBorder(new EmptyBorder(5,5,5,5));
        BBQ.setVerticalTextPosition(SwingConstants.BOTTOM);
        BBQ.setHorizontalTextPosition(SwingConstants.CENTER);
        BBQ.setFocusable(false);
        //pizza5
        Estaciones4.setIcon(new ImageIcon("IMG\\pizzas\\" + Estaciones4.getText() + ".png"));
//        pizza5.setBorder(new EmptyBorder(5,5,5,5));
        Estaciones4.setVerticalTextPosition(SwingConstants.BOTTOM);
        Estaciones4.setHorizontalTextPosition(SwingConstants.CENTER);
        Estaciones4.setFocusable(false);

        //pizza6
        Mediterania.setIcon(new ImageIcon("IMG\\pizzas\\" + Mediterania.getText() + ".png"));
//        pizza6.setBorder(new EmptyBorder(5,5,5,5));
        Mediterania.setVerticalTextPosition(SwingConstants.BOTTOM);
        Mediterania.setHorizontalTextPosition(SwingConstants.CENTER);
        Mediterania.setFocusable(false);

        //pizza7
        Vegetariana.setIcon(new ImageIcon("IMG\\pizzas\\" + Vegetariana.getText() + ".png"));
//        pizza7.setBorder(new EmptyBorder(5,5,5,5));
        Vegetariana.setVerticalTextPosition(SwingConstants.BOTTOM);
        Vegetariana.setHorizontalTextPosition(SwingConstants.CENTER);
        Vegetariana.setFocusable(false);

        //pizza8
        Havaiana.setIcon(new ImageIcon("IMG\\pizzas\\" + Havaiana.getText() + ".png"));
//        pizza9.setBorder(new EmptyBorder(5,5,5,5));
        Havaiana.setVerticalTextPosition(SwingConstants.BOTTOM);
        Havaiana.setHorizontalTextPosition(SwingConstants.CENTER);
        Havaiana.setFocusable(false);

        //pizza9
        DiCabra.setIcon(new ImageIcon("IMG\\pizzas\\" + DiCabra.getText() + ".png"));
        //pizza10.setBorder(new EmptyBorder(5,5,5,5));
        DiCabra.setVerticalTextPosition(SwingConstants.BOTTOM);
        DiCabra.setHorizontalTextPosition(SwingConstants.CENTER);
        DiCabra.setFocusable(false);

        Pepperoni.setIcon(new ImageIcon("IMG\\pizzas\\" + Pepperoni.getText() + ".png"));
        //pizza10.setBorder(new EmptyBorder(5,5,5,5));
        Pepperoni.setVerticalTextPosition(SwingConstants.BOTTOM);
        Pepperoni.setHorizontalTextPosition(SwingConstants.CENTER);
        Pepperoni.setFocusable(false);

        //main_centerImg.setIcon(new ImageIcon("IMG\\icon.png"));
        //set date 
        date.setText(date());
        //logout button
        logOut.setIcon(new ImageIcon("IMG\\logout.png"));
        logOut.setBorder(new EmptyBorder(2, 2, 2, 2));

        listaProductosP3.setBorder(BorderFactory.createCompoundBorder(
                listaProductosP3.getBorder(),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)));

        model = (DefaultTableModel) ListTable.getModel();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_crearNuevoPedido = new javax.swing.JButton();
        btn_modificarPedido = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        Margarita = new javax.swing.JButton();
        CuatroQuesos = new javax.swing.JButton();
        Prosciutto = new javax.swing.JButton();
        BBQ = new javax.swing.JButton();
        Estaciones4 = new javax.swing.JButton();
        Mediterania = new javax.swing.JButton();
        Vegetariana = new javax.swing.JButton();
        Havaiana = new javax.swing.JButton();
        DiCabra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        P3_Siguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductosP3 = new javax.swing.JTextArea();
        Pepperoni = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 800));

        jLabel1.setBackground(new java.awt.Color(254, 227, 142));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel1.setOpaque(true);

        btn_crearNuevoPedido.setBackground(new java.awt.Color(245, 245, 236));
        btn_crearNuevoPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_crearNuevoPedido.setText("Nuevo Pedido");
        btn_crearNuevoPedido.setBorder(null);
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
        btn_modificarPedido.setMinimumSize(new java.awt.Dimension(101, 390));
        btn_modificarPedido.setPreferredSize(new java.awt.Dimension(202, 380));
        btn_modificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarPedidoActionPerformed(evt);
            }
        });

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

        Margarita.setBackground(new java.awt.Color(245, 245, 236));
        Margarita.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Margarita.setText("Margarita");
        Margarita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Margarita.setFocusable(false);
        Margarita.setMaximumSize(new java.awt.Dimension(250, 200));
        Margarita.setPreferredSize(new java.awt.Dimension(250, 200));
        Margarita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Margarita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MargaritaMousePressed(evt);
            }
        });

        CuatroQuesos.setBackground(new java.awt.Color(245, 245, 236));
        CuatroQuesos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CuatroQuesos.setText("CuatroQuesos");
        CuatroQuesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CuatroQuesos.setFocusable(false);
        CuatroQuesos.setMaximumSize(new java.awt.Dimension(250, 200));
        CuatroQuesos.setPreferredSize(new java.awt.Dimension(250, 200));
        CuatroQuesos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CuatroQuesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CuatroQuesosMousePressed(evt);
            }
        });

        Prosciutto.setBackground(new java.awt.Color(245, 245, 236));
        Prosciutto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Prosciutto.setText("Prosciutto");
        Prosciutto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Prosciutto.setFocusable(false);
        Prosciutto.setMaximumSize(new java.awt.Dimension(250, 200));
        Prosciutto.setPreferredSize(new java.awt.Dimension(250, 200));
        Prosciutto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Prosciutto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProsciuttoMousePressed(evt);
            }
        });

        BBQ.setBackground(new java.awt.Color(245, 245, 236));
        BBQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BBQ.setText("BBQ");
        BBQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BBQ.setFocusable(false);
        BBQ.setMaximumSize(new java.awt.Dimension(250, 200));
        BBQ.setPreferredSize(new java.awt.Dimension(250, 200));
        BBQ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BBQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BBQMousePressed(evt);
            }
        });

        Estaciones4.setBackground(new java.awt.Color(245, 245, 236));
        Estaciones4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Estaciones4.setText("4Estaciones");
        Estaciones4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Estaciones4.setFocusable(false);
        Estaciones4.setMaximumSize(new java.awt.Dimension(250, 200));
        Estaciones4.setPreferredSize(new java.awt.Dimension(250, 200));
        Estaciones4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Estaciones4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Estaciones4MousePressed(evt);
            }
        });

        Mediterania.setBackground(new java.awt.Color(245, 245, 236));
        Mediterania.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Mediterania.setText("Mediterania");
        Mediterania.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Mediterania.setFocusable(false);
        Mediterania.setMaximumSize(new java.awt.Dimension(250, 200));
        Mediterania.setPreferredSize(new java.awt.Dimension(250, 200));
        Mediterania.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Mediterania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MediteraniaMousePressed(evt);
            }
        });

        Vegetariana.setBackground(new java.awt.Color(245, 245, 236));
        Vegetariana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Vegetariana.setText("Vegetariana");
        Vegetariana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Vegetariana.setFocusable(false);
        Vegetariana.setMaximumSize(new java.awt.Dimension(250, 200));
        Vegetariana.setPreferredSize(new java.awt.Dimension(250, 200));
        Vegetariana.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Vegetariana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VegetarianaMousePressed(evt);
            }
        });

        Havaiana.setBackground(new java.awt.Color(245, 245, 236));
        Havaiana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Havaiana.setText("Havaiana");
        Havaiana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Havaiana.setFocusable(false);
        Havaiana.setMaximumSize(new java.awt.Dimension(250, 200));
        Havaiana.setPreferredSize(new java.awt.Dimension(250, 200));
        Havaiana.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Havaiana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HavaianaMousePressed(evt);
            }
        });

        DiCabra.setBackground(new java.awt.Color(245, 245, 236));
        DiCabra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        DiCabra.setText("DiCabra");
        DiCabra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DiCabra.setFocusable(false);
        DiCabra.setMaximumSize(new java.awt.Dimension(250, 200));
        DiCabra.setPreferredSize(new java.awt.Dimension(250, 200));
        DiCabra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DiCabra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DiCabraMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(254, 227, 142));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Cajero : ");
        jLabel2.setOpaque(true);

        P3_Siguiente.setBackground(new java.awt.Color(217, 217, 217));
        P3_Siguiente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        P3_Siguiente.setText("Siguiente");
        P3_Siguiente.setPreferredSize(new java.awt.Dimension(120, 50));
        P3_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3_SiguienteActionPerformed(evt);
            }
        });

        listaProductosP3.setEditable(false);
        listaProductosP3.setColumns(20);
        listaProductosP3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        listaProductosP3.setRows(5);
        jScrollPane1.setViewportView(listaProductosP3);

        Pepperoni.setBackground(new java.awt.Color(245, 245, 236));
        Pepperoni.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Pepperoni.setText("Pepperoni");
        Pepperoni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pepperoni.setFocusable(false);
        Pepperoni.setMaximumSize(new java.awt.Dimension(250, 200));
        Pepperoni.setPreferredSize(new java.awt.Dimension(250, 200));
        Pepperoni.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Pepperoni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PepperoniMousePressed(evt);
            }
        });
        Pepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepperoniActionPerformed(evt);
            }
        });

        ListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Cant", "Imp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListTable.setColumnSelectionAllowed(true);
        ListTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ListTable);
        ListTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (ListTable.getColumnModel().getColumnCount() > 0) {
            ListTable.getColumnModel().getColumn(0).setMinWidth(140);
            ListTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            ListTable.getColumnModel().getColumn(1).setMinWidth(50);
            ListTable.getColumnModel().getColumn(1).setPreferredWidth(60);
            ListTable.getColumnModel().getColumn(1).setMaxWidth(70);
            ListTable.getColumnModel().getColumn(2).setMinWidth(50);
            ListTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            ListTable.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_crearNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(btn_modificarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P3_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mediterania, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estaciones4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Margarita, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Vegetariana, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CuatroQuesos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Havaiana, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Prosciutto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DiCabra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BBQ, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Pepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BBQ, CuatroQuesos, DiCabra, Estaciones4, Havaiana, Margarita, Mediterania, Prosciutto, Vegetariana});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_crearNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_modificarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BBQ, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Prosciutto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Margarita, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CuatroQuesos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Havaiana, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Mediterania, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DiCabra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Vegetariana, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Estaciones4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Pepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P3_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(120, 120, 120))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BBQ, CuatroQuesos, DiCabra, Estaciones4, Havaiana, Margarita, Mediterania, Prosciutto, Vegetariana});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearNuevoPedidoActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null, "¿queres hacer el pedido de nuevo?", "Nuevo Pedido", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Main v1 = new Main();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText());
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "OK");
        }

    }//GEN-LAST:event_btn_crearNuevoPedidoActionPerformed

    private void btn_modificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarPedidoActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        dispose();
        Login v1 = new Login();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed


    private void P3_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3_SiguienteActionPerformed
        // TODO add your handling code here:
        ElegirBebidas v1 = new ElegirBebidas();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setVisible(true);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.getListaArticulo(listaProductosP3.getText());
//        v1.DataLogin(jLabel1.getText(), tipoDePedido);
        dispose();
    }//GEN-LAST:event_P3_SiguienteActionPerformed

    private void MargaritaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MargaritaMousePressed
        try {
            File folder = new File("Articulos\\Pizzas");
//            System.out.println(folder.canRead());

            String[] files = folder.list();
//            System.out.println(Arrays.toString(folder.list()));
            String fileName = "";

            for (int i = 0; i < files.length; i++) {
                if (files[i].equals("Margarita.txt")) {
                    fileName += files[i];

                }
//                System.out.println(files[i]);
            }

            File openSelectedFile = new File("Articulos\\Pizzas\\" + fileName);
            Scanner lectura = new Scanner(openSelectedFile);
            while (lectura.hasNext()) {
                pizzaStringFileData += lectura.nextLine();
            }
            //Arrays.asList();
//            System.err.println(pizzaStringFileData);
            List<String> list = Arrays.asList(pizzaStringFileData.split(","));

//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//
//            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        //hard string type--------------------------
        String str = "\nMargarita\tMozzarella\tSalsa de Tomate";

        //--------------array de datos
        ArrayList<String> List = new ArrayList<>();
        List.add("Margarita");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);

                //table load data
                int i = 0;
                int subPizzaCounter = 1;
                boolean excepcion = false;
                Object[] newRow = new Object[]{str, i + 1, subPizzaCounter};
//                ListTable.setDefaultRenderer(String.class, new MultiLineTableCellRenderer());
//                ListTable.setValueAt("Line 1\nLine 2\nLine 3", 1, 1);
                while (i < ListTable.getRowCount() && !excepcion) {
                    if (ListTable.getValueAt(i, 0).toString().equals(newRow[0].toString())
                            && ListTable.getValueAt(i, 1).toString().equals(newRow[1].toString())
                            && ListTable.getValueAt(i, 2).toString().equals(newRow[2].toString())) {
                        excepcion = true;
                    }
                    ++i;
                }
                if (excepcion) {
                    int reply = JOptionPane.showConfirmDialog(null, "¿Queries Añadir la misma Pizza?", "Añadir", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
//                        model.addRow(newRow);
                        Object a = 0;
                        int row = 0;
                        for (int j = 0; j < ListTable.getRowCount(); j++) {
                           if(ListTable.getValueAt(j, 0).toString().equals(newRow[0].toString())){
//                               ListTable.getValueAt(j, 1).toString().replaceFirst(ListTable.getValueAt(j, 1), a);
                           }
                            
                        }
                        subPizzaCounter++;
                    } else {
                        JOptionPane.showMessageDialog(null, "No añadido la pizza!!", "No ha añadido nada!", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    model.addRow(newRow);
                }
            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Loading v2 = new Loading();
                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
                v1.getlistdata(listaProductosP3.getText());
                System.out.println(listaProductosP3.getText() + " in the elegir vent");
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);

                // este es para pasar datos
                v1.getIngList(List);

                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());


    }//GEN-LAST:event_MargaritaMousePressed

    private void CuatroQuesosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuatroQuesosMousePressed
        String name = CuatroQuesos.getText();
        String str = """
                      \nCuatroQuesos
                      \t Mozzarella
                      \t Salsa de Tomate
                      \t Queso de Cabra
                      \t Emmental
                      \t Gorgonzola""";

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
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);

            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);
                v1.getlistdata(listaProductosP3.getText());
                // este es para pasar datos 
                v1.getIngList(List);
                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());

    }//GEN-LAST:event_CuatroQuesosMousePressed

    private void ProsciuttoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProsciuttoMousePressed
        String name = Prosciutto.getText();
        String str = """ 
                      \nProsciutto
                      \t Mozzarella
                      \t Salsa de Tomate
                      \t Jamón york""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("Prosciutto");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        List.add("Jamón york");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);
            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);
                v1.getlistdata(listaProductosP3.getText());
                // este es para pasar datos 
                v1.getIngList(List);
                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_ProsciuttoMousePressed

    private void BBQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBQMousePressed
        String name = BBQ.getText();
        String str = """
                     \nBarbacoa
                     \t Mozzarella
                     \t Salsa de Tomate
                     \t Salsa Barbacoa
                     \t Bacon
                     \t Pollo
                     \t Ternera
                     \t Cebolla""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("Barbacoa");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        List.add("Bacon");
        List.add("Pollo");
        List.add("Ternera");
        List.add("Cebolla");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);
            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);
                v1.getlistdata(listaProductosP3.getText());
                // este es para pasar datos 
                v1.getIngList(List);
                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_BBQMousePressed

    private void MediteraniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediteraniaMousePressed
        String name = Mediterania.getText();
        String str = """
                     \nMediterránia
                     \t Mozzarella
                     \t Salsa de Tomate
                     \t Atún
                     \t Cebolla Morada""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("Mediterránia");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        List.add("Atún");
        List.add("Cebolla Morada");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);
            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);
                v1.getlistdata(listaProductosP3.getText());
                // este es para pasar datos 
                v1.getIngList(List);
                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_MediteraniaMousePressed

    private void Estaciones4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Estaciones4MousePressed
        String name = Estaciones4.getText();
        String str = """
                     \n4Estaciones
                     \t Mozzarella
                     \t Salsa de Tomate
                     \t Olivas Negras
                     \t Jamón york
                     \t Champiñones
                     \t Cebolla""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("4Estaciones");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        List.add("Olivas Negras");
        List.add("Jamón york");
        List.add("Champiñones");
        List.add("Cebolla");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);
            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);
                v1.getlistdata(listaProductosP3.getText());
                // este es para pasar datos 
                v1.getIngList(List);
                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_Estaciones4MousePressed

    private void VegetarianaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VegetarianaMousePressed
        String name = Vegetariana.getText();
        String str = """
                     \nVegetariana
                     \t Mozzarella
                     \t Salsa de Tomate
                     \t Champiñones
                     \t Tomate
                     \t Calabacín
                     \t Parmesano
                     \t Cebolla Morada""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("Vegetariana");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        List.add("Champiñones");
        List.add("Tomate");
        List.add("Calabacín");
        List.add("Parmesano");
        List.add("Cebolla Morada");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);
            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);
                v1.getlistdata(listaProductosP3.getText());
                // este es para pasar datos 
                v1.getIngList(List);
                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_VegetarianaMousePressed

    private void HavaianaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaianaMousePressed
        String name = Havaiana.getText();
        String str = """
                     \nHavaiana
                     \t Mozzarella
                     \t Salsa de Tomate
                     \t Piña
                     \t Jamón york""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("Havaiana");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        List.add("Piña");
        List.add("Jamón york");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);
            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);
                v1.getlistdata(listaProductosP3.getText());
                // este es para pasar datos 
                v1.getIngList(List);
                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_HavaianaMousePressed

    private void DiCabraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiCabraMousePressed
        String name = DiCabra.getText();
        String str = """
                     \nDiCabra
                     \t Mozzarella
                     \t Salsa de Tomate
                     \t Doble Queso de Cabra
                     \t Cebolla Caramelizada""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("DiCabra");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        List.add("Doble Queso de Cabra");
        List.add("Cebolla Caramelizada");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);
            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);
                // este es para pasar datos 
                v1.getlistdata(listaProductosP3.getText());
                v1.getIngList(List);
                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_DiCabraMousePressed

    private void PepperoniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PepperoniMousePressed
        // TODO add your handling code here:
        String str = """
                     \nPepperoni
                     \t Mozzarella
                     \t Salsa de Tomate
                     \t Pepperoni""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("Pepperoni");
        List.add("Mozzarella");
        List.add("Salsa de Tomate");
        List.add("Pepperoni");
        //---------------------------

        menu.removeAll();
        menu.add(new JMenuItem(new AbstractAction("Añadir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProductosP3.setText(listaProductosP3.getText() + str);
            }
        }));

        menu.add(new JMenuItem(new AbstractAction("Modificar") {
            @Override
            public void actionPerformed(ActionEvent e) {

                ModificarPizza v1 = new ModificarPizza();
                v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
                v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
                v1.setVisible(true);
//                v1.DataLogin(jLabel1.getText(), tipoDePedido);
                // este es para pasar datos 
                v1.getlistdata(listaProductosP3.getText());
                v1.getIngList(List);
                dispose();
            }
        }));
        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_PepperoniMousePressed

    private void PepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepperoniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PepperoniActionPerformed

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
            java.util.logging.Logger.getLogger(P3_EligirPizzas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P3_EligirPizzas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P3_EligirPizzas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P3_EligirPizzas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P3_EligirPizzas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBQ;
    private javax.swing.JButton CuatroQuesos;
    private javax.swing.JButton DiCabra;
    private javax.swing.JButton Estaciones4;
    private javax.swing.JButton Havaiana;
    private javax.swing.JTable ListTable;
    private javax.swing.JButton Margarita;
    private javax.swing.JButton Mediterania;
    private javax.swing.JButton P3_Siguiente;
    private javax.swing.JButton Pepperoni;
    private javax.swing.JButton Prosciutto;
    private javax.swing.JButton Vegetariana;
    private javax.swing.JButton btn_crearNuevoPedido;
    private javax.swing.JButton btn_modificarPedido;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea listaProductosP3;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}
