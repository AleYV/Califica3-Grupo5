package NoSolid.SRP;

import java.util.Random;

public class GeneratorIDEmpleado{
    public static void generateEmpId(String firstName){
        int random = new Random().nextInt(1000);
        String empId = firstName.substring(0, 1) + random;
        System.out.println("El ID del empleado es: " + empId);
    }


}
