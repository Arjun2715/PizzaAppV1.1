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
public class EligirProductov2Mod extends javax.swing.JFrame {

    final JPopupMenu menu = new JPopupMenu("Options");
    public String updateLista;
    public String tipoDePedido;
    int ArticleIndex;
    ArrayList<String> getCompra = new ArrayList<>();
    ArrayList<String> sendCompra = new ArrayList<>();
    public ArrayList<String> DatosDeClientes = new ArrayList<>();

    ;

    public EligirProductov2Mod() {
        initComponents();
        editComponentes();
//        String listData = listaProductosP3.getText();
    }

    public void DataLogin(String Nombre, ArrayList<String> OgList, ArrayList<String> newList, String FrameName, int changeIndex) { //metodo para sacar nombre del usuario de la pagina login

        ArticleIndex = changeIndex;
        getCompra = OgList;

//         sendCompra = getCompra;
//        sendCompra = newList;
        jLabel1.setText(Nombre.substring(0, 1).toUpperCase() + "" + Nombre.substring(1));
        jLabel1.setBorder(new EmptyBorder(0, 10, 0, 0));
        jLabel1.setOpaque(true);

        //tipo
//        tipoDePedido = TipoDePedido;
//        DatosDeClientes = datosCliente;
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
//        listaProductosP3.setText(updateLista + "\n" + NombrePizza + "\n" + ModifiedPizza);

    }

