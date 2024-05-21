package um.edu.uy.Lista;

import um.edu.uy.Nodo;

public class ListaDoblementeEnlazada <T> implements ListaEnlazadaInterface<T> {

    public Nodo<T> primero;
    public int Length;

    public ListaDoblementeEnlazada() {
        this.primero = null;
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
            NuevoNodo.setAnterior(temp);
            Length = Length+1;
        }
        else
            primero = new Nodo<>(value);
    }


    @Override
    public T get(int position) {
        Nodo<T> temp = primero;
        while (temp != null){
            for (int i = 0; i < position; i=i+1) {
                temp = temp.getNext();
            }
            return temp.getValue();
        }
        return null;
    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public void remove(T value) {

    }

    public int size(){
        return Length;
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

}
