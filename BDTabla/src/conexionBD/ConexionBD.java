package conexionBD;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class ConexionBD {
     public  static  final String url="jdbc:mysql://localhost:3306/bTienda2?autoReconnet=true&useSSL=false";
    public  static  final String usuario="root";
    public  static  final String contraseña="root";
    
     /*metodo de conexion de mysql*/
    public Connection getConnection()  {
        Connection conexion=null;/*varible objeto*/
        /*Excepciones*/
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection(url,usuario,contraseña);
            
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
                                
        } catch (Exception ex) {
                System.out.println("Error "+ex);     
        }
        return conexion;
    }
    
}
