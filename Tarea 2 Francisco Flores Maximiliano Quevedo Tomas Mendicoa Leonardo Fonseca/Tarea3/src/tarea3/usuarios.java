/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea3;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franc
 */
public class usuarios extends javax.swing.JFrame {
        DefaultTableModel modelo;
            Connection cx;
    Statement stmt;
    //PreparedStatement pst=null;
    //ResultSet rs= null;
    int i=0;
    
    double comision_cod =  0.06;
    double comision_min =  0.04;
    double comision_for =  0.09;
    
    double precio_cod = 34500;
    double precio_min = 8800;
    double precio_for = 58200;
    


    /**
     * Creates new form usuarios
     */
    public usuarios() {
        //this.pst = null;
        initComponents();
        this.setTitle("Programa de ventas XYZ");
        this.setLocation(335, 50);
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre del vendedor");
        modelo.addColumn("Cantidad de ventas MC");
        modelo.addColumn("Cantidad de ventas WZ");
        modelo.addColumn("Cantidad de ventas FT");
        modelo.addColumn("Total de ventas($)");
        modelo.addColumn("Comision TOTAL ($)");
        this.jTable4.setModel(modelo);

    }
 
     public void abrirFormulario(){
         Tabla_Vendedores f = new Tabla_Vendedores();
        f.setVisible(true);
    }
    //public void cargar(){
      //  try {
        //    String sql="SELECT * FROM vendedores WHERE Nombre='" & mayor_vendedor.getString().toString()+"'";
          //  pst=cx.prepareStatement(sql);
           // rs = pst.executeQuery(sql);
            //if(rs.next()){
              //  mayor_vendedor.setText(rs.getString("Nombre"));
                //com_mayor_vendedor.setText(rs.getString("comision_tot"));
            //}else{
              //  mayor_vendedor.setText("");
                //com_mayor_vendedor.setText("");
            //}
        //}catch(SQLException e) {
          //  JOptionPane.showMessageDialog(this, e.getMessage());
        //}
    //}
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ventas_cod = new javax.swing.JTextField();
        ventas_for = new javax.swing.JTextField();
        ventas_min = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        com_min = new javax.swing.JTextField();
        com_cod = new javax.swing.JTextField();
        com_for = new javax.swing.JTextField();
        calcular_comision = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        com_tot = new javax.swing.JTextField();
        ventas_tot = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("EMPRESA XYZ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Nombre de vendedor");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Call of Duty");

        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/callofduty.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("34.500 CLP");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minecraft.jpg"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Minecraft");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("8.800 CLP");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fortnite.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Fortnite");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("58.800 CLP");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Cant, ventas");

        ventas_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventas_codActionPerformed(evt);
            }
        });
        ventas_cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ventas_codKeyTyped(evt);
            }
        });

        ventas_for.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventas_forActionPerformed(evt);
            }
        });
        ventas_for.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ventas_forKeyTyped(evt);
            }
        });

        ventas_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventas_minActionPerformed(evt);
            }
        });
        ventas_min.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ventas_minKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Comisiones");

        com_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_minActionPerformed(evt);
            }
        });

        com_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_codActionPerformed(evt);
            }
        });

        com_for.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_forActionPerformed(evt);
            }
        });

        calcular_comision.setText("Calcular Comision");
        calcular_comision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_comisionActionPerformed(evt);
            }
        });

        Registrar.setText("Registrar Vendedor");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        jButton3.setText("Mostrar mayor vendedor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Total");

        com_tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_totActionPerformed(evt);
            }
        });

        ventas_tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventas_totActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(calcular_comision)
                                .addGap(66, 66, 66)
                                .addComponent(Registrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ventas_min, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(com_min, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(213, 213, 213)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ventas_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(com_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel14))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(454, 454, 454)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ventas_for, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(com_for, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ventas_tot)
                                        .addComponent(com_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(191, 191, 191)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(ventas_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ventas_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(com_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(com_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ventas_for, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(com_for, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(com_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(ventas_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular_comision)
                    .addComponent(Registrar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ventas_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventas_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventas_codActionPerformed

    private void ventas_forActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventas_forActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventas_forActionPerformed

    private void ventas_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventas_minActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventas_minActionPerformed

    private void com_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_minActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_minActionPerformed

    private void com_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_codActionPerformed

    private void com_forActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_forActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_forActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
        String cad2, cad3, cad4 ,cad5; 
        double cad7,cad6,cad8,cad9,cad,v_cod,v_min,v_for;
                //cad6, cad7, cad8, cad9, cad;
        cad2 = Nombre.getText();
        cad3 = ventas_cod.getText();
        cad4 = ventas_min.getText();
        cad5 = ventas_for.getText();
        cad6 = (parseInt(cad4)*precio_min)+(parseInt(cad3)*precio_cod)+(parseInt(cad5)*precio_for);//ventas tot
        cad7 = (precio_cod*comision_cod)*parseInt(cad3);
        cad8 =(precio_min*comision_min)*parseInt(cad4) ;
        cad9 = (precio_for*comision_for)*parseInt(cad5);
        cad  = cad7+cad8+cad9;
        v_cod=(parseInt(cad3)*precio_cod);
        v_min=(parseInt(cad4)*precio_min);
        v_for=(parseInt(cad5)*precio_for);
        //hay que llenar todos los datos para que no tire un error
        
        Object [] columna = new Object[9];
        columna [0] = Nombre.getText();
        columna [1] = v_cod;
        columna [2] = v_min;
        columna [3] = v_for; 
        columna [4] = cad6;
        columna [5] = cad;
        modelo.addRow(columna);
        
        
        String bd = "ventas";
        String url ="jdbc:mysql://localhost:3306/"+bd+"?useSSL=false&serverTimezone=UTC";
        String user="root";
        String password = "abcd";
        String driver = "com.mysql.cj.jdbc.driver";
        
        String st = "INSERT INTO vendedores VALUES('"+ i +"','"+cad2+"','"+cad3+"','"+cad4+"','"+ cad5 +"','"+cad6+"','"+cad7+"','"+ cad8 +"','"+ cad9 +"','"+ cad +"')";
        
        try {
           // Class.forName(driver);
            cx= DriverManager.getConnection(url,user,password);
            System.out.println("Se conecto a la BD "+bd);
            stmt = cx.createStatement();
            stmt.executeUpdate(st);
            System.out.println("Se registro a la BD ");
            javax.swing.JOptionPane.showMessageDialog(this, "Se registro a la BD");
            this.Nombre.setText("");
            this.ventas_cod.setText("");
            this.ventas_for.setText("");
            this.ventas_min.setText("");
            this.ventas_tot.setText("");
            this.com_cod.setText("");
            this.com_for.setText("");
            this.com_min.setText("");
            this.com_tot.setText("");
            i++;
        } catch (SQLException ex) {
            System.out.println("No se conecto a la BD "+bd);
            Logger.getLogger(Tarea3.class.getName()).log(Level.SEVERE, null, ex);
        }  
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Tarea3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void com_totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_totActionPerformed

    private void ventas_totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventas_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventas_totActionPerformed

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
if((c<'a'|| c>'z')&&(c<'A'||c>'Z')&&(c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_NombreKeyTyped

    private void ventas_codKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventas_codKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_ventas_codKeyTyped

    private void ventas_minKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventas_minKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_ventas_minKeyTyped

    private void ventas_forKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventas_forKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_ventas_forKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // poner lo de mostrar(); aca en este boton
        //cargar();
        abrirFormulario();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void calcular_comisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular_comisionActionPerformed
String com,com2,com3,comc;
int com4,com5,com6,comt;
if (!ventas_for.getText().equals("") && !ventas_min.getText().equals("") && !ventas_cod.getText().equals("")){
            this.com_cod.setText(String.valueOf(precio_cod * Integer.parseInt(ventas_cod.getText())*comision_cod));
            this.com_min.setText(String.valueOf(precio_min * Integer.parseInt(ventas_min.getText())*comision_min));
            this.com_for.setText(String.valueOf(precio_for * Integer.parseInt(ventas_for.getText())*comision_for));
            this.ventas_tot.setText(String.valueOf(precio_for * Integer.parseInt(ventas_for.getText())+precio_min * Integer.parseInt(ventas_min.getText()) + precio_cod * Integer.parseInt(ventas_cod.getText())));
            //com=com_cod.getText();
            //com2=com_for.getText();
            //com3=com_min.getText();
            //com4=Integer.parseInt(com);
            //com5=Integer.parseInt(com2);
            //com6=Integer.parseInt(com3);
            //comt=com4+com5+com6;
            //comc=Double.toString(comt);
            //this.jLabel4.setText((String.valueOf(precio_for * Integer.parseInt(ventas_for.getText())*comision_for)+(String.valueOf(precio_min * Integer.parseInt(ventas_min.getText())*comision_min)) + (String.valueOf(precio_cod * Integer.parseInt(ventas_cod.getText())*comision_cod))));
            //this.jLabel4.setText(com);
            float cod = parseFloat((String.valueOf(precio_cod * Integer.valueOf(ventas_cod.getText())*comision_cod)));
            float min = parseFloat((String.valueOf(precio_min * Integer.valueOf(ventas_min.getText())*comision_min)));
            float forn = parseFloat((String.valueOf(precio_for * Integer.valueOf(ventas_for.getText())*comision_for)));
            //int comi_total = cod + min + forn;
            this.com_tot.setText(String.valueOf(cod + min + forn));
        }
    }//GEN-LAST:event_calcular_comisionActionPerformed

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
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton calcular_comision;
    private javax.swing.JTextField com_cod;
    private javax.swing.JTextField com_for;
    private javax.swing.JTextField com_min;
    private javax.swing.JTextField com_tot;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField ventas_cod;
    private javax.swing.JTextField ventas_for;
    private javax.swing.JTextField ventas_min;
    private javax.swing.JTextField ventas_tot;
    // End of variables declaration//GEN-END:variables
}
