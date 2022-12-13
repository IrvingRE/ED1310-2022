package hashmap;

import java.util.HashMap;

public class HashMap {

  public static void main(String[] args) {   
    HashMap bancos = new HashMap<>();
    
    bancos.put("BBVA","1827");
    bancos.put("Santander","0049");
    bancos.put("Banorte","2038");
    bancos.put("HSBC","2100"); //el metodo put es para almacenar elementos

    System.out.println(bancos.isEmpty());//verificar si esta vacia, en caso de no estarlo regresa "false"
    System.out.println(bancos.size()); //se usa para obtener el numero total de elementos dentro del HashMap
    
    System.out.println("VALOR MAPEADO:" + bancos.get("BBVA")); //se usa para recuperar o buscar el valor mapeado por una clave particular mencionada en el parámetro
    
      boolean existe;
      existe = bancos.containsValue("1827"); //Comprueba la existencia de un valor.
      System.out.println(existe);
    
    bancos.remove("HSBC");//elimina el elemento del HashMap
      System.out.println(bancos);
      
    bancos.clear();//elimina todos los elementos del HasMap
        System.out.println(bancos.isEmpty());
  }
 
}
