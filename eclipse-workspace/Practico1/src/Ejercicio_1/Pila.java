package Ejercicio_1;

public class Pila <T> {
	private Lista<T> lista;

    public Pila() {
        this.lista = new Lista<>();
    }

    public void push(T elemento) {
        lista.insertFront(elemento);
    }

    public T pop() {
        return lista.extractFront();
    }

    public T top() {
        return lista.isEmpty() ? null : lista.get(0);
    }

    public void reverse() {
        // Invertir la lista
        Lista<T> listaInvertida = new Lista<>();
        while (!lista.isEmpty()) {
            listaInvertida.insertFront(lista.extractFront());
        }
        this.lista = listaInvertida;
    }

    public String toString() {
        return lista.toString();
    }

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println("Pila original: " + pila);
        System.out.println("Tope de la pila: " + pila.top());
        System.out.println("Elemento retirado: " + pila.pop());

        System.out.println("Pila después de pop: " + pila);
        pila.reverse();
        System.out.println("Pila invertida: " + pila);
        
    }
}

