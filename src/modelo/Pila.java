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
    /** Con el metodo push apilamos
     * un nuevo elemento a la pila ,la linea 22  Se instancia un objeto Nodo que  sirve como base general
     *   despues apunta a la cima de la pila  y el nuevo elemento pasa ser  la cima de la pila.
     */
    public void push(T dT) {
        Nodo<T> nd = new Nodo<>(dT);
        nd.setSiguienteDato(pilaCima);  
        pilaCima = nd;
        tamanio++; 
    }


    public T pop(){
        if(ISEMPTY()){
            return null;
        }
        T dt = pilaCima.getDato();
        pilaCima=pilaCima.getSiguienteDato();
        tamanio--;
        return dt;
    }


    
    public boolean ISEMPTY() {
        return pilaCima == null; // Comprobamos si la pila está vacía
    }

}
