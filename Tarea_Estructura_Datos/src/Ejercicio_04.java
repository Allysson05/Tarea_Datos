
class Nodo {
    String nombre;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(String nombre) {
        this.nombre = nombre;
        izquierdo = null;
        derecho = null;
    }
}
class ArbolEnfermedades {

    Nodo raiz;

    public void crearArbol() {

        raiz = new Nodo("Enfermedades cardiovasculares");

        raiz.izquierdo = new Nodo("Cardiopatias");
        raiz.derecho = new Nodo("Enfermedades vasculares");

        raiz.izquierdo.izquierdo = new Nodo("Infarto");
        raiz.izquierdo.derecho = new Nodo("Insuficiencia");

        raiz.derecho.izquierdo = new Nodo("Aneurisma");
        raiz.derecho.derecho = new Nodo("Aterosclerosis");

        raiz.izquierdo.izquierdo.izquierdo = new Nodo("Arritmias");

        raiz.izquierdo.derecho.izquierdo = new Nodo("Shock cardiogenico");
    }
public void mostrarNodos(Nodo nodo) {

    if(nodo != null) {

        System.out.println(nodo.nombre);

        mostrarNodos(nodo.izquierdo);
        mostrarNodos(nodo.derecho);
    }
}
public void mostrarPadresHijos(Nodo nodo) {

    if (nodo != null) {

        if (nodo.izquierdo != null || nodo.derecho != null) {

            System.out.print("Padre: " + nodo.nombre);

            if (nodo.izquierdo != null) {
                System.out.print(" | Hijo Izq: "
                        + nodo.izquierdo.nombre);
            }

            if (nodo.derecho != null) {
                System.out.print(" | Hijo Der: "
                        + nodo.derecho.nombre);
            }

            System.out.println();
        }

        mostrarPadresHijos(nodo.izquierdo);
        mostrarPadresHijos(nodo.derecho);
    }
}
public void mostrarHojas(Nodo nodo) {

    if (nodo != null) {

        if (nodo.izquierdo == null
                && nodo.derecho == null) {

            System.out.println(nodo.nombre);
        }

        mostrarHojas(nodo.izquierdo);
        mostrarHojas(nodo.derecho);
    }
}
}
public class Ejercicio_04 {
    public static void main(String[] args) {

    ArbolEnfermedades arbol = new ArbolEnfermedades();

    arbol.crearArbol();

    System.out.println("TODOS LOS NODOS");
    arbol.mostrarNodos(arbol.raiz);

    System.out.println("\nPADRES E HIJOS");
    arbol.mostrarPadresHijos(arbol.raiz);

    System.out.println("\nNODOS HOJA");
    arbol.mostrarHojas(arbol.raiz);
    
    } 
}
 
