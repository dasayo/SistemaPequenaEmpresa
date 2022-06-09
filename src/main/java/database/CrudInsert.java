package database;

import java.sql.*;

public class CrudInsert {


    ConexionDb conexionDb =new ConexionDb();

    public void insertarPr(String name, int cantidad, String fechaVencimiento, float precio){
       try {
           Connection connection = conexionDb.conectar();
           java.sql.Statement st = connection.createStatement();
            String str= "insert into productos (name,cantidad, precio, vencimiento) values('"+name+"', "+cantidad+", "+precio+", '"+fechaVencimiento+"');";
            st.execute(str);
       }catch (SQLException e){
           System.out.println(e);
       }

    }

    public void insertarUs(int documento, String user, String pass, String name){
        try {
            Connection connection = conexionDb.conectar();
            java.sql.Statement st = connection.createStatement();
            String str= "insert into usuarios (id,usuario, password, name) values("+documento+", '"+user+"', '"+pass+"', '"+name+"');";
            st.execute(str);
        }catch (SQLException e){
            System.out.println(e);
        }

    }


}
