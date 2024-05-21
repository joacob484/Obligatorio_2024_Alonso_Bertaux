package um.edu.uy.Queue;

import um.edu.uy.Lista.ListaDoblementeEnlazada;
import um.edu.uy.Nodo;

public class Queue <T> implements MyQueueInterface<T> {

    private ListaDoblementeEnlazada<T> lista;

    public Queue() {
        this.lista = new ListaDoblementeEnlazada<>();
    }

    @Override
    public void enqueue(T value) {
       Nodo<T> nodoAgregar;
       nodoAgregar = new Nodo<>(value);
       lista.AddFirst(nodoAgregar.getValue());
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if(lista.size() == 0){
            throw new EmptyQueueException();
        }
        else{
            Nodo<T> primero = new Nodo<>(lista.get(0));
            lista.remove(0);
            return primero.getValue();
        }
    }

    @Override
    public boolean contains(T value) {
        boolean contain = false;
        Nodo<T> temp = new Nodo<>(lista.get(0));
        while (temp != null && !temp.getValue().equals(value)) {
            temp = temp.getNext();
        }
        if (temp != null) {
            contain = true;
        }
        return contain;
    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public boolean isEmpty() {
        if (this.size() !=0){
            return true;
        }
        return false;
    }

}
