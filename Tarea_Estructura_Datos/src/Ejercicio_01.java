
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
   }
   class ListaEnlazadaSimple{
    Node head;
    public ListaEnlazadaSimple insert(int data) {
        Node new_Node = new Node(data);

        if (head == null) {
            head = new_Node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_Node;
        }

        return this;
    }

    public void print() {
        Node current = head;
        System.out.println("Lista enlazada:");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public ListaEnlazadaSimple insertStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            newNode.next = head;
            head = newNode;

        }
        return this;
    }

    public void search(int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                System.out.println("Elemento " + key + " encontrado");
                return;
            }
            current = current.next;
        }

        System.out.println("Elemento " + key + " no encontrado");
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println(key + " not found");
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println(key + " not found");
            return;
        }
        if (prev == null) {
            head = current.next;
        } else {
            prev.next = current.next;
        }
        current.next = null;
        System.out.println(key + " fue eliminado");
    }
    public void deleteMax(){
        if(head == null){
            return;
        }
        int mayor = head.data;
        Node current = head;
        
        while(current != null){
            if(current.data > mayor){
                mayor = current.data;
            }
            current = current.next;
        }
        delete(mayor);
    }
   }

  public class Ejercicio_01 {
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        System.out.println("-----LISTA INSERTADA DE NUMEROS------");
        lista.insert(10);
        lista.insert(20);
        lista.insert(30);
        lista.print();
        System.out.println("-------AÑADIR NUMEROS AL INICIO-------");
        lista.insertStart(40);
        lista.insertStart(50);
        lista.print();
        System.out.println("-------------BUSCAR UN NUMERO--------");
        lista.search(20);
        lista.search(90);
        lista.print();
        System.out.println("--------NUMEROS ELIMINADOS-------");
        lista.delete(20);
        lista.delete(30);
        lista.print();
        System.out.println("--------ELIMINAR EL VALOR MAYOR-------");
        lista.deleteMax();
        lista.print();
    }
}

