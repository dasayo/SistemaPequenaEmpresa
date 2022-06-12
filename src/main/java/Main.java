import database.ConnectionDb;
import database.CrudInsert;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConnectionDb connectionDb = new ConnectionDb();
        Connection con= connectionDb.conectar();
        CrudInsert insert = new CrudInsert(con);
        insert.insertarPr("garbanzo",10,"2023-3-22",3500.22f);
        insert.insertarUs(15457413,"Lsepulv","sdea","Luis");
    }
}
