package BaseDatos;


import java.sql.Connection;
import java.util.logging.Level;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection conexion;
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/tiendagames";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getConnection(){
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url,user, password);
            System.out.println("conectado");
            return conexion;

        } catch (SQLException excepcion) {
            JOptionPane.showMessageDialog(null, "Conexion no encontrada," + excepcion.getMessage());
            System.exit(-1);

        } catch (ClassNotFoundException error){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el driver por esto: " + error);
        }
        return null;
    }
    
    
    public void cerrar(){ 
        try{
            conexion.close();
        } catch(SQLException excepcion) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, excepcion);
        }
    }
    
    
}
