package ventanas;

import funciones.Calculos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.text.DecimalFormat;

/**
 * Clase encargada del registro de ventas de los usuarios, mostrar los que tienen
 * mayor cantidad de ventas enlazar el JFrame 'tablaVendedores'.
 * @author Bastián Pérez
 * @author Jahir Machuca
 */
public class RegistroVentas extends javax.swing.JFrame {
    private final DecimalFormat formatoMiles = new DecimalFormat("###,###.##");
    private final Calculos Calcular = new Calculos();
    private final String BBDD  = "bd_ventas_bp_jm";
    private final String tabla = "registros";
    private final String url =  "jdbc:mysql://localhost:3306/"+BBDD;    
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "";
    private String password = "";
    private Connection Conexion = null;
    private Statement Sentencia = null;
    private ImageIcon icono;
    
    /**
     * Definición del inicializador de un objeto RegistroVentas y define 
     * propiedades de la ventana.
     * @param USER: Usuario de la conexion local de MySQL obtenido del JFrame 'IniciarMySQL'.
     * @param PASSWORD: Contraseña de la conexion local de MySQL obtenida del JFrame 'IniciarMySQL'.
     */
    public RegistroVentas(String USER, String PASSWORD) {
        //Configuración de la ventana
        initComponents();
        this.setBounds(0,0,630,700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("XYZ® - Registro de ventas");
        this.icono = new ImageIcon("build/classes/imagenes/imgIcono.png");
        this.setIconImage(icono.getImage());
        //Almacenamiento de parámetros
        this.user = USER;
        this.password = PASSWORD;
        //Transparencia de jTextArea
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        txtInfo.setBorder(null);
        txtInfo.setBackground(new Color(0,0,0,50));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        lblGuionRut = new javax.swing.JLabel();
        txtDV = new javax.swing.JTextField();
        lblVentasCallOfDuty = new javax.swing.JLabel();
        txtVentasCallOfDuty = new javax.swing.JTextField();
        iconCallOfDuty = new javax.swing.JLabel();
        lblPrecioCallOfDuty = new javax.swing.JLabel();
        lblVendidoCallOfDuty = new javax.swing.JLabel();
        lblComisionCallOfDuty = new javax.swing.JLabel();
        lblVentasMinecraft = new javax.swing.JLabel();
        txtVentasMinecraft = new javax.swing.JTextField();
        iconMinecraft = new javax.swing.JLabel();
        lblPrecioMinecraft = new javax.swing.JLabel();
        lblVendidoMinecraft = new javax.swing.JLabel();
        lblComisionMinecraft = new javax.swing.JLabel();
        lblVentasFortnite = new javax.swing.JLabel();
        txtVentasFortnite = new javax.swing.JTextField();
        iconFortnite = new javax.swing.JLabel();
        lblPrecioFortnite = new javax.swing.JLabel();
        lblVendidoFortnite = new javax.swing.JLabel();
        lblComisionFortnite = new javax.swing.JLabel();
        bFinalizar = new javax.swing.JButton();
        bRegistrar = new javax.swing.JButton();
        bVerRegistros = new javax.swing.JButton();
        lblVerRegistros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 170, 0));
        lblTitulo.setText("Registro de ventas");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 380, 50));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre del vendedor     :");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 140, 30));

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
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 370, 30));

        lblRut.setForeground(new java.awt.Color(255, 255, 255));
        lblRut.setText("Rut                                  :");
        getContentPane().add(lblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, 30));

        txtRut.setBackground(new java.awt.Color(255, 255, 255));
        txtRut.setForeground(new java.awt.Color(0, 0, 0));
        txtRut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 170, 0), 2));
        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 280, 30));

        lblGuionRut.setForeground(new java.awt.Color(255, 255, 255));
        lblGuionRut.setText("    -");
        getContentPane().add(lblGuionRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 30, 30));

        txtDV.setBackground(new java.awt.Color(255, 255, 255));
        txtDV.setForeground(new java.awt.Color(0, 0, 0));
        txtDV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 170, 0), 2));
        txtDV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDVKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDVKeyTyped(evt);
            }
        });
        getContentPane().add(txtDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 60, 30));

        lblVentasCallOfDuty.setForeground(new java.awt.Color(255, 255, 255));
        lblVentasCallOfDuty.setText("Ventas Call of Duty :");
        getContentPane().add(lblVentasCallOfDuty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, 20));

        txtVentasCallOfDuty.setBackground(new java.awt.Color(255, 255, 255));
        txtVentasCallOfDuty.setForeground(new java.awt.Color(0, 0, 0));
        txtVentasCallOfDuty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 170, 0), 2));
        txtVentasCallOfDuty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentasCallOfDutyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentasCallOfDutyKeyTyped(evt);
            }
        });
        getContentPane().add(txtVentasCallOfDuty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 30));

        iconCallOfDuty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgCallOfDuty.jpg"))); // NOI18N
        iconCallOfDuty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        getContentPane().add(iconCallOfDuty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 120));

        lblPrecioCallOfDuty.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblPrecioCallOfDuty.setForeground(new java.awt.Color(255, 0, 0));
        lblPrecioCallOfDuty.setText("           $ 34.500");
        getContentPane().add(lblPrecioCallOfDuty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 20));

        lblVendidoCallOfDuty.setForeground(new java.awt.Color(255, 255, 255));
        lblVendidoCallOfDuty.setText("Vendido: $ 0");
        getContentPane().add(lblVendidoCallOfDuty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, 20));

        lblComisionCallOfDuty.setForeground(new java.awt.Color(255, 255, 255));
        lblComisionCallOfDuty.setText("Comision: $ 0");
        getContentPane().add(lblComisionCallOfDuty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 200, 20));

        lblVentasMinecraft.setForeground(new java.awt.Color(255, 255, 255));
        lblVentasMinecraft.setText("Ventas Minecraft :");
        getContentPane().add(lblVentasMinecraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 120, 20));

        txtVentasMinecraft.setBackground(new java.awt.Color(255, 255, 255));
        txtVentasMinecraft.setForeground(new java.awt.Color(0, 0, 0));
        txtVentasMinecraft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 170, 0), 2));
        txtVentasMinecraft.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentasMinecraftKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentasMinecraftKeyTyped(evt);
            }
        });
        getContentPane().add(txtVentasMinecraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, 30));

        iconMinecraft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgMinecraft.jpg"))); // NOI18N
        iconMinecraft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        getContentPane().add(iconMinecraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 120, 120));

        lblPrecioMinecraft.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblPrecioMinecraft.setForeground(new java.awt.Color(255, 0, 0));
        lblPrecioMinecraft.setText("            $ 8.800");
        getContentPane().add(lblPrecioMinecraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 120, 20));

        lblVendidoMinecraft.setForeground(new java.awt.Color(255, 255, 255));
        lblVendidoMinecraft.setText("Vendido: $ 0");
        getContentPane().add(lblVendidoMinecraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 180, 20));

        lblComisionMinecraft.setForeground(new java.awt.Color(255, 255, 255));
        lblComisionMinecraft.setText("Comision: $ 0");
        getContentPane().add(lblComisionMinecraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 180, 20));

        lblVentasFortnite.setForeground(new java.awt.Color(255, 255, 255));
        lblVentasFortnite.setText("Ventas Fortnite :");
        getContentPane().add(lblVentasFortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 120, 20));

        txtVentasFortnite.setBackground(new java.awt.Color(255, 255, 255));
        txtVentasFortnite.setForeground(new java.awt.Color(0, 0, 0));
        txtVentasFortnite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 170, 0), 2));
        txtVentasFortnite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentasFortniteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVentasFortniteKeyTyped(evt);
            }
        });
        getContentPane().add(txtVentasFortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 120, 30));

        iconFortnite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgFornite.jpg"))); // NOI18N
        iconFortnite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        getContentPane().add(iconFortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 120, 120));

        lblPrecioFortnite.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblPrecioFortnite.setForeground(new java.awt.Color(255, 0, 0));
        lblPrecioFortnite.setText("           $ 58.200");
        getContentPane().add(lblPrecioFortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 120, 20));

        lblVendidoFortnite.setForeground(new java.awt.Color(255, 255, 255));
        lblVendidoFortnite.setText("Vendido: $ 0");
        getContentPane().add(lblVendidoFortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 150, 20));

        lblComisionFortnite.setForeground(new java.awt.Color(255, 255, 255));
        lblComisionFortnite.setText("Comision: $ 0");
        getContentPane().add(lblComisionFortnite, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 150, 20));

        bFinalizar.setBackground(new java.awt.Color(0, 0, 0));
        bFinalizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        bFinalizar.setText("FINALIZAR");
        bFinalizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 170, 0), 2, true));
        bFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(bFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 160, 40));

        bRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        bRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        bRegistrar.setText("REGISTRAR");
        bRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 170, 0), 2, true));
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(bRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 160, 40));

        bVerRegistros.setForeground(new java.awt.Color(204, 0, 51));
        bVerRegistros.setBorder(null);
        bVerRegistros.setContentAreaFilled(false);
        bVerRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerRegistrosActionPerformed(evt);
            }
        });
        getContentPane().add(bVerRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 320, 20));

        lblVerRegistros.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblVerRegistros.setForeground(new java.awt.Color(204, 0, 0));
        lblVerRegistros.setText("«CLICK AQUÍ PARA VER TODOS LOS REGISTROS»");
        getContentPane().add(lblVerRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 290, 20));

        jScrollPane1.setOpaque(false);

        txtInfo.setEditable(false);
        txtInfo.setColumns(20);
        txtInfo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtInfo.setForeground(new java.awt.Color(255, 255, 255));
        txtInfo.setLineWrap(true);
        txtInfo.setRows(5);
        txtInfo.setWrapStyleWord(true);
        txtInfo.setBorder(null);
        jScrollPane1.setViewportView(txtInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 550, 110));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgFondo.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
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
     * Omite los caracteres que no sean números.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasMinecraftKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasMinecraftKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_txtVentasMinecraftKeyTyped
 
    /**
     * Omite los caracteres que no sean números.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasFortniteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasFortniteKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_txtVentasFortniteKeyTyped
   
    /**
     * Omite los caracteres que no sean números.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasCallOfDutyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasCallOfDutyKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')) evt.consume();
    }//GEN-LAST:event_txtVentasCallOfDutyKeyTyped
   
    /**
     * Actualiza los jLabel que muestran el valor vendido y la comision de
     * acuerdo a la cantidad de ventas de Call of Duty ingresadas.
     * Cambia el foco al jTextfield de la cantidad de ventas de Minecraft al presionar ENTER.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasCallOfDutyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasCallOfDutyKeyReleased
        String texto = txtVentasCallOfDuty.getText();
        
        if("".equals(texto) == false){
            int cantidad = Integer.parseInt(texto);
            int vendido = Calcular.Vendido(cantidad, "CallOfDuty");
            int comision = Calcular.Comision(cantidad, "CallOfDuty");   
            lblVendidoCallOfDuty.setText("Vendido: $ " + formatoMiles.format(vendido));
            lblComisionCallOfDuty.setText("Comision: $ " + formatoMiles.format(comision));
        }else{
            lblVendidoCallOfDuty.setText("Vendido: $ 0");
            lblComisionCallOfDuty.setText("Comision: $ 0");
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) txtVentasMinecraft.requestFocus();
    }//GEN-LAST:event_txtVentasCallOfDutyKeyReleased
    
    /**
     * Actualiza los jLabel que muestran el valor vendido y la comision de
     * acuerdo a la cantidad de ventas de Minecraft ingresadas.
     * Cambia el foco al jTextfield de la cantidad de ventas de Fortnite al presionar ENTER.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasMinecraftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasMinecraftKeyReleased
        String texto = txtVentasMinecraft.getText();
        
        if("".equals(texto) == false){
            int cantidad = Integer.parseInt(texto);
            int vendido = Calcular.Vendido(cantidad, "Minecraft");
            int comision = Calcular.Comision(cantidad, "Minecraft");   
            lblVendidoMinecraft.setText("Vendido: $ " + formatoMiles.format(vendido));
            lblComisionMinecraft.setText("Comision: $ " + formatoMiles.format(comision));
        }else{
            lblVendidoMinecraft.setText("Vendido: $ 0");
            lblComisionMinecraft.setText("Comision: $ 0");
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) txtVentasFortnite.requestFocus();
    }//GEN-LAST:event_txtVentasMinecraftKeyReleased

    /**
     * Actualiza los jLabel que muestran el valor vendido y la comision de
     * acuerdo a la cantidad de ventas de Fortnite ingresadas.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtVentasFortniteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasFortniteKeyReleased
        String texto = txtVentasFortnite.getText();
        
        if("".equals(texto) == false){
            int cantidad = Integer.parseInt(texto);
            int vendido = Calcular.Vendido(cantidad, "Fortnite");
            int comision = Calcular.Comision(cantidad, "Fortnite");     
            lblVendidoFortnite.setText("Vendido: $ " + formatoMiles.format(vendido));
            lblComisionFortnite.setText("Comision: $ " + formatoMiles.format(comision));
        }else{
            lblVendidoFortnite.setText("Vendido: $ 0");
            lblComisionFortnite.setText("Comision: $ 0");
        }
    }//GEN-LAST:event_txtVentasFortniteKeyReleased

    /**
     * Verifica que los datos estén ingresados correctamente, verifica si un vendedor existe o no,
     * Si no existe lo ingresa a la base de datos, si existe actualiza el nombre y suma los nuevos
     * valores de ventas con los antiguos.
     * @param evt: evento que se activa al presionar el botón 'Registrar'
     */
    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        String nombre ,  numRut, DvRut, rut, strVentasCOD, strVentasMIN, strVentasFOR;
        String nombreAnterior = "", strVentasCODAnterior = "0", strVentasMINAnterior = "0", strVentasFORAnterior = "0";
        int ventasCOD, ventasMIN, ventasFOR, ventasTotal, comisionCOD, comisionMIN, comisionFOR, comisionTotal;
        boolean rutExiste = false;
        //Obtener datos
        nombre = txtNombre.getText();
        numRut = txtRut.getText();
        DvRut = txtDV.getText();
        strVentasCOD = txtVentasCallOfDuty.getText();
        strVentasMIN = txtVentasMinecraft.getText();
        strVentasFOR = txtVentasFortnite.getText();
        txtInfo.setText(""); 
        //Verificar que todos los campos estén completos
        if("".equals(nombre) || "".equals(strVentasCOD) || "".equals(strVentasMIN) || "".equals(strVentasFOR) || "".equals(numRut) || "".equals(DvRut)){
            JOptionPane.showMessageDialog(this,"Debes llenar todos los campos. \n","AVISO!",JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        //Si todos los campos están completos
        }else{
            //preparar datos obtenidos
            rut = numRut + "-" + DvRut;
            ventasCOD = Integer.parseInt(strVentasCOD);
            ventasMIN = Integer.parseInt(strVentasMIN);
            ventasFOR = Integer.parseInt(strVentasFOR);
            // Verificar existencia del rut ingresado
            try{
                String consulta = "SELECT * FROM " + tabla +" WHERE RutVendedor = '" + rut + "';"; 
                Class.forName(driver).newInstance();
                Conexion = DriverManager.getConnection(url, user, password);
                if(Conexion!=null) System.out.println("Base de datos conectada con exito.");
                Sentencia = Conexion.createStatement();
                ResultSet resultado = Sentencia.executeQuery(consulta);
                System.out.println("Valores solicitados con exito.");
                //Si el rut existe en los datos consultados, guardar los datos anteriores y confirmar existencia del rut.
                while(resultado.next()){
                    if((resultado.getString("RutVendedor")).equals(rut)){
                        rutExiste = true;
                        nombreAnterior = resultado.getString("NombreVendedor");
                        strVentasCODAnterior = resultado.getString("CantVentasCOD");
                        strVentasMINAnterior = resultado.getString("CantVentasMIN");
                        strVentasFORAnterior = resultado.getString("CantVentasFOR");
                    }
                }
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(RegistroVentas.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if(Conexion!=null){
                    try{
                        Conexion.close();
                        Sentencia.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistroVentas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            //Si el rut ya existe sumar la nueva cantidad de ventas a la cantidad de ventas anterios
            if(rutExiste){
                ventasCOD += Integer.parseInt(strVentasCODAnterior);
                ventasMIN += Integer.parseInt(strVentasMINAnterior);
                ventasFOR += Integer.parseInt(strVentasFORAnterior);   
            }
            // Calcular valores con las cantidades de venta actualizadas.
            ventasTotal = Calcular.Vendido(ventasCOD,"CallOfDuty") +
                          Calcular.Vendido(ventasMIN, "Minecraft") +
                          Calcular.Vendido(ventasFOR, "Fortnite");
            comisionCOD = Calcular.Comision(ventasCOD, "CallOfDuty");
            comisionMIN = Calcular.Comision(ventasMIN, "Minecraft");
            comisionFOR = Calcular.Comision(ventasFOR, "Fortnite");
            comisionTotal = comisionCOD + comisionMIN + comisionFOR;
            //Comando ingresar nuevo vendedor
            String ingresarRegistro = "INSERT INTO " + tabla + " VALUES ('" + 
                                      rut + "', '" +
                                      nombre + "'," +
                                      ventasCOD + "," +
                                      ventasMIN + "," +
                                      ventasFOR + "," +
                                      ventasTotal + "," +
                                      comisionCOD + "," +
                                      comisionMIN + "," +
                                      comisionFOR + "," +
                                      comisionTotal + ");";
            //Comando para actualizar vendedor existente
            String actualizarRegistro = "UPDATE " + tabla + " SET " + 
                                        "NombreVendedor = '" + nombre + "', " + 
                                        "CantVentasCOD = " + ventasCOD + ", " +
                                        "CantVentasMIN = " + ventasMIN + ", " +
                                        "CantVentasFOR = " + ventasFOR + ", " +
                                        "VentasTotal = " + ventasTotal + ", " +
                                        "ComisionCOD = " + comisionCOD + ", " +
                                        "ComisionMIN = " + comisionMIN + ", " +
                                        "ComisionFOR = " + comisionFOR + ", " +
                                        "ComisionTotal = " + comisionTotal +
                                        " WHERE RutVendedor = '" + rut + "';";
            //Ingresar o actualizar vendedor
            try{
                Class.forName(driver).newInstance();
                Conexion = DriverManager.getConnection(url, user, password);
                if(Conexion!=null) System.out.println("Base de datos conectada con exito.");
                Sentencia = Conexion.createStatement();
                // Si el rut no existe, ingresar nuevo vendedor
                if(!rutExiste) Sentencia.executeUpdate(ingresarRegistro);
                // Si no, actualizar datos del vendedor
                else Sentencia.executeUpdate(actualizarRegistro);
                System.out.println("Valores agregados con exito.");
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(RegistroVentas.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                if (Conexion != null){
                    try{
                        Conexion.close();
                        Sentencia.close();
                        if(!rutExiste)//Notificar registro exitoso
                            txtInfo.setText("¡Registro exitoso de " + nombre + "!");
                        else{//Notificar los cambios realizados en la actualización del usuario
                            JOptionPane.showMessageDialog(this,"¡El rut " + rut + " ya se encuentra registrado!\n"+
                                    "El nombre '" + nombreAnterior + "' sera reemplazado por '" + nombre + "'.\n" +
                                    "Las ventas ingresadas seran sumadas a las anteriores.\n","AVISO!",JOptionPane.INFORMATION_MESSAGE);
                            txtInfo.setText("¡Actualizacion exitosa de " + nombre + "!");
                        }
                    }catch (SQLException ex){
                        System.out.println(ex.getMessage());
                    }
                }
            }
            //Reiniciar elementos del JFrame
            txtNombre.setText("");
            txtRut.setText("");
            txtDV.setText("");
            txtVentasCallOfDuty.setText("");
            txtVentasMinecraft.setText("");
            txtVentasFortnite.setText("");
            lblVendidoCallOfDuty.setText("Vendido: $ 0");
            lblComisionCallOfDuty.setText("Comision: $ 0");
            lblVendidoMinecraft.setText("Vendido: $ 0");
            lblComisionMinecraft.setText("Comision: $ 0");
            lblVendidoFortnite.setText("Vendido: $ 0");
            lblComisionFortnite.setText("Comision: $ 0");
        }    
    }//GEN-LAST:event_bRegistrarActionPerformed

    /**
     * Realiza una consulta a la base de datos, obtiene los vendedores con mayor
     * cantidad de ventas y los muestra en el JFrame.
     * @param evt: evento que se activa al presionar el botón 'Finalizar'
     */
    private void bFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFinalizarActionPerformed
        int contadorVendedores = 0;
        int nMaxVentas = 0;
        String texto = "";
        //Sentencia que obtiene a los vendedores con la mayor cantidad de ventas
        String buscarMayor = "SELECT CantVentasCOD + CantVentasMIN + CantVentasFOR as nVentas, NombreVendedor as nombre," +
                             " ComisionTotal as comision FROM " + tabla +
                             " WHERE CantVentasCOD + CantVentasMIN + CantVentasFOR = (SELECT MAX(CantVentasCOD + " +
                             "CantVentasMIN + CantVentasFOR) FROM " + tabla +") ORDER BY ComisionTotal DESC;";
        try{//Intentar conexión con la BD
            Class.forName(driver).newInstance();
            Conexion = DriverManager.getConnection(url, user, password);
            if(Conexion!=null) System.out.println("Base de datos conectada con exito.");
            Sentencia = Conexion.createStatement();
            ResultSet resultados = Sentencia.executeQuery(buscarMayor);
            System.out.println("Valores solicitados con exito."); 
            //Dar formato a texto que muestra los vendedores con mayor cantidad de ventas
            while(resultados.next()){
                contadorVendedores++;
                texto = texto + "     -  " + resultados.getString("nombre") +"   [COMISION: $ "+formatoMiles.format(resultados.getInt("comision")) +"]\n";
                if (contadorVendedores == 1)
                    nMaxVentas = resultados.getInt("nVentas");
            }
            //Si hay vendedores registrados
            if(contadorVendedores>0){
                //Si hay 1 añadir a texto en singular
                if(contadorVendedores == 1)
                 texto = "El vendedor que genero mas ventas ("+ nMaxVentas +" ventas) es:\n" + texto;
                //Si hay más de 1 añadir a texto en plural
                else texto = "Los vendedores que generaron mas ventas ("+ nMaxVentas +" ventas) son:\n" +texto;
                txtInfo.setText(texto);// Mostrar vendedores con mayor cantidad de ventas
            //Si no hay vendedores registrados
            }else{
                txtInfo.setText("La base de datos no tiene registros.");
            }   
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(RegistroVentas.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (Conexion != null){
                try{
                    Conexion.close();
                    Sentencia.close();
                }catch (SQLException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
        
    }//GEN-LAST:event_bFinalizarActionPerformed

    /**
     * Cambia el foco al cuadro de rut si se presiona ENTER.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) txtRut.requestFocus();
    }//GEN-LAST:event_txtNombreKeyReleased
    
    /**
     * Convierte el caracter 'k' en 'K'.
     * Cambia el foco al cuadro de cantidad de ventas de Call of Duty si se presiona ENTER.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtDVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDVKeyReleased
        if("k".equals(txtDV.getText())) txtDV.setText("K");
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) txtVentasCallOfDuty.requestFocus();   
    }//GEN-LAST:event_txtDVKeyReleased

    /**
     * Omite los caracteres que no sean números, 'k' ni 'K', tambien los omite cuando
     * el texto contenido alcanza un largo de 1 caracter.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtDVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDVKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9') && (c<'k'||c>'k') && (c<'K' || c>'K')) evt.consume();
        if(txtDV.getText().length() >= 1) evt.consume();
    }//GEN-LAST:event_txtDVKeyTyped

    /**
     * Muestra el rut en formato de miles, si se presiona Enter cambia el foco al
     * cuadro del dígito verificador.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        String rut = txtRut.getText();
        
        if("".equals(rut) == false){
            int RUT = Integer.parseInt(rut.replaceAll("\\.", ""));
            txtRut.setText(formatoMiles.format(RUT));
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) txtDV.requestFocus();
    }//GEN-LAST:event_txtRutKeyReleased

    /**
     * Omite los caracteres que no sean números. Omite los caracteres cuando el
     * el largo del texto obtenido alcanza 10 caracteres.
     * @param evt: evento que se activa al presionar una tecla y almacena su valor.
     */
    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9')) evt.consume();
        if(txtRut.getText().length() >= 10) evt.consume();
    }//GEN-LAST:event_txtRutKeyTyped

    /**
     * Inicializa una nueva ventana de 'tablaVendedores'
     * @param evt: evento que se activa al presionar el botón para ver todos los registros.
     */
    private void bVerRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerRegistrosActionPerformed
        tablaVendedores vTABLA = new tablaVendedores(user, password);
        vTABLA.setVisible(true);
        vTABLA.actualizarTabla();
    }//GEN-LAST:event_bVerRegistrosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFinalizar;
    private javax.swing.JButton bRegistrar;
    private javax.swing.JButton bVerRegistros;
    private javax.swing.JLabel iconCallOfDuty;
    private javax.swing.JLabel iconFortnite;
    private javax.swing.JLabel iconMinecraft;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComisionCallOfDuty;
    private javax.swing.JLabel lblComisionFortnite;
    private javax.swing.JLabel lblComisionMinecraft;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGuionRut;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioCallOfDuty;
    private javax.swing.JLabel lblPrecioFortnite;
    private javax.swing.JLabel lblPrecioMinecraft;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVendidoCallOfDuty;
    private javax.swing.JLabel lblVendidoFortnite;
    private javax.swing.JLabel lblVendidoMinecraft;
    private javax.swing.JLabel lblVentasCallOfDuty;
    private javax.swing.JLabel lblVentasFortnite;
    private javax.swing.JLabel lblVentasMinecraft;
    private javax.swing.JLabel lblVerRegistros;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtVentasCallOfDuty;
    private javax.swing.JTextField txtVentasFortnite;
    private javax.swing.JTextField txtVentasMinecraft;
    // End of variables declaration//GEN-END:variables
}
