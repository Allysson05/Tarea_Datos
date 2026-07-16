class Nodo {
    int dato;
    Nodo next;

    Nodo(int dato) {
        this.dato = dato;
        this.next = null;
    }
}

class Lista {
    Nodo head;
    Nodo tail;

    Lista() {
        this.head = null;
        this.tail = null;
    }

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (head == null) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.next = nuevo;
            tail = nuevo;
        }
    }

    public void SuprimirMayores(int limite) {
        Nodo actual = head;
        Nodo anterior = null;
        while (actual != null) {
            if (actual.dato > limite) {
                if (anterior == null) {
                    head = actual.next;
                } else {
                    anterior.next = actual.next;
                }
                actual = actual.next;
            } else {
                anterior = actual;
                actual = actual.next;
            }
        }
    }

    public void Mostrar() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.next;
        }
    }
}

public class Ejercicio_02 {

    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("lista sin mayores de 5");
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        lista.insertar(6);
        lista.insertar(7);
        lista.insertar(8);
        lista.insertar(9);
        lista.insertar(10);
        lista.Mostrar();
        lista.SuprimirMayores(5);
        System.out.println("nueva lista");
        lista.Mostrar();
    }
}
