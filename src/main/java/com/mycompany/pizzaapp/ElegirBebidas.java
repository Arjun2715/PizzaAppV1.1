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
public class ElegirBebidas extends javax.swing.JFrame {

    public String tipoDePedido;

    public ArrayList<String> DatosDeClientes = new ArrayList<>();

    ;
    public ElegirBebidas() {
        initComponents();
        editComponentes();

    }

    public void getListaArticulo(String data) {
        jTextArea1.setText(data);
        jTextArea1.setText(jTextArea1.getText() + "\n\nBebidas: ");
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

        //bebida1
        CocaColaZero.setIcon(new ImageIcon("IMG\\bebidas\\"+CocaColaZero.getText()+".png"));
//        bebida1.setBorder(new EmptyBorder(5,5,5,5));
        CocaColaZero.setVerticalTextPosition(SwingConstants.BOTTOM);
        CocaColaZero.setHorizontalTextPosition(SwingConstants.CENTER);
        CocaColaZero.setFocusable(false);

        //bebida2
        CocaCola.setIcon(new ImageIcon("IMG\\bebidas\\"+CocaCola.getText()+".png"));
//        bebida2.setBorder(new EmptyBorder(5,5,5,5));
        CocaCola.setVerticalTextPosition(SwingConstants.BOTTOM);
        CocaCola.setHorizontalTextPosition(SwingConstants.CENTER);
        CocaCola.setFocusable(false);

        //bebida3
        Nestea.setIcon(new ImageIcon("IMG\\bebidas\\"+Nestea.getText()+".png"));
//        bebida3.setBorder(new EmptyBorder(5,5,5,5));
        Nestea.setVerticalTextPosition(SwingConstants.BOTTOM);
        Nestea.setHorizontalTextPosition(SwingConstants.CENTER);
        Nestea.setFocusable(false);

        //bebeida4
        Agua.setIcon(new ImageIcon("IMG\\bebidas\\"+Agua.getText()+".png"));
//        bebida4.setBorder(new EmptyBorder(5,5,5,5));
        Agua.setVerticalTextPosition(SwingConstants.BOTTOM);
        Agua.setHorizontalTextPosition(SwingConstants.CENTER);
        Agua.setFocusable(false);

        //bebida5
        Fanta.setIcon(new ImageIcon("IMG\\bebidas\\"+Fanta.getText()+".png"));
//        bebida5.setBorder(new EmptyBorder(5,5,5,5));
        Fanta.setVerticalTextPosition(SwingConstants.BOTTOM);
        Fanta.setHorizontalTextPosition(SwingConstants.CENTER);
        Fanta.setFocusable(false);

        //bebida6
        Aquiarius.setIcon(new ImageIcon("IMG\\bebidas\\"+Aquiarius.getText()+".png"));
//        bebida6.setBorder(new EmptyBorder(5,5,5,5));
        Aquiarius.setVerticalTextPosition(SwingConstants.BOTTOM);
        Aquiarius.setHorizontalTextPosition(SwingConstants.CENTER);
        Aquiarius.setFocusable(false);

        //bebida7
        Cerveza.setIcon(new ImageIcon("IMG\\bebidas\\"+Cerveza.getText()+".png"));
//        bebida7.setBorder(new EmptyBorder(5,5,5,5));
        Cerveza.setVerticalTextPosition(SwingConstants.BOTTOM);
        Cerveza.setHorizontalTextPosition(SwingConstants.CENTER);
        Cerveza.setFocusable(false);

        //main_centerImg.setIcon(new ImageIcon("IMG\\icon.png"));
        //set date 
        date.setText(date());
        //logout button
        logOut.setIcon(new ImageIcon("IMG\\logout.png"));
        logOut.setBorder(new EmptyBorder(2, 2, 2, 2));

        //area box
        jTextArea1.setBorder(BorderFactory.createCompoundBorder(
                jTextArea1.getBorder(),
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
        CocaColaZero = new javax.swing.JButton();
        CocaCola = new javax.swing.JButton();
        Nestea = new javax.swing.JButton();
        Agua = new javax.swing.JButton();
        Fanta = new javax.swing.JButton();
        Aquiarius = new javax.swing.JButton();
        Cerveza = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        sinBebida = new javax.swing.JButton();
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

        CocaColaZero.setBackground(new java.awt.Color(245, 245, 236));
        CocaColaZero.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CocaColaZero.setText("CocaColaZero");
        CocaColaZero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        CocaColaZero.setFocusable(false);
        CocaColaZero.setMaximumSize(new java.awt.Dimension(250, 200));
        CocaColaZero.setPreferredSize(new java.awt.Dimension(250, 200));
        CocaColaZero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CocaColaZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CocaColaZeroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CocaColaZeroMouseExited(evt);
            }
        });
        CocaColaZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocaColaZeroActionPerformed(evt);
            }
        });

        CocaCola.setBackground(new java.awt.Color(245, 245, 236));
        CocaCola.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CocaCola.setText("CocaCola");
        CocaCola.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        CocaCola.setFocusable(false);
        CocaCola.setMaximumSize(new java.awt.Dimension(250, 200));
        CocaCola.setPreferredSize(new java.awt.Dimension(250, 200));
        CocaCola.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CocaCola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CocaColaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CocaColaMouseExited(evt);
            }
        });
        CocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocaColaActionPerformed(evt);
            }
        });

        Nestea.setBackground(new java.awt.Color(245, 245, 236));
        Nestea.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Nestea.setText("Nestea");
        Nestea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Nestea.setFocusable(false);
        Nestea.setMaximumSize(new java.awt.Dimension(250, 200));
        Nestea.setPreferredSize(new java.awt.Dimension(250, 200));
        Nestea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Nestea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NesteaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NesteaMouseExited(evt);
            }
        });
        Nestea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NesteaActionPerformed(evt);
            }
        });

        Agua.setBackground(new java.awt.Color(245, 245, 236));
        Agua.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Agua.setText("Agua");
        Agua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Agua.setFocusable(false);
        Agua.setMaximumSize(new java.awt.Dimension(250, 200));
        Agua.setPreferredSize(new java.awt.Dimension(250, 200));
        Agua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Agua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AguaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AguaMouseExited(evt);
            }
        });
        Agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AguaActionPerformed(evt);
            }
        });

        Fanta.setBackground(new java.awt.Color(245, 245, 236));
        Fanta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Fanta.setText("Fanta");
        Fanta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Fanta.setFocusable(false);
        Fanta.setMaximumSize(new java.awt.Dimension(250, 200));
        Fanta.setPreferredSize(new java.awt.Dimension(250, 200));
        Fanta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Fanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FantaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FantaMouseExited(evt);
            }
        });
        Fanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FantaActionPerformed(evt);
            }
        });

        Aquiarius.setBackground(new java.awt.Color(245, 245, 236));
        Aquiarius.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Aquiarius.setText("Aquiarius");
        Aquiarius.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Aquiarius.setFocusable(false);
        Aquiarius.setMaximumSize(new java.awt.Dimension(250, 200));
        Aquiarius.setPreferredSize(new java.awt.Dimension(250, 200));
        Aquiarius.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Aquiarius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AquiariusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AquiariusMouseExited(evt);
            }
        });
        Aquiarius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AquiariusActionPerformed(evt);
            }
        });

        Cerveza.setBackground(new java.awt.Color(245, 245, 236));
        Cerveza.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Cerveza.setText("Cerveza");
        Cerveza.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Cerveza.setFocusable(false);
        Cerveza.setMaximumSize(new java.awt.Dimension(250, 200));
        Cerveza.setPreferredSize(new java.awt.Dimension(250, 200));
        Cerveza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Cerveza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CervezaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CervezaMouseExited(evt);
            }
        });
        Cerveza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CervezaActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        sinBebida.setBackground(new java.awt.Color(245, 245, 236));
        sinBebida.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sinBebida.setText("Sin Bebida");
        sinBebida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        sinBebida.setFocusable(false);
        sinBebida.setMaximumSize(new java.awt.Dimension(250, 200));
        sinBebida.setPreferredSize(new java.awt.Dimension(250, 200));
        sinBebida.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sinBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sinBebidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sinBebidaMouseExited(evt);
            }
        });
        sinBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinBebidaActionPerformed(evt);
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
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CocaColaZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Aquiarius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CocaCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cerveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(Nestea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(Fanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                .addComponent(sinBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(60, 60, 60))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CocaCola, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(CocaColaZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nestea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Agua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Aquiarius, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(Cerveza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fanta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sinBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
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
                .addComponent(btn_crearNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_modificarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap())
            .addComponent(TopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightSideNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CocaColaZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocaColaZeroActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + CocaColaZero.getText());
        sinBebida.setEnabled(false);
    }//GEN-LAST:event_CocaColaZeroActionPerformed

    private void CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocaColaActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + CocaCola.getText());
        sinBebida.setEnabled(false);
    }//GEN-LAST:event_CocaColaActionPerformed

    private void NesteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NesteaActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + Nestea.getText());
        sinBebida.setEnabled(false);
    }//GEN-LAST:event_NesteaActionPerformed

    private void AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguaActionPerformed
        // TODO add your handling code here:
        sinBebida.setEnabled(false);
        jTextArea1.setText(jTextArea1.getText() + "\n" + Agua.getText());
    }//GEN-LAST:event_AguaActionPerformed

    private void FantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FantaActionPerformed
        // TODO add your handling code here:

        jTextArea1.setText(jTextArea1.getText() + "\n" + Fanta.getText());
        sinBebida.setEnabled(false);
    }//GEN-LAST:event_FantaActionPerformed

    private void AquiariusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AquiariusActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\n" + Aquiarius.getText());
        sinBebida.setEnabled(false);
    }//GEN-LAST:event_AquiariusActionPerformed

    private void CervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CervezaActionPerformed
        // TODO add your handling code here:

        jTextArea1.setText(jTextArea1.getText() + "\n" + Cerveza.getText());
        sinBebida.setEnabled(false);
    }//GEN-LAST:event_CervezaActionPerformed

    private void sinBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinBebidaActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(jTextArea1.getText() + "\nSin Bebidas");
