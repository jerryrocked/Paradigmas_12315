package ventanas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 * Clase de encargada de mostrar una tabla con todos los registros de la base de
 * datos utilizada.
 * @author Bastián Pérez
 * @author Jahir Machuca
 */
public class tablaVendedores extends javax.swing.JFrame {
    private final DecimalFormat formatoMiles = new DecimalFormat("###,###.##");
    private final String BBDD  = "bd_ventas_bp_jm";
    private final String tabla = "registros";
    private final String url =  "jdbc:mysql://localhost:3306/"+BBDD;    
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private String user;
    private String password;
    private Connection Conexion = null;
    private Statement Sentencia = null;
    private ImageIcon icono;
    private DefaultTableModel modelo;
    
    private final String titulos[] = {"Rut","Vendedor","N° ventas COD", "N° ventas MIN", "N° ventas FOR",
    "Total ventas", "Comision COD", "Comision MIN", "Comision FOR", "Comision total"};
    private String datosVendedor[] = new String[10];

    /**
     * Definición del inicializador de un objeto tablaVendedores y define 
     * propiedades de la ventana.
     * @param USER: Usuario de la conexion local de MySQL obtenido del JFrame 'RegistroVentas'.
     * @param PASSWORD: Contraseña de la conexion local de MySQL obtenida del JFrame 'RegistroVentas'.
     */
    public tablaVendedores(String USER, String PASSWORD){
        //Configuración de la ventana
        initComponents();
        getContentPane().setBackground(new Color(200,200,200));
        this.setBounds(0,0,1170, 450);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("XYZ® - Tabla de vendedores");
        this.icono = new ImageIcon("build/classes/imagenes/imgIcono.png");
        this.setIconImage(icono.getImage());
        //Almacenamiento de parámetros
        this.user = USER;
        this.password = PASSWORD;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblModificar = new javax.swing.JLabel();
        bActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 204));

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 0));

        tablaVendedores.setBackground(new java.awt.Color(200, 200, 200));
        tablaVendedores.setForeground(new java.awt.Color(0, 0, 0));
        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaVendedores.setGridColor(new java.awt.Color(0, 0, 0));
        tablaVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVendedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVendedores);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(23, 7, 72));
        lblTitulo.setText("TABLA DE REGISTRO DE VENDEDORES");

        lblModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblModificar.setForeground(new java.awt.Color(0, 0, 0));
        lblModificar.setText("PRESIONE LA FILA QUE DESEA MODIFICAR O ELIMINAR");

        bActualizar.setBackground(new java.awt.Color(204, 204, 204));
        bActualizar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        bActualizar.setForeground(new java.awt.Color(0, 0, 0));
        bActualizar.setText("ACTUALIZAR");
        bActualizar.setPreferredSize(new java.awt.Dimension(100, 25));
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(332, 332, 332))))
            .addGroup(layout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Si se clickea alguna fila de la tabla abre una nueva ventana de modificación de datos,
     * entregando como parámetros el nombre de usuario y contraseña de MySQL y el rut del
     * vendedor seleccionado.
     * @param evt: Evento que se activa al hacer un click en alguna fila de la tabla y 
     * que contiene la posición donde se realizó un click
     */
    private void tablaVendedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVendedoresMouseClicked
        int fila_point = tablaVendedores.rowAtPoint(evt.getPoint());
        int columna_point = 0;
        if (fila_point>-1){
            String user_update = String.valueOf(modelo.getValueAt(fila_point, columna_point));
            dispose();
            new modificarDatos(this.user, this.password, user_update).setVisible(true);
        }
    }//GEN-LAST:event_tablaVendedoresMouseClicked

    /**
     * LLama a la función actualizar tabla
     * @param evt: Evento que se activa al presionar el botón actualizar
     */
    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_bActualizarActionPerformed
    
    /**
     * Realiza una consulta a la base de datos, obtiene todos los registros ordenados
     * por rut, y los muestra en la tabla.
     */
    public void actualizarTabla(){
        try{
            Class.forName(driver).newInstance();
            Conexion = DriverManager.getConnection(url,user,password);
            if(Conexion!=null) System.out.println("Se ha conectado la base de datos con exito.");
            Sentencia = Conexion.createStatement();
            ResultSet rs = Sentencia.executeQuery("SELECT * FROM " + tabla + " ORDER BY RutVendedor ASC;");
            modelo = new DefaultTableModel(null, titulos);
            while(rs.next()){
                datosVendedor[0] = rs.getString("RutVendedor");
                datosVendedor[1] = rs.getString("NombreVendedor");
                datosVendedor[2] = rs.getString("CantVentasCOD");
                datosVendedor[3] = rs.getString("CantVentasMIN");
                datosVendedor[4] = rs.getString("CantVentasFOR");
                datosVendedor[5] = rs.getString("VentasTotal");
                datosVendedor[5] = "$ " + formatoMiles.format(Integer.parseInt(datosVendedor[5]));
                datosVendedor[6] = rs.getString("ComisionCOD");
                datosVendedor[6] = "$ " + formatoMiles.format(Integer.parseInt(datosVendedor[6]));
                datosVendedor[7] = rs.getString("ComisionMIN");
                datosVendedor[7] = "$ " + formatoMiles.format(Integer.parseInt(datosVendedor[7]));
                datosVendedor[8] = rs.getString("ComisionFOR");
                datosVendedor[8] = "$ " + formatoMiles.format(Integer.parseInt(datosVendedor[8]));
                datosVendedor[9] = rs.getString("ComisionTotal");
                datosVendedor[9] = "$ " + formatoMiles.format(Integer.parseInt(datosVendedor[9]));
                modelo.addRow(datosVendedor);   
            }
            tablaVendedores.setModel(modelo);
            TableColumn cRut = tablaVendedores.getColumn("Rut");
            cRut.setMaxWidth(100);
            TableColumn cVendedor = tablaVendedores.getColumn("Vendedor");
            cVendedor.setMaxWidth(230);
            TableColumn cVCod = tablaVendedores.getColumn("N° ventas COD");
            cVCod.setMaxWidth(100);
            TableColumn cVMin = tablaVendedores.getColumn("N° ventas MIN");
            cVMin.setMaxWidth(100);
            TableColumn cVFor = tablaVendedores.getColumn("N° ventas FOR");
            cVFor.setMaxWidth(100);
            TableColumn cTV = tablaVendedores.getColumn("Total ventas");
            cTV.setMaxWidth(100);
            TableColumn cCCod = tablaVendedores.getColumn("Comision COD");
            cCCod.setMaxWidth(100);
            TableColumn cCMin = tablaVendedores.getColumn("Comision MIN");
            cCMin.setMaxWidth(100);
            TableColumn cCFor = tablaVendedores.getColumn("Comision FOR");
            cCFor.setMaxWidth(100);
            TableColumn cCT = tablaVendedores.getColumn("Comision total");
            cCT.setMaxWidth(100);
        }catch (InstantiationException | IllegalAccessException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(tablaVendedores.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                if(Conexion!=null){
                    Conexion.close();
                    Sentencia.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(tablaVendedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaVendedores;
    // End of variables declaration//GEN-END:variables
}
