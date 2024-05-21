package um.edu.uy.Lista;

import um.edu.uy.Nodo;

public class ListaEnlazada<T extends Comparable<T>> implements ListaEnlazadaInterface<T> {

    public Nodo<T> primero;
    public Nodo<T> ultimo;
    public int Length;

    public ListaEnlazada() {
        this.primero = null;
        this.ultimo = null;
        Length = 0;
    }

    @Override
    public void add(T value) {
        if (primero != null){
            Nodo<T> temp = primero;
            while(temp.getNext()!= null)
                temp = temp.getNext();
            Nodo<T> NuevoNodo =  new Nodo<>(value);
            temp.setNext(NuevoNodo);
            Length++;
        }
        else
            primero = new Nodo<>(value);

    }

    @Override
    public void remove(int posicion) {
        if (primero != null){
            Nodo<T> temp = primero;
            for (int i = 0; i < posicion-1; i++) {
                temp = temp.getNext();
            }
            if (temp.getNext().getNext() != null){
                temp.setNext(temp.getNext().getNext());
            }
            else
                temp.setNext(null);
        }
        Length -- ;
    }

    @Override
    public T get(int position) {
        Nodo<T> temp = primero;
        while (temp != null){
            for (int i = 0; i < position-1; i=i+1) {
                temp = temp.getNext();
            }
            return temp.getValue();
        }
        return null;
    }

    public Nodo<T> getNode(int posicion) {
        Nodo<T> temp = primero;
        while (temp != null) {
            for (int i = 0; i < posicion - 1; i = i + 1) {
                temp = temp.getNext();
            }
            return temp;
        }
        return null;
    }
    public void AddFirst(T value){
        Nodo<T> temp = new Nodo<>(value);
        if (primero != null){
            temp.setNext(primero);
            primero.setAnterior(temp);
            primero = temp;

        }
        Length ++;

    }


    public void AddLast (T value){
        Nodo<T> temp = primero;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        Nodo<T> ultimo = new Nodo<>(value);
        temp.setNext(ultimo);
        ultimo.setAnterior(temp);
        Length ++;

    }




}