    private void editComponentes() {
        menu.add("Añadir");
        menu.add("Modificar");
        menu.add(new Button());
        //lista font
//        listaProductosP3.setFont(new Font("Plain", Font.BOLD, 18));
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
        Mediterrania.setIcon(new ImageIcon("IMG\\pizzas\\" + Mediterrania.getText() + ".png"));
//        pizza6.setBorder(new EmptyBorder(5,5,5,5));
        Mediterrania.setVerticalTextPosition(SwingConstants.BOTTOM);
        Mediterrania.setHorizontalTextPosition(SwingConstants.CENTER);
        Mediterrania.setFocusable(false);

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

        //bebida1
        CocaColaZero.setIcon(new ImageIcon("IMG\\bebidas\\" + CocaColaZero.getText() + ".png"));
//        bebida1.setBorder(new EmptyBorder(5,5,5,5));
        CocaColaZero.setVerticalTextPosition(SwingConstants.BOTTOM);
        CocaColaZero.setHorizontalTextPosition(SwingConstants.CENTER);
        CocaColaZero.setFocusable(false);

        //bebida2
        CocaCola.setIcon(new ImageIcon("IMG\\bebidas\\" + CocaCola.getText() + ".png"));
//        bebida2.setBorder(new EmptyBorder(5,5,5,5));
        CocaCola.setVerticalTextPosition(SwingConstants.BOTTOM);
        CocaCola.setHorizontalTextPosition(SwingConstants.CENTER);
        CocaCola.setFocusable(false);

        //bebida3
        Nestea.setIcon(new ImageIcon("IMG\\bebidas\\" + Nestea.getText() + ".png"));
//        bebida3.setBorder(new EmptyBorder(5,5,5,5));
        Nestea.setVerticalTextPosition(SwingConstants.BOTTOM);
        Nestea.setHorizontalTextPosition(SwingConstants.CENTER);
        Nestea.setFocusable(false);

        //bebeida4
        Agua.setIcon(new ImageIcon("IMG\\bebidas\\" + Agua.getText() + ".png"));
//        bebida4.setBorder(new EmptyBorder(5,5,5,5));
        Agua.setVerticalTextPosition(SwingConstants.BOTTOM);
        Agua.setHorizontalTextPosition(SwingConstants.CENTER);
        Agua.setFocusable(false);

        //bebida5
        Fanta.setIcon(new ImageIcon("IMG\\bebidas\\" + Fanta.getText() + ".png"));
//        bebida5.setBorder(new EmptyBorder(5,5,5,5));
        Fanta.setVerticalTextPosition(SwingConstants.BOTTOM);
        Fanta.setHorizontalTextPosition(SwingConstants.CENTER);
        Fanta.setFocusable(false);

        //bebida6
        Aquiarius.setIcon(new ImageIcon("IMG\\bebidas\\" + Aquiarius.getText() + ".png"));
//        bebida6.setBorder(new EmptyBorder(5,5,5,5));
        Aquiarius.setVerticalTextPosition(SwingConstants.BOTTOM);
        Aquiarius.setHorizontalTextPosition(SwingConstants.CENTER);
        Aquiarius.setFocusable(false);

        //bebida7
        Cerveza.setIcon(new ImageIcon("IMG\\bebidas\\" + Cerveza.getText() + ".png"));
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
//        listaProductosP3.setVisible(false);
//        listaProductosP3.setBorder(BorderFactory.createCompoundBorder(
//                listaProductosP3.getBorder(),
//                BorderFactory.createEmptyBorder(20, 20, 20, 20)));
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Margarita = new javax.swing.JButton();
        CuatroQuesos = new javax.swing.JButton();
        Prosciutto = new javax.swing.JButton();
        BBQ = new javax.swing.JButton();
        Estaciones4 = new javax.swing.JButton();
        Mediterrania = new javax.swing.JButton();
        Vegetariana = new javax.swing.JButton();
        Havaiana = new javax.swing.JButton();
        DiCabra = new javax.swing.JButton();
        Pepperoni = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        CocaColaZero = new javax.swing.JButton();
        Aquiarius = new javax.swing.JButton();
        Cerveza = new javax.swing.JButton();
        CocaCola = new javax.swing.JButton();
        Nestea = new javax.swing.JButton();
        Fanta = new javax.swing.JButton();
        Agua = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        ChunckyMonkey = new javax.swing.JButton();
        FudgeBrownie = new javax.swing.JButton();
        CookieDough = new javax.swing.JButton();
        CherryGracia = new javax.swing.JButton();
        HalfBackedFroyo = new javax.swing.JButton();
        SaltedCaramel = new javax.swing.JButton();
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

        MainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane2.setBorder(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pizzas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        Margarita.setBackground(new java.awt.Color(245, 245, 236));
        Margarita.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Margarita.setText("Margarita");
        Margarita.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Margarita.setFocusable(false);
        Margarita.setMaximumSize(new java.awt.Dimension(250, 200));
        Margarita.setMinimumSize(new java.awt.Dimension(250, 200));
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
        Margarita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MargaritaActionPerformed(evt);
            }
        });

        CuatroQuesos.setBackground(new java.awt.Color(245, 245, 236));
        CuatroQuesos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CuatroQuesos.setText("CuatroQuesos");
        CuatroQuesos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        CuatroQuesos.setFocusable(false);
        CuatroQuesos.setMaximumSize(new java.awt.Dimension(250, 200));
        CuatroQuesos.setMinimumSize(new java.awt.Dimension(250, 200));
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
        Prosciutto.setMinimumSize(new java.awt.Dimension(250, 200));
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
        BBQ.setMinimumSize(new java.awt.Dimension(250, 200));
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
        Estaciones4.setMinimumSize(new java.awt.Dimension(250, 200));
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

        Mediterrania.setBackground(new java.awt.Color(245, 245, 236));
        Mediterrania.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Mediterrania.setText("Mediterrania");
        Mediterrania.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Mediterrania.setFocusable(false);
        Mediterrania.setMaximumSize(new java.awt.Dimension(250, 200));
        Mediterrania.setMinimumSize(new java.awt.Dimension(250, 200));
        Mediterrania.setPreferredSize(new java.awt.Dimension(250, 200));
        Mediterrania.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Mediterrania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MediterraniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MediterraniaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MediterraniaMousePressed(evt);
            }
        });
        Mediterrania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediterraniaActionPerformed(evt);
            }
        });

        Vegetariana.setBackground(new java.awt.Color(245, 245, 236));
        Vegetariana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Vegetariana.setText("Vegetariana");
        Vegetariana.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Vegetariana.setFocusable(false);
        Vegetariana.setMaximumSize(new java.awt.Dimension(250, 200));
        Vegetariana.setMinimumSize(new java.awt.Dimension(250, 200));
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
        Havaiana.setMinimumSize(new java.awt.Dimension(250, 200));
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
        DiCabra.setMinimumSize(new java.awt.Dimension(250, 200));
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

        Pepperoni.setBackground(new java.awt.Color(245, 245, 236));
        Pepperoni.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Pepperoni.setText("Pepperoni");
        Pepperoni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 246, 218), 3, true));
        Pepperoni.setFocusable(false);
        Pepperoni.setMaximumSize(new java.awt.Dimension(250, 200));
        Pepperoni.setMinimumSize(new java.awt.Dimension(250, 200));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Estaciones4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prosciutto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Margarita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mediterrania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Havaiana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pepperoni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuatroQuesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vegetariana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DiCabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Estaciones4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Prosciutto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Margarita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuatroQuesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mediterrania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vegetariana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiCabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Havaiana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BBQ, CuatroQuesos, DiCabra, Estaciones4, Havaiana, Margarita, Mediterrania, Pepperoni, Prosciutto, Vegetariana});

        jScrollPane2.setViewportView(jPanel1);

        jScrollPane3.setBorder(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bebidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Aquiarius, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(CocaColaZero, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)))
                    .addComponent(Nestea, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Cerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Agua, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CocaColaZero, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Aquiarius, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nestea, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agua, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel2);

        jScrollPane4.setBorder(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Postres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaltedCaramel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HalfBackedFroyo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FudgeBrownie, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CookieDough, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ChunckyMonkey, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(CherryGracia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CherryGracia, CookieDough, FudgeBrownie, HalfBackedFroyo, SaltedCaramel});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CherryGracia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ChunckyMonkey, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CookieDough, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(SaltedCaramel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HalfBackedFroyo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FudgeBrownie, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CherryGracia, CookieDough, FudgeBrownie, HalfBackedFroyo, SaltedCaramel});

        jScrollPane4.setViewportView(jPanel3);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
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
                .addComponent(btn_crearNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_modificarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(TopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightSideNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void MargaritaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MargaritaMousePressed

//        String name = Margarita.getText();
//        String str = """
//                     \nMargarita
//                     \tMozzarella
//                     \tSalsa de Tomate""";
        //--------------array de datos 
////        ArrayList<String> List = new ArrayList<>();
////        List.add("Margarita");
////        List.add("Mozzarella");
////        List.add("Salsa de Tomate");
        //---------------------------
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Margarita.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }

    }//GEN-LAST:event_MargaritaMousePressed

    private void CuatroQuesosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuatroQuesosMousePressed

