
package tarea7.colas;

public class Main {
    
    public static void main(String[] args) {
        ADTColas<String> cola = new ADTColas<>();
        cola.enqueue("Irving");
        cola.enqueue("Hai Xel");
        cola.enqueue("Sharon");
        
        System.out.println(cola);
        System.out.println("Esta vacia?");
        System.out.println(cola.isEmpty());
        System.out.println("Tamanio de la cola:" + cola.length());
        System.out.println("SE SACA UN ELEMENTO:");
        cola.dequeue();
        System.out.println(cola);
        System.out.println("SE INGRESA UN ELEMENTO:");
        cola.enqueue("Pepe");
        System.out.println(cola);
    }
    
}
