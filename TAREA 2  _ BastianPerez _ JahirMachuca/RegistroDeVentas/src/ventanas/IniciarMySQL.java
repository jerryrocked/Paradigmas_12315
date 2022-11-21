package ventanas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * La clase IniciarMySQL permite verificar la conexión con MySQL, también crear
 * la base de datos a utilizar en el caso de que no exista, finalmente abre la
 * ventana de registro de ventas.
 * @author Bastián Pérez
 * @author Jahir Machuca
 */
public class IniciarMySQL extends javax.swing.JFrame {
    private final String BBDD = "bd_ventas_bp_jm";
    private final String tabla = "registros";
    private final String driver = "jdbc:mysql://localhost:3306/";
    private String user;
    private String password;
    private Connection Conexion1;
    private PreparedStatement ps;
    private ImageIcon icono;
    
    /**
     * Definición del inicializador de un objeto IniciarMySQL y define 
     * propiedades de la ventana.
     */
    public IniciarMySQL() {
        //Configuración de la ventana
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setBounds(0,0,334,290);
        this.setLocationRelativeTo(null);
        this.setTitle("MySQL - Iniciar sesion");
        this.icono = new ImageIcon("build/classes/imagenes/imgIconoMySql.png");
        this.setIconImage(icono.getImage());
        //Transparencia a text area
        TA_Mensaje.setOpaque(false);
        TA_Mensaje.setOpaque(false);
        TA_Mensaje.setBorder(null);
        TA_Mensaje.setBorder(null);
        TA_Mensaje.setBackground(new Color(0,0,0,150));
        txtPassword.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPassword = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        bIngresar = new javax.swing.JButton();
        TA_Mensaje = new javax.swing.JTextArea();
        imgMySql = new javax.swing.JLabel();
        lblWrongPassword = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Contraseña:");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 20));

        lblUser.setForeground(new java.awt.Color(0, 0, 0));
        lblUser.setText("Usuario: ");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 20));

        txtUser.setBackground(new java.awt.Color(0, 0, 102));
        txtUser.setForeground(new java.awt.Color(241, 135, 0));
        txtUser.setText("root");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 250, 30));

        txtPassword.setBackground(new java.awt.Color(0, 0, 102));
        txtPassword.setForeground(new java.awt.Color(241, 135, 0));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 30));

        bIngresar.setBackground(new java.awt.Color(241, 135, 0));
        bIngresar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bIngresar.setForeground(new java.awt.Color(0, 0, 102));
        bIngresar.setText("Ingresar");
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(bIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 110, 30));

        TA_Mensaje.setEditable(false);
        TA_Mensaje.setColumns(20);
        TA_Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        TA_Mensaje.setRows(5);
        TA_Mensaje.setText("   \n    Ingrese usuario y contraseña de MySQL para iniciar \n    la base de datos.");
        getContentPane().add(TA_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 60));

        imgMySql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgLogoMySql.png"))); // NOI18N
        getContentPane().add(imgMySql, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 215, 60, 30));

        lblWrongPassword.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblWrongPassword.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblWrongPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 200, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgFondoMySQL.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -5, 370, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    /**
     * Verifica que el formato de los datos ingresados sean los correctos,
     * intenta conectarse a la conexión local de MySQL, si no lo logra vuelve a pedir los datos de ingreso,
     * si logra la conectividad, verifica si existe la base de datos, si no existe la crea,
     * si existe, verifica la existencia de la tabla a utilizar, si no existe la crea.
     * Si existe la base de datos y la tabla, inicializa el JFrame 'RegistroVentas'.
     * @param evt: Registra un evento al presionar el botón ingresar.
     */
    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        boolean existeBD = false, creadaBD = false;
        boolean existeTabla = false, creadaTabla = false;
        
        user = txtUser.getText();
        password = txtPassword.getText();
        txtPassword.setText("");
        if("".equals(user)){
            JOptionPane.showMessageDialog(this,"Ingresa tu nombre de usuario.\n","AVISO!",JOptionPane.INFORMATION_MESSAGE);
        }else{
            // VERIFICAR EXISTENCIA DE BD Y CREAR
            try {
                //CONECTAR BD
                Conexion1 = (Connection) DriverManager.getConnection(driver,user,password);
                //VERIFICAR SI EXISTE LA BD
                ps = Conexion1.prepareStatement("show databases");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {                
                    if (rs.getString(1).equals(BBDD)) {
                        existeBD = true;
                    }
                }
                //SI NO EXISTE LA BD, CREAR BD
                if(!existeBD){
                    ps = Conexion1.prepareStatement("CREATE DATABASE "+BBDD);
                    ps.executeUpdate();
                    creadaBD=true;
                    System.out.println("Se creo la base de datos");
                //SINO, VERIFICAR EXISTENCIA
                }else{
                    System.out.println("La base de datos ya existe");
                    creadaBD = true;
                }
                Conexion1.close();
                ps.close(); //CERRAR CONEXIÓN
            }catch (SQLException ex) {
                System.out.println(ex);
                lblWrongPassword.setText("¡Usuario o contraseña incorrecta!");
                txtPassword.requestFocus();
            }
            // CREAR Y VERIFICAR EXISTENCIA DE TABLA SI EXISTE BD
            if(creadaBD){
                try {
                    //CONECTAR BD
                    Conexion1 = (Connection) DriverManager.getConnection(driver,user,password);
                    //USAR BD
                    ps = Conexion1.prepareStatement("USE "+BBDD);
                    ps.executeUpdate();
                    //VERIFICAR SI EXISTE LA TABLA
                    ps = Conexion1.prepareStatement("show tables");
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {                
                        if (rs.getString(1).equals(tabla)) {
                            existeTabla = true;
                        }
                    }
                    //SI NO EXISTE LA TABLA, CREAR TABLA
                    if(!existeTabla){
                        ps = Conexion1.prepareStatement("CREATE TABLE IF NOT EXISTS "+tabla+" ("+
                                "RutVendedor VARCHAR(25) PRIMARY KEY NOT NULL, "+
                                "NombreVendedor VARCHAR(50) NOT NULL, "+
                                "CantVentasCOD INT NOT NULL, "+
                                "CantVentasMIN INT NOT NULL, "+
                                "CantVentasFOR INT NOT NULL, "+
                                "VentasTotal INT NOT NULL, "+
                                "ComisionCOD INT NOT NULL, "+
                                "ComisionMIN INT NOT NULL, "+
                                "ComisionFOR INT NOT NULL, "+
                                "ComisionTotal INT NOT NULL);");
                        ps.executeUpdate();
                        creadaTabla=true;
                        System.out.println("Se creo la tabla "+ tabla);
                    //SINO, VERIFICAR EXISTENCIA
                    }else{
                        System.out.println("La tabla ya existe");
                        creadaTabla = true;
                    }
                    Conexion1.close();
                    ps.close();//CERRAR CONEXIÓN
                }catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            //SI EXISTE BD Y TABLA, ABRIR VENTANA DE REGISTRO DE VENTAS
            if(creadaBD && creadaTabla){
                this.dispose();
                new RegistroVentas(user, password).setVisible(true);
            }
        }
    }//GEN-LAST:event_bIngresarActionPerformed

    /**
     * Vacía el jLabel que indica que la contraseña es incorrecta y cambia el foco
     * a la casilla contraseña si se presiona ENTER.
     * @param evt: Evento de acciones realizadas por teclado en la casilla usuario
     */
    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        lblWrongPassword.setText("");
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtPassword.requestFocus();
    }//GEN-LAST:event_txtUserKeyReleased
    
    /**
     * Vacía el jLabel que indica que la contraseña es incorrecta y presiona el
     * botón ingresar al presionar ENTER.
     * @param evt: Evento de acciones realizadas por teclado en la casilla usuario
     */
    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        lblWrongPassword.setText("");
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            bIngresar.doClick();
    }//GEN-LAST:event_txtPasswordKeyReleased

    /**
     * Inicializa y abre una nueva ventana de inicio MySQL.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarMySQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarMySQL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA_Mensaje;
    private javax.swing.JButton bIngresar;
    private javax.swing.JLabel imgMySql;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblWrongPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
