package Ejercicio_1;

import java.util.Iterator;

public class Lista <T extends Comparable<T>> implements Iterable <T> {
    private Nodo<T> head;
    private int size;

    public Lista() {
        this.head = null;
        this.size = 0;
    }

    public void insertFront(T data) {
        Nodo<T> newNode = new Nodo(data);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
    
    public void insertEnd(T data) {
        Nodo<T> newNode = new Nodo<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Nodo<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public T extractFront() {
        if (this.isEmpty()) {
            System.out.println("La lista está vacía");
            return null; 
        }

        T data = this.head.data;
        this.head = this.head.next;
        this.size--;
        return data;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Índice fuera de rango");
            return null; 
        }

        Nodo<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }
    
    public int indexOf(T elemento) {
    	Nodo<T> current = this.head;
    	int pos = 0;
    	
    	while(current!= null) {
    		if (current.data.equals(elemento)) {	
    			return pos;
    		}
    		current = current.next;
    		pos ++;
    	}
    	return -1;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Nodo current = this.head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        return result.length() > 0 ? result.substring(0, result.length() - 4) : "";
    }
    public Iterator<T> iterator(){
    	return new MyIterador(this.head);
    }
    
    
    public boolean contains(T data) {
		return this.indexOf(data) == -1 ? false : true;
	}
    
    public Nodo<T> getNodo(int index) {
		if (!isEmpty() && getSize() > index) {
			Nodo<T> tmp = this.head;
			for (int i = 0; i <= index && tmp != null; i++) {
				if (i == index) {
					return tmp;
				}
				tmp = tmp.getNext();
			}
		}
		return null;
	}
    
    public void insertarOrdenado (T data) {
    	if (this.head == null) {
    		this.insertFront(data);
    	}
    	int comparacion = this.head.getData().compareTo(data);
    	
    	if ((comparacion > 0) || (comparacion == 0)) {
    		this.insertFront(data);
    	
    	}else if (this.head.getNext() == null) {
    		this.insertEnd(data);
    	
    	} else {
    		Nodo <T>current = this.head.getNext();
    		T info = current.getData();
    		int comp = info.compareTo(data);
    		while( comp > 0 ) {
    			current = current.getNext();
    		}
    		Nodo<T> newNode = new Nodo<>(data);
    		current = newNode.getNext();
    		newNode = current;
    	}
    	
    	
    }
    
    
	
	


}