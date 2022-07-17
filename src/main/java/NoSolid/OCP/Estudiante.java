package NoSolid.OCP;

import java.util.Arrays;
import java.util.List;

public class Estudiante {
    String name;
    String regNumber;
    String department;
    double score;

    public Estudiante(String name, String regNumber, double score, String dept) {
        this.name = name;
        this.regNumber = regNumber;
        this.score = score;
        this.department = dept;
    }

    @Override
    public String toString() { //toString==displayResult()???
        return ("Nombre: " + name + "\nNumero Regex: " + regNumber + "\nDept:" + department + "\nMarks:"
                + score + "\n*******");
    }
}
