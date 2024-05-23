package um.edu.uy.Lista;

import um.edu.uy.Nodo;
import um.edu.uy.Queue.EmptyQueueException;
import um.edu.uy.Queue.MyQueueInterface;
import um.edu.uy.Stack.MyStackInterface;
import um.edu.uy.Stack.EmptyStackException;

public class ListaEnlazada<T extends Comparable<T>> implements ListaEnlazadaInterface<T>, MyQueueInterface<T>, MyStackInterface<T> {

    public Nodo<T> primero;
    public Nodo<T> ultimo;

    public ListaEnlazada() {
        this.primero = null;
        this.ultimo = null;
    }

    @Override
    public void add(T value) {
        addToTheEnd(value);
    }

    private void addToBeginning(T value) {
        if (value != null) {

            Nodo<T> elementToAdd = new Nodo<>(value);

            if (this.primero == null) { // si la lista es vacia

                this.primero = elementToAdd;
                this.ultimo = elementToAdd;

            } else { // en caso de no ser vacia se agrega al comienzo

                elementToAdd.setNext(this.primero);
                this.primero = elementToAdd;
            }

        } else {
            // si el elemento es vacio se ignora
        }
    }

    private void addToTheEnd(T value) {
        if (value != null) {

            Nodo<T> elementToAdd = new Nodo<>(value);

            if (this.primero == null) { // si la lista es vacia

                this.primero = elementToAdd;
                this.ultimo = elementToAdd;

            } else { // en caso de no ser vacia se agrega al final

                this.ultimo.setNext(elementToAdd);
                this.ultimo = elementToAdd;
            }

        } else {
            // si el elemento es vacio se ignora
        }
    }


    @Override
    public T get(int position) {
        T valueToReturn = null;
        int tempPosition = 0;
        Nodo<T> temp = this.primero;
        while (temp != null && tempPosition != position) {
            temp = temp.getNext();
            tempPosition++;
        }
        if (tempPosition == position) {
            valueToReturn = temp.getValue();
        }
        return valueToReturn;
    }
    @Override
    public boolean contains(T value) {
        boolean contains = false;
        Nodo<T> temp = this.primero;
        while (temp != null && !temp.getValue().equals(value)) {
            temp = temp.getNext();
        }
        if (temp != null) {
            contains = true;
        }
        return contains;
    }

    @Override
    public void remove(T value) {
        Nodo<T> beforeSearchValue = null;
        Nodo<T> searchValue = this.primero;
        while (searchValue != null && !searchValue.getValue().equals(value)) {
            beforeSearchValue = searchValue;
            searchValue = searchValue.getNext();
        }
        if (searchValue != null) {
            if (searchValue == this.primero && searchValue != this.ultimo) {
                Nodo<T> temp = this.primero;
                this.primero = this.primero.getNext();
                temp.setNext(null);
            } else if (searchValue == this.ultimo && searchValue != this.primero) {
                beforeSearchValue.setNext(null);
                this.ultimo = beforeSearchValue;
            } else if (searchValue == this.ultimo && searchValue == this.primero) {
                this.primero = null;
                this.ultimo = null;
            } else {
                beforeSearchValue.setNext(searchValue.getNext());
                searchValue.setNext(null);
            }
        } else {
            // Si no es encuentra el valor a eliminar no se realiza nada
        }
    }
    public T removeLast() { // esta operación remueve el último elemento y retorna el elemento eliminado
        T valueToRemove = null;

        if (this.ultimo != null) {
            valueToRemove = this.ultimo.getValue();
            remove(valueToRemove);
        }

        return valueToRemove;
    }

    @Override
    public int size() {
        int size = 0;

        Nodo<T> temp = this.primero;

        while (temp != null) {

            temp = temp.getNext();
            size++;

        }

        return size;
    }

    @Override
    public void enqueue(T value) {
        addToBeginning(value);
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if (this.ultimo == null) {
            throw new EmptyQueueException();
        }
        return removeLast();
    }



    @Override
    public void push(T value) {
        addToTheEnd(value);
    }

    @Override
    public T pop() throws EmptyStackException {
        if (this.ultimo == null) { // si la pila esta vacia
            throw new EmptyStackException();
        }
        return removeLast();
    }

    @Override
    public T top() {
        T valueToReturn = null;

        if (this.ultimo != null) {
            valueToReturn = this.ultimo.getValue();
        }

        return valueToReturn;
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






}
