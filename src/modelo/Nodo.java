package modelo;

public class Nodo<T> {
	//ATRIBUTO
	private T dato;
	private Nodo<T> siguienteDato;
	

	public Nodo(T datoT){
		this.dato=datoT;
		this.siguienteDato=null;
	}

    public T getDato() {
        return dato;
    }

    public void setDato(T datoT) {
        this.dato = datoT;
    }

    public Nodo<T> getSiguienteDato() {
        return siguienteDato;
    }

    public void setSiguienteDato(Nodo<T> siguienteDato) {
        this.siguienteDato = siguienteDato;
    }
	
	
}
