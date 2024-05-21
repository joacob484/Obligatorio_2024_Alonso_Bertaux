package um.edu.uy.Queue;

public interface MyQueueInterface<T> {

    void enqueue(T value);

    T dequeue() throws EmptyQueueException;

    boolean contains(T value);

    int size();
    boolean isEmpty();
}
