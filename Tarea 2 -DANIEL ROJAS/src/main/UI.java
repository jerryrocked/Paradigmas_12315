package main;


/**
 *
 * @author Hiro
 */
public class UI extends javax.swing.JFrame {

    public UI() {
        initComponents();
        this.setTitle("Ventas de juegos");
        this.setLocation(400, 220);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NombreVendedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CMB_Productos = new javax.swing.JComboBox<>();
        Button_Salir = new javax.swing.JToggleButton();
        Button_Guardar = new javax.swing.JToggleButton();
        carlos = new javax.swing.JLabel();
        Precio_COD = new javax.swing.JTextField();
        maincra = new javax.swing.JLabel();
        Precio_MC = new javax.swing.JTextField();
        fornite = new javax.swing.JLabel();
        Precio_Fortnite = new javax.swing.JTextField();
        CantidadDeCadaProducto = new javax.swing.JTextField();
        Venta_Pesos = new javax.swing.JLabel();
        Pesos_COD = new javax.swing.JTextField();
        Pesos_MC = new javax.swing.JTextField();
        Pesos_Fortnite = new javax.swing.JTextField();
        Comision_Vendedor = new javax.swing.JLabel();
        ComisionVendedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NomVendedorMVP = new javax.swing.JTextField();
        ComisionDelMVP = new javax.swing.JLabel();
        ComisionMVP = new javax.swing.JTextField();
        Button_eliminar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Button_Modificar = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre del Vendedor:");

        NombreVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreVendedorActionPerformed(evt);
            }
        });
        NombreVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreVendedorKeyTyped(evt);
            }
        });

        jLabel2.setText("Cantidad de ventas en cada producto");

        CMB_Productos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Call of Duty (COD)", "Minecraft (MC)", "Fortnite", " " }));

        Button_Salir.setText("Salir");
        Button_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SalirActionPerformed(evt);
            }
        });

        Button_Guardar.setText("Guardar");

        carlos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carlos.jpg"))); // NOI18N
        carlos.setText("jLabel3");

        Precio_COD.setText("34500");
        Precio_COD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Precio_CODActionPerformed(evt);
            }
        });
        Precio_COD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Precio_CODKeyTyped(evt);
            }
        });

        maincra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maincra.jpg"))); // NOI18N
        maincra.setText("jLabel3");

        Precio_MC.setText("8800");
        Precio_MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Precio_MCActionPerformed(evt);
            }
        });
        Precio_MC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Precio_MCKeyTyped(evt);
            }
        });

        fornite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fornite.jpg"))); // NOI18N
        fornite.setText("jLabel3");

        Precio_Fortnite.setText("58200");
        Precio_Fortnite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Precio_FortniteActionPerformed(evt);
            }
        });
        Precio_Fortnite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Precio_FortniteKeyTyped(evt);
            }
        });

        CantidadDeCadaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadDeCadaProductoActionPerformed(evt);
            }
        });

        Venta_Pesos.setText("Pesos");

        Pesos_COD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesos_CODActionPerformed(evt);
            }
        });
        Pesos_COD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pesos_CODKeyTyped(evt);
            }
        });

        Pesos_MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesos_MCActionPerformed(evt);
            }
        });
        Pesos_MC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pesos_MCKeyTyped(evt);
            }
        });

        Pesos_Fortnite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesos_FortniteActionPerformed(evt);
            }
        });
        Pesos_Fortnite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pesos_FortniteKeyTyped(evt);
            }
        });

        Comision_Vendedor.setText("Comision que gana el vendedor");

        jLabel3.setText("Vendedor con más ventas(MVP):");

        NomVendedorMVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomVendedorMVPActionPerformed(evt);
            }
        });
        NomVendedorMVP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomVendedorMVPKeyTyped(evt);
            }
        });

        ComisionDelMVP.setText("Comision ganada");

        Button_eliminar.setText("Eliminar");
        Button_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_eliminarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Vendedor", "Producto", "Numero_Evento", "Comision"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Button_Modificar.setText("Modificar");
        Button_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ModificarActionPerformed(evt);
            }
        });

        jLabel4.setText("$");

        jLabel5.setText("$");

        jLabel6.setText("$");

        jLabel7.setText("$");

        jLabel8.setText("$");

        jLabel9.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(CMB_Productos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(CantidadDeCadaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Comision_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(carlos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Pesos_COD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Precio_COD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(maincra, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Precio_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(Pesos_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Pesos_Fortnite, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Precio_Fortnite, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(fornite, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(Venta_Pesos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComisionVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Button_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(Button_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NomVendedorMVP, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComisionMVP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComisionDelMVP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMB_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadDeCadaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carlos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maincra, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fornite, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Precio_Fortnite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio_MC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Precio_COD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Venta_Pesos)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pesos_COD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pesos_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pesos_Fortnite, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(Comision_Vendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComisionVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(NomVendedorMVP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComisionDelMVP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComisionMVP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_eliminar)
                    .addComponent(Button_Modificar)
                    .addComponent(Button_Guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(Button_Salir)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SalirActionPerformed
        // con esto cerramos el programa con el boton salir
        System.exit(0);
    }//GEN-LAST:event_Button_SalirActionPerformed

    private void NombreVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreVendedorActionPerformed

    private void NombreVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreVendedorKeyTyped
        
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A' ||c>'Z') && (c<' '|| c>' '))evt.consume();
        
    }//GEN-LAST:event_NombreVendedorKeyTyped

    private void Precio_MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Precio_MCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Precio_MCActionPerformed

    private void Precio_FortniteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Precio_FortniteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Precio_FortniteActionPerformed

    private void Precio_CODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Precio_CODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Precio_CODActionPerformed

    private void CantidadDeCadaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadDeCadaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadDeCadaProductoActionPerformed

    private void NomVendedorMVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomVendedorMVPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomVendedorMVPActionPerformed

    private void NomVendedorMVPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomVendedorMVPKeyTyped
         char c = evt.getKeyChar();
        if ((c<'a'|| c>'z') && (c<'A' ||c>'Z') && (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_NomVendedorMVPKeyTyped

    private void Precio_CODKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Precio_CODKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_Precio_CODKeyTyped

    private void Precio_MCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Precio_MCKeyTyped
         char c = evt.getKeyChar();
        if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_Precio_MCKeyTyped

    private void Precio_FortniteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Precio_FortniteKeyTyped
         char c = evt.getKeyChar();
        if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_Precio_FortniteKeyTyped

    private void Pesos_CODKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pesos_CODKeyTyped
       char c = evt.getKeyChar();
        if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_Pesos_CODKeyTyped

    private void Pesos_MCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pesos_MCKeyTyped
       char c = evt.getKeyChar();
        if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_Pesos_MCKeyTyped

    private void Pesos_FortniteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pesos_FortniteKeyTyped
       char c = evt.getKeyChar();
        if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_Pesos_FortniteKeyTyped

    private void Button_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ModificarActionPerformed

    private void Button_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_eliminarActionPerformed

    private void Pesos_CODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesos_CODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pesos_CODActionPerformed

    private void Pesos_MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesos_MCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pesos_MCActionPerformed

    private void Pesos_FortniteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesos_FortniteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pesos_FortniteActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Button_Guardar;
    private javax.swing.JToggleButton Button_Modificar;
    private javax.swing.JToggleButton Button_Salir;
    private javax.swing.JToggleButton Button_eliminar;
    private javax.swing.JComboBox<String> CMB_Productos;
    private javax.swing.JTextField CantidadDeCadaProducto;
    private javax.swing.JLabel ComisionDelMVP;
    private javax.swing.JTextField ComisionMVP;
    private javax.swing.JTextField ComisionVendedor;
    private javax.swing.JLabel Comision_Vendedor;
    private javax.swing.JTextField NomVendedorMVP;
    private javax.swing.JTextField NombreVendedor;
    private javax.swing.JTextField Pesos_COD;
    private javax.swing.JTextField Pesos_Fortnite;
    private javax.swing.JTextField Pesos_MC;
    private javax.swing.JTextField Precio_COD;
    private javax.swing.JTextField Precio_Fortnite;
    private javax.swing.JTextField Precio_MC;
    private javax.swing.JLabel Venta_Pesos;
    private javax.swing.JLabel carlos;
    private javax.swing.JLabel fornite;
    private javax.swing.JLabel maincra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void SetLocationRelativeTo(UI aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