//        String name = Margarita.getText();
//        String str = """
//                     \nMargarita
//                     \tMozzarella
//                     \tSalsa de Tomate""";
        //--------------array de datos 
//        ArrayList<String> List = new ArrayList<>();
//        List.add("CuatroQuesos");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Queso de Cabra");
//        List.add("Emmental");
//        List.add("Gorgonzola");
        //---------------------------
        int n = getCompra.indexOf(ArticleIndex);
        int m = sendCompra.indexOf(ArticleIndex);
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), CuatroQuesos.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_CuatroQuesosMousePressed

    private void ProsciuttoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProsciuttoMousePressed
//        String name = Prosciutto.getText();
//        String str = """ 
//                      \nProsciutto
//                      \t Mozzarella
//                      \t Salsa de Tomate
//                      \t Jamón york""";
//
//        //--------------array de datos 
//        ArrayList<String> List = new ArrayList<>();
//        List.add("Prosciutto");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Jamón york");
        //---------------------------
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Prosciutto.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_ProsciuttoMousePressed

    private void BBQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBQMousePressed
//        String name = BBQ.getText();
//        String str = """
//                     \nBarbacoa
//                     \t Mozzarella
//                     \t Salsa de Tomate
//                     \t Salsa Barbacoa
//                     \t Bacon
//                     \t Pollo
//                     \t Ternera
//                     \t Cebolla""";
//
//        //--------------array de datos 
//        ArrayList<String> List = new ArrayList<>();
//        List.add("Barbacoa");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Bacon");
//        List.add("Pollo");
//        List.add("Ternera");
//        List.add("Cebolla");
        //---------------------------
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), BBQ.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_BBQMousePressed

    private void MediterraniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediterraniaMousePressed
//        String name = Mediterania.getText();
//        String str = """
//                     \nMediterránia
//                     \t Mozzarella
//                     \t Salsa de Tomate
//                     \t Atún
//                     \t Cebolla Morada""";
//
//        //--------------array de datos 
//        ArrayList<String> List = new ArrayList<>();
//        List.add("Mediterránia");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Atún");
//        List.add("Cebolla Morada");
        //---------------------------
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Mediterrania.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);




