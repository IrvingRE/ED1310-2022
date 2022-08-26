
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Irving
 */
public class Arreglo {
      
    int tamanio;
    private int longitud;
    private int indice;
    private String valor;
   ArrayList<String> ArrayL = new ArrayList<>();
    

    public Arreglo(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public int getlongitud(){
        return longitud;    
    }
    
    public void setElemento(int indice,String valor){
        this.indice = indice;
        this.valor = valor;
        ArrayL.add(indice,valor);
    }
    
    public int getElemento(int indice){
        return indice;
    }
    
    public void limpiar (String valor){
        ArrayL.clear();
    }

    @Override
    public String toString() {
        return "Arreglo{" + "tamanio=" + tamanio + ", longitud=" + longitud + ", indice=" + indice + ", valor=" + valor + ", ArrayL=" + ArrayL + '}';
    }

     
    
    
}
