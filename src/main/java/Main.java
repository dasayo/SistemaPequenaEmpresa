import database.ConexionDb;
import database.CrudInsert;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConexionDb connectionDb = new ConexionDb();
        Connection con= connectionDb.conexion();
        CrudInsert insert = new CrudInsert(con);
        insert.insertarPr("garbanzo",10,"2023-3-22",3500.22f);
        insert.insertarUs(15457413,"Lsepulv","sdea","Luis");
    }
}
