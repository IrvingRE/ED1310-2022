
package Tarea5;

/**
 *
 * @author Irving
 * @param <T>

 */
public class ListaSimplementeLigada<T> {
    
    private Nodo<T> head;
    private int tamanio = 0;
    
    public ListaSimplementeLigada() {
    }
    
    public boolean seEncuentraVacia() {
        return this.head == null;
    }
    public String getTamanio(){
        return "La lista tiene un tamaño de" + this.tamanio;
    }
    public void añadirAlFinal(T valor){
        if(this.head==null){
            head=new Nodo<>(valor);
        }else {
            Nodo<T> nuevo=new Nodo(valor);
            Nodo<T> aux= this.head;
            
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    public void añadirAInicio(T valor){
        if(head==null){
            head=new Nodo(valor);
        }else{
            Nodo<T> nuevo=new Nodo(valor);
            nuevo.setSiguiente(head);
            head=nuevo;
        }
        tamanio++;
    }
    public void despuesDe(T referencia, T valor){
        Nodo nodo=new Nodo(valor);
        if(head == null){
            head=nodo;
        }else{
            Nodo<T> aux=this.head;
            int contador=0;
            while(contador< (Integer) referencia && aux.getSiguiente() !=null){
                aux = aux.getSiguiente();
                contador++;
            }
            nodo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nodo);
        }
        tamanio++;
    }
    public void quitar(T posicion){
        Nodo aux=head;
        int contador=0;
        while(contador<((Integer)posicion-1)){
            aux=aux.getSiguiente();
            contador++;
        }
        Nodo temporal=aux.getSiguiente();
        aux.setSiguiente(temporal.getSiguiente());
        temporal.setSiguiente(null);
        tamanio--;
    }
    public void quitarElPrimero(){
        if(head!=null){
            Nodo primer=head;
            head=head.getSiguiente();
            primer.setSiguiente(null);
        }
        tamanio--;
    }
    public void quitarElFinal(){
        if(head.getSiguiente()==null){
            head=null;
        }else{
            Nodo aux=head;
            while (aux.getSiguiente().getSiguiente() !=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
        tamanio--;
    }
    public String encontrar(T valor){
        Nodo aux=head;
        int contador=0;
        String posicion="";
        while(aux.getSiguiente()!=null){
            if(aux.getDato()==valor){
                posicion=contador+" ";
            }
            aux=aux.getSiguiente();
            contador++;
        }
        return "La posicion del numero" + valor + "es" + posicion;
    }
    public void actualizacion(T a_Buscar,T valor){
        Nodo aux=head;
        int contador=0;
        while(aux.getSiguiente() !=null){
            if(aux.getDato() ==a_Buscar){
                aux.setDato(valor);
            }
            aux=aux.getSiguiente();
            contador++;
        }
    }
    public Nodo transversal(){
        Nodo aux=head;
        while(aux!=null){
            System.out.print(aux);
            aux=aux.getSiguiente();
        }
        return aux;
    }
}
