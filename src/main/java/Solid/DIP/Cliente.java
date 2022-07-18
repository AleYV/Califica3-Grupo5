package Solid.DIP;


public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con DIP");

        InterfazUsuario usuario;
        OracleDatabase dbOracle = new OracleDatabase();
        MySQLDatabase dbSQL = new MySQLDatabase();
        // Usando Oracle
        usuario = new InterfazUsuario(dbOracle);
        usuario.saveEmployeeId("E003");

        // Usando Mysql
        usuario = new InterfazUsuario(dbSQL);
        usuario.saveEmployeeId("P008");

        // Cambiando la base de datos objetivo
        //usuario = new InterfazUsuario(new OracleDatabase());

        usuario.setDb(dbOracle);
        usuario.saveEmployeeId("J010");


    }
}
