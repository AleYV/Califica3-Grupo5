package Solid.OCP;

public class ArtsDistinctionDecider implements DistintionDecider {

    @Override
    public void evaluateDistinction(Estudiante estudiante) {
        if (estudiante.score > 70){
            System.out.println(estudiante.regNumber+" ha recibido una distincion en artes.");
        }
    }
}
