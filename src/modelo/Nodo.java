package modelo;

public class Nodo<T> {
	//ATRIBUTO
	private T dato;
	private Nodo<T> siguienteDato;
	
	//CONSTRUCTO
	public Nodo(T dato) {
		this.dato = dato;
		this.siguienteDato = null; // iniciazamos el atributo siguienteDato como nulo ya que será el encargado de
									// apuntar al siguente elemento en una pila o colas
	}

	
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Nodo<T> getSiguienteDato() {
		return siguienteDato;
	}

	public void setSiguienteDato(Nodo<T> siguienteDato) {
		this.siguienteDato = siguienteDato;
	}
	
	
}
