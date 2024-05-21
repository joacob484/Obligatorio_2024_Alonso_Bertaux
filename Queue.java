public class Queue <T> implements MyQueueInterface<T>{

    public Nodo <T> primero;
    public Nodo <T> ultimo;

    public Queue() {
        this.primero = null;
        this.ultimo = null;
    }

    @Override
    public void enqueue(T value) {
        if (value != null) {

            Nodo<T> elementToAdd = new Nodo<>(value);

            if (this.primero == null) {

                this.primero = elementToAdd;
                this.ultimo = elementToAdd;

            } else {

                elementToAdd.setNext(this.primero);
                this.primero = elementToAdd;
            }

        } else {

        }
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if (this.ultimo == null) {
            throw new EmptyQueueException();
        }
    }

    @Override
    public boolean contains(T value) {
        boolean contain = false;
        Nodo<T> temp = this.primero;
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
        return 0;
    }
}
