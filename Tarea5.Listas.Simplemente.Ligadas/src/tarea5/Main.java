/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea5;

/**
 *
 * @author Irving
 */
public class Main {

    public static void main(String[] args) {
        ListaSimplementeLigada head = new ListaSimplementeLigada();
        System.out.println("Devuelve valor true si se encuentra vacia y false si no se encuentra vacia"); 
        System.out.println(head.seEncuentraVacia());
        System.out.println(head.getTamanio());
        System.out.println(head.transversal());
        System.out.println("-------------------------");
        

        head.añadirAlFinal(10);
        head.añadirAInicio(12);
        head.añadirAlFinal(13);
        head.despuesDe(1, 11);
        
        System.out.println("La primera lista");
        System.out.println(head.transversal());
        System.out.println(head.seEncuentraVacia());
        System.out.println(head.getTamanio());
        System.out.println(head.encontrar(12));
        System.out.println(head.encontrar(10));
        System.out.println(head.encontrar(11));
        System.out.println(" ");
        
        System.out.println("Al atualizar:");  
        head.actualizacion(10,15);
        System.out.println(head.transversal());
        System.out.println(head.encontrar(15));
        System.out.println(" ");

        head.quitar(2);
        System.out.println(head.transversal());
        System.out.println(head.getTamanio());

        head.quitarElPrimero();
        System.out.println(head.transversal());
        System.out.println(head.getTamanio());

        head.quitarElFinal();
        System.out.println(head.transversal());
        System.out.println(head.getTamanio());
        
        

    }
}
