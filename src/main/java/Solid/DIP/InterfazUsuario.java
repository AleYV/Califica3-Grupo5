package Solid.DIP;

class InterfazUsuario{
    BaseDatos db;

    public InterfazUsuario(BaseDatos db){
        this.db = db;
    }

    public void setDb(BaseDatos db){
        this.db = db;
    }

    public void saveEmployeeId(String empId){
        db.saveEmpIdInDatabase(empId);
    }
}