//        CocaCola.setEnabled(false);
//        CocaColaZero.setEnabled(false);
//        Fanta.setEnabled(false);
//        Aquiarius.setEnabled(false);
//        Agua.setEnabled(false);
//        Cerveza.setEnabled(false);
//        Nestea.setEnabled(false);
        ElegirPostres v1 = new ElegirPostres();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setVisible(true);
        v1.getListaArticulo(jTextArea1.getText());
        v1.DataLogin(jLabel1.getText(), tipoDePedido, DatosDeClientes);
        dispose();

    }//GEN-LAST:event_sinBebidaActionPerformed

    private void CocaColaZeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CocaColaZeroMouseEntered
        // TODO add your handling code here:
        CocaColaZero.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CocaColaZeroMouseEntered

    private void CocaColaZeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CocaColaZeroMouseExited
        // TODO add your handling code here:
        CocaColaZero.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_CocaColaZeroMouseExited

    private void CocaColaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CocaColaMouseEntered
        // TODO add your handling code here:
        CocaCola.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CocaColaMouseEntered

    private void CocaColaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CocaColaMouseExited
        // TODO add your handling code here:
        CocaCola.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_CocaColaMouseExited

    private void NesteaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NesteaMouseEntered
        // TODO add your handling code here:
        Nestea.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_NesteaMouseEntered

    private void NesteaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NesteaMouseExited
        // TODO add your handling code here:
        Nestea.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_NesteaMouseExited

    private void AguaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AguaMouseEntered
        // TODO add your handling code here:
        Agua.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_AguaMouseEntered

    private void AguaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AguaMouseExited
        // TODO add your handling code here:
        Agua.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_AguaMouseExited

    private void AquiariusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AquiariusMouseEntered
        // TODO add your handling code here:
        Aquiarius.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_AquiariusMouseEntered

    private void AquiariusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AquiariusMouseExited
        // TODO add your handling code here:
        Aquiarius.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_AquiariusMouseExited

    private void CervezaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CervezaMouseExited
        // TODO add your handling code here:
        Cerveza.setBackground(new java.awt.Color(245, 245, 236));
       
    }//GEN-LAST:event_CervezaMouseExited

    private void CervezaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CervezaMouseEntered
        // TODO add your handling code here:
         Cerveza.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CervezaMouseEntered

    private void FantaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FantaMouseEntered
        // TODO add your handling code here:
        Fanta.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_FantaMouseEntered

    private void FantaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FantaMouseExited
        // TODO add your handling code here:
        Fanta.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_FantaMouseExited

    private void sinBebidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinBebidaMouseEntered
        // TODO add your handling code here:
        sinBebida.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_sinBebidaMouseEntered

    private void sinBebidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinBebidaMouseExited
        // TODO add your handling code here:
        sinBebida.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_sinBebidaMouseExited

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
        ElegirPostres v1 = new ElegirPostres();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setVisible(true);
        v1.getListaArticulo(jTextArea1.getText());
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
            java.util.logging.Logger.getLogger(ElegirBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ElegirBebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agua;
    private javax.swing.JButton Aquiarius;
    private javax.swing.JButton Cerveza;
    private javax.swing.JButton CocaCola;
    private javax.swing.JButton CocaColaZero;
    private javax.swing.JButton Fanta;
    private javax.swing.JLabel GuardarImg;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Nestea;
    private javax.swing.JPanel RightSideNav;
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
    private javax.swing.JButton sinBebida;
    // End of variables declaration//GEN-END:variables
}
