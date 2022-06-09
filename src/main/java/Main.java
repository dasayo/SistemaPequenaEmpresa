import database.ConexionDb;
import database.CrudInsert;

public class Main {
    public static void main(String[] args) {
        CrudInsert insert = new CrudInsert();
        insert.insertarPr("lentejas",5,"02/15/2024",2450.99f);
        insert.insertarUs(1037660985,"dasayo","1235","David");
    }
}
