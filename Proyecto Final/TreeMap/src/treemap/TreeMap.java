package treemap;

import java.util.TreeMap;

public class TreeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        
        treeMap.put(5, "irving"); //Agrega un elemento al treemap
        treeMap.put(4, "sharon");
        treeMap.put(2, "juan");
        treeMap.put(6, "luis");
        treeMap.put(3, "ceja");
        treeMap.put(1, "natalia");
        
                
        System.out.println("Esta llena? " + treeMap.isEmpty()); // muestra si esta vacia
        
        System.out.println("El tamanio es de: " + treeMap.size()); //muestra el tamaño
        
        for (Integer key : treeMap.keySet()) {
            System.out.println("Clave:" + key + "--> Valor: " + treeMap.get(key)); //sirve para que regrese claves y valores
        }
        System.out.println("Contiene dentro el valor? " + treeMap.containsValue("juan"));//saber si existe el valor
        
        System.out.println("Contiene dentro la clave? " + treeMap.containsKey(7)); //saber si existe la clave
        
        //en los dos regresara un true o false
        
        System.out.println("Valor relaciona a una clave:" + treeMap.get(4)); //que valor esta relacionado a la clave asignada
    }
    
}
