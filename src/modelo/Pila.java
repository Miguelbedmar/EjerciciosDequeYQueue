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
    public void push(T dT) {
        Nodo<T> nd = new Nodo<>(dT);
        nd.setSiguienteDato(pilaCima);
        pilaCima = n;
        tamanio++;
    }


    
    public boolean ISEMPTY() {
        return pilaCima == null;
    }

}
