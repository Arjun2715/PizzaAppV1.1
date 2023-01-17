package com.mycompany.pizzaapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author arjun
 */
public class ModificarPizza extends javax.swing.JFrame {

    public int numCont1 = 1;
    public int numCont2 = 1;
    public int numCont3 = 1;
    public int numCont4 = 1;
    public int numCont5 = 1;
    public int numCont6 = 1;
    public int numCont7 = 1;
    public ArrayList<String> ModifiedPizza = new ArrayList<>();
    public String ListaDeProductos;
    public String tipoDePedido;
    public ArrayList<String> DatosDeClientes = new ArrayList<>();

    ;

    public ModificarPizza() {
        initComponents();
        editComponentes();
        GuardarImg.setIcon(new ImageIcon("IMG\\buttons\\guardar_main.png"));

    }

    public void getlistdata(String data) {
        ListaDeProductos = data;
    }

    private void getPizzaData() {

        ModifiedPizza.add(modificarImg.getText());
        //unchanged ingredient
        if (ingredientCount1.getText().equals("1")) {
            ModifiedPizza.add(ingredient1.getText());
        }
        if (ingredientCount2.getText().equals("1")) {
            ModifiedPizza.add(ingredient2.getText());
        }
        if (ingredientCount3.getText().equals("1")) {
            ModifiedPizza.add(ingredient3.getText());
        }
        if (ingredientCount4.getText().equals("1")) {
            ModifiedPizza.add(ingredient4.getText());
        }
        if (ingredientCount5.getText().equals("1")) {
            ModifiedPizza.add(ingredient5.getText());
        }
        if (ingredientCount6.getText().equals("1")) {
            ModifiedPizza.add(ingredient6.getText());
        }
        if (ingredientCount7.getText().equals("1")) {
            ModifiedPizza.add(ingredient7.getText());
        }

        //double added ingredient
        if (ingredientCount1.getText().equals("2")) {
            ModifiedPizza.add(ingredient1.getText());
            ModifiedPizza.add("+ " + ingredient1.getText());
        }
        if (ingredientCount2.getText().equals("2")) {
            ModifiedPizza.add(ingredient2.getText());
            ModifiedPizza.add("+ " + ingredient2.getText());
        }
        if (ingredientCount3.getText().equals("2")) {
            ModifiedPizza.add(ingredient3.getText());
            ModifiedPizza.add("+ " + ingredient3.getText());
        }
        if (ingredientCount4.getText().equals("2")) {
            ModifiedPizza.add(ingredient4.getText());
            ModifiedPizza.add("+ " + ingredient4.getText());
        }
        if (ingredientCount5.getText().equals("2")) {
            ModifiedPizza.add(ingredient5.getText());
            ModifiedPizza.add("+ " + ingredient5.getText());
        }
        if (ingredientCount6.getText().equals("2")) {
            ModifiedPizza.add(ingredient6.getText());
            ModifiedPizza.add("+ " + ingredient6.getText());
        }
        if (ingredientCount7.getText().equals("2")) {
            ModifiedPizza.add(ingredient7.getText());
            ModifiedPizza.add("+ " + ingredient7.getText());
        }

        //triple added ingredient
        if (ingredientCount1.getText().equals("3")) {
            ModifiedPizza.add(ingredient1.getText());
            ModifiedPizza.add("+ " + ingredient1.getText());
            ModifiedPizza.add("+ " + ingredient1.getText());
        }
        if (ingredientCount2.getText().equals("3")) {
            ModifiedPizza.add(ingredient2.getText());
            ModifiedPizza.add("+ " + ingredient2.getText());
            ModifiedPizza.add("+ " + ingredient2.getText());
        }
        if (ingredientCount3.getText().equals("3")) {
            ModifiedPizza.add(ingredient3.getText());
            ModifiedPizza.add("+ " + ingredient3.getText());
            ModifiedPizza.add("+ " + ingredient3.getText());
        }
        if (ingredientCount4.getText().equals("3")) {
            ModifiedPizza.add(ingredient4.getText());
            ModifiedPizza.add("+ " + ingredient4.getText());
            ModifiedPizza.add("+ " + ingredient4.getText());
        }
        if (ingredientCount5.getText().equals("3")) {
            ModifiedPizza.add(ingredient5.getText());
            ModifiedPizza.add("+ " + ingredient5.getText());
            ModifiedPizza.add("+ " + ingredient5.getText());
        }
        if (ingredientCount6.getText().equals("3")) {
            ModifiedPizza.add(ingredient6.getText());
            ModifiedPizza.add("+ " + ingredient6.getText());
            ModifiedPizza.add("+ " + ingredient6.getText());
        }
        if (ingredientCount7.getText().equals("3")) {
            ModifiedPizza.add(ingredient7.getText());
            ModifiedPizza.add("+ " + ingredient7.getText());
            ModifiedPizza.add("+ " + ingredient7.getText());
        }
        //eliminar ingredientes
        if (ingredientCount1.getText().equals("0")) {
            ModifiedPizza.add("- " + ingredient1.getText());
        }
        if (ingredientCount2.getText().equals("0")) {
            ModifiedPizza.add("- " + ingredient2.getText());
        }
        if (ingredientCount3.getText().equals("0")) {
            ModifiedPizza.add("- " + ingredient3.getText());
        }
        if (ingredientCount4.getText().equals("0")) {
            ModifiedPizza.add("- " + ingredient4.getText());
        }
        if (ingredientCount5.getText().equals("0")) {
            ModifiedPizza.add("- " + ingredient5.getText());
        }
        if (ingredientCount6.getText().equals("0")) {
            ModifiedPizza.add("- " + ingredient6.getText());
        }
        if (ingredientCount7.getText().equals("0")) {
            ModifiedPizza.add("- " + ingredient7.getText());
        }

    }

