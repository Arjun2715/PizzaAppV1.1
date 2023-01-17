package com.mycompany.pizzaapp;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
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

/**
 *
 * @author arjun
 */
public class EligirPizzas extends javax.swing.JFrame {

    final JPopupMenu menu = new JPopupMenu("Options");
    public String updateLista;
    public String tipoDePedido;
    public ArrayList<String> DatosDeClientes= new ArrayList<>();;

    public EligirPizzas() {
        initComponents();
        editComponentes();
//        String listData = listaProductosP3.getText();
    }

    public void DataLogin(String Nombre, String TipoDePedido, ArrayList<String> datosCliente) { //metodo para sacar nombre del usuario de la pagina login
        jLabel1.setText(Nombre.substring(0, 1).toUpperCase() + "" + Nombre.substring(1));
        jLabel1.setBorder(new EmptyBorder(0, 10, 0, 0));
        jLabel1.setOpaque(true);
        //tipo
        tipoDePedido = TipoDePedido;
        DatosDeClientes = datosCliente;
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
        
        GuardarImg.setIcon(new ImageIcon("IMG\\buttons\\guardar_main.png"));
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
        Margarita = new javax.swing.JButton();
        CuatroQuesos = new javax.swing.JButton();
        Prosciutto = new javax.swing.JButton();
        BBQ = new javax.swing.JButton();
        Estaciones4 = new javax.swing.JButton();
        Mediterania = new javax.swing.JButton();
        Vegetariana = new javax.swing.JButton();
        Havaiana = new javax.swing.JButton();
        DiCabra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductosP3 = new javax.swing.JTextArea();
        Pepperoni = new javax.swing.JButton();
        GuardarImg = new javax.swing.JLabel();
        RightSideNav = new javax.swing.JPanel();
        btn_crearNuevoPedido = new javax.swing.JButton();
        btn_modificarPedido = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        TopBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 800));

        Margarita.setBackground(new java.awt.Color(245, 245, 236));
        Margarita.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Margarita.setText("Margarita");
        Margarita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Margarita.setFocusable(false);
        Margarita.setMaximumSize(new java.awt.Dimension(250, 200));
        Margarita.setPreferredSize(new java.awt.Dimension(250, 200));
        Margarita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Margarita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MargaritaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MargaritaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MargaritaMousePressed(evt);
            }
        });

        CuatroQuesos.setBackground(new java.awt.Color(245, 245, 236));
        CuatroQuesos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CuatroQuesos.setText("CuatroQuesos");
        CuatroQuesos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        CuatroQuesos.setFocusable(false);
        CuatroQuesos.setMaximumSize(new java.awt.Dimension(250, 200));
        CuatroQuesos.setPreferredSize(new java.awt.Dimension(250, 200));
        CuatroQuesos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CuatroQuesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CuatroQuesosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuatroQuesosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CuatroQuesosMousePressed(evt);
            }
        });

        Prosciutto.setBackground(new java.awt.Color(245, 245, 236));
        Prosciutto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Prosciutto.setText("Prosciutto");
        Prosciutto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Prosciutto.setFocusable(false);
        Prosciutto.setMaximumSize(new java.awt.Dimension(250, 200));
        Prosciutto.setPreferredSize(new java.awt.Dimension(250, 200));
        Prosciutto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Prosciutto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProsciuttoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProsciuttoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProsciuttoMousePressed(evt);
            }
        });

        BBQ.setBackground(new java.awt.Color(245, 245, 236));
        BBQ.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BBQ.setText("BBQ");
        BBQ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        BBQ.setFocusable(false);
        BBQ.setMaximumSize(new java.awt.Dimension(250, 200));
        BBQ.setPreferredSize(new java.awt.Dimension(250, 200));
        BBQ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BBQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BBQMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BBQMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BBQMousePressed(evt);
            }
        });

        Estaciones4.setBackground(new java.awt.Color(245, 245, 236));
        Estaciones4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Estaciones4.setText("4Estaciones");
        Estaciones4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Estaciones4.setFocusable(false);
        Estaciones4.setMaximumSize(new java.awt.Dimension(250, 200));
        Estaciones4.setPreferredSize(new java.awt.Dimension(250, 200));
        Estaciones4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Estaciones4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Estaciones4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Estaciones4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Estaciones4MousePressed(evt);
            }
        });

        Mediterania.setBackground(new java.awt.Color(245, 245, 236));
        Mediterania.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Mediterania.setText("Mediterrania");
        Mediterania.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Mediterania.setFocusable(false);
        Mediterania.setMaximumSize(new java.awt.Dimension(250, 200));
        Mediterania.setPreferredSize(new java.awt.Dimension(250, 200));
        Mediterania.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Mediterania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MediteraniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MediteraniaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MediteraniaMousePressed(evt);
            }
        });
        Mediterania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediteraniaActionPerformed(evt);
            }
        });

        Vegetariana.setBackground(new java.awt.Color(245, 245, 236));
        Vegetariana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Vegetariana.setText("Vegetariana");
        Vegetariana.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Vegetariana.setFocusable(false);
        Vegetariana.setMaximumSize(new java.awt.Dimension(250, 200));
        Vegetariana.setPreferredSize(new java.awt.Dimension(250, 200));
        Vegetariana.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Vegetariana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VegetarianaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VegetarianaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VegetarianaMousePressed(evt);
            }
        });

        Havaiana.setBackground(new java.awt.Color(245, 245, 236));
        Havaiana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Havaiana.setText("Havaiana");
        Havaiana.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Havaiana.setFocusable(false);
        Havaiana.setMaximumSize(new java.awt.Dimension(250, 200));
        Havaiana.setPreferredSize(new java.awt.Dimension(250, 200));
        Havaiana.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Havaiana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HavaianaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HavaianaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HavaianaMousePressed(evt);
            }
        });

        DiCabra.setBackground(new java.awt.Color(245, 245, 236));
        DiCabra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        DiCabra.setText("DiCabra");
        DiCabra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        DiCabra.setFocusable(false);
        DiCabra.setMaximumSize(new java.awt.Dimension(250, 200));
        DiCabra.setPreferredSize(new java.awt.Dimension(250, 200));
        DiCabra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DiCabra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DiCabraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DiCabraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DiCabraMousePressed(evt);
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
        Pepperoni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Pepperoni.setFocusable(false);
        Pepperoni.setMaximumSize(new java.awt.Dimension(250, 200));
        Pepperoni.setPreferredSize(new java.awt.Dimension(250, 200));
        Pepperoni.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Pepperoni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PepperoniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PepperoniMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PepperoniMousePressed(evt);
            }
        });
        Pepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepperoniActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mediterania, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estaciones4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Margarita, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Vegetariana, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CuatroQuesos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Havaiana, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Prosciutto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DiCabra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BBQ, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(Pepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        MainPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BBQ, CuatroQuesos, DiCabra, Estaciones4, Havaiana, Margarita, Mediterania, Prosciutto, Vegetariana});

        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Prosciutto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Margarita, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CuatroQuesos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Havaiana, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Mediterania, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiCabra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Vegetariana, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BBQ, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Estaciones4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        MainPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BBQ, CuatroQuesos, DiCabra, Estaciones4, Havaiana, Margarita, Mediterania, Prosciutto, Vegetariana});

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
        btn_modificarPedido.setEnabled(false);
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
                .addComponent(btn_crearNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_modificarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RightSideNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addComponent(TopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightSideNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void MargaritaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MargaritaMousePressed

        String name = Margarita.getText();
        String str = """
                     \nMargarita
                     \tMozzarella
                     \tSalsa de Tomate""";

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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);

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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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
                     \nBBQ
                     \t Mozzarella
                     \t Salsa de Tomate
                     \t Salsa Barbacoa
                     \t Bacon
                     \t Pollo
                     \t Ternera
                     \t Cebolla""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("BBQ");
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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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
                     \nMediterrania
                     \t Mozzarella
                     \t Salsa de Tomate
                     \t Atún
                     \t Cebolla Morada""";

        //--------------array de datos 
        ArrayList<String> List = new ArrayList<>();
        List.add("Mediterrania");
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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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
                v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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

    private void MargaritaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MargaritaMouseEntered
        // TODO add your handling code here:
        Margarita.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_MargaritaMouseEntered

    private void MargaritaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MargaritaMouseExited
        // TODO add your handling code here:
        Margarita.setBackground(new java.awt.Color(245, 245, 236));
        
    }//GEN-LAST:event_MargaritaMouseExited

    private void CuatroQuesosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuatroQuesosMouseEntered
        // TODO add your handling code here:
        CuatroQuesos.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CuatroQuesosMouseEntered

    private void CuatroQuesosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuatroQuesosMouseExited
        // TODO add your handling code here:
        CuatroQuesos.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_CuatroQuesosMouseExited

    private void ProsciuttoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProsciuttoMouseEntered
        // TODO add your handling code here:
        Prosciutto.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_ProsciuttoMouseEntered

    private void ProsciuttoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProsciuttoMouseExited
        // TODO add your handling code here:
        Prosciutto.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_ProsciuttoMouseExited

    private void BBQMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBQMouseEntered
        // TODO add your handling code here:
        BBQ.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_BBQMouseEntered

    private void BBQMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBQMouseExited
        // TODO add your handling code here:
        BBQ.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_BBQMouseExited

    private void MediteraniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediteraniaMouseEntered
        // TODO add your handling code here:
        Mediterania.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_MediteraniaMouseEntered

    private void MediteraniaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediteraniaMouseExited
        // TODO add your handling code here:
        Mediterania.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_MediteraniaMouseExited

    private void VegetarianaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VegetarianaMouseEntered
        // TODO add your handling code here:
        Vegetariana.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_VegetarianaMouseEntered

    private void VegetarianaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VegetarianaMouseExited
        // TODO add your handling code here:
        Vegetariana.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_VegetarianaMouseExited

    private void HavaianaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaianaMouseEntered
        // TODO add your handling code here:
        Havaiana.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_HavaianaMouseEntered

    private void HavaianaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaianaMouseExited
        // TODO add your handling code here:
        Havaiana.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_HavaianaMouseExited

    private void DiCabraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiCabraMouseEntered
        // TODO add your handling code here:
        DiCabra.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_DiCabraMouseEntered

    private void DiCabraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiCabraMouseExited
        // TODO add your handling code here:
        DiCabra.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_DiCabraMouseExited

    private void Estaciones4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Estaciones4MouseEntered
        // TODO add your handling code here:
        Estaciones4.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_Estaciones4MouseEntered

    private void Estaciones4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Estaciones4MouseExited
        // TODO add your handling code here:
        Estaciones4.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_Estaciones4MouseExited

    private void PepperoniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PepperoniMouseEntered
        // TODO add your handling code here:
        Pepperoni.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_PepperoniMouseEntered

    private void PepperoniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PepperoniMouseExited
        // TODO add your handling code here:
        Pepperoni.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_PepperoniMouseExited

    private void btn_crearNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearNuevoPedidoActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null, "¿Hacer el pedido de nuevo?", "Nuevo Pedido", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            Main v1 = new Main();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText());
            dispose();
        }
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

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        dispose();
        Login v1 = new Login();
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);

        v1.setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    private void MediteraniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediteraniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediteraniaActionPerformed

    private void GuardarImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarImgMouseClicked
         // TODO add your handling code here:
        ElegirBebidas v1 = new ElegirBebidas();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setVisible(true);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.getListaArticulo(listaProductosP3.getText());
        v1.DataLogin(jLabel1.getText(), tipoDePedido,DatosDeClientes);
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
            java.util.logging.Logger.getLogger(EligirPizzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EligirPizzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EligirPizzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EligirPizzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EligirPizzas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBQ;
    private javax.swing.JButton CuatroQuesos;
    private javax.swing.JButton DiCabra;
    private javax.swing.JButton Estaciones4;
    private javax.swing.JLabel GuardarImg;
    private javax.swing.JButton Havaiana;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Margarita;
    private javax.swing.JButton Mediterania;
    private javax.swing.JButton Pepperoni;
    private javax.swing.JButton Prosciutto;
    private javax.swing.JPanel RightSideNav;
    private javax.swing.JPanel TopBar;
    private javax.swing.JButton Vegetariana;
    private javax.swing.JButton btn_crearNuevoPedido;
    private javax.swing.JButton btn_modificarPedido;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea listaProductosP3;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}
