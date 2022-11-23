package tarea7.colas;

import java.util.ArrayList;

public class ADTColas <T>{
    
    ArrayList ADTColas;
    
    public ADTColas(){
        ADTColas= new ArrayList();
    }
    public boolean isEmpty(){
        return ADTColas.isEmpty(); 

    }
    public int length(){
        return ADTColas.size();
    }
    public void enqueue(T elemento){
        ADTColas.add(elemento);
    }
    public T dequeue(){
        T sacado;
        sacado=(T)ADTColas.remove(0);
        return sacado;
    }

    @Override
    public String toString() {
        return "ADTColas{" + "ADTColas=" + ADTColas + '}';
    }
}