    public void DataLogin(String Nombre, String TipoDePedido, ArrayList<String> datosCliente) { //metodo para sacar nombre del usuario de la pagina login
        jLabel1.setText(Nombre.substring(0, 1).toUpperCase() + "" + Nombre.substring(1));
        jLabel1.setBorder(new EmptyBorder(0, 10, 0, 0));
        jLabel1.setOpaque(true);
        tipoDePedido = TipoDePedido;
        DatosDeClientes = datosCliente;
    }

    public void getIngList(ArrayList<String> list) {
        ArrayList<String> List = list;

        modificarImg.setText("");
        modificarImg.setText(List.get(0));
        modificarImg.setIcon(new ImageIcon("IMG\\pizzas\\" + List.get(0) + ".png"));

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª
        // use if else to setvisible(true/false) the buttons and jlabels
//        System.out.println(List.size());
//        for (int i = 0; i < List.size(); i++) {
//            System.out.println(List.get(i));
//
//        }
        switch (List.size()) {
            case 3 -> {
                ingredient1.setText("");
                ingredient1.setText(List.get(1));
                ingredient2.setText("");
                ingredient2.setText(List.get(2));

                //hide extra components
                //labels
                ingredient3.setText("");
                ingredient3.setVisible(false);
                ingredient4.setText("");
                ingredient4.setVisible(false);
                ingredient5.setText("");
                ingredient5.setVisible(false);
                ingredient7.setText("");
                ingredient7.setVisible(false);
                ingredient6.setText("");
                ingredient6.setVisible(false);
                //buttons
                RestarIngredient3.setVisible(false);
                SumarIngredient3.setVisible(false);
                RestarIngredient4.setVisible(false);
                SumarIngredient4.setVisible(false);
                RestarIngredient5.setVisible(false);
                SumarIngredient5.setVisible(false);
                RestarIngredient7.setVisible(false);
                SumarIngredient7.setVisible(false);
                RestarIngredient6.setVisible(false);
                SumarIngredient6.setVisible(false);

                //cont variable hide
                ingredientCount3.setVisible(false);
                ingredientCount4.setVisible(false);
                ingredientCount5.setVisible(false);
                ingredientCount7.setVisible(false);
                ingredientCount6.setVisible(false);
            }
            case 4 -> {
                ingredient1.setText("");
                ingredient1.setText(List.get(1));
                ingredient2.setText("");
                ingredient2.setText(List.get(2));
                ingredient3.setText("");
                ingredient3.setText(List.get(3));
                //hide extra components
                //labels
                ingredient4.setText("");
                ingredient4.setVisible(false);
                ingredient5.setText("");
                ingredient5.setVisible(false);
                ingredient7.setText("");
                ingredient7.setVisible(false);
                ingredient6.setText("");
                ingredient6.setVisible(false);
                //buttons
                RestarIngredient4.setVisible(false);
                SumarIngredient4.setVisible(false);
                RestarIngredient5.setVisible(false);
                SumarIngredient5.setVisible(false);
                RestarIngredient7.setVisible(false);
                SumarIngredient7.setVisible(false);
                RestarIngredient6.setVisible(false);
                SumarIngredient6.setVisible(false);
                //cont variable hide
                ingredientCount4.setVisible(false);
                ingredientCount5.setVisible(false);
                ingredientCount7.setVisible(false);
                ingredientCount6.setVisible(false);
            }
            case 5 -> {
                ingredient1.setText("");
                ingredient1.setText(List.get(1));
                ingredient2.setText("");
                ingredient2.setText(List.get(2));
                ingredient3.setText("");
                ingredient3.setText(List.get(3));
                ingredient4.setText("");
                ingredient4.setText(List.get(4));

                //hide extra components
                //labels
                ingredient5.setText("");
                ingredient5.setVisible(false);
                ingredient7.setText("");
                ingredient7.setVisible(false);
                ingredient6.setText("");
                ingredient6.setVisible(false);
                //buttons
                RestarIngredient5.setVisible(false);
                SumarIngredient5.setVisible(false);
                RestarIngredient7.setVisible(false);
                SumarIngredient7.setVisible(false);
                RestarIngredient6.setVisible(false);
                SumarIngredient6.setVisible(false);
                //cont variable hide
                ingredientCount5.setVisible(false);
                ingredientCount7.setVisible(false);
                ingredientCount6.setVisible(false);
            }
            case 6 -> {
                ingredient1.setText("");
                ingredient1.setText(List.get(1));
                ingredient2.setText("");
                ingredient2.setText(List.get(2));
                ingredient3.setText("");
                ingredient3.setText(List.get(3));
                ingredient4.setText("");
                ingredient4.setText(List.get(4));
                ingredient5.setText("");
                ingredient5.setText(List.get(5));

                //hide extra components
                //labels
                ingredient7.setText("");
                ingredient7.setVisible(false);
                ingredient6.setText("");
                ingredient6.setVisible(false);
                //buttons
                RestarIngredient7.setVisible(false);
                SumarIngredient7.setVisible(false);
                RestarIngredient6.setVisible(false);
                SumarIngredient6.setVisible(false);
                //cont variable hide
                ingredientCount7.setVisible(false);
                ingredientCount6.setVisible(false);
            }
            case 7 -> {
                ingredient1.setText("");
                ingredient1.setText(List.get(1));
                ingredient2.setText("");
                ingredient2.setText(List.get(2));
                ingredient3.setText("");
                ingredient3.setText(List.get(3));
                ingredient4.setText("");
                ingredient4.setText(List.get(4));
                ingredient5.setText("");
                ingredient5.setText(List.get(5));
                ingredient7.setText("");
                ingredient7.setText(List.get(6));
                //hide extra components
                //labels
                ingredient6.setText("");
                ingredient6.setVisible(false);
                //buttons
                RestarIngredient6.setVisible(false);
                SumarIngredient6.setVisible(false);

                //cont variable hide
                ingredientCount6.setVisible(false);
            }
            case 8 -> {
                ingredient1.setText("");
                ingredient1.setText(List.get(1));
                ingredient2.setText("");
                ingredient2.setText(List.get(2));
                ingredient3.setText("");
                ingredient3.setText(List.get(3));
                ingredient4.setText("");
                ingredient4.setText(List.get(4));
                ingredient5.setText("");
                ingredient5.setText(List.get(5));
                ingredient7.setText("");
                ingredient7.setText(List.get(6));
                ingredient6.setText("");
                ingredient6.setText(List.get(7));
            }
            default -> {
            }
        }

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

        modificarImg.setVerticalTextPosition(SwingConstants.BOTTOM);
        modificarImg.setHorizontalTextPosition(SwingConstants.CENTER);
        modificarImg.setFocusable(false);
        //set date 
        date.setText(date());
        //logout button
        logOut.setIcon(new ImageIcon("IMG\\logout.png"));
        logOut.setBorder(new EmptyBorder(2, 2, 2, 2));

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
        modificarImg = new javax.swing.JButton();
        ingredient1 = new javax.swing.JLabel();
        ingredient2 = new javax.swing.JLabel();
        ingredient3 = new javax.swing.JLabel();
        ingredient4 = new javax.swing.JLabel();
        ingredient5 = new javax.swing.JLabel();
        ingredient7 = new javax.swing.JLabel();
        RestarIngredient1 = new javax.swing.JButton();
        SumarIngredient1 = new javax.swing.JButton();
        RestarIngredient2 = new javax.swing.JButton();
        SumarIngredient2 = new javax.swing.JButton();
        RestarIngredient3 = new javax.swing.JButton();
        SumarIngredient3 = new javax.swing.JButton();
        RestarIngredient4 = new javax.swing.JButton();
        SumarIngredient4 = new javax.swing.JButton();
        RestarIngredient5 = new javax.swing.JButton();
        SumarIngredient5 = new javax.swing.JButton();
        RestarIngredient7 = new javax.swing.JButton();
        SumarIngredient7 = new javax.swing.JButton();
        ingredientCount1 = new javax.swing.JLabel();
        ingredientCount3 = new javax.swing.JLabel();
        ingredientCount2 = new javax.swing.JLabel();
        ingredientCount4 = new javax.swing.JLabel();
        ingredientCount5 = new javax.swing.JLabel();
        ingredientCount7 = new javax.swing.JLabel();
        ingredient6 = new javax.swing.JLabel();
        RestarIngredient6 = new javax.swing.JButton();
        SumarIngredient6 = new javax.swing.JButton();
        ingredientCount6 = new javax.swing.JLabel();
        RightSideNav = new javax.swing.JPanel();
        btn_crearNuevoPedido = new javax.swing.JButton();
        btn_modificarPedido = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        TopBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        GuardarImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 800));

        jPanel1.setPreferredSize(new java.awt.Dimension(1745, 1147));

        modificarImg.setBackground(new java.awt.Color(245, 245, 236));
        modificarImg.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        modificarImg.setText("Margarita");
        modificarImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modificarImg.setFocusable(false);
        modificarImg.setMaximumSize(new java.awt.Dimension(250, 200));
        modificarImg.setPreferredSize(new java.awt.Dimension(250, 200));
        modificarImg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ingredient1.setText("jLabel3");

        ingredient2.setText("jLabel4");

        ingredient3.setText("jLabel5");

        ingredient4.setText("jLabel6");

        ingredient5.setText("jLabel7");

        ingredient7.setText("jLabel9");

        RestarIngredient1.setBackground(new java.awt.Color(217, 217, 217));
        RestarIngredient1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RestarIngredient1.setText("-");
        RestarIngredient1.setBorder(null);
        RestarIngredient1.setFocusable(false);
        RestarIngredient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIngredient1ActionPerformed(evt);
            }
        });

        SumarIngredient1.setBackground(new java.awt.Color(217, 217, 217));
        SumarIngredient1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SumarIngredient1.setText("+");
        SumarIngredient1.setBorder(null);
        SumarIngredient1.setFocusable(false);
        SumarIngredient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarIngredient1ActionPerformed(evt);
            }
        });

        RestarIngredient2.setBackground(new java.awt.Color(217, 217, 217));
        RestarIngredient2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RestarIngredient2.setText("-");
        RestarIngredient2.setBorder(null);
        RestarIngredient2.setFocusable(false);
        RestarIngredient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIngredient2ActionPerformed(evt);
            }
        });

        SumarIngredient2.setBackground(new java.awt.Color(217, 217, 217));
        SumarIngredient2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SumarIngredient2.setText("+");
        SumarIngredient2.setBorder(null);
        SumarIngredient2.setFocusable(false);
        SumarIngredient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarIngredient2ActionPerformed(evt);
            }
        });

        RestarIngredient3.setBackground(new java.awt.Color(217, 217, 217));
        RestarIngredient3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RestarIngredient3.setText("-");
        RestarIngredient3.setBorder(null);
        RestarIngredient3.setFocusable(false);
        RestarIngredient3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIngredient3ActionPerformed(evt);
            }
        });

        SumarIngredient3.setBackground(new java.awt.Color(217, 217, 217));
        SumarIngredient3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SumarIngredient3.setText("+");
        SumarIngredient3.setBorder(null);
        SumarIngredient3.setFocusable(false);
        SumarIngredient3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarIngredient3ActionPerformed(evt);
            }
        });

        RestarIngredient4.setBackground(new java.awt.Color(217, 217, 217));
        RestarIngredient4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RestarIngredient4.setText("-");
        RestarIngredient4.setBorder(null);
        RestarIngredient4.setFocusable(false);
        RestarIngredient4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIngredient4ActionPerformed(evt);
            }
        });

        SumarIngredient4.setBackground(new java.awt.Color(217, 217, 217));
        SumarIngredient4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SumarIngredient4.setText("+");
        SumarIngredient4.setBorder(null);
        SumarIngredient4.setFocusable(false);
        SumarIngredient4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarIngredient4ActionPerformed(evt);
            }
        });

        RestarIngredient5.setBackground(new java.awt.Color(217, 217, 217));
        RestarIngredient5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RestarIngredient5.setText("-");
        RestarIngredient5.setBorder(null);
        RestarIngredient5.setFocusable(false);
        RestarIngredient5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIngredient5ActionPerformed(evt);
            }
        });

        SumarIngredient5.setBackground(new java.awt.Color(217, 217, 217));
        SumarIngredient5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SumarIngredient5.setText("+");
        SumarIngredient5.setBorder(null);
        SumarIngredient5.setFocusable(false);
        SumarIngredient5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarIngredient5ActionPerformed(evt);
            }
        });

        RestarIngredient7.setBackground(new java.awt.Color(217, 217, 217));
        RestarIngredient7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RestarIngredient7.setText("-");
        RestarIngredient7.setBorder(null);
        RestarIngredient7.setFocusable(false);
        RestarIngredient7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIngredient7ActionPerformed(evt);
            }
        });

        SumarIngredient7.setBackground(new java.awt.Color(217, 217, 217));
        SumarIngredient7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SumarIngredient7.setText("+");
        SumarIngredient7.setBorder(null);
        SumarIngredient7.setFocusable(false);
        SumarIngredient7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarIngredient7ActionPerformed(evt);
            }
        });

        ingredientCount1.setText("1");
        ingredientCount1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ingredientCount3.setText("1");
        ingredientCount3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ingredientCount2.setText("1");
        ingredientCount2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ingredientCount4.setText("1");
        ingredientCount4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ingredientCount5.setText("1");
        ingredientCount5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ingredientCount7.setText("1");
        ingredientCount7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ingredient6.setText("jLabel8");

        RestarIngredient6.setBackground(new java.awt.Color(217, 217, 217));
        RestarIngredient6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RestarIngredient6.setText("-");
        RestarIngredient6.setBorder(null);
        RestarIngredient6.setFocusable(false);
        RestarIngredient6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIngredient6ActionPerformed(evt);
            }
        });

        SumarIngredient6.setBackground(new java.awt.Color(217, 217, 217));
        SumarIngredient6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SumarIngredient6.setText("+");
        SumarIngredient6.setBorder(null);
        SumarIngredient6.setFocusable(false);
        SumarIngredient6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarIngredient6ActionPerformed(evt);
            }
        });

        ingredientCount6.setText("1");
        ingredientCount6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(modificarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ingredient1)
                        .addComponent(ingredient2)
                        .addComponent(ingredient3)
                        .addComponent(ingredient4)
                        .addComponent(ingredient5)
                        .addComponent(ingredient7))
                    .addComponent(ingredient6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RestarIngredient7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestarIngredient1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestarIngredient3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestarIngredient4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestarIngredient5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestarIngredient6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestarIngredient2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ingredientCount4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ingredientCount2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingredientCount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingredientCount5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingredientCount3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingredientCount7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(SumarIngredient1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SumarIngredient2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SumarIngredient3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SumarIngredient4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SumarIngredient5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SumarIngredient7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ingredientCount6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(SumarIngredient6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ingredientCount1)
                                .addComponent(RestarIngredient1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ingredient1))
                            .addComponent(SumarIngredient1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SumarIngredient2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SumarIngredient3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingredientCount3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RestarIngredient3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingredient3))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SumarIngredient4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingredientCount4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RestarIngredient4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingredient4))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SumarIngredient5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingredientCount5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RestarIngredient5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingredient5)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ingredientCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RestarIngredient2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ingredient2)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ingredientCount6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RestarIngredient6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ingredient6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(SumarIngredient6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SumarIngredient7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingredientCount7)
                            .addComponent(RestarIngredient7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingredient7))))
                .addGap(32, 32, 32))
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
            .addComponent(TopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RightSideNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(173, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightSideNav, javax.swing.GroupLayout.PREFERRED_SIZE, 754, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RestarIngredient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarIngredient1ActionPerformed
        // TODO add your handling code here:

        ingredientCount1.setText("");

        if (numCont1 == 0) {

            ingredientCount1.setText("0");
        } else {
            numCont1 -= 1;
            ingredientCount1.setText(String.valueOf(numCont1));
        }


    }//GEN-LAST:event_RestarIngredient1ActionPerformed

    private void SumarIngredient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarIngredient1ActionPerformed
        // TODO add your handling code here:
//        System.out.println("jbutton 2 clicked");
        ingredientCount1.setText("");
        numCont1 += 1;
        if (numCont1 > 3) {
            numCont1 = 3;
            ingredientCount1.setText("3");

        } else {
            ingredientCount1.setText(String.valueOf(numCont1));
        }

    }//GEN-LAST:event_SumarIngredient1ActionPerformed

    private void RestarIngredient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarIngredient2ActionPerformed
        // TODO add your handling code here:
