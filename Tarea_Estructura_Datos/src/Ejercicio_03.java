class ArbolBinario {
    int dato;
    ArbolBinario izq;
    ArbolBinario der;

    ArbolBinario(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }
}

class Lista {
    ArbolBinario root;

    Lista() {
        this.root = null;
    }

    public void insertar(int dato) {
        ArbolBinario nuevo = new ArbolBinario(dato);

        if (root == null) {
            root = nuevo;
            return;
        }

        ArbolBinario actual = root;

        while (true) {
            if (dato < actual.dato) {
                if (actual.izq == null) {
                    actual.izq = nuevo;
                    break;
                }
                actual = actual.izq;
            } else {
                if (actual.der == null) {
                    actual.der = nuevo;
                    break;
                }
                actual = actual.der;
            }
        }
    }
}

public class Ejercicio_03 {

    public void buscarNumeroMayor(ArbolBinario arbol, int num) {
        if (arbol != null) {
            if (arbol.dato > num) {
                System.out.println(arbol.dato);
            }
            buscarNumeroMayor(arbol.izq, num);
            buscarNumeroMayor(arbol.der, num);
        }
    }

    public void buscarNumeroMenor(ArbolBinario arbol, int num) {
        if (arbol != null) {
            if (arbol.dato < num) {
                System.out.println(arbol.dato);
            }
            buscarNumeroMenor(arbol.izq, num);
            buscarNumeroMenor(arbol.der, num);
        }
    }

    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.insertar(5);
        lista.insertar(3);
        lista.insertar(7);
        lista.insertar(2);
        lista.insertar(4);
        lista.insertar(6);
        lista.insertar(8);

        Ejercicio_03 obj = new Ejercicio_03();

        System.out.println("Numeros mayores a 5:");
        obj.buscarNumeroMayor(lista.root, 5);

        System.out.println();

        System.out.println("Numeros menores a 5:");
        obj.buscarNumeroMenor(lista.root, 5);
    }
}