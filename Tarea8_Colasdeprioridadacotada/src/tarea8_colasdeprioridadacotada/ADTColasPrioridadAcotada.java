package tarea8_colasdeprioridadacotada;

import java.util.ArrayList;


public class ADTColasPrioridadAcotada <T> extends ADTColas <T> {
    
    ArrayList prioridadCola;
    
    public ADTColasPrioridadAcotada(int niveles){
        prioridadCola= new ArrayList(niveles);
         for (int i = 0; i < prioridadCola.size()-1; i++){
             ADTColas<T> cola= new ADTColas();
             prioridadCola.add(cola);
         }
    }

    @Override
     public boolean isEmpty(){
        boolean estado=false;
        for (int i = 0; i <prioridadCola.size()-1; i++) {
            prioridadCola.get(i);
            for (int j = 0; j < ADTColas.size()-1; j++) {
                if (ADTColas.get(j)==null) {
                    estado=true;
                }
            }
        }
        return estado; 
    }
    
    @Override
    public int length(){
        return ADTColas.size();
    }
    
    public void enqueue(int priority, T elemento){
        for (int i = 0; i <= priority; i++) {
            prioridadCola.get(i);
            ADTColas.add(elemento);    
        }
    }
    
    @Override
    public T dequeue(){
        prioridadCola.get(0);
        T sacado= (T) ADTColas.remove(0);
        return sacado;
    }

    @Override
    public String toString() {
        return "ADTColasPrioridadAcotada{" + "prioridadCola=" + prioridadCola + '}';
    }

    
    
}
