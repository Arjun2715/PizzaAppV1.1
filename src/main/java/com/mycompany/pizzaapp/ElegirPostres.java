/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pizzaapp;

import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author arjun
 */
public class ElegirPostres extends javax.swing.JFrame {

    public String tipoDePedido;

    public ArrayList<String> DatosDeClientes = new ArrayList<>();

    ;
    public ElegirPostres() {
        initComponents();
        editComponentes();

    }

    public void getListaArticulo(String data) {
        jTextArea1.setText(data);
        jTextArea1.setText(jTextArea1.getText() + "\n\nPostres:");
    }

    public void DataLogin(String Nombre, String TipoDePedido, ArrayList<String> datosCliente) { //metodo para sacar nombre del usuario de la pagina login
        jLabel1.setText(Nombre.substring(0, 1).toUpperCase() + "" + Nombre.substring(1));
        jLabel1.setBorder(new EmptyBorder(0, 10, 0, 0));
        jLabel1.setOpaque(true);
        //tipo
        tipoDePedido = TipoDePedido;
        DatosDeClientes = datosCliente;
    }

    private void editComponentes() {

        //imagenes de los componentes
        btn_crearNuevoPedido.setIcon(new ImageIcon("IMG\\pizza.png"));
        btn_crearNuevoPedido.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_crearNuevoPedido.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_crearNuevoPedido.setFocusable(false);
        btn_modificarPedido.setIcon(new ImageIcon("IMG\\modificar_pedido.png"));
        btn_modificarPedido.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_modificarPedido.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_modificarPedido.setFocusable(false);
        jTextArea1.setFont(new Font("Plain", Font.BOLD, 18));

        //postre1
        SaltedCaramel.setIcon(new ImageIcon("IMG\\postres\\" + SaltedCaramel.getText() + ".png"));
//        postre1.setBorder(new EmptyBorder(5,5,5,5));
        SaltedCaramel.setVerticalTextPosition(SwingConstants.BOTTOM);
        SaltedCaramel.setHorizontalTextPosition(SwingConstants.CENTER);
        SaltedCaramel.setFocusable(false);

        //postre2
        CookieDough.setIcon(new ImageIcon("IMG\\postres\\" + CookieDough.getText() + ".png"));
//        postre2.setBorder(new EmptyBorder(5,5,5,5));
        CookieDough.setVerticalTextPosition(SwingConstants.BOTTOM);
        CookieDough.setHorizontalTextPosition(SwingConstants.CENTER);
        CookieDough.setFocusable(false);

        //postre3
        FudgeBrownie.setIcon(new ImageIcon("IMG\\postres\\" + FudgeBrownie.getText() + ".png"));
//        postre3.setBorder(new EmptyBorder(5,5,5,5));
        FudgeBrownie.setVerticalTextPosition(SwingConstants.BOTTOM);
        FudgeBrownie.setHorizontalTextPosition(SwingConstants.CENTER);
        FudgeBrownie.setFocusable(false);

        //postre4
        ChunckyMonkey.setIcon(new ImageIcon("IMG\\postres\\" + ChunckyMonkey.getText() + ".png"));
//        postre4.setBorder(new EmptyBorder(5,5,5,5));
        ChunckyMonkey.setVerticalTextPosition(SwingConstants.BOTTOM);
        ChunckyMonkey.setHorizontalTextPosition(SwingConstants.CENTER);
        ChunckyMonkey.setFocusable(false);

        //postre5
        CherryGracia.setIcon(new ImageIcon("IMG\\postres\\" + CherryGracia.getText() + ".png"));
//        postre5.setBorder(new EmptyBorder(5,5,5,5));
        CherryGracia.setVerticalTextPosition(SwingConstants.BOTTOM);
        CherryGracia.setHorizontalTextPosition(SwingConstants.CENTER);
        CherryGracia.setFocusable(false);

        //postre6
        HalfBackedFroyo.setIcon(new ImageIcon("IMG\\postres\\" + HalfBackedFroyo.getText() + ".png"));
//        postre6.setBorder(new EmptyBorder(5,5,5,5));
        HalfBackedFroyo.setVerticalTextPosition(SwingConstants.BOTTOM);
        HalfBackedFroyo.setHorizontalTextPosition(SwingConstants.CENTER);
        HalfBackedFroyo.setFocusable(false);

        //main_centerImg.setIcon(new ImageIcon("IMG\\icon.png"));
        //set date 
        date.setText(date());
        //logout button
        logOut.setIcon(new ImageIcon("IMG\\logout.png"));
        logOut.setBorder(new EmptyBorder(2, 2, 2, 2));
        GuardarImg.setIcon(new ImageIcon("IMG\\buttons\\guardar_main.png"));
        jTextArea1.setBorder(BorderFactory.createCompoundBorder(jTextArea1.getBorder(), BorderFactory.createEmptyBorder(20, 20, 20, 20)));

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
        SaltedCaramel = new javax.swing.JButton();
        CookieDough = new javax.swing.JButton();
        FudgeBrownie = new javax.swing.JButton();
        ChunckyMonkey = new javax.swing.JButton();
        CherryGracia = new javax.swing.JButton();
        HalfBackedFroyo = new javax.swing.JButton();
        sinPostre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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

        SaltedCaramel.setBackground(new java.awt.Color(245, 245, 236));
        SaltedCaramel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SaltedCaramel.setText("SaltedCaramel");
        SaltedCaramel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        SaltedCaramel.setFocusable(false);
        SaltedCaramel.setMaximumSize(new java.awt.Dimension(250, 200));
        SaltedCaramel.setPreferredSize(new java.awt.Dimension(250, 200));
        SaltedCaramel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SaltedCaramel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaltedCaramelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaltedCaramelMouseExited(evt);
            }
        });
        SaltedCaramel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaltedCaramelActionPerformed(evt);
            }
        });

        CookieDough.setBackground(new java.awt.Color(245, 245, 236));
        CookieDough.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CookieDough.setText("CookieDough");
        CookieDough.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        CookieDough.setFocusable(false);
        CookieDough.setMaximumSize(new java.awt.Dimension(250, 200));
        CookieDough.setPreferredSize(new java.awt.Dimension(250, 200));
        CookieDough.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CookieDough.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CookieDoughMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CookieDoughMouseExited(evt);
            }
        });
        CookieDough.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CookieDoughActionPerformed(evt);
            }
        });

        FudgeBrownie.setBackground(new java.awt.Color(245, 245, 236));
        FudgeBrownie.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FudgeBrownie.setText("FudgeBrownie");
        FudgeBrownie.setActionCommand("");
        FudgeBrownie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        FudgeBrownie.setFocusable(false);
        FudgeBrownie.setMaximumSize(new java.awt.Dimension(250, 200));
        FudgeBrownie.setPreferredSize(new java.awt.Dimension(250, 200));
        FudgeBrownie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FudgeBrownie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FudgeBrownieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FudgeBrownieMouseExited(evt);
            }
        });
        FudgeBrownie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FudgeBrownieActionPerformed(evt);
            }
        });

        ChunckyMonkey.setBackground(new java.awt.Color(245, 245, 236));
        ChunckyMonkey.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ChunckyMonkey.setText("ChunckyMonkey");
        ChunckyMonkey.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        ChunckyMonkey.setFocusable(false);
        ChunckyMonkey.setMaximumSize(new java.awt.Dimension(250, 200));
        ChunckyMonkey.setPreferredSize(new java.awt.Dimension(250, 200));
        ChunckyMonkey.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ChunckyMonkey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChunckyMonkeyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChunckyMonkeyMouseExited(evt);
            }
        });
        ChunckyMonkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChunckyMonkeyActionPerformed(evt);
            }
        });

        CherryGracia.setBackground(new java.awt.Color(245, 245, 236));
        CherryGracia.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CherryGracia.setText("CherryGracia");
        CherryGracia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        CherryGracia.setFocusable(false);
        CherryGracia.setMaximumSize(new java.awt.Dimension(250, 200));
        CherryGracia.setPreferredSize(new java.awt.Dimension(250, 200));
        CherryGracia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CherryGracia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CherryGraciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CherryGraciaMouseExited(evt);
            }
        });
        CherryGracia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CherryGraciaActionPerformed(evt);
            }
        });

        HalfBackedFroyo.setBackground(new java.awt.Color(245, 245, 236));
        HalfBackedFroyo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        HalfBackedFroyo.setText("HalfBackedFroyo");
        HalfBackedFroyo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        HalfBackedFroyo.setFocusable(false);
        HalfBackedFroyo.setMaximumSize(new java.awt.Dimension(250, 200));
        HalfBackedFroyo.setPreferredSize(new java.awt.Dimension(250, 200));
        HalfBackedFroyo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        HalfBackedFroyo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HalfBackedFroyoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HalfBackedFroyoMouseExited(evt);
            }
        });
        HalfBackedFroyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HalfBackedFroyoActionPerformed(evt);
            }
        });

        sinPostre.setBackground(new java.awt.Color(245, 245, 236));
        sinPostre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sinPostre.setText("Sin Postre");
        sinPostre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        sinPostre.setFocusable(false);
        sinPostre.setMaximumSize(new java.awt.Dimension(250, 200));
        sinPostre.setPreferredSize(new java.awt.Dimension(250, 200));
        sinPostre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sinPostre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sinPostreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sinPostreMouseExited(evt);
            }
        });
        sinPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinPostreActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaltedCaramel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HalfBackedFroyo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CookieDough, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CherryGracia, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sinPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(FudgeBrownie, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(ChunckyMonkey, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CookieDough, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaltedCaramel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FudgeBrownie, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChunckyMonkey, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CherryGracia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HalfBackedFroyo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sinPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
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
                .addComponent(btn_crearNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_modificarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
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
            .addComponent(TopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RightSideNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightSideNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaltedCaramelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaltedCaramelActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + SaltedCaramel.getText());
        sinPostre.setEnabled(false);
    }//GEN-LAST:event_SaltedCaramelActionPerformed

    private void CookieDoughActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CookieDoughActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + CookieDough.getText());
        sinPostre.setEnabled(false);
    }//GEN-LAST:event_CookieDoughActionPerformed

    private void FudgeBrownieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FudgeBrownieActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + FudgeBrownie.getText());
        sinPostre.setEnabled(false);
    }//GEN-LAST:event_FudgeBrownieActionPerformed

    private void ChunckyMonkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChunckyMonkeyActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + ChunckyMonkey.getText());
        sinPostre.setEnabled(false);
    }//GEN-LAST:event_ChunckyMonkeyActionPerformed

    private void CherryGraciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CherryGraciaActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + CherryGracia.getText());
        sinPostre.setEnabled(false);
    }//GEN-LAST:event_CherryGraciaActionPerformed

    private void HalfBackedFroyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HalfBackedFroyoActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + HalfBackedFroyo.getText());
        sinPostre.setEnabled(false);
    }//GEN-LAST:event_HalfBackedFroyoActionPerformed

    private void sinPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinPostreActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\nSin Postre");
        MetodosPago v1 = new MetodosPago();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setVisible(true);
        v1.getListData(jTextArea1.getText());
        v1.DataLogin(jLabel1.getText(), tipoDePedido, DatosDeClientes);
        dispose();


    }//GEN-LAST:event_sinPostreActionPerformed

    private void SaltedCaramelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaltedCaramelMouseEntered
        // TODO add your handling code here:
        SaltedCaramel.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_SaltedCaramelMouseEntered

    private void SaltedCaramelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaltedCaramelMouseExited
        // TODO add your handling code here:
        SaltedCaramel.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_SaltedCaramelMouseExited

    private void CookieDoughMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CookieDoughMouseEntered
        // TODO add your handling code here:
        CookieDough.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CookieDoughMouseEntered

    private void CookieDoughMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CookieDoughMouseExited
        // TODO add your handling code here:
        CookieDough.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_CookieDoughMouseExited

    private void FudgeBrownieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FudgeBrownieMouseEntered
        // TODO add your handling code here:
        FudgeBrownie.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_FudgeBrownieMouseEntered

    private void FudgeBrownieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FudgeBrownieMouseExited
        // TODO add your handling code here:
        FudgeBrownie.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_FudgeBrownieMouseExited

    private void ChunckyMonkeyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChunckyMonkeyMouseEntered
        // TODO add your handling code here:
        ChunckyMonkey.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_ChunckyMonkeyMouseEntered

    private void ChunckyMonkeyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChunckyMonkeyMouseExited
        // TODO add your handling code here:
        ChunckyMonkey.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_ChunckyMonkeyMouseExited

    private void HalfBackedFroyoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HalfBackedFroyoMouseEntered
        // TODO add your handling code here:
        HalfBackedFroyo.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_HalfBackedFroyoMouseEntered

    private void HalfBackedFroyoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HalfBackedFroyoMouseExited
        // TODO add your handling code here:
        HalfBackedFroyo.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_HalfBackedFroyoMouseExited

    private void CherryGraciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CherryGraciaMouseEntered
        // TODO add your handling code here:
        CherryGracia.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CherryGraciaMouseEntered

    private void CherryGraciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CherryGraciaMouseExited
        // TODO add your handling code here:
        CherryGracia.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_CherryGraciaMouseExited

    private void sinPostreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinPostreMouseEntered
        // TODO add your handling code here:
        sinPostre.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_sinPostreMouseEntered

    private void sinPostreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinPostreMouseExited
        // TODO add your handling code here:
        sinPostre.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_sinPostreMouseExited

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

    private void GuardarImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarImgMouseClicked
       // TODO add your handling code here:
        MetodosPago v1 = new MetodosPago();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setVisible(true);
        v1.getListData(jTextArea1.getText());
        v1.DataLogin(jLabel1.getText(), tipoDePedido, DatosDeClientes);
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
            java.util.logging.Logger.getLogger(ElegirPostres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirPostres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirPostres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirPostres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ElegirPostres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CherryGracia;
    private javax.swing.JButton ChunckyMonkey;
    private javax.swing.JButton CookieDough;
    private javax.swing.JButton FudgeBrownie;
    private javax.swing.JLabel GuardarImg;
    private javax.swing.JButton HalfBackedFroyo;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel RightSideNav;
    private javax.swing.JButton SaltedCaramel;
    private javax.swing.JPanel TopBar;
    private javax.swing.JButton btn_crearNuevoPedido;
    private javax.swing.JButton btn_modificarPedido;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton sinPostre;
    // End of variables declaration//GEN-END:variables
}
