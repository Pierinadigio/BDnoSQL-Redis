package Ejercicio_1;

import java.util.Iterator;

public class MyIterador<T> implements Iterator <T>{
	private Nodo <T> cursor;
	
	
	public MyIterador (Nodo <T> cursor) {
		this.cursor = cursor;
	}
	
	public boolean hasNext() {
		return this.cursor != null;
	}
	
	public T next() {
		T data = this.cursor.getData();
		
		this.cursor = cursor.getNext();
		return data;
		
	}
 
	public void avanzar() {
    	
    	if (this.hasNext()) {
    		this.cursor = cursor.getNext();
    		
		}
    	else {
    		this.cursor = null;
        }
    	
	}
	public T Valor(){
		if(this.cursor!=null) {
			return this.cursor.getData();
		}
		return null;
		
	}
}
