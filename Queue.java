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
        T valueToRemove = null;

        valueToRemove = this.ultimo.getValue();




        return valueToRemove;
    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
