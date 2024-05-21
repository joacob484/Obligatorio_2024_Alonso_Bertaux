package um.edu.uy.Lista;

public interface ListaEnlazadaInterface<T> {

    void add(T value);

    T get(int position);

    boolean contains(T value);
    void remove(T value);
    int size();



}