//        int numCont = 1;
//        System.out.println("jbutton 3 clicked");
        ingredientCount2.setText("");
        if (numCont2 == 0) {
            ingredientCount2.setText("0");
        } else {
            numCont2 -= 1;
            ingredientCount2.setText(String.valueOf(numCont2));
        }
    }//GEN-LAST:event_RestarIngredient2ActionPerformed

    private void SumarIngredient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarIngredient2ActionPerformed
//        System.out.println("jbutton 4 clicked");
        ingredientCount2.setText("");
        numCont2 += 1;
        if (numCont2 > 1) {
            numCont2 = 1;
            ingredientCount2.setText("1");
        } else {
            ingredientCount2.setText(String.valueOf(numCont2));
        }
    }//GEN-LAST:event_SumarIngredient2ActionPerformed

    private void RestarIngredient3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarIngredient3ActionPerformed
        ingredientCount3.setText("");
        if (numCont3 == 0) {
            ingredientCount3.setText("0");
        } else {
            numCont3 -= 1;
            ingredientCount3.setText(String.valueOf(numCont3));
        }
    }//GEN-LAST:event_RestarIngredient3ActionPerformed

    private void SumarIngredient3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarIngredient3ActionPerformed
        ingredientCount3.setText("");
        numCont3 += 1;
        if (numCont3 > 3) {
            numCont3 = 3;
            ingredientCount3.setText("3");
        } else {
            ingredientCount3.setText(String.valueOf(numCont3));
        }
    }//GEN-LAST:event_SumarIngredient3ActionPerformed

    private void RestarIngredient4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarIngredient4ActionPerformed
