/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea6;

public class Main {
    
    public static void main(String[] args) {
        ADTPila<String> pila = new ADTPila<>();
        pila.push("Angela");
        pila.push("Diego");
        pila.push("Juan");
        
        System.out.println("Se encuentra llena?");
        System.out.println(pila.isEmpty());
        System.out.println(pila);
        pila.push("Diana");
        System.out.println("AGREGAR A DIANA:");
        System.out.println(pila);
        
        System.out.println("ELIMINACION DE ELEMEMENTO:");
        String sacado = pila.pop();
        System.out.println("Sacamos: " + sacado);  
        System.out.println(pila);     
        System.out.println("VERIFICAR TOPE:");
        System.out.println(pila.peek());
        
        System.out.println("Se encuentra llena?");
        System.out.println(pila.isFull());
        pila.push("Pablo");
        pila.push("Jaime");
        pila.push("Carlos");
        System.out.println(pila);
        
        System.out.println("Tamanio:");
        System.out.println(pila.getLength());
        System.out.println(pila.isFull());
        
    }
    
}

