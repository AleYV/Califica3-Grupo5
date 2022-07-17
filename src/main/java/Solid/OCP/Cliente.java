package Solid.OCP;

import java.util.ArrayList;
import java.util.List;
public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion OCP");
        List<Estudiante> CienciasEstudiantes = enrollScienceStudents();
        List<Estudiante> ArtesEstudiantes = enrollArtsStudents();

        // Muestra todos los resultados.
        System.out.println("Resultados:");

        for (Estudiante estudiante : CienciasEstudiantes) {
            System.out.println(estudiante);
        }
        for (Estudiante estudiante : ArtesEstudiantes) {
            System.out.println(estudiante);
        }

        // Evalua las distinciones

        DistintionDecider scienceDistinctionDecider = new ScienceDistinctionDecider();
        DistintionDecider artsDistinctionDecider = new ArtsDistinctionDecider();
        System.out.println("Distinciones:");
        for (Estudiante estudiante : CienciasEstudiantes) {
            scienceDistinctionDecider.evaluateDistinction(estudiante);
        }
        for (Estudiante estudiante : ArtesEstudiantes) {
            artsDistinctionDecider.evaluateDistinction(estudiante);
        }

    }

    private static List<Estudiante> enrollScienceStudents() {
        Estudiante Irene = new CienciaEstudiante("Irene", "R1", 81.5);
        Estudiante jessica = new CienciaEstudiante("Jessica", "R2", 72);
        List<Estudiante> CienciasEstudiantes = new ArrayList<>();
        CienciasEstudiantes.add(Irene);
        CienciasEstudiantes.add(jessica);
        return CienciasEstudiantes;
    }

    private static List<Estudiante> enrollArtsStudents() {
        Estudiante chalo = new ArteEstudiante("Chalo", "R3", 71);
        Estudiante claudio = new ArteEstudiante("Claudio", "R4", 66.5);
        List<Estudiante> ArtesEstudiantes = new ArrayList<>();
        ArtesEstudiantes.add(chalo);
        ArtesEstudiantes.add(claudio);
        return ArtesEstudiantes;
    }


}