//        System.out.println("jbutton 7 clicked");
        ingredientCount4.setText("");
        if (numCont4 == 0) {
            ingredientCount4.setText("0");
        } else {
            numCont4 -= 1;
            ingredientCount4.setText(String.valueOf(numCont4));
        }
    }//GEN-LAST:event_RestarIngredient4ActionPerformed

    private void SumarIngredient4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarIngredient4ActionPerformed
//        System.out.println("jbutton 8 clicked");
        ingredientCount4.setText("");
        numCont4 += 1;
        if (numCont4 > 3) {
            numCont4 = 3;
            ingredientCount4.setText("3");
        } else {
            ingredientCount4.setText(String.valueOf(numCont4));
        }
    }//GEN-LAST:event_SumarIngredient4ActionPerformed

    private void RestarIngredient5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarIngredient5ActionPerformed
//        System.out.println("jbutton 9 clicked");
        ingredientCount5.setText("");

        if (numCont5 == 0) {

            ingredientCount5.setText("0");
        } else {
            numCont5 -= 1;
            ingredientCount5.setText(String.valueOf(numCont5));
        }
    }//GEN-LAST:event_RestarIngredient5ActionPerformed

    private void SumarIngredient5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarIngredient5ActionPerformed
//        System.out.println("jbutton 10 clicked");
        ingredientCount5.setText("");
        numCont5 += 1;
        if (numCont5 > 3) {
            numCont5 = 3;
            ingredientCount5.setText("3");
        } else {
            ingredientCount5.setText(String.valueOf(numCont5));
        }
    }//GEN-LAST:event_SumarIngredient5ActionPerformed

    private void RestarIngredient7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarIngredient7ActionPerformed
