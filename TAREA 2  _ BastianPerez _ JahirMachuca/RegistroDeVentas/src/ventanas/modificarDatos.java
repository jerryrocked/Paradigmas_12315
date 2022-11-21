package ventanas;

import funciones.Calculos;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Clase encargada de modificar los datos de los vendedores registrados
 * en la base de datos.
 * @author Bastian Pérez
 * @author Jahir Machuca
 */
public class modificarDatos extends javax.swing.JFrame {
    private final Calculos Calcular = new Calculos();
    private final String BBDD  = "bd_ventas_bp_jm";
    private final String tabla = "registros";
    private final String url =  "jdbc:mysql://localhost:3306/"+BBDD;    
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private String user_update;
    private String user;
    private String password;
    private Connection Conexion = null;
    private Statement Sentencia = null;
    private ImageIcon icono;
    
    /**
     * Definición del inicializador de un objeto modificarDatos y define 
     * propiedades de la ventana.
     * @param USER: Usuario de la conexion local de MySQL obtenido del JFrame 'RegistroVentas'.
     * @param PASSWORD: Contraseña de la conexion local de MySQL obtenida del JFrame 'RegistroVentas'.
     * @param USER_UPDATE: Rut del usuario a modificar
     */
    public modificarDatos(String USER, String PASSWORD, String USER_UPDATE) {
        //Configuración de la ventana
        initComponents();
        this.setBounds(0,0,495, 420);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Modificar datos (" + USER_UPDATE + ")");
        this.icono = new ImageIcon("build/classes/imagenes/imgIcono.png");
        this.setIconImage(icono.getImage());
        //Almacenamiento de parámetros
        this.user_update = USER_UPDATE;
        this.user = USER;
        this.password = PASSWORD;
        cargarDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblVentasCOD = new javax.swing.JLabel();
        txtVentasCOD = new javax.swing.JTextField();
        lblVentasMIN = new javax.swing.JLabel();
        txtVentasMIN = new javax.swing.JTextField();
        lblVentasFOR = new javax.swing.JLabel();
        txtVentasFOR = new javax.swing.JTextField();
        bModificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 170, 0));
        lblTitulo.setText("DATOS DEL VENDEDOR");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 310, 40));

        lblRut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRut.setForeground(new java.awt.Color(255, 170, 0));
        lblRut.setText("RUT:");
        getContentPane().add(lblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 20));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 170, 0));
        lblNombre.setText("NOMBRE:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 310, 20));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 170, 0), 2));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 440, 30));

        lblVentasCOD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblVentasCOD.setForeground(new java.awt.Color(255, 170, 0));
        lblVentasCOD.setText("VENTAS CALL OF DUTY:");
        getContentPane().add(lblVentasCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 310, 20));

        txtVentasCOD.setBackground(new java.awt.Color(255, 255, 255));
        txtVentasCOD.setForeground(new java.awt.Color(0, 0, 0));
        txtVentasCOD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 170, 0), 2));
        txtVentasCOD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentasCODKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentasCODKeyTyped(evt);
            }
        });
        getContentPane().add(txtVentasCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 30));

        lblVentasMIN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblVentasMIN.setForeground(new java.awt.Color(255, 170, 0));
        lblVentasMIN.setText("VENTAS MINECRAFT:");
        getContentPane().add(lblVentasMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, 20));

        txtVentasMIN.setBackground(new java.awt.Color(255, 255, 255));
        txtVentasMIN.setForeground(new java.awt.Color(0, 0, 0));
        txtVentasMIN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 170, 0), 2));
        txtVentasMIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentasMINKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentasMINKeyTyped(evt);
            }
        });
        getContentPane().add(txtVentasMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, 30));

        lblVentasFOR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblVentasFOR.setForeground(new java.awt.Color(255, 170, 0));
        lblVentasFOR.setText("VENTAS FORTNITE:");
        getContentPane().add(lblVentasFOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 310, 20));

        txtVentasFOR.setBackground(new java.awt.Color(255, 255, 255));
        txtVentasFOR.setForeground(new java.awt.Color(0, 0, 0));
        txtVentasFOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 170, 0), 2));
        txtVentasFOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentasFORKeyTyped(evt);
            }
        });
        getContentPane().add(txtVentasFOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 210, 30));

        bModificar.setBackground(new java.awt.Color(0, 0, 0));
        bModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bModificar.setForeground(new java.awt.Color(255, 255, 255));
        bModificar.setText("MODIFICAR");
        bModificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 170, 0), 2, true));
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });
        getContentPane().add(bModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 190, 40));

        bEliminar.setBackground(new java.awt.Color(0, 0, 0));
        bEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bEliminar.setText("ELIMINAR");
        bEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 170, 0), 2, true));
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 190, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgFondo.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Elimina registros de la tabla usada cuando el rut es el seleccionado.
     * y vuelve a abrir una ventana 'tablaVendedores'
     * @param evt: Evento que se activa al presionar el botón Eliminar
     */
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        try{
            Class.forName(driver);
            Conexion = DriverManager.getConnection(url,user,password);
            if(Conexion!=null) System.out.println("Base de datos conectada");
            Sentencia = Conexion.createStatement();
            String eliminarRegistro = "DELETE FROM " + tabla + " WHERE RutVendedor = '" + user_update +"';";
            Sentencia.executeUpdate(eliminarRegistro);
            this.dispose();
            tablaVendedores vTABLA = new tablaVendedores(user, password);
            vTABLA.setVisible(true);
            vTABLA.actualizarTabla();
            JOptionPane.showMessageDialog(this,"Registro eliminado con exito. \n","AVISO!",JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(modificarDatos.class.getName()).log(Level.SEVERE, null, ex);
            this.dispose();
            tablaVendedores vTABLA = new tablaVendedores(user, password);
            vTABLA.setVisible(true);
            vTABLA.actualizarTabla();
            JOptionPane.showMessageDialog(this,"Error al eliminar el registro. \n","AVISO!",JOptionPane.INFORMATION_MESSAGE);
        } finally {
            if(Conexion!=null){
                try{
                    Conexion.close();
                    Sentencia.close();
                } catch (SQLException ex) {
                    Logger.getLogger(modificarDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    /**
     * Calcula los valores de ventas y comision de acuerdo a los nuevos datos ingresados
     * y actualiza al vendedor en la base de datos. Finalmente vuelve a abrir una ventana
     * 'tablaVendedores'.
     * @param evt: Evento que se activa al presionar el botón Modificar
     */
    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        String Nombre, DV, strVentasCOD, strVentasMIN, strVentasFOR;
        int ventasCOD, ventasMIN, ventasFOR, ventasTotal, comisionCOD, comisionMIN, comisionFOR, comisionTotal;
        
        Nombre = txtNombre.getText();
        strVentasCOD = txtVentasCOD.getText();
        strVentasMIN = txtVentasMIN.getText();
        strVentasFOR = txtVentasFOR.getText();
        if("".equals(Nombre) || "".equals(strVentasCOD) || "".equals(strVentasMIN) || "".equals(strVentasFOR)){
            JOptionPane.showMessageDialog(this,"Debes llenar todos los campos. \n","AVISO!",JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        }else{
            ventasCOD = Integer.parseInt(strVentasCOD);
            ventasMIN = Integer.parseInt(strVentasMIN);
            ventasFOR = Integer.parseInt(strVentasFOR);
            ventasTotal = Calcular.Vendido(ventasCOD,"CallOfDuty") +
                          Calcular.Vendido(ventasMIN, "Minecraft") +
                          Calcular.Vendido(ventasFOR, "Fortnite");
            comisionCOD = Calcular.Comision(ventasCOD, "CallOfDuty");
            comisionMIN = Calcular.Comision(ventasMIN, "Minecraft");
            comisionFOR = Calcular.Comision(ventasFOR, "Fortnite");
            comisionTotal = comisionCOD + comisionMIN + comisionFOR;
            try{
                Class.forName(driver);
                Conexion = DriverManager.getConnection(url,user,password);
                Sentencia = Conexion.createStatement();
                String modificarRegistro = "UPDATE " + tabla + " SET " + 
                                           "NombreVendedor = '" + Nombre + "', " + 
                                           "CantVentasCOD = " + ventasCOD + ", " +
                                           "CantVentasMIN = " + ventasMIN + ", " +
                                           "CantVentasFOR = " + ventasFOR + ", " +
                                           "VentasTotal = " + ventasTotal + ", " +
                                           "ComisionCOD = " + comisionCOD + ", " +
                                           "ComisionMIN = " + comisionMIN + ", " +
                                           "ComisionFOR = " + comisionFOR + ", " +
                                           "ComisionTotal = " + comisionTotal +
                                           " WHERE RutVendedor = '" + user_update + "';";
                Sentencia.executeUpdate(modificarRegistro);
                this.dispose();
                tablaVendedores vTABLA = new tablaVendedores(user, password);
                vTABLA.setVisible(true);
                vTABLA.actualizarTabla();
                JOptionPane.showMessageDialog(this,"Registro modificado con exito. \n","AVISO!",JOptionPane.INFORMATION_MESSAGE);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(modificarDatos.class.getName()).log(Level.SEVERE, null, ex);
                this.dispose();
                tablaVendedores vTABLA = new tablaVendedores(user, password);
                vTABLA.setVisible(true);
                vTABLA.actualizarTabla();
                JOptionPane.showMessageDialog(this,"Error al modificar el registro. \n","AVISO!",JOptionPane.INFORMATION_MESSAGE);
            }finally{
                if(Conexion!=null){
                    try{
                        Conexion.close();
                        Sentencia.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(modificarDatos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_bModificarActionPerformed

    /**
     * Cambia el foco al cuadro de cantidad de ventas de Call of Duty si se presiona ENTER.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) txtVentasCOD.requestFocus();
    }//GEN-LAST:event_txtNombreKeyReleased

    /**
     * Omite los caracteres que no sean letras ni espacios, tambien los omite cuando
     * el texto contenido alcanza un largo de 49 caracteres.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a'||c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
        if(txtNombre.getText().length() >= 49) evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    /**
     * Cambia el foco al jTextfield de la cantidad de ventas de Minecraft al presionar ENTER.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasCODKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasCODKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtVentasMIN.requestFocus();
    }//GEN-LAST:event_txtVentasCODKeyReleased
    
    /**
     * Cambia el foco al jTextfield de la cantidad de ventas de Fortnite al presionar ENTER.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasMINKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasMINKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtVentasFOR.requestFocus();
    }//GEN-LAST:event_txtVentasMINKeyReleased

    /**
     * Omite los caracteres que no sean números.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasCODKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasCODKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_txtVentasCODKeyTyped

    /**
     * Omite los caracteres que no sean números.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasMINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasMINKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_txtVentasMINKeyTyped

    /**
     * Omite los caracteres que no sean números.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasFORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasFORKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_txtVentasFORKeyTyped
    
    /**
     * Busca el rut a actualizar en la base de datos y rellena los jTextField con
     * los datos obtenidos.
     */
    private void cargarDatos(){
        try{
            Class.forName(driver).newInstance();
            Conexion = DriverManager.getConnection(url,user,password);
            if(Conexion!=null) System.out.println("Se ha conectado la base de datos con exito.");
            Sentencia = Conexion.createStatement();
            ResultSet rs = Sentencia.executeQuery("SELECT RutVendedor, NombreVendedor, CantVentasCOD, CantVentasMIN, CantVentasFOR FROM " + tabla +
                                                  " WHERE RutVendedor = '" + user_update + "';");
            while(rs.next()){
                lblRut.setText("RUT: "+ rs.getString("RutVendedor"));
                txtNombre.setText(rs.getString("NombreVendedor"));
                txtVentasCOD.setText(rs.getString("CantVentasCOD"));
                txtVentasMIN.setText(rs.getString("CantVentasMIN"));
                txtVentasFOR.setText(rs.getString("CantVentasFOR"));
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(modificarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                if(Conexion!=null){
                    Conexion.close();
                    Sentencia.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(modificarDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bModificar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVentasCOD;
    private javax.swing.JLabel lblVentasFOR;
    private javax.swing.JLabel lblVentasMIN;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVentasCOD;
    private javax.swing.JTextField txtVentasFOR;
    private javax.swing.JTextField txtVentasMIN;
    // End of variables declaration//GEN-END:variables
}
