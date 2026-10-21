package modelo;

public class Pila<T> {

    //ATRIBUTO
    private Nodo<T> pilaCima;

    private int tamanio;//Contador    
    //CONSTRUCTOR

    public Pila() {
        this.pilaCima = null;
        this.tamanio = 0;
    }

    //METODOS PUSH POP Y ISEMPTY
    /**
     * Con el metodo push apilamos un nuevo elemento a la pila ,la linea 22 Se
     * instancia un objeto Nodo que sirve como base general despues apunta a la
     * cima de la pila y el nuevo elemento pasa ser la cima de la pila.
     */
    public void apilar(T dT) {
        Nodo<T> nd = new Nodo<>(dT);
        nd.setSiguienteDato(pilaCima);
        pilaCima = nd;
        tamanio++;
    }
    /**
     * Con el metodo pop desapilaremos la pila  
     * primero con una condición comprobaremos si la pila vacía si no se cumple  entonces apuntamos a la cima 
     * desapilamos yobtenemos el siguiente dato en la cima .* */
    public T desapilar() {
        if (estaVacio()) {
            return null;
        }
        T dt = pilaCima.getDato();
        pilaCima = pilaCima.getSiguienteDato();
        tamanio--;
        return dt;
    }

    public boolean estaVacio() {
        return pilaCima == null; // Comprobamos si la pila está vacía
    }

}