int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_MediterraniaMousePressed

    private void Estaciones4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Estaciones4MousePressed
//        String name = Estaciones4.getText();
//        String str = """
//                     \n4Estaciones
//                     \t Mozzarella
//                     \t Salsa de Tomate
//                     \t Olivas Negras
//                     \t Jamón york
//                     \t Champiñones
//                     \t Cebolla""";
//
//        //--------------array de datos 
//        ArrayList<String> List = new ArrayList<>();
//        List.add("4Estaciones");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Olivas Negras");
//        List.add("Jamón york");
//        List.add("Champiñones");
//        List.add("Cebolla");
        //---------------------------
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Estaciones4.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_Estaciones4MousePressed

    private void VegetarianaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VegetarianaMousePressed
//        String name = Vegetariana.getText();
//        String str = """
//                     \nVegetariana
//                     \t Mozzarella
//                     \t Salsa de Tomate
//                     \t Champiñones
//                     \t Tomate
//                     \t Calabacín
//                     \t Parmesano
//                     \t Cebolla Morada""";
//
//        //--------------array de datos 
//        ArrayList<String> List = new ArrayList<>();
//        List.add("Vegetariana");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Champiñones");
//        List.add("Tomate");
//        List.add("Calabacín");
//        List.add("Parmesano");
//        List.add("Cebolla Morada");
        //---------------------------
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Vegetariana.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_VegetarianaMousePressed

    private void HavaianaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaianaMousePressed
//        String name = Havaiana.getText();
//        String str = """
//                     \nHavaiana
//                     \t Mozzarella
//                     \t Salsa de Tomate
//                     \t Piña
//                     \t Jamón york""";
//
//        //--------------array de datos 
//        ArrayList<String> List = new ArrayList<>();
//        List.add("Havaiana");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Piña");
//        List.add("Jamón york");
        //---------------------------
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Havaiana.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_HavaianaMousePressed

    private void DiCabraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiCabraMousePressed
//        String name = DiCabra.getText();
//        String str = """
//                     \nDiCabra
//                     \t Mozzarella
//                     \t Salsa de Tomate
//                     \t Doble Queso de Cabra
//                     \t Cebolla Caramelizada""";
//
//        //--------------array de datos 
//        ArrayList<String> List = new ArrayList<>();
//        List.add("DiCabra");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Doble Queso de Cabra");
//        List.add("Cebolla Caramelizada");
        //---------------------------
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), DiCabra.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_DiCabraMousePressed

    private void PepperoniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PepperoniMousePressed
        // TODO add your handling code here:
//        String str = """
//                     \nPepperoni
//                     \t Mozzarella
//                     \t Salsa de Tomate
//                     \t Pepperoni""";
//
//        //--------------array de datos 
//        ArrayList<String> List = new ArrayList<>();
//        List.add("Pepperoni");
//        List.add("Mozzarella");
//        List.add("Salsa de Tomate");
//        List.add("Pepperoni");
        //---------------------------
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Pepperoni.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este??", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
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

    private void MediterraniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediterraniaMouseEntered
        // TODO add your handling code here:
        Mediterrania.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_MediterraniaMouseEntered

    private void MediterraniaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediterraniaMouseExited
        // TODO add your handling code here:
        Mediterrania.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_MediterraniaMouseExited

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
        int reply = JOptionPane.showConfirmDialog(null, "¿queres hacer el pedido de nuevo?", "Nuevo Pedido", JOptionPane.YES_NO_OPTION);
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

    private void MargaritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MargaritaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MargaritaActionPerformed

    private void CocaColaZeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CocaColaZeroMouseEntered
        // TODO add your handling code here:
        CocaColaZero.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CocaColaZeroMouseEntered

    private void CocaColaZeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CocaColaZeroMouseExited
        // TODO add your handling code here:
        CocaColaZero.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_CocaColaZeroMouseExited

    private void CocaColaZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocaColaZeroActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + CocaColaZero.getText());
