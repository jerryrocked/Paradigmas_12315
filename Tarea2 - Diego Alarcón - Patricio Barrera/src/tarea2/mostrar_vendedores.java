package tarea2;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author diego
 */
public class mostrar_vendedores extends javax.swing.JFrame {
    Connection cy = null;
    Statement stmt = null;
    Statement stmt1 = null;
    String titulos[] = {"Nombre","Cantidad COD","Cantidad Minecraft","Cantidad Fortnite","Cantidad total","Comision COD","Comision Minecraft","Comision Fortnite","Comision total"};
    String fila[] = new String [9];
    DefaultTableModel modelo;
    
    
    String titulos1[] = {"Nombre","Cantidad Total","Cantidad Comision"};
    String fila1[] = new String [3];
    DefaultTableModel modelo1;
    

    

   
    public mostrar_vendedores() {
        initComponents();
        this.setTitle("Vendedores");
        this.setLocation(335,200);
        this.setResizable(false);

        try {
          String bd = "personas";
          String url = "jdbc:mysql://localhost:3306/"+bd+"?useSSL=false&serverTimezone=UTC";
          String user = "root";
          String password = "";  
          
               Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
               cy = DriverManager.getConnection(url,user,password);
 

           cy = DriverManager.getConnection(url,user,password);
            if (cy!= null)
                   System.out.println("""
                                      Se ha establecido una conexion a la base de datos
                                      """+url);
               
               stmt = cy.createStatement();
               stmt1 = cy.createStatement();
               ResultSet rs = stmt.executeQuery("SELECT * FROM `vendedores`");
              
              ResultSet rm = stmt1.executeQuery("SELECT `Nombre vendedor`, `Total de ventas ($)`, `Comision total ($)` FROM  `vendedores` ORDER BY `Total de ventas ($)`  DESC LIMIT 1");
               
               
               modelo = new DefaultTableModel(null,titulos);
               modelo1 = new DefaultTableModel(null,titulos1);
               
            
               while(rs.next()) {
                   
                   fila[0] = rs.getString("Nombre vendedor");
                   fila[1] = rs.getString("Cant. COD vendidas");
                   fila[2] = rs.getString("Cant. Minecraft vendidas");
                   fila[3] = rs.getString("Cant. Fortnite vendidas");
                   fila[4] = rs.getString("Total de ventas ($)");
                   fila[5] = rs.getString("Comision COD");
                   fila[6] = rs.getString("Comision Min");
                   fila[7] = rs.getString("Comision Fortnite");
                   fila[8] = rs.getString("Comision total ($)");
                   modelo.addRow(fila); 
                   
               }
               tabla_vendedores.setModel(modelo);
                while(rm.next()){
                    
                fila1[0] = rm.getString("Nombre vendedor");
                fila1[1] = rm.getString("Total de ventas ($)");
                fila1[2] = rm.getString("Comision total ($)");
                modelo1.addRow(fila1);
                    
                }
              
               vendedor_mayor.setModel(modelo1);
               
               
               
               
               
               
               
               
               
    
                
               
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }    

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_vendedores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        vendedor_mayor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_vendedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_vendedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 280));

        vendedor_mayor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(vendedor_mayor);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 210));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Vendedor con mayores ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 420, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(mostrar_vendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostrar_vendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostrar_vendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostrar_vendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mostrar_vendedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_vendedores;
    private javax.swing.JTable vendedor_mayor;
    // End of variables declaration//GEN-END:variables
}
