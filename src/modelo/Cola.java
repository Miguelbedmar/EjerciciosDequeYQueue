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
    public void encolar(T dT) {
        Nodo<T> nd = new Nodo<>(dT);
        if (estaVacio()) { //Comprobamos si el principio de la cola está vacio
            principioCola = null;
        } else {
            finalCola.setSiguienteDato(nd); //seleccionamos el siguiente elemento al final de la cola
        }
        finalCola = nd;
        tamanio++;
    }

    public T desencolar() {
        if (estaVacio()) { 
            return null;
        }
        T dt = principioCola.getDato(); // Obtenemos el elemento acutal del principio
        principioCola = principioCola.getSiguienteDato(); 
        if (principioCola == null) {  
            finalCola = null; // Si el principio de la cola está vacio entonces vaciamos el final.
        }

        tamanio--;
        return dt;
    }

    public boolean estaVacio() { 
        return principioCola == null; 
    }

}