//        System.out.println("jbutton 11 clicked");
        ingredientCount7.setText("");

        if (numCont7 == 0) {

            ingredientCount7.setText("0");
        } else {
            numCont7 -= 1;
            ingredientCount7.setText(String.valueOf(numCont7));
        }
    }//GEN-LAST:event_RestarIngredient7ActionPerformed

    private void SumarIngredient7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarIngredient7ActionPerformed
//        System.out.println("jbutton 12 clicked");
        ingredientCount7.setText("");
        numCont7 += 1;
        if (numCont7 > 3) {
            numCont7 = 3;
            ingredientCount7.setText("3");
        } else {
            ingredientCount7.setText(String.valueOf(numCont7));
        }
    }//GEN-LAST:event_SumarIngredient7ActionPerformed

    private void RestarIngredient6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarIngredient6ActionPerformed
//        System.out.println("jbutton 13 clicked");
        ingredientCount6.setText("");

        if (numCont6 == 0) {

            ingredientCount6.setText("0");
        } else {
            numCont6 -= 1;
            ingredientCount6.setText(String.valueOf(numCont6));
        }
    }//GEN-LAST:event_RestarIngredient6ActionPerformed

    private void SumarIngredient6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarIngredient6ActionPerformed
//        System.out.println("jbutton 14 clicked");
        ingredientCount6.setText("");
        numCont6 += 1;
        if (numCont6 > 3) {
            numCont6 = 3;
            ingredientCount6.setText("3");
        } else {
            ingredientCount6.setText(String.valueOf(numCont6));
        }
    }//GEN-LAST:event_SumarIngredient6ActionPerformed

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
        getPizzaData();
        EligirPizzas v1 = new EligirPizzas();
        v1.setDefaultCloseOperation(HIDE_ON_CLOSE);
        v1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v1.setIconImage(new ImageIcon("IMG\\icon.png").getImage());
        v1.setVisible(true);
        v1.getModifiedPizza(ModifiedPizza, ListaDeProductos);
        System.out.println(ListaDeProductos);
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
            java.util.logging.Logger.getLogger(ModificarPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ModificarPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GuardarImg;
    private javax.swing.JButton RestarIngredient1;
    private javax.swing.JButton RestarIngredient2;
    private javax.swing.JButton RestarIngredient3;
    private javax.swing.JButton RestarIngredient4;
    private javax.swing.JButton RestarIngredient5;
    private javax.swing.JButton RestarIngredient6;
    private javax.swing.JButton RestarIngredient7;
    private javax.swing.JPanel RightSideNav;
    private javax.swing.JButton SumarIngredient1;
    private javax.swing.JButton SumarIngredient2;
    private javax.swing.JButton SumarIngredient3;
    private javax.swing.JButton SumarIngredient4;
    private javax.swing.JButton SumarIngredient5;
    private javax.swing.JButton SumarIngredient6;
    private javax.swing.JButton SumarIngredient7;
    private javax.swing.JPanel TopBar;
    private javax.swing.JButton btn_crearNuevoPedido;
    private javax.swing.JButton btn_modificarPedido;
    private javax.swing.JLabel date;
    private javax.swing.JLabel ingredient1;
    private javax.swing.JLabel ingredient2;
    private javax.swing.JLabel ingredient3;
    private javax.swing.JLabel ingredient4;
    private javax.swing.JLabel ingredient5;
    private javax.swing.JLabel ingredient6;
    private javax.swing.JLabel ingredient7;
    private javax.swing.JLabel ingredientCount1;
    private javax.swing.JLabel ingredientCount2;
    private javax.swing.JLabel ingredientCount3;
    private javax.swing.JLabel ingredientCount4;
    private javax.swing.JLabel ingredientCount5;
    private javax.swing.JLabel ingredientCount6;
    private javax.swing.JLabel ingredientCount7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logOut;
    private javax.swing.JButton modificarImg;
    // End of variables declaration//GEN-END:variables
}
