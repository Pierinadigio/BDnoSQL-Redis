package Ejercicio_1;
import java.util.*;


public class ListaNombres {
	public NodoNombre raiz;
	public int size;
	
	public ListaNombres () {
		this.size = 0;
		this.raiz = null;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void insertFront (String nombre) {
		NodoNombre nombreNuevo = new NodoNombre (nombre);
		nombreNuevo.siguiente = this.raiz;
		this.raiz = nombreNuevo;
		this.size ++;
	}
	
	public String extractFront () {
		
		if(isEmpty()) {
			System.out.println("lista vacia");
			return   "vacio";
		}
		
		String nombreextraido = this.raiz.nombre;
		this.raiz = this.raiz.siguiente;
		this.size --;
		return nombreextraido;
		
	}
	
	public int getSize() {
        return this.size;
    }
	public String toString() {
	    StringJoiner result = new StringJoiner(" y ");
	    NodoNombre current = this.raiz;
	    
	    while (current != null) {
	        result.add(String.valueOf(current.nombre));
	        current = current.siguiente;
	    }
	    
	    return result.toString();
	}
	
	public int indexOf(String elemento) {
    	NodoNombre current = this.raiz;
    	int pos = 0;
    	
    	while(current!= null) {
    		if (current.nombre.equals(elemento)) {	
    			return pos;
    		}
    		current = current.siguiente;
    		pos ++;
    	}
    	return -1;
    }
	/*public String toString() {
        StringBuilder listado = new StringBuilder();
        NodoNombre nodoActual = this.raiz;
        while (nodoActual != null) {
            listado.append(nodoActual.nombre).append(" y ");
            nodoActual = nodoActual.siguiente;
        }
        return listado.length() > 0 ? listado.substring(0, listado.length() - 4) : "";
    }*/
}
