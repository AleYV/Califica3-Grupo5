package NoSolid.SRP;

public class SeniorityChecker{
    public static void checkSeniority(double experienceInYears){
        System.out.println("Este empleado es un" + " empleado " + (experienceInYears > 5 ? "senior" : "junior"));
    }

}
