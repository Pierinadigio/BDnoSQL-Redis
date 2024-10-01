package Ejercicio_1;

public class NodoNombre {
	public String nombre;
	public NodoNombre siguiente;
	
	
	public NodoNombre(String nombre) {
		super();
		this.nombre = nombre;
		this.siguiente = null;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public NodoNombre getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(NodoNombre siguiente) {
		this.siguiente = siguiente;
	}
	
	
	

}
