package modelo;

public class Cola<T> {

    //ATRIBUTO
    private Nodo<T> finalCola;
    private Nodo<T> principioCola;
    private int tamanio;

    //CONSTRUCTOR
    public Cola() {
        this.finalCola = null;
        this.principioCola = null;
        this.tamanio = 0;
    }

    //METODOS QUEUE DEQUEQUE Y ISEMPTY
    public T encolar(){
        return null;
    }


    public T desencolar(){
        return null;
    }

    public boolean isempty(){
        return principioCola==null;
    }


}