//        sinBebida.setEnabled(false);
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), CocaColaZero.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_CocaColaZeroActionPerformed

    private void AquiariusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AquiariusMouseEntered
        // TODO add your handling code here:
        Aquiarius.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_AquiariusMouseEntered

    private void AquiariusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AquiariusMouseExited
        // TODO add your handling code here:
        Aquiarius.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_AquiariusMouseExited

    private void AquiariusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AquiariusActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + Aquiarius.getText());
//        sinBebida.setEnabled(false);
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Aquiarius.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_AquiariusActionPerformed

    private void CervezaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CervezaMouseEntered
        // TODO add your handling code here:
        Cerveza.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CervezaMouseEntered

    private void CervezaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CervezaMouseExited
        // TODO add your handling code here:
        Cerveza.setBackground(new java.awt.Color(245, 245, 236));

    }//GEN-LAST:event_CervezaMouseExited

    private void CervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CervezaActionPerformed
        // TODO add your handling code here:

//        jTextArea1.setText(jTextArea1.getText() + "\n" + Cerveza.getText());
//        sinBebida.setEnabled(false);
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Cerveza.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_CervezaActionPerformed

    private void CocaColaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CocaColaMouseEntered
        // TODO add your handling code here:
        CocaCola.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CocaColaMouseEntered

    private void CocaColaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CocaColaMouseExited
        // TODO add your handling code here:
        CocaCola.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_CocaColaMouseExited

    private void CocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocaColaActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + CocaCola.getText());
//        sinBebida.setEnabled(false);ç
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), CocaCola.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_CocaColaActionPerformed

    private void NesteaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NesteaMouseEntered
        // TODO add your handling code here:
        Nestea.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_NesteaMouseEntered

    private void NesteaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NesteaMouseExited
        // TODO add your handling code here:
        Nestea.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_NesteaMouseExited

    private void NesteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NesteaActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + Nestea.getText());
//        sinBebida.setEnabled(false);
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Nestea.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_NesteaActionPerformed

    private void FantaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FantaMouseEntered
        // TODO add your handling code here:
        Fanta.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_FantaMouseEntered

    private void FantaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FantaMouseExited
        // TODO add your handling code here:
        Fanta.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_FantaMouseExited

    private void FantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FantaActionPerformed
        // TODO add your handling code here:

//        jTextArea1.setText(jTextArea1.getText() + "\n" + Fanta.getText());
//        sinBebida.setEnabled(false);
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Fanta.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_FantaActionPerformed

    private void AguaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AguaMouseEntered
        // TODO add your handling code here:
        Agua.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_AguaMouseEntered

    private void AguaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AguaMouseExited
        // TODO add your handling code here:
        Agua.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_AguaMouseExited

    private void AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguaActionPerformed
        // TODO add your handling code here:
//        sinBebida.setEnabled(false);
//        jTextArea1.setText(jTextArea1.getText() + "\n" + Agua.getText());
        String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), Agua.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_AguaActionPerformed

    private void ChunckyMonkeyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChunckyMonkeyMouseEntered
        // TODO add your handling code here:
        ChunckyMonkey.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_ChunckyMonkeyMouseEntered

    private void ChunckyMonkeyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChunckyMonkeyMouseExited
        // TODO add your handling code here:
        ChunckyMonkey.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_ChunckyMonkeyMouseExited

    private void ChunckyMonkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChunckyMonkeyActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + ChunckyMonkey.getText());
//        sinPostre.setEnabled(false);
String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), ChunckyMonkey.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_ChunckyMonkeyActionPerformed

    private void FudgeBrownieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FudgeBrownieMouseEntered
        // TODO add your handling code here:
        FudgeBrownie.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_FudgeBrownieMouseEntered

    private void FudgeBrownieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FudgeBrownieMouseExited
        // TODO add your handling code here:
        FudgeBrownie.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_FudgeBrownieMouseExited

    private void FudgeBrownieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FudgeBrownieActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + FudgeBrownie.getText());
//        sinPostre.setEnabled(false);
String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), FudgeBrownie.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_FudgeBrownieActionPerformed

    private void CookieDoughMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CookieDoughMouseEntered
        // TODO add your handling code here:
        CookieDough.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CookieDoughMouseEntered

    private void CookieDoughMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CookieDoughMouseExited
        // TODO add your handling code here:
        CookieDough.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_CookieDoughMouseExited

    private void CookieDoughActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CookieDoughActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + CookieDough.getText());
