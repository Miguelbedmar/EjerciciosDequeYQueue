package modelo;

public class Nodo<T> {
	//ATRIBUTO
	private T dato;
	private Nodo siguienteDato;
	

	public Nodo(T datoT){
		this.dato=dato;
		this.siguienteDato=null;
	}

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSiguienteDato() {
        return siguienteDato;
    }

    public void setSiguienteDato(Nodo siguienteDato) {
        this.siguienteDato = siguienteDato;
    }
	
	
}
