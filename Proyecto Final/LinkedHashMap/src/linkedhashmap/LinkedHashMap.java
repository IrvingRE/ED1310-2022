package linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMap {

    public static void main(String[] args) {
       
        LinkedHashMap<Integer, String> LHM= new LinkedHashMap<Integer, String>();
        
        LHM.put(1, "nuggets"); //agregar elementos, pero sin orden
        LHM.put(2, "pizza");
        LHM.put(3, "hamburguesa");
        LHM.put(4, "tacos");
        LHM.put(5, "alitas");
        
        
        System.out.println("Esta llena? " + LHM.isEmpty()); // muestra si esta vacia
        
        System.out.println("El tamanio es de: " + LHM.size()); //muestra el tamaño
        
        System.out.println("La llave existe: " + LHM.containsKey(4)); // retorna si la clave existe o no
        
        System.out.println("El valor existe: " + LHM.containsValue("caguamas")); // retorna si el valor existe o no
        
        // en ambos casos se retorna true o false
        
        System.out.println(LHM.clone()); // sirve para hacerle una copia al estado actual de la estructura
        
        LHM.replace(2, "quesadillas"); //para remplazar el valor asociado a la clave
        
        System.out.println(LHM.keySet()); //retorna las claves contenidas 
        
        LHM.putIfAbsent(6, "gorditas");
        LHM.putIfAbsent(5, "alitas");
        System.out.println(LHM);
        
        LHM.remove(4);// elimina el valor asociado a la clave
        
        LHM.remove(3, "hamburguesas"); //elimina el par llave-valor indicado
        
        System.out.println(LHM);

    }
    
}