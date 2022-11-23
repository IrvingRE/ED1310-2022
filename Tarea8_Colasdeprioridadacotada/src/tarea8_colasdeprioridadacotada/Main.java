package tarea8_colasdeprioridadacotada;


public class Main {

    public static void main(String[] args) {
        ADTColasPrioridadAcotada<String> barco = new ADTColasPrioridadAcotada<>(7);
        System.out.println(barco.isEmpty());
        System.out.println(barco.length());
        barco.enqueue(1, "niñas");
        barco.enqueue(2, "niños");
        barco.enqueue(2, "3ra edad");
        barco.enqueue(3, "mujeres");
        barco.enqueue(3, "hombres");
        barco.enqueue(4, "maestre");
        barco.enqueue(4, "mecanico");
        barco.enqueue(4, "vigia");
        barco.enqueue(4, "timonel");
        barco.enqueue(5, "capitan");
        
    }
    
}
