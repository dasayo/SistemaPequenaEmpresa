package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionDb {
    Connection conect = null;
        private String bd="dbnegocio";
	private String url="jdbc:postgresql://database-1.cwvm1nkqoc9g.us-east-1.rds.amazonaws.com/"+bd;
	private String user="program";
	private String pass="unal123";
        
    public Connection conexion(){
        try{
          Class.forName("org.postgresql.Driver");  
          conect = DriverManager.getConnection(url,user,pass);
         
          JOptionPane.showMessageDialog(null, "Conexion Ok.....");
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en Conexion....."+e);
            
        }
    
        return conect;
    }
}