//        sinPostre.setEnabled(false);
String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), CookieDough.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_CookieDoughActionPerformed

    private void CherryGraciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CherryGraciaMouseEntered
        // TODO add your handling code here:
        CherryGracia.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_CherryGraciaMouseEntered

    private void CherryGraciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CherryGraciaMouseExited
        // TODO add your handling code here:
        CherryGracia.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_CherryGraciaMouseExited

    private void CherryGraciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CherryGraciaActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + CherryGracia.getText());
//        sinPostre.setEnabled(false);
String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), CherryGracia.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_CherryGraciaActionPerformed

    private void HalfBackedFroyoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HalfBackedFroyoMouseEntered
        // TODO add your handling code here:
        HalfBackedFroyo.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_HalfBackedFroyoMouseEntered

    private void HalfBackedFroyoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HalfBackedFroyoMouseExited
        // TODO add your handling code here:
        HalfBackedFroyo.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_HalfBackedFroyoMouseExited

    private void HalfBackedFroyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HalfBackedFroyoActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + HalfBackedFroyo.getText());
//        sinPostre.setEnabled(false);
String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), HalfBackedFroyo.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_HalfBackedFroyoActionPerformed

    private void SaltedCaramelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaltedCaramelMouseEntered
        // TODO add your handling code here:
        SaltedCaramel.setBackground(new java.awt.Color(246, 246, 218));
    }//GEN-LAST:event_SaltedCaramelMouseEntered

    private void SaltedCaramelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaltedCaramelMouseExited
        // TODO add your handling code here:
        SaltedCaramel.setBackground(new java.awt.Color(245, 245, 236));
    }//GEN-LAST:event_SaltedCaramelMouseExited

    private void SaltedCaramelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaltedCaramelActionPerformed
        // TODO add your handling code here:
//        jTextArea1.setText(jTextArea1.getText() + "\n" + SaltedCaramel.getText());
//        sinPostre.setEnabled(false);
String change = getCompra.get(ArticleIndex).replace(getCompra.get(ArticleIndex), SaltedCaramel.getText());
        getCompra.remove(getCompra.get(ArticleIndex));
        getCompra.add(ArticleIndex, change);
        System.out.println(change);
        sendCompra = getCompra;
        System.out.println(sendCompra);
//        System.out.println(sendCompra);
        int reply = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar este artículo por este?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ModificarPedido_1 v1 = new ModificarPedido_1();
            v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
            v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
            v1.setVisible(true);
            v1.DataLogin(jLabel1.getText(), getCompra, sendCompra, "NewFrame");
            dispose();
        }
    }//GEN-LAST:event_SaltedCaramelActionPerformed

    private void MediterraniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediterraniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediterraniaActionPerformed

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
            java.util.logging.Logger.getLogger(EligirProductov2Mod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EligirProductov2Mod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EligirProductov2Mod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EligirProductov2Mod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EligirProductov2Mod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agua;
    private javax.swing.JButton Aquiarius;
    private javax.swing.JButton BBQ;
    private javax.swing.JButton Cerveza;
    private javax.swing.JButton CherryGracia;
    private javax.swing.JButton ChunckyMonkey;
    private javax.swing.JButton CocaCola;
    private javax.swing.JButton CocaColaZero;
    private javax.swing.JButton CookieDough;
    private javax.swing.JButton CuatroQuesos;
    private javax.swing.JButton DiCabra;
    private javax.swing.JButton Estaciones4;
    private javax.swing.JButton Fanta;
    private javax.swing.JButton FudgeBrownie;
    private javax.swing.JButton HalfBackedFroyo;
    private javax.swing.JButton Havaiana;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Margarita;
    private javax.swing.JButton Mediterrania;
    private javax.swing.JButton Nestea;
    private javax.swing.JButton Pepperoni;
    private javax.swing.JButton Prosciutto;
    private javax.swing.JPanel RightSideNav;
    private javax.swing.JButton SaltedCaramel;
    private javax.swing.JPanel TopBar;
    private javax.swing.JButton Vegetariana;
    private javax.swing.JButton btn_crearNuevoPedido;
    private javax.swing.JButton btn_modificarPedido;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}
