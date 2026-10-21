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
            principioCola = nd;
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
    /**Para mostrar la pila utilizo el metodo toString  e instancio un objeto de tipo 
     * StrigBuilder para porder concatadenar los datos 
     */


    //Obtenemos el tamaño de la cola
    public int getTamanio() { 
        return tamanio;
    }

    @Override
    public String toString() { 
        if (estaVacio()) {
            return "Cola Vacia";
        }
        StringBuilder stbP = new StringBuilder(); // Instancio un objeto de tipo StringBuilder

        Nodo<T> nd = principioCola;

        while (nd != null) {
            stbP.append("[").append(nd.getDato()).append("]"); 
            nd = nd.getSiguienteDato();
        }
        return stbP.toString();
    }

}
