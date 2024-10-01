package Ejercicio_1;


public class Nodo<T> {
	public Nodo<T> next;
	public T data;
	
	public Nodo(T data) {
        this.data = data;
        this.next = null;
    }

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData( T data) {
		this.data = data;
	}

}
